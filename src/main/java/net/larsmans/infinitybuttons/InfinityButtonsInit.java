package net.larsmans.infinitybuttons;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.loader.api.FabricLoader;
import net.larsmans.infinitybuttons.advancement.InfinityButtonsTriggers;
import net.larsmans.infinitybuttons.block.InfinityButtonsBlocks;
import net.larsmans.infinitybuttons.block.custom.letterbutton.LetterButton;
import net.larsmans.infinitybuttons.block.custom.letterbutton.LetterButtonEnum;
import net.larsmans.infinitybuttons.block.custom.letterbutton.gui.LetterButtonGui;
import net.larsmans.infinitybuttons.compat.IBCarpenterBlocks;
import net.larsmans.infinitybuttons.compat.IBCreateBlocks;
import net.larsmans.infinitybuttons.compat.IBNethersDelightBlocks;
import net.larsmans.infinitybuttons.compat.IBNethersDelightItems;
import net.larsmans.infinitybuttons.config.InfinityButtonsConfig;
import net.larsmans.infinitybuttons.item.InfinityButtonsItems;
import net.larsmans.infinitybuttons.sounds.InfinityButtonsSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfinityButtonsInit implements ModInitializer {
	public static final String MOD_ID = "infinitybuttons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static InfinityButtonsConfig config;

	@Override
	public void onInitialize() {
		ServerPlayNetworking.registerGlobalReceiver(LetterButtonGui.LETTER_BUTTON_PACKET, (server, player, handler, buf, sender) -> {
			BlockPos pos = buf.readBlockPos();
			LetterButtonEnum letterButtonEnum = buf.readEnumConstant(LetterButtonEnum.class);
			World world = player.getWorld();
			world.setBlockState(pos, world.getBlockState(pos).with(LetterButton.CHARACTER, letterButtonEnum));
		});

		AutoConfig.register(InfinityButtonsConfig.class, JanksonConfigSerializer::new);
		config = AutoConfig.getConfigHolder(InfinityButtonsConfig.class).getConfig();

		InfinityButtonsItems.registerModItems();
		InfinityButtonsBlocks.registerModBlocks();
		InfinityButtonsSounds.registerSounds();
		InfinityButtonsTriggers.register();

		if (FabricLoader.getInstance().isModLoaded("nethersdelight")) {
			IBNethersDelightItems.registerCompatItems();
			IBNethersDelightBlocks.registerCompatBlocks();
		}

		if (FabricLoader.getInstance().isModLoaded("carpenter")) {
			IBCarpenterBlocks.registerCompatBlocks();
		}

		if (FabricLoader.getInstance().isModLoaded("create")) {
			IBCreateBlocks.registerCompatBlocks();
		}
	}
}