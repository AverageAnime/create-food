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
    public static FlowableFluid STILL_CREAM_FROSTING,STILL_CARAMEL,STILL_BERRY_CREAM_FROSTING, STILL_HOT_CHOCOLATE, STILL_CACAO_MASS,STILL_CACAO_BUTTER, STILL_WHITE_CHOCOLATE, STILL_DARK_CHOCOLATE, STILL_HOT_DARK_CHOCOLATE, STILL_HOT_WHITE_CHOCOLATE,STILL_CHOCOLATE_CREAM_FROSTING,STILL_CHOCOLATE_MILK,STILL_GLOW_BERRY_CREAM_FROSTING,STILL_CHORUS_FRUIT_CREAM_FROSTING, STILL_GELATIN_MIX,STILL_RED_GELATIN_MIX,STILL_BLACK_GELATIN_MIX,STILL_BLUE_GELATIN_MIX,STILL_BROWN_GELATIN_MIX,STILL_CYAN_GELATIN_MIX,STILL_GRAY_GELATIN_MIX,STILL_GREEN_GELATIN_MIX,STILL_LIGHT_BLUE_GELATIN_MIX,STILL_LIGHT_GRAY_GELATIN_MIX,STILL_LIME_GELATIN_MIX,STILL_MAGENTA_GELATIN_MIX,STILL_ORANGE_GELATIN_MIX,STILL_PINK_GELATIN_MIX,STILL_PURPLE_GELATIN_MIX,STILL_YELLOW_GELATIN_MIX,STILL_VEGETABLE_OIL,STILL_SUGAR_CANE_JUICE,STILL_CANE_SYRUP,STILL_MOLASSES,STILL_BLACKSTRAP_MOLASSES,STILL_TOFFEE,STILL_BUTTERSCOTCH,STILL_CONDENSED_MILK,STILL_APPLE_CREAM_FROSTING,STILL_BUTTERSCOTCH_FUDGE,STILL_CARAMEL_FUDGE,STILL_TOFFEE_FUDGE,STILL_CHOCOLATE_FUDGE,STILL_DARK_CHOCOLATE_FUDGE,STILL_WHITE_CHOCOLATE_FUDGE,STILL_SLIME,STILL_HEAVY_CREAM,STILL_ICE_CREAM,STILL_MILKSHAKE;
    public static FlowableFluid FLOWING_CREAM_FROSTING,FLOWING_CARAMEL,FLOWING_BERRY_CREAM_FROSTING, FLOWING_HOT_CHOCOLATE, FLOWING_CACAO_MASS,FLOWING_CACAO_BUTTER, FLOWING_WHITE_CHOCOLATE, FLOWING_DARK_CHOCOLATE, FLOWING_HOT_DARK_CHOCOLATE, FLOWING_HOT_WHITE_CHOCOLATE,FLOWING_CHOCOLATE_CREAM_FROSTING,FLOWING_CHOCOLATE_MILK,FLOWING_GLOW_BERRY_CREAM_FROSTING,FLOWING_CHORUS_FRUIT_CREAM_FROSTING, FLOWING_GELATIN_MIX,FLOWING_RED_GELATIN_MIX,FLOWING_BLACK_GELATIN_MIX,FLOWING_BLUE_GELATIN_MIX,FLOWING_BROWN_GELATIN_MIX,FLOWING_CYAN_GELATIN_MIX,FLOWING_GRAY_GELATIN_MIX,FLOWING_GREEN_GELATIN_MIX,FLOWING_LIGHT_BLUE_GELATIN_MIX,FLOWING_LIGHT_GRAY_GELATIN_MIX,FLOWING_LIME_GELATIN_MIX,FLOWING_MAGENTA_GELATIN_MIX,FLOWING_ORANGE_GELATIN_MIX,FLOWING_PINK_GELATIN_MIX,FLOWING_PURPLE_GELATIN_MIX,FLOWING_YELLOW_GELATIN_MIX,FLOWING_VEGETABLE_OIL,FLOWING_SUGAR_CANE_JUICE,FLOWING_CANE_SYRUP,FLOWING_MOLASSES,FLOWING_BLACKSTRAP_MOLASSES,FLOWING_TOFFEE,FLOWING_BUTTERSCOTCH,FLOWING_CONDENSED_MILK,FLOWING_APPLE_CREAM_FROSTING,FLOWING_BUTTERSCOTCH_FUDGE,FLOWING_CARAMEL_FUDGE,FLOWING_TOFFEE_FUDGE,FLOWING_CHOCOLATE_FUDGE,FLOWING_DARK_CHOCOLATE_FUDGE,FLOWING_WHITE_CHOCOLATE_FUDGE,FLOWING_SLIME,FLOWING_HEAVY_CREAM,FLOWING_ICE_CREAM,FLOWING_MILKSHAKE;
    public static Block CREAM_FROSTING_BLOCK,CARAMEL_BLOCK,BERRY_CREAM_FROSTING_BLOCK, HOT_CHOCOLATE_BLOCK, CACAO_MASS_BLOCK,CACAO_BUTTER_BLOCK, WHITE_CHOCOLATE_BLOCK, DARK_CHOCOLATE_BLOCK, HOT_DARK_CHOCOLATE_BLOCK, HOT_WHITE_CHOCOLATE_BLOCK,CHOCOLATE_CREAM_FROSTING_BLOCK,CHOCOLATE_MILK_BLOCK,GLOW_BERRY_CREAM_FROSTING_BLOCK,CHORUS_FRUIT_CREAM_FROSTING_BLOCK, GELATIN_MIX_BLOCK,RED_GELATIN_MIX_BLOCK,BLACK_GELATIN_MIX_BLOCK,BLUE_GELATIN_MIX_BLOCK,BROWN_GELATIN_MIX_BLOCK,CYAN_GELATIN_MIX_BLOCK,GRAY_GELATIN_MIX_BLOCK,GREEN_GELATIN_MIX_BLOCK,LIGHT_BLUE_GELATIN_MIX_BLOCK,LIGHT_GRAY_GELATIN_MIX_BLOCK,LIME_GELATIN_MIX_BLOCK,MAGENTA_GELATIN_MIX_BLOCK,ORANGE_GELATIN_MIX_BLOCK,PINK_GELATIN_MIX_BLOCK,PURPLE_GELATIN_MIX_BLOCK,YELLOW_GELATIN_MIX_BLOCK,VEGETABLE_OIL_BLOCK,SUGAR_CANE_JUICE_BLOCK,CANE_SYRUP_BLOCK,MOLASSES_BLOCK,BLACKSTRAP_MOLASSES_BLOCK,TOFFEE_BLOCK,BUTTERSCOTCH_BLOCK,CONDENSED_MILK_BLOCK,APPLE_CREAM_FROSTING_BLOCK,BUTTERSCOTCH_FUDGE_BLOCK,CARAMEL_FUDGE_BLOCK,TOFFEE_FUDGE_BLOCK,CHOCOLATE_FUDGE_BLOCK,DARK_CHOCOLATE_FUDGE_BLOCK,WHITE_CHOCOLATE_FUDGE_BLOCK,SLIME_BLOCK,HEAVY_CREAM_BLOCK,ICE_CREAM_BLOCK,MILKSHAKE_BLOCK;
    public static Item CREAM_FROSTING_BUCKET,CARAMEL_BUCKET,BERRY_CREAM_FROSTING_BUCKET, HOT_CHOCOLATE_BUCKET, CACAO_MASS_BUCKET, CACAO_BUTTER_BUCKET, WHITE_CHOCOLATE_BUCKET, DARK_CHOCOLATE_BUCKET, HOT_DARK_CHOCOLATE_BUCKET, HOT_WHITE_CHOCOLATE_BUCKET,CHOCOLATE_CREAM_FROSTING_BUCKET,CHOCOLATE_MILK_BUCKET,GLOW_BERRY_CREAM_FROSTING_BUCKET,CHORUS_FRUIT_CREAM_FROSTING_BUCKET, GELATIN_MIX_BUCKET,RED_GELATIN_MIX_BUCKET,BLACK_GELATIN_MIX_BUCKET,BLUE_GELATIN_MIX_BUCKET,BROWN_GELATIN_MIX_BUCKET,CYAN_GELATIN_MIX_BUCKET,GRAY_GELATIN_MIX_BUCKET,GREEN_GELATIN_MIX_BUCKET,LIGHT_BLUE_GELATIN_MIX_BUCKET,LIGHT_GRAY_GELATIN_MIX_BUCKET,LIME_GELATIN_MIX_BUCKET,MAGENTA_GELATIN_MIX_BUCKET,ORANGE_GELATIN_MIX_BUCKET,PINK_GELATIN_MIX_BUCKET,PURPLE_GELATIN_MIX_BUCKET,YELLOW_GELATIN_MIX_BUCKET,VEGETABLE_OIL_BUCKET,SUGAR_CANE_JUICE_BUCKET,CANE_SYRUP_BUCKET,MOLASSES_BUCKET,BLACKSTRAP_MOLASSES_BUCKET,TOFFEE_BUCKET,BUTTERSCOTCH_BUCKET,CONDENSED_MILK_BUCKET,APPLE_CREAM_FROSTING_BUCKET,BUTTERSCOTCH_FUDGE_BUCKET,CARAMEL_FUDGE_BUCKET,TOFFEE_FUDGE_BUCKET,CHOCOLATE_FUDGE_BUCKET,DARK_CHOCOLATE_FUDGE_BUCKET,WHITE_CHOCOLATE_FUDGE_BUCKET,SLIME_BUCKET,HEAVY_CREAM_BUCKET,ICE_CREAM_BUCKET,MILKSHAKE_BUCKET;
    public static boolean isMilkshake(FluidState state) {
        return state.isOf(ModFluids.STILL_MILKSHAKE) || state.isOf(ModFluids.FLOWING_MILKSHAKE);
    }
    public static boolean isIceCream(FluidState state) {
        return state.isOf(ModFluids.STILL_ICE_CREAM) || state.isOf(ModFluids.FLOWING_ICE_CREAM);
    }
    public static boolean isHeavyCream(FluidState state) {
        return state.isOf(ModFluids.STILL_HEAVY_CREAM) || state.isOf(ModFluids.FLOWING_HEAVY_CREAM);
    }
    public static boolean isSlime(FluidState state) {
        return state.isOf(ModFluids.STILL_SLIME) || state.isOf(ModFluids.FLOWING_SLIME);
    }
    public static boolean isWhiteChocolateFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_WHITE_CHOCOLATE_FUDGE) || state.isOf(ModFluids.FLOWING_WHITE_CHOCOLATE_FUDGE);
    }
    public static boolean isDarkChocolateFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_DARK_CHOCOLATE_FUDGE) || state.isOf(ModFluids.FLOWING_DARK_CHOCOLATE_FUDGE);
    }
    public static boolean isChocolateFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_CHOCOLATE_FUDGE) || state.isOf(ModFluids.FLOWING_CHOCOLATE_FUDGE);
    }
    public static boolean isToffeeFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_TOFFEE_FUDGE) || state.isOf(ModFluids.FLOWING_TOFFEE_FUDGE);
    }
    public static boolean isCaramelFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_CARAMEL_FUDGE) || state.isOf(ModFluids.FLOWING_CARAMEL_FUDGE);
    }
    public static boolean isButterscotchFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_BUTTERSCOTCH_FUDGE) || state.isOf(ModFluids.FLOWING_BUTTERSCOTCH_FUDGE);
    }
    public static boolean isAppleCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_APPLE_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_APPLE_CREAM_FROSTING);
    }
    public static boolean isCondensedMilk(FluidState state) {
        return state.isOf(ModFluids.STILL_CONDENSED_MILK) || state.isOf(ModFluids.FLOWING_CONDENSED_MILK);
    }
    public static boolean isButterscotch(FluidState state) {
        return state.isOf(ModFluids.STILL_BUTTERSCOTCH) || state.isOf(ModFluids.FLOWING_BUTTERSCOTCH);
    }
    public static boolean isToffee(FluidState state) {
        return state.isOf(ModFluids.STILL_TOFFEE) || state.isOf(ModFluids.FLOWING_TOFFEE);
    }
    public static boolean isBlackstrapMolasses(FluidState state) {
        return state.isOf(ModFluids.STILL_BLACKSTRAP_MOLASSES) || state.isOf(ModFluids.FLOWING_BLACKSTRAP_MOLASSES);
    }
    public static boolean isMolasses(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLASSES) || state.isOf(ModFluids.FLOWING_MOLASSES);
    }
    public static boolean isCaneSyrup(FluidState state) {
        return state.isOf(ModFluids.STILL_CANE_SYRUP) || state.isOf(ModFluids.FLOWING_CANE_SYRUP);
    }
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
    public static void registerModFluids () {
        CreateFood.LOGGER.info("Registering Fluids for " + CreateFood.MOD_ID);
    }
    public static void registerFluid(){
        if (CONFIG.isMilkshakeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(MILKSHAKE_BUCKET);
            });
            STILL_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "milkshake"), new MilkshakeFluid.Still());
            FLOWING_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_milkshake"), new MilkshakeFluid.Flowing());
            MILKSHAKE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "milkshake_block"),
                    new FluidBlock(ModFluids.STILL_MILKSHAKE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            MILKSHAKE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "milkshake_bucket"),
                    new BucketItem(ModFluids.STILL_MILKSHAKE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isIceCreamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(ICE_CREAM_BUCKET);
            });
            STILL_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "ice_cream"), new IceCreamFluid.Still());
            FLOWING_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_ice_cream"), new IceCreamFluid.Flowing());
            ICE_CREAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "ice_cream_block"),
                    new FluidBlock(ModFluids.STILL_ICE_CREAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            ICE_CREAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "ice_cream_bucket"),
                    new BucketItem(ModFluids.STILL_ICE_CREAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isHeavyCreamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(HEAVY_CREAM_BUCKET);
            });
            STILL_HEAVY_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "heavy_cream"), new HeavyCreamFluid.Still());
            FLOWING_HEAVY_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_heavy_cream"), new HeavyCreamFluid.Flowing());
            HEAVY_CREAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "heavy_cream_block"),
                    new FluidBlock(ModFluids.STILL_HEAVY_CREAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            HEAVY_CREAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "heavy_cream_bucket"),
                    new BucketItem(ModFluids.STILL_HEAVY_CREAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isSlimeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(SLIME_BUCKET);
            });
            STILL_SLIME = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "slime"), new SlimeFluid.Still());
            FLOWING_SLIME = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_slime"), new SlimeFluid.Flowing());
            SLIME_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "slime_block"),
                    new FluidBlock(ModFluids.STILL_SLIME, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            SLIME_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "slime_bucket"),
                    new BucketItem(ModFluids.STILL_SLIME, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isWhiteChocolateFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(WHITE_CHOCOLATE_FUDGE_BUCKET);
            });
            STILL_WHITE_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "white_chocolate_fudge"), new WhiteChocolateFudgeFluid.Still());
            FLOWING_WHITE_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_white_chocolate_fudge"), new WhiteChocolateFudgeFluid.Flowing());
            WHITE_CHOCOLATE_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "white_chocolate_fudge_block"),
                    new FluidBlock(ModFluids.STILL_WHITE_CHOCOLATE_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            WHITE_CHOCOLATE_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "white_chocolate_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_WHITE_CHOCOLATE_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isDarkChocolateFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(DARK_CHOCOLATE_FUDGE_BUCKET);
            });
            STILL_DARK_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "dark_chocolate_fudge"), new DarkChocolateFudgeFluid.Still());
            FLOWING_DARK_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_dark_chocolate_fudge"), new DarkChocolateFudgeFluid.Flowing());
            DARK_CHOCOLATE_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "dark_chocolate_fudge_block"),
                    new FluidBlock(ModFluids.STILL_DARK_CHOCOLATE_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            DARK_CHOCOLATE_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "dark_chocolate_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_DARK_CHOCOLATE_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChocolateFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CHOCOLATE_FUDGE_BUCKET);
            });
            STILL_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chocolate_fudge"), new ChocolateFudgeFluid.Still());
            FLOWING_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chocolate_fudge"), new ChocolateFudgeFluid.Flowing());
            CHOCOLATE_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chocolate_fudge_block"),
                    new FluidBlock(ModFluids.STILL_CHOCOLATE_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHOCOLATE_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chocolate_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_CHOCOLATE_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isToffeeFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(TOFFEE_FUDGE_BUCKET);
            });
            STILL_TOFFEE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "toffee_fudge"), new ToffeeFudgeFluid.Still());
            FLOWING_TOFFEE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_toffee_fudge"), new ToffeeFudgeFluid.Flowing());
            TOFFEE_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "toffee_fudge_block"),
                    new FluidBlock(ModFluids.STILL_TOFFEE_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            TOFFEE_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "toffee_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_TOFFEE_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCaramelFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CARAMEL_FUDGE_BUCKET);
            });
            STILL_CARAMEL_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "caramel_fudge"), new CaramelFudgeFluid.Still());
            FLOWING_CARAMEL_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_caramel_fudge"), new CaramelFudgeFluid.Flowing());
            CARAMEL_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "caramel_fudge_block"),
                    new FluidBlock(ModFluids.STILL_CARAMEL_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CARAMEL_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "caramel_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_CARAMEL_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isButterscotchFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(BUTTERSCOTCH_FUDGE_BUCKET);
            });
            STILL_BUTTERSCOTCH_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "butterscotch_fudge"), new ButterscotchFudgeFluid.Still());
            FLOWING_BUTTERSCOTCH_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_butterscotch_fudge"), new ButterscotchFudgeFluid.Flowing());
            BUTTERSCOTCH_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "butterscotch_fudge_block"),
                    new FluidBlock(ModFluids.STILL_BUTTERSCOTCH_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BUTTERSCOTCH_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "butterscotch_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_BUTTERSCOTCH_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isAppleCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(APPLE_CREAM_FROSTING_BUCKET);
            });
            STILL_APPLE_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "apple_cream_frosting"), new AppleCreamFrostingFluid.Still());
            FLOWING_APPLE_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_apple_cream_frosting"), new AppleCreamFrostingFluid.Flowing());
            APPLE_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "apple_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_APPLE_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            APPLE_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "apple_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_APPLE_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCondensedMilkFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CONDENSED_MILK_BUCKET);
            });
            STILL_CONDENSED_MILK = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "condensed_milk"), new CondensedMilkFluid.Still());
            FLOWING_CONDENSED_MILK = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_condensed_milk"), new CondensedMilkFluid.Flowing());
            CONDENSED_MILK_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "condensed_milk_block"),
                    new FluidBlock(ModFluids.STILL_CONDENSED_MILK, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CONDENSED_MILK_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "condensed_milk_bucket"),
                    new BucketItem(ModFluids.STILL_CONDENSED_MILK, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isButterscotchFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(BUTTERSCOTCH_BUCKET);
            });
            STILL_BUTTERSCOTCH = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "butterscotch"), new ButterscotchFluid.Still());
            FLOWING_BUTTERSCOTCH = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_butterscotch"), new ButterscotchFluid.Flowing());
            BUTTERSCOTCH_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "butterscotch_block"),
                    new FluidBlock(ModFluids.STILL_BUTTERSCOTCH, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BUTTERSCOTCH_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "butterscotch_bucket"),
                    new BucketItem(ModFluids.STILL_BUTTERSCOTCH, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isToffeeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(TOFFEE_BUCKET);
            });
            STILL_TOFFEE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "toffee"), new ToffeeFluid.Still());
            FLOWING_TOFFEE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_toffee"), new ToffeeFluid.Flowing());
            TOFFEE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "toffee_block"),
                    new FluidBlock(ModFluids.STILL_TOFFEE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            TOFFEE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "toffee_bucket"),
                    new BucketItem(ModFluids.STILL_TOFFEE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBlackstrapMolassesFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(BLACKSTRAP_MOLASSES_BUCKET);
            });
            STILL_BLACKSTRAP_MOLASSES = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "blackstrap_molasses"), new BlackstrapMolassesFluid.Still());
            FLOWING_BLACKSTRAP_MOLASSES = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_blackstrap_molasses"), new BlackstrapMolassesFluid.Flowing());
            BLACKSTRAP_MOLASSES_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "blackstrap_molasses_block"),
                    new FluidBlock(ModFluids.STILL_BLACKSTRAP_MOLASSES, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BLACKSTRAP_MOLASSES_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "blackstrap_molasses_bucket"),
                    new BucketItem(ModFluids.STILL_BLACKSTRAP_MOLASSES, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isMolassesFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(MOLASSES_BUCKET);
            });
            STILL_MOLASSES = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "molasses"), new MolassesFluid.Still());
            FLOWING_MOLASSES = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_molasses"), new MolassesFluid.Flowing());
            MOLASSES_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "molasses_block"),
                    new FluidBlock(ModFluids.STILL_MOLASSES, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            MOLASSES_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "molasses_bucket"),
                    new BucketItem(ModFluids.STILL_MOLASSES, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCaneSyrupFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> {
                entries.add(CANE_SYRUP_BUCKET);
            });
            STILL_CANE_SYRUP = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cane_syrup"), new CaneSyrupFluid.Still());
            FLOWING_CANE_SYRUP = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cane_syrup"), new CaneSyrupFluid.Flowing());
            CANE_SYRUP_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cane_syrup_block"),
                    new FluidBlock(ModFluids.STILL_CANE_SYRUP, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CANE_SYRUP_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cane_syrup_bucket"),
                    new BucketItem(ModFluids.STILL_CANE_SYRUP, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
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