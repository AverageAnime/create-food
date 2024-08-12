package net.averageanime.createfood.block;

import net.averageanime.createfood.CreateFood;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlimeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.averageanime.createfood.CreateFood.CONFIG;
import static net.minecraft.block.Blocks.*;

public class ModBlocks {
    public static Block CHOCOLATE_PIE_GRAHAM_CRACKER,GLOW_BERRY_PIE,CHORUS_FRUIT_PIE,BERRY_PIE,GLOW_BERRY_CHEESECAKE,CHORUS_FRUIT_CHEESECAKE,APPLE_CHEESECAKE,CHEESECAKE,RAW_BERRY_CHEESECAKE,RAW_APPLE_PIE,RAW_GLOW_BERRY_PIE,RAW_GLOW_BERRY_CHEESECAKE,RAW_CHORUS_FRUIT_PIE,RAW_CHORUS_FRUIT_CHEESECAKE,RAW_CHEESECAKE,RAW_BERRY_PIE,RAW_APPLE_CHEESECAKE,RAW_CHOCOLATE_PIE_GRAHAM_CRACKER,RAW_CHOCOLATE_PIE,RAW_GRAHAM_CRACKER_PIE_CRUST,RAW_PIE_CRUST,CAKE_GLOW_BERRY,CAKE_CHORUS_FRUIT,GLOW_BERRY_CREAM_CAKE_SWEET_BERRY,GLOW_BERRY_CREAM_CAKE_GLOW_BERRY,GLOW_BERRY_CREAM_CAKE_CHORUS_FRUIT,CHORUS_FRUIT_CREAM_CAKE_SWEET_BERRY,CHORUS_FRUIT_CREAM_CAKE_GLOW_BERRY,CHORUS_FRUIT_CREAM_CAKE_CHORUS_FRUIT,BERRY_CREAM_CAKE_GLOW_BERRY,BERRY_CREAM_CAKE_CHORUS_FRUIT,BERRY_CREAM_CAKE_SWEET_BERRY,CHORUS_FRUIT_CREAM_FROSTED_CAKE,GLOW_BERRY_CREAM_FROSTED_CAKE,BERRY_CREAM_FROSTED_CAKE,FROSTED_CAKE,CAKE_BASE,PIZZA_DOUGH,PIZZA_DOUGH_TOMATO_SAUCE,CHEESE_PIZZA,SAUSAGE_PIZZA,BACON_PIZZA,MUSHROOM_PIZZA,ONION_PIZZA,FISH_PIZZA,SAUSAGE_ONION_PIZZA,SAUSAGE_BACON_PIZZA,SAUSAGE_MUSHROOM_PIZZA,SAUSAGE_FISH_PIZZA,MUSHROOM_ONION_PIZZA,MUSHROOM_BACON_PIZZA,MUSHROOM_FISH_PIZZA,FISH_ONION_PIZZA,FISH_BACON_PIZZA,ONION_BACON_PIZZA,RAW_CHEESE_PIZZA,RAW_SAUSAGE_PIZZA,RAW_BACON_PIZZA,RAW_MUSHROOM_PIZZA,RAW_ONION_PIZZA,RAW_FISH_PIZZA,RAW_SAUSAGE_ONION_PIZZA,RAW_SAUSAGE_BACON_PIZZA,RAW_SAUSAGE_MUSHROOM_PIZZA,RAW_SAUSAGE_FISH_PIZZA,RAW_MUSHROOM_ONION_PIZZA,RAW_MUSHROOM_BACON_PIZZA,RAW_MUSHROOM_FISH_PIZZA,RAW_FISH_ONION_PIZZA,RAW_FISH_BACON_PIZZA,RAW_ONION_BACON_PIZZA,SMORES_PIE, BLACK_GELATIN_DESSERT, BLUE_GELATIN_DESSERT, BROWN_GELATIN_DESSERT, CYAN_GELATIN_DESSERT, GELATIN_DESSERT, GRAY_GELATIN_DESSERT, GREEN_GELATIN_DESSERT, LIGHT_BLUE_GELATIN_DESSERT, LIGHT_GRAY_GELATIN_DESSERT, LIME_GELATIN_DESSERT, MAGENTA_GELATIN_DESSERT, ORANGE_GELATIN_DESSERT, PINK_GELATIN_DESSERT, PURPLE_GELATIN_DESSERT, RED_GELATIN_DESSERT, YELLOW_GELATIN_DESSERT;

