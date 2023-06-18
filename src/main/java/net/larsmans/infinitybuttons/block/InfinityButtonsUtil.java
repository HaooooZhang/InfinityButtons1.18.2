package net.larsmans.infinitybuttons.block;

import net.larsmans.infinitybuttons.InfinityButtonsInit;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.render.Camera;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class InfinityButtonsUtil {

    public static final MutableText HOLD_SHIFT_TEXT = new TranslatableText("infinitybuttons.tooltip.hold_shift");

    public static final MutableText SAFE_EMERGENCY_BUTTON_ACTIONBAR_TEXT = new TranslatableText("infinitybuttons.actionbar.closed_safety_button");

    public static void tooltip(List<Text> tooltip, String name) {
        if (InfinityButtonsInit.config.tooltips) {
            if (Screen.hasShiftDown()) {
                tooltip.add(new TranslatableText("infinitybuttons.tooltip." + name).formatted(Formatting.GRAY));
            } else {
                tooltip.add(HOLD_SHIFT_TEXT.formatted(Formatting.GRAY));
            }
        }
    }

    public static void tooltip(List<Text> tooltip, String name1, String name2) {
        if (InfinityButtonsInit.config.tooltips) {
            if (Screen.hasShiftDown()) {
                tooltip.add(new TranslatableText("infinitybuttons.tooltip." + name1).formatted(Formatting.GRAY));
                tooltip.add(new TranslatableText("infinitybuttons.tooltip." + name2).formatted(Formatting.GRAY));
            } else {
                tooltip.add(HOLD_SHIFT_TEXT.formatted(Formatting.GRAY));
            }
        }
    }

    public static void playGlobalSound(World world, BlockPos pos, SoundEvent soundEvent, SoundCategory soundCategory) {
        Camera cam = MinecraftClient.getInstance().gameRenderer.getCamera();
        if (cam.isReady()) {
            double x = cam.getPos().x;
            double y = cam.getPos().y;
            double z = cam.getPos().z;
            double d0 = (double)pos.getX() - x;
            double d1 = (double)pos.getY() - y;
            double d2 = (double)pos.getZ() - z;
            double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
            if (d3 > 0.0D) {
                x += d0 / d3 * 2.0D;
                y += d1 / d3 * 2.0D;
                z += d2 / d3 * 2.0D;
            }
            world.playSound(x, y, z, soundEvent, soundCategory, 1.0F, 1.0F, false);
        }
    }
}
