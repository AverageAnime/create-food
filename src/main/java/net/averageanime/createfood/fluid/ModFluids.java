package net.averageanime.createfood.fluid;

import net.averageanime.createfood.CreateFood;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.averageanime.createfood.CreateFood.CONFIG;

public class ModFluids {
    public static FlowableFluid STILL_CREAM_FROSTING,STILL_CARAMEL,STILL_BERRY_CREAM_FROSTING, STILL_HOT_CHOCOLATE, STILL_CACAO_MASS,STILL_CACAO_BUTTER, STILL_WHITE_CHOCOLATE, STILL_DARK_CHOCOLATE, STILL_HOT_DARK_CHOCOLATE, STILL_HOT_WHITE_CHOCOLATE,STILL_CHOCOLATE_CREAM_FROSTING,STILL_CHOCOLATE_MILK,STILL_GLOW_BERRY_CREAM_FROSTING,STILL_CHORUS_FRUIT_CREAM_FROSTING,
            STILL_GELATIN_MIX,STILL_RED_GELATIN_MIX,STILL_BLACK_GELATIN_MIX,STILL_BLUE_GELATIN_MIX,STILL_BROWN_GELATIN_MIX,STILL_CYAN_GELATIN_MIX,STILL_GRAY_GELATIN_MIX,STILL_GREEN_GELATIN_MIX,STILL_LIGHT_BLUE_GELATIN_MIX,STILL_LIGHT_GRAY_GELATIN_MIX,STILL_LIME_GELATIN_MIX,STILL_MAGENTA_GELATIN_MIX,STILL_ORANGE_GELATIN_MIX,STILL_PINK_GELATIN_MIX,STILL_PURPLE_GELATIN_MIX,STILL_YELLOW_GELATIN_MIX,STILL_VEGETABLE_OIL,STILL_SUGAR_CANE_JUICE;
    public static FlowableFluid FLOWING_CREAM_FROSTING,FLOWING_CARAMEL,FLOWING_BERRY_CREAM_FROSTING, FLOWING_HOT_CHOCOLATE, FLOWING_CACAO_MASS,FLOWING_CACAO_BUTTER, FLOWING_WHITE_CHOCOLATE, FLOWING_DARK_CHOCOLATE, FLOWING_HOT_DARK_CHOCOLATE, FLOWING_HOT_WHITE_CHOCOLATE,FLOWING_CHOCOLATE_CREAM_FROSTING,FLOWING_CHOCOLATE_MILK,FLOWING_GLOW_BERRY_CREAM_FROSTING,FLOWING_CHORUS_FRUIT_CREAM_FROSTING,
            FLOWING_GELATIN_MIX,FLOWING_RED_GELATIN_MIX,FLOWING_BLACK_GELATIN_MIX,FLOWING_BLUE_GELATIN_MIX,FLOWING_BROWN_GELATIN_MIX,FLOWING_CYAN_GELATIN_MIX,FLOWING_GRAY_GELATIN_MIX,FLOWING_GREEN_GELATIN_MIX,FLOWING_LIGHT_BLUE_GELATIN_MIX,FLOWING_LIGHT_GRAY_GELATIN_MIX,FLOWING_LIME_GELATIN_MIX,FLOWING_MAGENTA_GELATIN_MIX,FLOWING_ORANGE_GELATIN_MIX,FLOWING_PINK_GELATIN_MIX,FLOWING_PURPLE_GELATIN_MIX,FLOWING_YELLOW_GELATIN_MIX,FLOWING_VEGETABLE_OIL,FLOWING_SUGAR_CANE_JUICE;
    public static Block CREAM_FROSTING_BLOCK,CARAMEL_BLOCK,BERRY_CREAM_FROSTING_BLOCK, HOT_CHOCOLATE_BLOCK, CACAO_MASS_BLOCK,CACAO_BUTTER_BLOCK, WHITE_CHOCOLATE_BLOCK, DARK_CHOCOLATE_BLOCK, HOT_DARK_CHOCOLATE_BLOCK, HOT_WHITE_CHOCOLATE_BLOCK,CHOCOLATE_CREAM_FROSTING_BLOCK,CHOCOLATE_MILK_BLOCK,GLOW_BERRY_CREAM_FROSTING_BLOCK,CHORUS_FRUIT_CREAM_FROSTING_BLOCK,
            GELATIN_MIX_BLOCK,RED_GELATIN_MIX_BLOCK,BLACK_GELATIN_MIX_BLOCK,BLUE_GELATIN_MIX_BLOCK,BROWN_GELATIN_MIX_BLOCK,CYAN_GELATIN_MIX_BLOCK,GRAY_GELATIN_MIX_BLOCK,GREEN_GELATIN_MIX_BLOCK,LIGHT_BLUE_GELATIN_MIX_BLOCK,LIGHT_GRAY_GELATIN_MIX_BLOCK,LIME_GELATIN_MIX_BLOCK,MAGENTA_GELATIN_MIX_BLOCK,ORANGE_GELATIN_MIX_BLOCK,PINK_GELATIN_MIX_BLOCK,PURPLE_GELATIN_MIX_BLOCK,YELLOW_GELATIN_MIX_BLOCK,VEGETABLE_OIL_BLOCK,SUGAR_CANE_JUICE_BLOCK;
    public static Item CREAM_FROSTING_BUCKET,CARAMEL_BUCKET,BERRY_CREAM_FROSTING_BUCKET, HOT_CHOCOLATE_BUCKET, CACAO_MASS_BUCKET, CACAO_BUTTER_BUCKET, WHITE_CHOCOLATE_BUCKET, DARK_CHOCOLATE_BUCKET, HOT_DARK_CHOCOLATE_BUCKET, HOT_WHITE_CHOCOLATE_BUCKET,CHOCOLATE_CREAM_FROSTING_BUCKET,CHOCOLATE_MILK_BUCKET,GLOW_BERRY_CREAM_FROSTING_BUCKET,CHORUS_FRUIT_CREAM_FROSTING_BUCKET,
            GELATIN_MIX_BUCKET,RED_GELATIN_MIX_BUCKET,BLACK_GELATIN_MIX_BUCKET,BLUE_GELATIN_MIX_BUCKET,BROWN_GELATIN_MIX_BUCKET,CYAN_GELATIN_MIX_BUCKET,GRAY_GELATIN_MIX_BUCKET,GREEN_GELATIN_MIX_BUCKET,LIGHT_BLUE_GELATIN_MIX_BUCKET,LIGHT_GRAY_GELATIN_MIX_BUCKET,LIME_GELATIN_MIX_BUCKET,MAGENTA_GELATIN_MIX_BUCKET,ORANGE_GELATIN_MIX_BUCKET,PINK_GELATIN_MIX_BUCKET,PURPLE_GELATIN_MIX_BUCKET,YELLOW_GELATIN_MIX_BUCKET,VEGETABLE_OIL_BUCKET,SUGAR_CANE_JUICE_BUCKET;
    public static boolean isSugarCaneJuice(FluidState state) {
        return state.isOf(ModFluids.STILL_SUGAR_CANE_JUICE) || state.isOf(ModFluids.FLOWING_SUGAR_CANE_JUICE);
    }
    public static boolean isVegetableOil(FluidState state) {
        return state.isOf(ModFluids.STILL_VEGETABLE_OIL) || state.isOf(ModFluids.FLOWING_VEGETABLE_OIL);
    }
    public static boolean isBlackGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_BLACK_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_BLACK_GELATIN_MIX);
    }
    public static boolean isBlueGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_BLUE_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_BLUE_GELATIN_MIX);
    }
    public static boolean isBrownGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_BROWN_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_BROWN_GELATIN_MIX);
    }
    public static boolean isCyanGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_CYAN_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_CYAN_GELATIN_MIX);
    }
    public static boolean isGrayGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_GRAY_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_GRAY_GELATIN_MIX);
    }
    public static boolean isGreenGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_GREEN_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_GREEN_GELATIN_MIX);
    }
    public static boolean isLightBlueGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_LIGHT_BLUE_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_LIGHT_BLUE_GELATIN_MIX);
    }
    public static boolean isLightGrayGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_LIGHT_GRAY_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_LIGHT_GRAY_GELATIN_MIX);
    }
    public static boolean isLimeGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_LIME_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_LIME_GELATIN_MIX);
    }
    public static boolean isMagentaGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_MAGENTA_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_MAGENTA_GELATIN_MIX);
    }
    public static boolean isOrangeGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_ORANGE_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_ORANGE_GELATIN_MIX);
    }
    public static boolean isPinkGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_PINK_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_PINK_GELATIN_MIX);
    }
    public static boolean isPurpleGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_PURPLE_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_PURPLE_GELATIN_MIX);
    }
    public static boolean isRedGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_RED_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_RED_GELATIN_MIX);
    }
    public static boolean isYellowGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_YELLOW_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_YELLOW_GELATIN_MIX);
    }
    public static boolean isGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_GELATIN_MIX);
    }
    public static boolean isBerryCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_BERRY_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_BERRY_CREAM_FROSTING);
    }
    public static boolean isCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_CREAM_FROSTING);
    }
    public static boolean isCaramel(FluidState state) {
        return state.isOf(ModFluids.STILL_CARAMEL) || state.isOf(ModFluids.FLOWING_CARAMEL);
    }
    public static boolean isCacaoButter(FluidState state) {
        return state.isOf(ModFluids.STILL_CACAO_BUTTER) || state.isOf(ModFluids.FLOWING_CACAO_BUTTER);
    }
    public static boolean isChorusFruitCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_CHORUS_FRUIT_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_CHORUS_FRUIT_CREAM_FROSTING);
    }
    public static boolean isHotChocolate(FluidState state) {
        return state.isOf(ModFluids.STILL_HOT_CHOCOLATE) || state.isOf(ModFluids.FLOWING_HOT_CHOCOLATE);
    }
    public static boolean isHotWhiteChocolate(FluidState state) {
        return state.isOf(ModFluids.STILL_HOT_WHITE_CHOCOLATE) || state.isOf(ModFluids.FLOWING_HOT_WHITE_CHOCOLATE);
    }
    public static boolean isHotDarkChocolate(FluidState state) {
        return state.isOf(ModFluids.STILL_HOT_DARK_CHOCOLATE) || state.isOf(ModFluids.FLOWING_HOT_DARK_CHOCOLATE);
    }
    public static boolean isWhiteChocolate(FluidState state) {
        return state.isOf(ModFluids.STILL_WHITE_CHOCOLATE) || state.isOf(ModFluids.FLOWING_WHITE_CHOCOLATE);
    }
    public static boolean isDarkChocolate(FluidState state) {
        return state.isOf(ModFluids.STILL_DARK_CHOCOLATE) || state.isOf(ModFluids.FLOWING_DARK_CHOCOLATE);
    }
    public static boolean isCacaoMass(FluidState state) {
        return state.isOf(ModFluids.STILL_CACAO_MASS) || state.isOf(ModFluids.FLOWING_CACAO_MASS);
    }
    public static boolean isChocolateCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_CHOCOLATE_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_CHOCOLATE_CREAM_FROSTING);
    }
    public static boolean isChocolateMilk(FluidState state) {
        return state.isOf(ModFluids.STILL_CHOCOLATE_MILK) || state.isOf(ModFluids.FLOWING_CHOCOLATE_MILK);
    }
    public static boolean isGlowBerryCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_GLOW_BERRY_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_GLOW_BERRY_CREAM_FROSTING);
    }
    public static void register(){
        if (CONFIG.isSugarCaneJuiceFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(SUGAR_CANE_JUICE_BUCKET);
            });
            STILL_SUGAR_CANE_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "sugar_cane_juice"), new SugarCaneJuiceFluid.Still());
            FLOWING_SUGAR_CANE_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_sugar_cane_juice"), new SugarCaneJuiceFluid.Flowing());
            SUGAR_CANE_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "sugar_cane_juice_block"),
                    new FluidBlock(ModFluids.STILL_SUGAR_CANE_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            SUGAR_CANE_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "sugar_cane_juice_bucket"),
                    new BucketItem(ModFluids.STILL_SUGAR_CANE_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isVegetableOilFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(VEGETABLE_OIL_BUCKET);
            });
            STILL_VEGETABLE_OIL = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "vegetable_oil"), new VegetableOilFluid.Still());
            FLOWING_VEGETABLE_OIL = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_vegetable_oil"), new VegetableOilFluid.Flowing());
            VEGETABLE_OIL_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "vegetable_oil_block"),
                    new FluidBlock(ModFluids.STILL_VEGETABLE_OIL, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            VEGETABLE_OIL_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "vegetable_oil_bucket"),
                    new BucketItem(ModFluids.STILL_VEGETABLE_OIL, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBlackGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(BLACK_GELATIN_MIX_BUCKET);
            });
            STILL_BLACK_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "black_gelatin_mix"), new BlackGelatinMixFluid.Still());
            FLOWING_BLACK_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_black_gelatin_mix"), new BlackGelatinMixFluid.Flowing());
            BLACK_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "black_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_BLACK_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BLACK_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "black_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_BLACK_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBlueGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(BLUE_GELATIN_MIX_BUCKET);
            });
            STILL_BLUE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "blue_gelatin_mix"), new BlueGelatinMixFluid.Still());
            FLOWING_BLUE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_blue_gelatin_mix"), new BlueGelatinMixFluid.Flowing());
            BLUE_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "blue_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_BLUE_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BLUE_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "blue_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_BLUE_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBrownGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(BROWN_GELATIN_MIX_BUCKET);
            });
            STILL_BROWN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "brown_gelatin_mix"), new BrownGelatinMixFluid.Still());
            FLOWING_BROWN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_brown_gelatin_mix"), new BrownGelatinMixFluid.Flowing());
            BROWN_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "brown_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_BROWN_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BROWN_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "brown_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_BROWN_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCyanGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CYAN_GELATIN_MIX_BUCKET);
            });
            STILL_CYAN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cyan_gelatin_mix"), new CyanGelatinMixFluid.Still());
            FLOWING_CYAN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cyan_gelatin_mix"), new CyanGelatinMixFluid.Flowing());
            CYAN_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cyan_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_CYAN_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CYAN_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cyan_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_CYAN_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGrayGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(GRAY_GELATIN_MIX_BUCKET);
            });
            STILL_GRAY_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "gray_gelatin_mix"), new GrayGelatinMixFluid.Still());
            FLOWING_GRAY_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_gray_gelatin_mix"), new GrayGelatinMixFluid.Flowing());
            GRAY_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "gray_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_GRAY_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GRAY_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "gray_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_GRAY_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGreenGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(GREEN_GELATIN_MIX_BUCKET);
            });
            STILL_GREEN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "green_gelatin_mix"), new GreenGelatinMixFluid.Still());
            FLOWING_GREEN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_green_gelatin_mix"), new GreenGelatinMixFluid.Flowing());
            GREEN_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "green_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_GREEN_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GREEN_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "green_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_GREEN_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isLightBlueGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(LIGHT_BLUE_GELATIN_MIX_BUCKET);
            });
            STILL_LIGHT_BLUE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "light_blue_gelatin_mix"), new LightBlueGelatinMixFluid.Still());
            FLOWING_LIGHT_BLUE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_light_blue_gelatin_mix"), new LightBlueGelatinMixFluid.Flowing());
            LIGHT_BLUE_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "light_blue_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_LIGHT_BLUE_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            LIGHT_BLUE_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "light_blue_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_LIGHT_BLUE_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isLightGrayGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(LIGHT_GRAY_GELATIN_MIX_BUCKET);
            });
            STILL_LIGHT_GRAY_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "light_gray_gelatin_mix"), new LightGrayGelatinMixFluid.Still());
            FLOWING_LIGHT_GRAY_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_light_gray_gelatin_mix"), new LightGrayGelatinMixFluid.Flowing());
            LIGHT_GRAY_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "light_gray_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_LIGHT_GRAY_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            LIGHT_GRAY_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "light_gray_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_LIGHT_GRAY_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isLimeGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(LIME_GELATIN_MIX_BUCKET);
            });
            STILL_LIME_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "lime_gelatin_mix"), new LimeGelatinMixFluid.Still());
            FLOWING_LIME_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_lime_gelatin_mix"), new LimeGelatinMixFluid.Flowing());
            LIME_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "lime_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_LIME_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            LIME_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "lime_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_LIME_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isMagentaGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(MAGENTA_GELATIN_MIX_BUCKET);
            });
            STILL_MAGENTA_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "magenta_gelatin_mix"), new MagentaGelatinMixFluid.Still());
            FLOWING_MAGENTA_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_magenta_gelatin_mix"), new MagentaGelatinMixFluid.Flowing());
            MAGENTA_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "magenta_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_MAGENTA_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            MAGENTA_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "magenta_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_MAGENTA_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isOrangeGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(ORANGE_GELATIN_MIX_BUCKET);
            });
            STILL_ORANGE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "orange_gelatin_mix"), new OrangeGelatinMixFluid.Still());
            FLOWING_ORANGE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_orange_gelatin_mix"), new OrangeGelatinMixFluid.Flowing());
            ORANGE_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "orange_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_ORANGE_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            ORANGE_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "orange_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_ORANGE_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isPinkGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(PINK_GELATIN_MIX_BUCKET);
            });
            STILL_PINK_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "pink_gelatin_mix"), new PinkGelatinMixFluid.Still());
            FLOWING_PINK_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_pink_gelatin_mix"), new PinkGelatinMixFluid.Flowing());
            PINK_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "pink_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_PINK_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            PINK_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "pink_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_PINK_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isPurpleGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(PURPLE_GELATIN_MIX_BUCKET);
            });
            STILL_PURPLE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "purple_gelatin_mix"), new PurpleGelatinMixFluid.Still());
            FLOWING_PURPLE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_purple_gelatin_mix"), new PurpleGelatinMixFluid.Flowing());
            PURPLE_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "purple_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_PURPLE_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            PURPLE_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "purple_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_PURPLE_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isRedGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(RED_GELATIN_MIX_BUCKET);
            });
            STILL_RED_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "red_gelatin_mix"), new RedGelatinMixFluid.Still());
            FLOWING_RED_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_red_gelatin_mix"), new RedGelatinMixFluid.Flowing());
            RED_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "red_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_RED_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            RED_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "red_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_RED_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isYellowGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(YELLOW_GELATIN_MIX_BUCKET);
            });
            STILL_YELLOW_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "yellow_gelatin_mix"), new YellowGelatinMixFluid.Still());
            FLOWING_YELLOW_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_yellow_gelatin_mix"), new YellowGelatinMixFluid.Flowing());
            YELLOW_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "yellow_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_YELLOW_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            YELLOW_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "yellow_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_YELLOW_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(GELATIN_MIX_BUCKET);
            });
            STILL_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "gelatin_mix"), new GelatinMixFluid.Still());
            FLOWING_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_gelatin_mix"), new GelatinMixFluid.Flowing());
            GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBerryCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(BERRY_CREAM_FROSTING_BUCKET);
            });
            STILL_BERRY_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "berry_cream_frosting"), new BerryCreamFrostingFluid.Still());
            FLOWING_BERRY_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_berry_cream_frosting"), new BerryCreamFrostingFluid.Flowing());
            BERRY_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "berry_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_BERRY_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BERRY_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "berry_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_BERRY_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCacaoButterFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CACAO_BUTTER_BUCKET);
            });
            STILL_CACAO_BUTTER = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cacao_butter"), new CacaoButterFluid.Still());
            FLOWING_CACAO_BUTTER = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cacao_butter"), new CacaoButterFluid.Flowing());
            CACAO_BUTTER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cacao_butter_block"),
                    new FluidBlock(ModFluids.STILL_CACAO_BUTTER, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CACAO_BUTTER_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cacao_butter_bucket"),
                    new BucketItem(ModFluids.STILL_CACAO_BUTTER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCacaoMassFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CACAO_MASS_BUCKET);
            });
            STILL_CACAO_MASS = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cacao_mass"), new CacaoMassFluid.Still());
            FLOWING_CACAO_MASS = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cacao_mass"), new CacaoMassFluid.Flowing());
            CACAO_MASS_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cacao_mass_block"),
                    new FluidBlock(ModFluids.STILL_CACAO_MASS, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CACAO_MASS_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cacao_mass_bucket"),
                    new BucketItem(ModFluids.STILL_CACAO_MASS, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCaramelFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CARAMEL_BUCKET);
            });
            STILL_CARAMEL = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "caramel"), new CaramelFluid.Still());
            FLOWING_CARAMEL = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_caramel"), new CaramelFluid.Flowing());
            CARAMEL_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "caramel_block"),
                    new FluidBlock(ModFluids.STILL_CARAMEL, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CARAMEL_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "caramel_bucket"),
                    new BucketItem(ModFluids.STILL_CARAMEL, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChocolateCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CHOCOLATE_CREAM_FROSTING_BUCKET);
            });
            STILL_CHOCOLATE_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chocolate_cream_frosting"), new ChocolateCreamFrostingFluid.Still());
            FLOWING_CHOCOLATE_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chocolate_cream_frosting"), new ChocolateCreamFrostingFluid.Flowing());
            CHOCOLATE_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chocolate_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_CHOCOLATE_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHOCOLATE_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chocolate_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_CHOCOLATE_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChocolateMilkFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CHOCOLATE_MILK_BUCKET);
            });
            STILL_CHOCOLATE_MILK = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chocolate_milk"), new ChocolateMilkFluid.Still());
            FLOWING_CHOCOLATE_MILK = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chocolate_milk"), new ChocolateMilkFluid.Flowing());
            CHOCOLATE_MILK_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chocolate_milk_block"),
                    new FluidBlock(ModFluids.STILL_CHOCOLATE_MILK, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHOCOLATE_MILK_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chocolate_milk_bucket"),
                    new BucketItem(ModFluids.STILL_CHOCOLATE_MILK, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChorusFruitCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CHORUS_FRUIT_CREAM_FROSTING_BUCKET);
            });
            STILL_CHORUS_FRUIT_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chorus_fruit_cream_frosting"), new ChorusFruitCreamFrostingFluid.Still());
            FLOWING_CHORUS_FRUIT_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chorus_fruit_cream_frosting"), new ChorusFruitCreamFrostingFluid.Flowing());
            CHORUS_FRUIT_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chorus_fruit_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_CHORUS_FRUIT_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHORUS_FRUIT_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chorus_fruit_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_CHORUS_FRUIT_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CREAM_FROSTING_BUCKET);
            });
            STILL_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cream_frosting"), new CreamFrostingFluid.Still());
            FLOWING_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cream_frosting"), new CreamFrostingFluid.Flowing());
            CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isDarkChocolateFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(DARK_CHOCOLATE_BUCKET);
            });
            STILL_DARK_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "dark_chocolate"), new DarkChocolateFluid.Still());
            FLOWING_DARK_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_dark_chocolate"), new DarkChocolateFluid.Flowing());
            DARK_CHOCOLATE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "dark_chocolate_block"),
                    new FluidBlock(ModFluids.STILL_DARK_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            DARK_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "dark_chocolate_bucket"),
                    new BucketItem(ModFluids.STILL_DARK_CHOCOLATE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGlowBerryCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(GLOW_BERRY_CREAM_FROSTING_BUCKET);
            });
            STILL_GLOW_BERRY_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "glow_berry_cream_frosting"), new GlowBerryCreamFrostingFluid.Still());
            FLOWING_GLOW_BERRY_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_glow_berry_cream_frosting"), new GlowBerryCreamFrostingFluid.Flowing());
            GLOW_BERRY_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "glow_berry_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_GLOW_BERRY_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GLOW_BERRY_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "glow_berry_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_GLOW_BERRY_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isHotChocolateFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(HOT_CHOCOLATE_BUCKET);
            });
            STILL_HOT_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "hot_chocolate"), new HotChocolateFluid.Still());
            FLOWING_HOT_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_hot_chocolate"), new HotChocolateFluid.Flowing());
            HOT_CHOCOLATE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "hot_chocolate_block"),
                    new FluidBlock(ModFluids.STILL_HOT_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            HOT_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "hot_chocolate_bucket"),
                    new BucketItem(ModFluids.STILL_HOT_CHOCOLATE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isHotDarkChocolateFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(HOT_DARK_CHOCOLATE_BUCKET);
            });
            STILL_HOT_DARK_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "hot_dark_chocolate"), new HotDarkChocolateFluid.Still());
            FLOWING_HOT_DARK_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_hot_dark_chocolate"), new HotDarkChocolateFluid.Flowing());
            HOT_DARK_CHOCOLATE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "hot_dark_chocolate_block"),
                    new FluidBlock(ModFluids.STILL_HOT_DARK_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            HOT_DARK_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "hot_dark_chocolate_bucket"),
                    new BucketItem(ModFluids.STILL_HOT_DARK_CHOCOLATE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isHotWhiteChocolateFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(HOT_WHITE_CHOCOLATE_BUCKET);
            });
            STILL_HOT_WHITE_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "hot_white_chocolate"), new HotWhiteChocolateFluid.Still());
            FLOWING_HOT_WHITE_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_hot_white_chocolate"), new HotWhiteChocolateFluid.Flowing());
            HOT_WHITE_CHOCOLATE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "hot_white_chocolate_block"),
                    new FluidBlock(ModFluids.STILL_HOT_WHITE_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            HOT_WHITE_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "hot_white_chocolate_bucket"),
                    new BucketItem(ModFluids.STILL_HOT_WHITE_CHOCOLATE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isWhiteChocolateFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(WHITE_CHOCOLATE_BUCKET);
            });
            STILL_WHITE_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "white_chocolate"), new WhiteChocolateFluid.Still());
            FLOWING_WHITE_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_white_chocolate"), new WhiteChocolateFluid.Flowing());
            WHITE_CHOCOLATE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "white_chocolate_block"),
                    new FluidBlock(ModFluids.STILL_WHITE_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            WHITE_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "white_chocolate_bucket"),
                    new BucketItem(ModFluids.STILL_WHITE_CHOCOLATE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }

    }
}