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
import static net.minecraft.block.Blocks.SLIME_BLOCK;
import static net.minecraft.block.Blocks.WHITE_CARPET;

public class ModBlocks {
    public static Block PIZZA_DOUGH,PIZZA_DOUGH_TOMATO_SAUCE,CHEESE_PIZZA,SAUSAGE_PIZZA,BACON_PIZZA,MUSHROOM_PIZZA,ONION_PIZZA,FISH_PIZZA,SAUSAGE_ONION_PIZZA,SAUSAGE_BACON_PIZZA,SAUSAGE_MUSHROOM_PIZZA,SAUSAGE_FISH_PIZZA,MUSHROOM_ONION_PIZZA,MUSHROOM_BACON_PIZZA,MUSHROOM_FISH_PIZZA,FISH_ONION_PIZZA,FISH_BACON_PIZZA,ONION_BACON_PIZZA,RAW_CHEESE_PIZZA,RAW_SAUSAGE_PIZZA,RAW_BACON_PIZZA,RAW_MUSHROOM_PIZZA,RAW_ONION_PIZZA,RAW_FISH_PIZZA,RAW_SAUSAGE_ONION_PIZZA,RAW_SAUSAGE_BACON_PIZZA,RAW_SAUSAGE_MUSHROOM_PIZZA,RAW_SAUSAGE_FISH_PIZZA,RAW_MUSHROOM_ONION_PIZZA,RAW_MUSHROOM_BACON_PIZZA,RAW_MUSHROOM_FISH_PIZZA,RAW_FISH_ONION_PIZZA,RAW_FISH_BACON_PIZZA,RAW_ONION_BACON_PIZZA,SMORES_PIE, BLACK_GELATIN_DESSERT, BLUE_GELATIN_DESSERT, BROWN_GELATIN_DESSERT, CYAN_GELATIN_DESSERT, GELATIN_DESSERT, GRAY_GELATIN_DESSERT, GREEN_GELATIN_DESSERT, LIGHT_BLUE_GELATIN_DESSERT, LIGHT_GRAY_GELATIN_DESSERT, LIME_GELATIN_DESSERT, MAGENTA_GELATIN_DESSERT, ORANGE_GELATIN_DESSERT, PINK_GELATIN_DESSERT, PURPLE_GELATIN_DESSERT, RED_GELATIN_DESSERT, YELLOW_GELATIN_DESSERT;
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

// Raw Bacon Pizza & Slice

        if (CONFIG.isRawBaconPizzaEnabled) {
            RAW_BACON_PIZZA = registerBlock("raw_bacon_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_BACON_PIZZA));
        }

// Raw Cheese Pizza & Slice

        if (CONFIG.isRawCheesePizzaEnabled) {
            RAW_CHEESE_PIZZA = registerBlock("raw_cheese_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CHEESE_PIZZA));
        }

// Raw Fish Pizza & Slice

        if (CONFIG.isRawFishPizzaEnabled) {
            RAW_FISH_PIZZA = registerBlock("raw_fish_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_FISH_PIZZA));
        }

// Raw Fish & Bacon Pizza & Slice

        if (CONFIG.isRawFishBaconPizzaEnabled) {
            RAW_FISH_BACON_PIZZA = registerBlock("raw_fish_bacon_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_FISH_BACON_PIZZA));
        }

// Raw Fish & Onion Pizza & Slice

        if (CONFIG.isRawFishOnionPizzaEnabled) {
            RAW_FISH_ONION_PIZZA = registerBlock("raw_fish_onion_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_FISH_ONION_PIZZA));
        }

// Raw Mushroom Pizza & Slice

        if (CONFIG.isRawMushroomPizzaEnabled) {
            RAW_MUSHROOM_PIZZA = registerBlock("raw_mushroom_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MUSHROOM_PIZZA));
        }

// Raw Mushroom & Bacon Pizza & Slice

        if (CONFIG.isRawMushroomBaconPizzaEnabled) {
            RAW_MUSHROOM_BACON_PIZZA = registerBlock("raw_mushroom_bacon_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MUSHROOM_BACON_PIZZA));
        }

// Raw Mushroom & Fish Pizza & Slice

        if (CONFIG.isRawMushroomFishPizzaEnabled) {
            RAW_MUSHROOM_FISH_PIZZA = registerBlock("raw_mushroom_fish_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MUSHROOM_FISH_PIZZA));
        }

// Raw Mushroom & Onion Pizza & Slice

        if (CONFIG.isRawMushroomOnionPizzaEnabled) {
            RAW_MUSHROOM_ONION_PIZZA = registerBlock("raw_mushroom_onion_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MUSHROOM_ONION_PIZZA));
        }

// Raw Onion Pizza & Slice

        if (CONFIG.isRawOnionPizzaEnabled) {
            RAW_ONION_PIZZA = registerBlock("raw_onion_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_ONION_PIZZA));
        }

// Raw Onion & Bacon Pizza & Slice

        if (CONFIG.isRawOnionBaconPizzaEnabled) {
            RAW_ONION_BACON_PIZZA = registerBlock("raw_onion_bacon_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_ONION_BACON_PIZZA));
        }

// Raw Sausage Pizza & Slice

        if (CONFIG.isRawSausagePizzaEnabled) {
            RAW_SAUSAGE_PIZZA = registerBlock("raw_sausage_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_SAUSAGE_PIZZA));
        }

// Raw Sausage & Bacon Pizza & Slice

        if (CONFIG.isRawSausageBaconPizzaEnabled) {
            RAW_SAUSAGE_BACON_PIZZA = registerBlock("raw_sausage_bacon_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_SAUSAGE_BACON_PIZZA));
        }

// Raw Sausage & Fish Pizza & Slice

        if (CONFIG.isRawSausageFishPizzaEnabled) {
            RAW_SAUSAGE_FISH_PIZZA = registerBlock("raw_sausage_fish_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_SAUSAGE_FISH_PIZZA));
        }

// Raw Sausage & Mushroom Pizza & Slice

        if (CONFIG.isRawSausageMushroomPizzaEnabled) {
            RAW_SAUSAGE_MUSHROOM_PIZZA = registerBlock("raw_sausage_mushroom_pizza", new RawPizzaBlock(FabricBlockSettings.copyOf(WHITE_CARPET).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_SAUSAGE_MUSHROOM_PIZZA));
        }

// Raw Sausage & Onion Pizza & Slice

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
