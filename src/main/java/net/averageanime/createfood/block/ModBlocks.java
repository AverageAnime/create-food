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

public class ModBlocks {
    public static Block CHEESE_PIZZA,SMORES_PIE, BLACK_GELATIN_DESSERT, BLUE_GELATIN_DESSERT, BROWN_GELATIN_DESSERT, CYAN_GELATIN_DESSERT, GELATIN_DESSERT, GRAY_GELATIN_DESSERT, GREEN_GELATIN_DESSERT, LIGHT_BLUE_GELATIN_DESSERT, LIGHT_GRAY_GELATIN_DESSERT, LIME_GELATIN_DESSERT, MAGENTA_GELATIN_DESSERT, ORANGE_GELATIN_DESSERT, PINK_GELATIN_DESSERT, PURPLE_GELATIN_DESSERT, RED_GELATIN_DESSERT, YELLOW_GELATIN_DESSERT;
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
