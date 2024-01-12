package net.averageanime.createfood.item;

import net.averageanime.createfood.CreateFood;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ICON = registerItem("icon", new Item(new FabricItemSettings()));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CreateFood.LOGGER.info("Registering Mod Items for " + CreateFood.MOD_ID);

    }
}