    public static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, name), block);
    }

    private static void registerBlockItem (String name, Block block){
        Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks () {
        CreateFood.LOGGER.info("Registering Blocks for " + CreateFood.MOD_ID);
    }

    public static void registerBlock(){

// Berry Cream Frosted Cake

        if (CONFIG.isBerryCreamFrostedCakeEnabled) {
            BERRY_CREAM_FROSTED_CAKE = registerBlock("berry_cream_frosted_cake", new CakeBaseBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_FROSTED_CAKE));
        }

// Berry Cream Cake (Chorus Fruit)

        if (CONFIG.isBerryCreamCakeChorusFruitEnabled) {
            BERRY_CREAM_CAKE_CHORUS_FRUIT = registerBlock("berry_cream_cake_chorus_fruit", new BerryCreamCakeChorusFruitBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_CAKE_CHORUS_FRUIT));
        }

// Berry Cream Cake (Glow Berry)

        if (CONFIG.isBerryCreamCakeGlowBerryEnabled) {
            BERRY_CREAM_CAKE_GLOW_BERRY = registerBlock("berry_cream_cake_glow_berry", new BerryCreamCakeGlowBerryBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_CAKE_GLOW_BERRY));
        }

// Berry Cream Cake (Sweet Berry)

        if (CONFIG.isBerryCreamCakeSweetBerryEnabled) {
            BERRY_CREAM_CAKE_SWEET_BERRY = registerBlock("berry_cream_cake_sweet_berry", new BerryCreamCakeSweetBerryBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_CAKE_SWEET_BERRY));
        }

// Cake Base

        if (CONFIG.isCakeBaseEnabled) {
            CAKE_BASE = registerBlock("cake_base", new CakeBaseBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CAKE_BASE));
        }

// Cake (Chorus Fruit)

        if (CONFIG.isCakeChorusFruitEnabled) {
            CAKE_CHORUS_FRUIT = registerBlock("cake_chorus_fruit", new CakeChorusFruitBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CAKE_CHORUS_FRUIT));
        }

// Cake (Glow Berry)

        if (CONFIG.isCakeGlowBerryEnabled) {
            CAKE_GLOW_BERRY = registerBlock("cake_glow_berry", new CakeGlowBerryBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CAKE_GLOW_BERRY));
        }

// Chorus Fruit Cream Cake (Chorus Fruit)

        if (CONFIG.isBerryCreamCakeChorusFruitEnabled) {
            CHORUS_FRUIT_CREAM_CAKE_CHORUS_FRUIT = registerBlock("chorus_fruit_cream_cake_chorus_fruit", new ChorusFruitCreamCakeChorusFruitBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_CAKE_CHORUS_FRUIT));
        }

// Chorus Fruit Cream Cake (Glow Berry)

        if (CONFIG.isBerryCreamCakeGlowBerryEnabled) {
            CHORUS_FRUIT_CREAM_CAKE_GLOW_BERRY = registerBlock("chorus_fruit_cream_cake_glow_berry", new ChorusFruitCreamCakeGlowBerryBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_CAKE_GLOW_BERRY));
        }

// Chorus Fruit Cream Cake (Sweet Berry)

        if (CONFIG.isBerryCreamCakeSweetBerryEnabled) {
            CHORUS_FRUIT_CREAM_CAKE_SWEET_BERRY = registerBlock("chorus_fruit_cream_cake_sweet_berry", new ChorusFruitCreamCakeSweetBerryBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_CAKE_SWEET_BERRY));
        }

// Chorus Fruit Cream Frosted Cake

        if (CONFIG.isChorusFruitCreamFrostedCakeEnabled) {
            CHORUS_FRUIT_CREAM_FROSTED_CAKE = registerBlock("chorus_fruit_cream_frosted_cake", new CakeBaseBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_FROSTED_CAKE));
        }

// Frosted Cake

        if (CONFIG.isFrostedCakeEnabled) {
            FROSTED_CAKE = registerBlock("frosted_cake", new CakeBaseBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FROSTED_CAKE));
        }

