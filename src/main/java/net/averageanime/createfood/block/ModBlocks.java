package net.averageanime.createfood.block;

import net.averageanime.createfood.CreateFood;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, name), block);
    }

    private static Item registerBlockItem (String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks () {
        CreateFood.LOGGER.info("Registering ModBlocks for " + CreateFood.MOD_ID);
    }

}
