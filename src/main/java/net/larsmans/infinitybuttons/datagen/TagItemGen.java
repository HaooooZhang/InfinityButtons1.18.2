package net.larsmans.infinitybuttons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.larsmans.infinitybuttons.block.InfinityButtonsBlocks;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TagItemGen extends FabricTagProvider<Item> {
    public TagItemGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ITEM, "infinitybuttons_blocktag");
    }

    public static final TagKey<Item> CONCRETE_POWDER_BUTTONS = add("concrete_powder_buttons");
    public static final TagKey<Item> CONCRETE_POWDER_LARGE_BUTTONS = add("concrete_powder_large_buttons");
    public static final TagKey<Item> LARGE_BUTTONS = add("large_buttons");
    public static final TagKey<Item> WOODEN_LARGE_BUTTONS = add("wooden_large_buttons");
    public static final TagKey<Item> EMERGENCY_BUTTONS = add("emergency_buttons");
    public static final TagKey<Item> SAFE_EMERGENCY_BUTTONS = add("safe_emergency_buttons");
    public static final TagKey<Item> SECRET_BUTTONS = add("secret_buttons");
    public static final TagKey<Item> WOODEN_SECRET_BUTTONS = add("wooden_secret_buttons");
    public static final TagKey<Item> BOOKSHELF_SECRET_BUTTONS = add("bookshelf_secret_buttons");
    public static final TagKey<Item> TORCH_BUTTONS = add("torch_buttons");
    public static final TagKey<Item> CONSOLE_BUTTONS = add("console_buttons");
    public static final TagKey<Item> LANTERN_BUTTONS = add("lantern_buttons");
    public static final TagKey<Item> COPPER_BUTTONS = add("copper_buttons");
    public static final TagKey<Item> COPPER_LARGE_BUTTONS = add("copper_large_buttons");

    static TagKey<Item> add(String name) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier("infinitybuttons:" + name));
    }

    protected void generateInfinityButtonsTags() {
        getOrCreateTagBuilder(CONCRETE_POWDER_BUTTONS)
                .add(InfinityButtonsBlocks.WHITE_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIGHT_GRAY_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GRAY_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BLACK_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BROWN_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.RED_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.ORANGE_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.YELLOW_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIME_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GREEN_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CYAN_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIGHT_BLUE_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BLUE_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PURPLE_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.MAGENTA_CONCRETE_POWDER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PINK_CONCRETE_POWDER_BUTTON.asItem())
        ;

        getOrCreateTagBuilder(CONCRETE_POWDER_LARGE_BUTTONS)
                .add(InfinityButtonsBlocks.WHITE_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIGHT_GRAY_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GRAY_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BLACK_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BROWN_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.RED_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.ORANGE_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.YELLOW_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIME_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GREEN_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CYAN_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIGHT_BLUE_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BLUE_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PURPLE_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.MAGENTA_CONCRETE_POWDER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PINK_CONCRETE_POWDER_LARGE_BUTTON.asItem())
        ;

        getOrCreateTagBuilder(LARGE_BUTTONS)
                .addOptionalTag(WOODEN_LARGE_BUTTONS)
                .addOptionalTag(COPPER_LARGE_BUTTONS)
                .addOptionalTag(CONCRETE_POWDER_LARGE_BUTTONS)
                .add(InfinityButtonsBlocks.STONE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DEEPSLATE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GRANITE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DIORITE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.ANDESITE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.TUFF_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DRIPSTONE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CALCITE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.POLISHED_BLACKSTONE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.IRON_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GOLD_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.EMERALD_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DIAMOND_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PRISMARINE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PRISMARINE_BRICK_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DARK_PRISMARINE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.SAND_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.RED_SAND_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GRAVEL_LARGE_BUTTON.asItem())
        ;

        getOrCreateTagBuilder(WOODEN_LARGE_BUTTONS)
                .add(InfinityButtonsBlocks.OAK_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.SPRUCE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BIRCH_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.JUNGLE_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.ACACIA_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DARK_OAK_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CRIMSON_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WARPED_LARGE_BUTTON.asItem())
        ;

        getOrCreateTagBuilder(EMERGENCY_BUTTONS)
                .add(InfinityButtonsBlocks.WHITE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIGHT_GRAY_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GRAY_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BLACK_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BROWN_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.RED_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.ORANGE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.YELLOW_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIME_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GREEN_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CYAN_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIGHT_BLUE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BLUE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PURPLE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.MAGENTA_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PINK_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.FANCY_EMERGENCY_BUTTON.asItem())
        ;

        getOrCreateTagBuilder(SAFE_EMERGENCY_BUTTONS)
                .add(InfinityButtonsBlocks.WHITE_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIGHT_GRAY_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GRAY_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BLACK_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BROWN_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.RED_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.ORANGE_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.YELLOW_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIME_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GREEN_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CYAN_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LIGHT_BLUE_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BLUE_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PURPLE_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.MAGENTA_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PINK_SAFE_EMERGENCY_BUTTON.asItem())
                .add(InfinityButtonsBlocks.FANCY_SAFE_EMERGENCY_BUTTON.asItem())
        ;

        getOrCreateTagBuilder(SECRET_BUTTONS)
                .addOptionalTag(WOODEN_SECRET_BUTTONS)
                .add(InfinityButtonsBlocks.BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.STONE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.MOSSY_STONE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CRACKED_STONE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CHISELED_STONE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DEEPSLATE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CRACKED_DEEPSLATE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DEEPSLATE_TILE_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CRACKED_DEEPSLATE_TILE_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.END_STONE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PURPUR_BLOCK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.QUARTZ_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DARK_PRISMARINE_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.POLISHED_BLACKSTONE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CHISELED_POLISHED_BLACKSTONE_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.NETHER_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CRACKED_NETHER_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CHISELED_NETHER_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.RED_NETHER_BRICK_SECRET_BUTTON.asItem())

                .addOptional(new Identifier("infinitybuttons:rose_quartz_tile_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_rose_quartz_tile_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_granite_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_granite_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_diorite_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_diorite_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_andesite_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_andesite_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_calcite_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_calcite_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_dripstone_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_dripstone_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_deepslate_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_deepslate_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_tuff_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_tuff_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_asurine_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_asurine_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_crimsite_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_crimsite_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_limestone_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_limestone_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_ochrum_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_ochrum_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_scoria_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_scoria_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_scorchia_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_scorchia_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:cut_veridium_brick_secret_button"))
                .addOptional(new Identifier("infinitybuttons:small_veridium_brick_secret_button"))
        ;

        getOrCreateTagBuilder(WOODEN_SECRET_BUTTONS)
                .addOptionalTag(BOOKSHELF_SECRET_BUTTONS)
                .add(InfinityButtonsBlocks.OAK_PLANK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.SPRUCE_PLANK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BIRCH_PLANK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.JUNGLE_PLANK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.ACACIA_PLANK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DARK_OAK_PLANK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CRIMSON_PLANK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WARPED_PLANK_SECRET_BUTTON.asItem())
        ;

        getOrCreateTagBuilder(BOOKSHELF_SECRET_BUTTONS)
                .add(InfinityButtonsBlocks.BOOKSHELF_SECRET_BUTTON.asItem())
                .addOptional(new Identifier("infinitybuttons:carpenter_spruce_bookshelf_secret_button"))
                .addOptional(new Identifier("infinitybuttons:carpenter_birch_bookshelf_secret_button"))
                .addOptional(new Identifier("infinitybuttons:carpenter_jungle_bookshelf_secret_button"))
                .addOptional(new Identifier("infinitybuttons:carpenter_acacia_bookshelf_secret_button"))
                .addOptional(new Identifier("infinitybuttons:carpenter_dark_oak_bookshelf_secret_button"))
                .addOptional(new Identifier("infinitybuttons:carpenter_crimson_bookshelf_secret_button"))
                .addOptional(new Identifier("infinitybuttons:carpenter_warped_bookshelf_secret_button"))
        ;

        getOrCreateTagBuilder(TORCH_BUTTONS)
                .add(InfinityButtonsBlocks.TORCH_BUTTON.asItem())
                .add(InfinityButtonsBlocks.TORCH_LEVER.asItem())
                .add(InfinityButtonsBlocks.SOUL_TORCH_BUTTON.asItem())
                .add(InfinityButtonsBlocks.SOUL_TORCH_LEVER.asItem())
                .add(InfinityButtonsBlocks.REDSTONE_TORCH_BUTTON.asItem())
                .add(InfinityButtonsBlocks.REDSTONE_TORCH_LEVER.asItem())
                .addOptional(new Identifier("infinitybuttons:propelplant_torch_button"))
                .addOptional(new Identifier("infinitybuttons:propelplant_torch_lever"))
        ;

        getOrCreateTagBuilder(CONSOLE_BUTTONS)
                .add(InfinityButtonsBlocks.SMALL_CONSOLE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.SMALL_CONSOLE_LEVER.asItem())
                .add(InfinityButtonsBlocks.CONSOLE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CONSOLE_LEVER.asItem())
                .add(InfinityButtonsBlocks.LARGE_CONSOLE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LARGE_CONSOLE_LEVER.asItem())
                .add(InfinityButtonsBlocks.BIG_CONSOLE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.BIG_CONSOLE_LEVER.asItem())
        ;

        getOrCreateTagBuilder(LANTERN_BUTTONS)
                .add(InfinityButtonsBlocks.LANTERN_BUTTON.asItem())
                .add(InfinityButtonsBlocks.LANTERN_LEVER.asItem())
                .add(InfinityButtonsBlocks.SOUL_LANTERN_BUTTON.asItem())
                .add(InfinityButtonsBlocks.SOUL_LANTERN_LEVER.asItem())
        ;

        getOrCreateTagBuilder(COPPER_BUTTONS)
                .add(InfinityButtonsBlocks.COPPER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.EXPOSED_COPPER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WEATHERED_COPPER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.OXIDIZED_COPPER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WAXED_COPPER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WAXED_EXPOSED_COPPER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WAXED_WEATHERED_COPPER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WAXED_OXIDIZED_COPPER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.STICKY_COPPER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.STICKY_EXPOSED_COPPER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.STICKY_WEATHERED_COPPER_BUTTON.asItem())
                .add(InfinityButtonsBlocks.STICKY_OXIDIZED_COPPER_BUTTON.asItem())
        ;

        getOrCreateTagBuilder(COPPER_LARGE_BUTTONS)
                .add(InfinityButtonsBlocks.COPPER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.EXPOSED_COPPER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WEATHERED_COPPER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.OXIDIZED_COPPER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WAXED_COPPER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WAXED_EXPOSED_COPPER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WAXED_WEATHERED_COPPER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WAXED_OXIDIZED_COPPER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.STICKY_COPPER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.STICKY_EXPOSED_COPPER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.STICKY_WEATHERED_COPPER_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.STICKY_OXIDIZED_COPPER_LARGE_BUTTON.asItem())
        ;
    }
    
    public static final TagKey<Item> BUTTONS = edit("buttons");
    public static final TagKey<Item> NON_FLAMMABLE_WOOD = edit("non_flammable_wood");
    public static final TagKey<Item> PIGLIN_REPELLENTS = edit("piglin_repellents");
    public static final TagKey<Item> STONE_BRICKS = edit("stone_bricks");

    static TagKey<Item> edit(String name) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier("minecraft:" + name));
    }

    protected void generateVanillaTags() {

        getOrCreateTagBuilder(BUTTONS)
                .addOptionalTag(COPPER_BUTTONS)
                .addOptionalTag(CONCRETE_POWDER_BUTTONS)
                .add(InfinityButtonsBlocks.DEEPSLATE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GRANITE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DIORITE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.ANDESITE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.TUFF_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DRIPSTONE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CALCITE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.IRON_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GOLD_BUTTON.asItem())
                .add(InfinityButtonsBlocks.EMERALD_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DIAMOND_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PRISMARINE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.PRISMARINE_BRICK_BUTTON.asItem())
                .add(InfinityButtonsBlocks.DARK_PRISMARINE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.SAND_BUTTON.asItem())
                .add(InfinityButtonsBlocks.RED_SAND_BUTTON.asItem())
                .add(InfinityButtonsBlocks.GRAVEL_BUTTON.asItem())
        ;

        getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                .add(InfinityButtonsBlocks.CRIMSON_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WARPED_LARGE_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CRIMSON_PLANK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.WARPED_PLANK_SECRET_BUTTON.asItem())
        ;

        getOrCreateTagBuilder(PIGLIN_REPELLENTS)
                .add(InfinityButtonsBlocks.SOUL_TORCH_BUTTON.asItem())
                .add(InfinityButtonsBlocks.SOUL_TORCH_LEVER.asItem())
                .add(InfinityButtonsBlocks.SOUL_LANTERN_BUTTON.asItem())
                .add(InfinityButtonsBlocks.SOUL_LANTERN_LEVER.asItem())
        ;

        getOrCreateTagBuilder(STONE_BRICKS)
                .add(InfinityButtonsBlocks.STONE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.MOSSY_STONE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CRACKED_STONE_BRICK_SECRET_BUTTON.asItem())
                .add(InfinityButtonsBlocks.CHISELED_STONE_BRICK_SECRET_BUTTON.asItem())
        ;
    }

    @Override
    protected void generateTags() {
        generateVanillaTags();
        generateInfinityButtonsTags();
    }
}