// Glow Berry Cream Cake (Chorus Fruit)

        if (CONFIG.isGlowBerryCreamCakeChorusFruitEnabled) {
            GLOW_BERRY_CREAM_CAKE_CHORUS_FRUIT = registerBlock("glow_berry_cream_cake_chorus_fruit", new GlowBerryCreamCakeChorusFruitBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_CAKE_CHORUS_FRUIT));
        }

// Glow Berry Cream Cake (Glow Berry)

        if (CONFIG.isGlowBerryCreamCakeGlowBerryEnabled) {
            GLOW_BERRY_CREAM_CAKE_GLOW_BERRY = registerBlock("glow_berry_cream_cake_glow_berry", new GlowBerryCreamCakeGlowBerryBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_CAKE_GLOW_BERRY));
        }

// Glow Berry Cream Cake (Sweet Berry)

        if (CONFIG.isGlowBerryCreamCakeSweetBerryEnabled) {
            GLOW_BERRY_CREAM_CAKE_SWEET_BERRY = registerBlock("glow_berry_cream_cake_sweet_berry", new GlowBerryCreamCakeSweetBerryBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_CAKE_SWEET_BERRY));
        }

// Glow Berry Cream Frosted Cake

        if (CONFIG.isGlowBerryCreamFrostedCakeEnabled) {
            GLOW_BERRY_CREAM_FROSTED_CAKE = registerBlock("glow_berry_cream_frosted_cake", new CakeBaseBlock(FabricBlockSettings.copyOf(CAKE).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_FROSTED_CAKE));
        }

// Pizza Dough

        if (CONFIG.isPizzaDoughEnabled) {
            PIZZA_DOUGH = registerBlock("pizza_dough", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PIZZA_DOUGH));
        }

// Pizza Dough (Sauce)

        if (CONFIG.isPizzaDoughTomatoSauceEnabled) {
            PIZZA_DOUGH_TOMATO_SAUCE = registerBlock("pizza_dough_tomato_sauce", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PIZZA_DOUGH_TOMATO_SAUCE));
        }

// Raw Apple Cheesecake

        if (CONFIG.isRawAppleCheesecakeEnabled) {
            RAW_APPLE_CHEESECAKE = registerBlock("raw_apple_cheesecake", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_APPLE_CHEESECAKE));
        }

// Raw Apple Pie

        if (CONFIG.isRawApplePieEnabled) {
            RAW_APPLE_PIE = registerBlock("raw_apple_pie", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_APPLE_PIE));
        }

// Raw Bacon Pizza

        if (CONFIG.isRawBaconPizzaEnabled) {
            RAW_BACON_PIZZA = registerBlock("raw_bacon_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_BACON_PIZZA));
        }

// Raw Berry Pie

        if (CONFIG.isRawBerryPieEnabled) {
            RAW_BERRY_PIE = registerBlock("raw_berry_pie", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_BERRY_PIE));
        }

// Raw Berry Cheesecake

        if (CONFIG.isRawBerryCheesecakeEnabled) {
            RAW_BERRY_CHEESECAKE = registerBlock("raw_berry_cheesecake", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_BERRY_CHEESECAKE));
        }

// Raw Cheesecake

        if (CONFIG.isRawCheesecakeEnabled) {
            RAW_CHEESECAKE = registerBlock("raw_cheesecake", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CHEESECAKE));
        }

// Raw Cheese Pizza

        if (CONFIG.isRawCheesePizzaEnabled) {
            RAW_CHEESE_PIZZA = registerBlock("raw_cheese_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CHEESE_PIZZA));
        }

// Raw Chocolate Pie

        if (CONFIG.isRawChocolatePieEnabled) {
            RAW_CHOCOLATE_PIE = registerBlock("raw_chocolate_pie", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CHOCOLATE_PIE));
        }

// Raw Chocolate Pie (Graham Cracker)

        if (CONFIG.isRawChocolatePieGrahamCrackerEnabled) {
            RAW_CHOCOLATE_PIE_GRAHAM_CRACKER = registerBlock("raw_chocolate_pie_graham_cracker", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CHOCOLATE_PIE_GRAHAM_CRACKER));
        }

