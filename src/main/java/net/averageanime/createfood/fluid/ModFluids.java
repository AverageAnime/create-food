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
    public static FlowableFluid STILL_CREAM_FROSTING,STILL_CARAMEL,STILL_BERRY_CREAM_FROSTING, STILL_HOT_CHOCOLATE, STILL_CACAO_MASS,STILL_CACAO_BUTTER, STILL_WHITE_CHOCOLATE, STILL_DARK_CHOCOLATE, STILL_HOT_DARK_CHOCOLATE, STILL_HOT_WHITE_CHOCOLATE,STILL_CHOCOLATE_CREAM_FROSTING,STILL_CHOCOLATE_MILK,STILL_GLOW_BERRY_CREAM_FROSTING,STILL_CHORUS_FRUIT_CREAM_FROSTING, STILL_GELATIN_MIX;
    public static FlowableFluid FLOWING_CREAM_FROSTING,FLOWING_CARAMEL,FLOWING_BERRY_CREAM_FROSTING, FLOWING_HOT_CHOCOLATE, FLOWING_CACAO_MASS,FLOWING_CACAO_BUTTER, FLOWING_WHITE_CHOCOLATE, FLOWING_DARK_CHOCOLATE, FLOWING_HOT_DARK_CHOCOLATE, FLOWING_HOT_WHITE_CHOCOLATE,FLOWING_CHOCOLATE_CREAM_FROSTING,FLOWING_CHOCOLATE_MILK,FLOWING_GLOW_BERRY_CREAM_FROSTING,FLOWING_CHORUS_FRUIT_CREAM_FROSTING,FLOWING_GELATIN_MIX;
    public static Block CREAM_FROSTING_BLOCK,CARAMEL_BLOCK,BERRY_CREAM_FROSTING_BLOCK, HOT_CHOCOLATE_BLOCK, CACAO_MASS_BLOCK,CACAO_BUTTER_BLOCK, WHITE_CHOCOLATE_BLOCK, DARK_CHOCOLATE_BLOCK, HOT_DARK_CHOCOLATE_BLOCK, HOT_WHITE_CHOCOLATE_BLOCK,CHOCOLATE_CREAM_FROSTING_BLOCK,CHOCOLATE_MILK_BLOCK,GLOW_BERRY_CREAM_FROSTING_BLOCK,CHORUS_FRUIT_CREAM_FROSTING_BLOCK,GELATIN_MIX_BLOCK;
    public static Item CREAM_FROSTING_BUCKET,CARAMEL_BUCKET,BERRY_CREAM_FROSTING_BUCKET, HOT_CHOCOLATE_BUCKET, CACAO_MASS_BUCKET, CACAO_BUTTER_BUCKET, WHITE_CHOCOLATE_BUCKET, DARK_CHOCOLATE_BUCKET, HOT_DARK_CHOCOLATE_BUCKET, HOT_WHITE_CHOCOLATE_BUCKET,CHOCOLATE_CREAM_FROSTING_BUCKET,CHOCOLATE_MILK_BUCKET,GLOW_BERRY_CREAM_FROSTING_BUCKET,CHORUS_FRUIT_CREAM_FROSTING_BUCKET,GELATIN_MIX_BUCKET;
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