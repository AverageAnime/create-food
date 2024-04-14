package net.averageanime.createfood;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.averageanime.createfood.block.ModBlocks;
import net.averageanime.createfood.config.ModConfig;
import net.averageanime.createfood.fluid.ModFluids;
import net.averageanime.createfood.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.averageanime.createfood.block.ModBlocks.registerBlock;
import static net.averageanime.createfood.fluid.ModFluids.registerFluid;
import static net.averageanime.createfood.item.ModItems.registerItem;

public class CreateFood implements ModInitializer {
	public static final String MOD_ID = "createfood";
	public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "group"));
	public static final Logger LOGGER = LoggerFactory.getLogger("createfood");
	public static ModConfig CONFIG;
	@Override
	public void onInitialize() {

		Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
				.displayName(Text.translatable("itemgroup.createfood"))
				.icon(() -> new ItemStack(ModItems.ICON))
				.entries(((displayContext, entries) -> {
				}))
				.build());

		AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
		CONFIG = AutoConfig.getConfigHolder(ModConfig.class).getConfig();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFluids.registerModFluids();
		registerItem();
		registerBlock();
		registerFluid();

	}
}