// Raw Chorus Fruit Cheesecake

        if (CONFIG.isRawChorusFruitCheesecakeEnabled) {
            RAW_CHORUS_FRUIT_CHEESECAKE = registerBlock("raw_chorus_fruit_cheesecake", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CHORUS_FRUIT_CHEESECAKE));
        }

// Raw Chorus Fruit Pie

        if (CONFIG.isRawChorusFruitPieEnabled) {
            RAW_CHORUS_FRUIT_PIE = registerBlock("raw_chorus_fruit_pie", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CHORUS_FRUIT_PIE));
        }

// Raw Fish Pizza

        if (CONFIG.isRawFishPizzaEnabled) {
            RAW_FISH_PIZZA = registerBlock("raw_fish_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_FISH_PIZZA));
        }

// Raw Fish & Bacon Pizza

        if (CONFIG.isRawFishBaconPizzaEnabled) {
            RAW_FISH_BACON_PIZZA = registerBlock("raw_fish_bacon_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_FISH_BACON_PIZZA));
        }

// Raw Fish & Onion Pizza

        if (CONFIG.isRawFishOnionPizzaEnabled) {
            RAW_FISH_ONION_PIZZA = registerBlock("raw_fish_onion_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_FISH_ONION_PIZZA));
        }

// Raw Glow Berry Cheesecake

        if (CONFIG.isRawGlowBerryCheesecakeEnabled) {
            RAW_GLOW_BERRY_CHEESECAKE = registerBlock("raw_glow_berry_cheesecake", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_GLOW_BERRY_CHEESECAKE));
        }

// Raw Glow Berry Pie

        if (CONFIG.isRawGlowBerryPieEnabled) {
            RAW_GLOW_BERRY_PIE = registerBlock("raw_glow_berry_pie", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_GLOW_BERRY_PIE));
        }

// Raw Graham Cracker Pie Crust

        if (CONFIG.isRawGrahamCrackerPieCrustEnabled) {
            RAW_GRAHAM_CRACKER_PIE_CRUST = registerBlock("raw_graham_cracker_pie_crust", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_GRAHAM_CRACKER_PIE_CRUST));
        }

// Raw Mushroom Pizza

        if (CONFIG.isRawMushroomPizzaEnabled) {
            RAW_MUSHROOM_PIZZA = registerBlock("raw_mushroom_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MUSHROOM_PIZZA));
        }

// Raw Mushroom & Bacon Pizza

        if (CONFIG.isRawMushroomBaconPizzaEnabled) {
            RAW_MUSHROOM_BACON_PIZZA = registerBlock("raw_mushroom_bacon_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MUSHROOM_BACON_PIZZA));
        }

// Raw Mushroom & Fish Pizza

        if (CONFIG.isRawMushroomFishPizzaEnabled) {
            RAW_MUSHROOM_FISH_PIZZA = registerBlock("raw_mushroom_fish_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MUSHROOM_FISH_PIZZA));
        }

// Raw Mushroom & Onion Pizza

        if (CONFIG.isRawMushroomOnionPizzaEnabled) {
            RAW_MUSHROOM_ONION_PIZZA = registerBlock("raw_mushroom_onion_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MUSHROOM_ONION_PIZZA));
        }

// Raw Onion Pizza

        if (CONFIG.isRawOnionPizzaEnabled) {
            RAW_ONION_PIZZA = registerBlock("raw_onion_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_ONION_PIZZA));
        }

// Raw Onion & Bacon Pizza

        if (CONFIG.isRawOnionBaconPizzaEnabled) {
            RAW_ONION_BACON_PIZZA = registerBlock("raw_onion_bacon_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_ONION_BACON_PIZZA));
        }

// Raw Pie Crust

        if (CONFIG.isRawPieCrustEnabled) {
            RAW_PIE_CRUST = registerBlock("raw_pie_crust", new RawPieCrustBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_PIE_CRUST));
        }

// Raw Sausage Pizza

        if (CONFIG.isRawSausagePizzaEnabled) {
            RAW_SAUSAGE_PIZZA = registerBlock("raw_sausage_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_SAUSAGE_PIZZA));
        }

// Raw Sausage & Bacon Pizza

        if (CONFIG.isRawSausageBaconPizzaEnabled) {
            RAW_SAUSAGE_BACON_PIZZA = registerBlock("raw_sausage_bacon_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_SAUSAGE_BACON_PIZZA));
        }

// Raw Sausage & Fish Pizza

        if (CONFIG.isRawSausageFishPizzaEnabled) {
            RAW_SAUSAGE_FISH_PIZZA = registerBlock("raw_sausage_fish_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_SAUSAGE_FISH_PIZZA));
        }

// Raw Sausage & Mushroom Pizza

        if (CONFIG.isRawSausageMushroomPizzaEnabled) {
            RAW_SAUSAGE_MUSHROOM_PIZZA = registerBlock("raw_sausage_mushroom_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_SAUSAGE_MUSHROOM_PIZZA));
        }

// Raw Sausage & Onion Pizza

        if (CONFIG.isRawSausageOnionPizzaEnabled) {
            RAW_SAUSAGE_ONION_PIZZA = registerBlock("raw_sausage_onion_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_SAUSAGE_ONION_PIZZA));
        }

// Gelatin Dessert Block

        if (CONFIG.isBlackGelatinDessertBlockEnabled) {
            BLACK_GELATIN_DESSERT = registerBlock("black_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLACK_GELATIN_DESSERT));
        }
        if (CONFIG.isBlueGelatinDessertBlockEnabled) {
            BLUE_GELATIN_DESSERT = registerBlock("blue_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLUE_GELATIN_DESSERT));
        }
        if (CONFIG.isBrownGelatinDessertBlockEnabled) {
            BROWN_GELATIN_DESSERT = registerBlock("brown_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BROWN_GELATIN_DESSERT));
        }
        if (CONFIG.isCyanGelatinDessertBlockEnabled) {
            CYAN_GELATIN_DESSERT = registerBlock("cyan_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CYAN_GELATIN_DESSERT));
        }
        if (CONFIG.isGelatinDessertBlockEnabled) {
            GELATIN_DESSERT = registerBlock("gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GELATIN_DESSERT));
        }
        if (CONFIG.isGrayGelatinDessertBlockEnabled) {
            GRAY_GELATIN_DESSERT = registerBlock("gray_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAY_GELATIN_DESSERT));
        }
        if (CONFIG.isGreenGelatinDessertBlockEnabled) {
            GREEN_GELATIN_DESSERT = registerBlock("green_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GREEN_GELATIN_DESSERT));
        }
        if (CONFIG.isLightBlueGelatinDessertBlockEnabled) {
            LIGHT_BLUE_GELATIN_DESSERT = registerBlock("light_blue_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIGHT_BLUE_GELATIN_DESSERT));
        }
        if (CONFIG.isLightGrayGelatinDessertBlockEnabled) {
            LIGHT_GRAY_GELATIN_DESSERT = registerBlock("light_gray_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIGHT_GRAY_GELATIN_DESSERT));
        }
        if (CONFIG.isLimeGelatinDessertBlockEnabled) {
            LIME_GELATIN_DESSERT = registerBlock("lime_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIME_GELATIN_DESSERT));
        }
        if (CONFIG.isMagentaGelatinDessertBlockEnabled) {
            MAGENTA_GELATIN_DESSERT = registerBlock("magenta_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MAGENTA_GELATIN_DESSERT));
        }
        if (CONFIG.isOrangeGelatinDessertBlockEnabled) {
            ORANGE_GELATIN_DESSERT = registerBlock("orange_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ORANGE_GELATIN_DESSERT));
        }
        if (CONFIG.isPinkGelatinDessertBlockEnabled) {
            PINK_GELATIN_DESSERT = registerBlock("pink_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PINK_GELATIN_DESSERT));
        }
        if (CONFIG.isPurpleGelatinDessertBlockEnabled) {
            PURPLE_GELATIN_DESSERT = registerBlock("purple_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PURPLE_GELATIN_DESSERT));
        }
        if (CONFIG.isRedGelatinDessertBlockEnabled) {
            RED_GELATIN_DESSERT = registerBlock("red_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RED_GELATIN_DESSERT));
        }
        if (CONFIG.isYellowGelatinDessertBlockEnabled) {
            YELLOW_GELATIN_DESSERT = registerBlock("yellow_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(YELLOW_GELATIN_DESSERT));
        }
    }
}
