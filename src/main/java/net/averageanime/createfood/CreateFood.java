package net.averageanime.createfood;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.averageanime.createfood.block.ModBlocks;
import net.averageanime.createfood.config.ModConfig;
import net.averageanime.createfood.item.BottleDrink;
import net.averageanime.createfood.item.BowlFood;
import net.averageanime.createfood.item.ModItems;
import net.averageanime.createfood.item.StickFood;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
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

import static net.averageanime.createfood.fluid.ModFluids.register;
import static net.averageanime.createfood.item.ModItems.registerItem;

public class CreateFood implements ModInitializer {
	public static final String MOD_ID = "createfood";
	public static ModConfig CONFIG;

	public static final Logger LOGGER = LoggerFactory.getLogger("createfood");

	public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "group"));

	@Override
	public void onInitialize() {

		AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
		CONFIG = AutoConfig.getConfigHolder(ModConfig.class).getConfig();

// Apple Popsicle
		if (CONFIG.isApplePopsicleEnabled) {
			final Item APPLEPOPSICLE = registerItem("apple_popsicle", new StickFood(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLEPOPSICLE));
		}
// Bar of Dark Chocolate
		if (CONFIG.isDarkChocolateBarEnabled) {
			final Item BAROFDARKCHOCOLATE = registerItem("bar_of_dark_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.2f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BAROFDARKCHOCOLATE));
		}
// Bar of White Chocolate
		if (CONFIG.isWhiteChocolateBarEnabled) {
			final Item BAROFWHITECHOCOLATE = registerItem("bar_of_white_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BAROFWHITECHOCOLATE));
		}
// Beef Bun
		if (CONFIG.isBeefBunEnabled) {
			final Item BEEFBUN = registerItem("beef_bun", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUN));
		}
// Beef Bun (Bacon)
		if (CONFIG.isBeefBunBaconEnabled) {
			final Item BEEFBUNBACON = registerItem("beef_bun_bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNBACON));
		}
// Beef Bun (Bacon, Lettuce)
		if (CONFIG.isBeefBunBaconLettuceEnabled) {
			final Item BEEFBUNBACONLETTUCE = registerItem("beef_bun_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNBACONLETTUCE));
		}
// Beef Bun (Bacon, Lettuce, Tomato)
		if (CONFIG.isBeefBunBaconLettuceTomatoEnabled) {
			final Item BEEFBUNBACONLETTUCETOMATO = registerItem("beef_bun_bacon_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNBACONLETTUCETOMATO));

		}
// Beef Bun (Lettuce)
		if (CONFIG.isBeefBunLettuceEnabled) {
			final Item BEEFBUNLETTUCE = registerItem("beef_bun_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNLETTUCE));
		}
// Beef Bun (Lettuce, Tomato)
		if (CONFIG.isBeefBunLettuceTomatoEnabled) {
			final Item BEEFBUNLETTUCETOMATO = registerItem("beef_bun_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNLETTUCETOMATO));
		}
// Beef Bun (Onion)
		if (CONFIG.isBeefBunOnionEnabled) {
			final Item BEEFBUNONION = registerItem("beef_bun_onion", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNONION));
		}
// Beef Bun (Onion, Bacon)
		if (CONFIG.isBeefBunOnionBaconEnabled) {
			final Item BEEFBUNONIONBACON = registerItem("beef_bun_onion_bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNONIONBACON));
		}
// Beef Bun (Onion, Bacon, Lettuce)
		if (CONFIG.isBeefBunOnionBaconLettuceEnabled) {
			final Item BEEFBUNONIONBACONLETTUCE = registerItem("beef_bun_onion_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNONIONBACONLETTUCE));
		}
// Beef Bun (Onion, Lettuce)
		if (CONFIG.isBeefBunOnionLettuceEnabled) {
			final Item BEEFBUNONIONLETTUCE = registerItem("beef_bun_onion_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNONIONLETTUCE));
		}
// Beef Bun (Onion, Lettuce, Tomato)
		if (CONFIG.isBeefBunOnionLettuceTomatoEnabled) {
			final Item BEEFBUNONIONLETTUCETOMATO = registerItem("beef_bun_onion_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNONIONLETTUCETOMATO));
		}
// Beef Bun (Peanut Butter)
		if (CONFIG.isBeefBunPeanutButterEnabled) {
			final Item BEEFBUNPEANUTBUTTER = registerItem("beef_bun_peanut_butter", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNPEANUTBUTTER));
		}
// Beef Bun (Peanut Butter, Bacon)
		if (CONFIG.isBeefBunPeanutButterBaconEnabled) {
			final Item BEEFBUNPEANUTBUTTERBACON = registerItem("beef_bun_peanut_butter_bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNPEANUTBUTTERBACON));
		}
// Berry Cream Chocolate
		if (CONFIG.isBerryCreamChocolateEnabled) {
			final Item BERRYCREAMCHOCOLATE = registerItem("berry_cream_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMCHOCOLATE));
		}
// Berry Cream Dark Chocolate
		if (CONFIG.isBerryCreamDarkChocolateEnabled) {
			final Item BERRYCREAMDARKCHOCOLATE = registerItem("berry_cream_dark_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMDARKCHOCOLATE));
		}
// Berry Cream White Chocolate
		if (CONFIG.isBerryCreamWhiteChocolateEnabled) {
			final Item BERRYCREAMWHITECHOCOLATE = registerItem("berry_cream_white_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMWHITECHOCOLATE));
		}
// Berry Cream Filled Chocolate Pastry Bar
		if (CONFIG.isBerryCreamChocolatePastryBarEnabled) {
			final Item BERRYCREAMCHOCOLATEPASTRYBAR = registerItem("berry_cream_chocolate_pastry_bar", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMCHOCOLATEPASTRYBAR));
		}
// Berry Cream Filled Pastry Bar
		if (CONFIG.isBerryCreamPastryBarEnabled) {
			final Item BERRYCREAMCHOCOLATEPASTRYBAR = registerItem("berry_cream_pastry_bar", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMCHOCOLATEPASTRYBAR));
		}
// Berry Cream Frosting Bottle
		if (CONFIG.isBerryCreamFrostingBottleEnabled) {
			final Item BERRYCREAMFROSTINGBOTTLE = registerItem("berry_cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMFROSTINGBOTTLE));
		}
// Berry Cream Frosted Chocolate Sweet Roll
		if (CONFIG.isBerryCreamFrostedChocolateSweetRollEnabled) {
			final Item BERRYCREAMFROSTEDCHOCOLATESWEETROLL = registerItem("berry_cream_frosted_chocolate_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMFROSTEDCHOCOLATESWEETROLL));
		}
// Berry Cream Frosted Chocolate Sweet Roll (Sweet Berry)
		if (CONFIG.isBerryCreamFrostedChocolateSweetRollSweetBerryEnabled) {
			final Item BERRYCREAMFROSTEDCHOCOLATESWEETROLLSWEETBERRY = registerItem("berry_cream_frosted_chocolate_sweet_roll_sweet_berry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMFROSTEDCHOCOLATESWEETROLLSWEETBERRY));
		}
// Berry Cream Frosted Sweet Roll
		if (CONFIG.isBerryCreamFrostedSweetRollEnabled) {
			final Item BERRYCREAMFROSTEDSWEETROLL = registerItem("berry_cream_frosted_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMFROSTEDSWEETROLL));
		}
// Berry Cream Frosted Sweet Roll (Sweet Berry)
		if (CONFIG.isBerryCreamFrostedSweetRollSweetBerryEnabled) {
			final Item BERRYCREAMFROSTEDSWEETROLLSWEETBERRY = registerItem("berry_cream_frosted_sweet_roll_sweet_berry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMFROSTEDSWEETROLLSWEETBERRY));
		}
// Berry Cream Glazed Chocolate Donut
		if (CONFIG.isBerryCreamGlazedChocolateDonutEnabled) {
			final Item BERRYCREAMGLAZEDCHOCOLATEDONUT = registerItem("berry_cream_glazed_chocolate_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMGLAZEDCHOCOLATEDONUT));
		}
// Berry Cream Glazed Donut
		if (CONFIG.isBerryCreamGlazedDonutEnabled) {
			final Item BERRYCREAMGLAZEDDONUT = registerItem("berry_cream_glazed_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMGLAZEDDONUT));
		}
// Berry Popsicle
		if (CONFIG.isBerryPopsicleEnabled) {
			final Item BERRYPOPSICLE = registerItem("berry_popsicle", new StickFood(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYPOPSICLE));
		}
// Biscuit
		if (CONFIG.isBiscuitEnabled) {
			final Item BISCUIT = registerItem("biscuit", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BISCUIT));
		}
// Bread (Lettuce)
		if (CONFIG.isBreadLettuceEnabled) {
			final Item BREADLETTUCE = registerItem("bread_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADLETTUCE));
		}
// Bread (Lettuce, Carrot)
		if (CONFIG.isBreadLettuceCarrotEnabled) {
			final Item BREADLETTUCECARROT = registerItem("bread_lettuce_carrot", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADLETTUCECARROT));
		}
// Bread Slice
		if (CONFIG.isBreadSliceEnabled) {
			final Item BREADSLICE = registerItem("bread_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICE));
		}
// Bread Slice (Bacon, Lettuce, Tomato)
		if (CONFIG.isBreadSliceBaconLettuceTomatoEnabled) {
			final Item BREADSLICEBACONLETTUCETOMATO = registerItem("bread_slice_bacon_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEBACONLETTUCETOMATO));
		}
// Bread Slice (Lettuce)
		if (CONFIG.isBreadSliceLettuceEnabled) {
			final Item BREADSLICELETTUCE = registerItem("bread_slice_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICELETTUCE));
		}
// Bread Slice (Lettuce, Tomato)
		if (CONFIG.isBreadSliceLettuceTomatoEnabled) {
			final Item BREADSLICELETTUCETOMATO = registerItem("bread_slice_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICELETTUCETOMATO));
		}
// Breakfast Sausages
		if (CONFIG.isBreakfastSausagesEnabled) {
			final Item BREAKFASTSAUSAGES = registerItem("breakfast_sausages", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREAKFASTSAUSAGES));
		}
// Bun
		if (CONFIG.isBunEnabled) {
			final Item BUN = registerItem("bun", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUN));
		}
// Butter
		if (CONFIG.isButterEnabled) {
			final Item BUTTER = registerItem("butter", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTER));
		}
// Butter Dough
		if (CONFIG.isButterDoughEnabled) {
			final Item BUTTERDOUGH = registerItem("butter_dough", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERDOUGH));
		}
// Cacao Butter
		if (CONFIG.isCacaoButterEnabled) {
			final Item CACAOBUTTER = registerItem("cacao_butter", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CACAOBUTTER));
		}
// Cacao Nibs
		if (CONFIG.isCacaoNibsEnabled) {
			final Item CACAONIBS = registerItem("cacao_nibs", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CACAONIBS));
		}
// Cake Base
		if (CONFIG.isCakeBaseEnabled) {
			final Item CAKEBASE = registerItem("cake_base", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CAKEBASE));
		}
// Caramel
		if (CONFIG.isCaramelEnabled) {
			final Item CARAMEL = registerItem("caramel", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMEL));
		}
// Caramel Filled Chocolate
		if (CONFIG.isCaramelChocolateEnabled) {
			final Item CARAMELCHOCOLATE = registerItem("caramel_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELCHOCOLATE));
		}
// Caramel Filled Dark Chocolate
		if (CONFIG.isCaramelDarkChocolateEnabled) {
			final Item CARAMELDARKCHOCOLATE = registerItem("caramel_dark_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELDARKCHOCOLATE));
		}
// Caramel Filled White Chocolate
		if (CONFIG.isCaramelWhiteChocolateEnabled) {
			final Item CARAMELWHITECHOCOLATE = registerItem("caramel_white_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELWHITECHOCOLATE));
		}
// Caramel Filled Chocolate Pastry Bar
		if (CONFIG.isCaramelChocolatePastryBarEnabled) {
			final Item CARAMELCHOCOLATEPASTRYBAR = registerItem("caramel_chocolate_pastry_bar", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELCHOCOLATEPASTRYBAR));
		}
// Caramel Filled Pastry Bar
		if (CONFIG.isCaramelPastryBarEnabled) {
			final Item CARAMELPASTRYBAR = registerItem("caramel_pastry_bar", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELPASTRYBAR));
		}
// Caramel Glazed Apple
		if (CONFIG.isCaramelGlazedAppleEnabled) {
			final Item CARAMELGLAZEDAPPLE = registerItem("caramel_glazed_apple", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELGLAZEDAPPLE));
		}
// Caramel Glazed Berries
		if (CONFIG.isCaramelGlazedBerriesEnabled) {
			final Item CARAMELGLAZEDBERRIES = registerItem("caramel_glazed_berries", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELGLAZEDBERRIES));
		}
// Caramel Glazed Chocolate Sweet Roll
		if (CONFIG.isCaramelGlazedChocolateSweetRollEnabled) {
			final Item CARAMELGLAZEDCHOCOLATESWEETROLL = registerItem("caramel_glazed_chocolate_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELGLAZEDCHOCOLATESWEETROLL));
		}
// Caramel Glazed Sweet Roll
		if (CONFIG.isCaramelGlazedSweetRollEnabled) {
			final Item CARAMELGLAZEDSWEETROLL = registerItem("caramel_glazed_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELGLAZEDSWEETROLL));
		}
// Caramel Toast
		if (CONFIG.isCaramelToastEnabled) {
			final Item CARAMELTOAST = registerItem("caramel_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELTOAST));
		}
// Cheese
		if (CONFIG.isCheeseEnabled) {
			final Item CHEESEBLOCK = registerItem("cheese_block", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBLOCK));
			final Item CHEESESLICE = registerItem("cheese_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESESLICE));
		}
// Cheese and Beef Bun
		if (CONFIG.isCheeseAndBeefBunEnabled) {
			final Item CHEESEANDBEEFBUN = registerItem("cheese_and_beef_bun", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUN));
		}
// Cheese and Beef Bun (Bacon)
		if (CONFIG.isCheeseAndBeefBunBaconEnabled) {
			final Item CHEESEANDBEEFBUNBACON = registerItem("cheese_and_beef_bun_bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNBACON));
		}
// Cheese and Beef Bun (Bacon, Lettuce)
		if (CONFIG.isCheeseAndBeefBunBaconLettuceEnabled) {
			final Item CHEESEANDBEEFBUNBACONLETTUCE = registerItem("cheese_and_beef_bun_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNBACONLETTUCE));
		}
// Cheese and Beef Bun (Bacon, Lettuce, Tomato)
		if (CONFIG.isCheeseAndBeefBunBaconLettuceTomatoEnabled) {
			final Item CHEESEANDBEEFBUNBACONLETTUCETOMATO = registerItem("cheese_and_beef_bun_bacon_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNBACONLETTUCETOMATO));
		}
// Cheese and Beef Bun (Onion, Bacon)
		if (CONFIG.isCheeseAndBeefBunOnionBaconEnabled) {
			final Item CHEESEANDBEEFBUNONIONBACON = registerItem("cheese_and_beef_bun_onion_bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNONIONBACON));
		}
// Cheese and Beef Bun (Onion, Bacon, Lettuce)
		if (CONFIG.isCheeseAndBeefBunOnionBaconLettuceEnabled) {
			final Item CHEESEANDBEEFBUNONIONBACONLETTUCE = registerItem("cheese_and_beef_bun_onion_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNONIONBACONLETTUCE));
		}
// Cheese and Beef Bun (Lettuce)
		if (CONFIG.isCheeseAndBeefBunLettuceEnabled) {
			final Item CHEESEANDBEEFBUNLETTUCE = registerItem("cheese_and_beef_bun_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNLETTUCE));
		}
// Cheese and Beef Bun (Lettuce, Tomato)
		if (CONFIG.isCheeseAndBeefBunLettuceTomatoEnabled) {
			final Item CHEESEANDBEEFBUNLETTUCETOMATO = registerItem("cheese_and_beef_bun_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNLETTUCETOMATO));
		}
// Cheese and Beef Bun (Onion)
		if (CONFIG.isCheeseAndBeefBunOnionEnabled) {
			final Item CHEESEANDBEEFBUNONION = registerItem("cheese_and_beef_bun_onion", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNONION));
		}
// Cheese and Beef Bun (Onion, Lettuce)
		if (CONFIG.isCheeseAndBeefBunOnionLettuceEnabled) {
			final Item CHEESEANDBEEFBUNONIONLETTUCE = registerItem("cheese_and_beef_bun_onion_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNONIONLETTUCE));
		}
// Cheese and Beef Bun (Onion, Lettuce, Tomato)
		if (CONFIG.isCheeseAndBeefBunOnionLettuceTomatoEnabled) {
			final Item CHEESEANDBEEFBUNONIONLETTUCETOMATO = registerItem("cheese_and_beef_bun_onion_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(1.1f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNONIONLETTUCETOMATO));
		}
// Cheese and Chicken Bun
		if (CONFIG.isCheeseAndChickenBunEnabled) {
			final Item CHEESEANDCHICKENBUN = registerItem("cheese_and_chicken_bun", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDCHICKENBUN));
		}
// Cheese And Chicken Bun (Bacon, Lettuce)
		if (CONFIG.isCheeseAndChickenBunBaconLettuceEnabled) {
			final Item CHEESEANDCHICKENBUNBACONLETTUCE = registerItem("cheese_and_chicken_bun_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(13).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDCHICKENBUNBACONLETTUCE));
		}
// Cheese and Chicken Bun (Lettuce)
		if (CONFIG.isCheeseAndChickenBunLettuceEnabled) {
			final Item CHEESEANDCHICKENBUNLETTUCE = registerItem("cheese_and_chicken_bun_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDCHICKENBUNLETTUCE));
		}
// Cheese and Chicken Bun (Lettuce, Tomato)
		if (CONFIG.isCheeseAndChickenBunLettuceTomatoEnabled) {
			final Item CHEESEANDCHICKENBUNLETTUCETOMATO = registerItem("cheese_and_chicken_bun_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDCHICKENBUNLETTUCETOMATO));
		}
// Cheese and Sausage Biscuit
		if (CONFIG.isCheeseAndSausageBiscuitEnabled) {
			final Item CHEESEANDSAUSAGEBISCUIT = registerItem("cheese_and_sausage_biscuit", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(16).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDSAUSAGEBISCUIT));
		}
// Cheese and Sausage Biscuit Sandwich
		if (CONFIG.isCheeseAndSausageBiscuitSandwichEnabled) {
			final Item CHEESEANDSAUSAGEBISCUITSANDWICH = registerItem("cheese_and_sausage_biscuit_sandwich", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(21).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDSAUSAGEBISCUITSANDWICH));
		}
// Cheese Biscuit
		if (CONFIG.isCheeseBiscuitEnabled) {
			final Item CHEESEBISCUIT = registerItem("cheese_biscuit", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBISCUIT));
		}
// Cheese Biscuit Sandwich
		if (CONFIG.isCheeseBiscuitSandwichEnabled) {
			final Item CHEESEBISCUITSANDWICH = registerItem("cheese_biscuit_sandwich", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBISCUITSANDWICH));
		}
// Cheeseburger
		if (CONFIG.isCheeseburgerEnabled) {
			final Item CHEESEBURGER = registerItem("cheeseburger", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGER));
		}
// Cheeseburger (Bacon)
		if (CONFIG.isCheeseburgerBaconEnabled) {
			final Item CHEESEBURGERBACON = registerItem("cheeseburger_bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERBACON));
		}
// Cheeseburger (Bacon, Lettuce)
		if (CONFIG.isCheeseburgerBaconLettuceEnabled) {
			final Item CHEESEBURGERBACONLETTUCE = registerItem("cheeseburger_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERBACONLETTUCE));
		}
// Cheeseburger (Onion)
		if (CONFIG.isCheeseburgerOnionEnabled) {
			final Item CHEESEBURGERONION = registerItem("cheeseburger_onion", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERONION));
		}
// Cheeseburger (Onion, Bacon)
		if (CONFIG.isCheeseburgerOnionBaconEnabled) {
			final Item CHEESEBURGERONIONBACON = registerItem("cheeseburger_onion_bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(13).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERONIONBACON));
		}
// Cheeseburger (Onion, Lettuce)
		if (CONFIG.isCheeseburgerOnionLettuceEnabled) {
			final Item CHEESEBURGERONIONLETTUCE = registerItem("cheeseburger_onion_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERONIONLETTUCE));
		}
// Cheeseburger (Onion, Bacon, Lettuce)
		if (CONFIG.isCheeseburgerOnionBaconLettuceEnabled) {
			final Item CHEESEBURGERONIONBACONLETTUCE = registerItem("cheeseburger_onion_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(13).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERONIONBACONLETTUCE));
		}
// Cheeseburger (Bacon, Lettuce, Tomato)
		if (CONFIG.isCheeseburgerBaconLettuceTomatoEnabled) {
			final Item CHEESEBURGERBACONLETTUCETOMATO = registerItem("cheeseburger_bacon_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(13).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERBACONLETTUCETOMATO));
		}
// Cheeseburger (Lettuce)
		if (CONFIG.isCheeseburgerLettuceEnabled) {
			final Item CHEESEBURGERLETTUCE = registerItem("cheeseburger_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERLETTUCE));
		}
// Cheeseburger (Lettuce, Tomato)
		if (CONFIG.isCheeseburgerLettuceTomatoEnabled) {
			final Item CHEESEBURGERLETTUCETOMATO = registerItem("cheeseburger_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERLETTUCETOMATO));
		}
// Cheeseburger (Onion, Lettuce, Tomato)
		if (CONFIG.isCheeseburgerOnionLettuceTomatoEnabled) {
			final Item CHEESEBURGERONIONLETTUCETOMATO = registerItem("cheeseburger_onion_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERONIONLETTUCETOMATO));
		}
// Chicken Bun
		if (CONFIG.isChickenBunEnabled) {
			final Item CHICKENBUN = registerItem("chicken_bun", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBUN));
		}
// Chicken Bun (Bacon, Lettuce)
		if (CONFIG.isChickenBunBaconLettuceEnabled) {
			final Item CHICKENBUNBACONLETTUCE = registerItem("chicken_bun_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBUNBACONLETTUCE));
		}
// Chicken Bun (Lettuce)
		if (CONFIG.isChickenBunLettuceEnabled) {
			final Item CHICKENBUNLETTUCE = registerItem("chicken_bun_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBUNLETTUCE));
		}
// Chicken Bun (Lettuce, Tomato)
		if (CONFIG.isChickenBunLettuceTomatoEnabled) {
			final Item CHICKENBUNLETTUCETOMATO = registerItem("chicken_bun_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBUNLETTUCETOMATO));
		}
// Chicken Burger
		if (CONFIG.isChickenBurgerEnabled) {
			final Item CHICKENBURGER = registerItem("chicken_burger", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBURGER));
		}
// Chicken Burger (Bacon, Lettuce)
		if (CONFIG.isChickenBurgerBaconLettuceEnabled) {
			final Item CHICKENBURGERBACONLETTUCE = registerItem("chicken_burger_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(14).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBURGERBACONLETTUCE));
		}
// Chicken Burger (Lettuce)
		if (CONFIG.isChickenBurgerLettuceEnabled) {
			final Item CHICKENBURGERLETTUCE = registerItem("chicken_burger_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBURGERLETTUCE));
		}
// Chicken Burger (Lettuce, Tomato)
		if (CONFIG.isChickenBurgerLettuceTomatoEnabled) {
			final Item CHICKENBURGERLETTUCETOMATO = registerItem("chicken_burger_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBURGERLETTUCETOMATO));
		}
// Chicken Cheeseburger
		if (CONFIG.isChickenCheeseburgerEnabled) {
			final Item CHICKENCHEESEBURGER = registerItem("chicken_cheeseburger", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENCHEESEBURGER));
		}
// Chicken Cheeseburger (Bacon, Lettuce)
		if (CONFIG.isChickenCheeseburgerBaconLettuceEnabled) {
			final Item CHICKENCHEESEBURGERBACONLETTUCE = registerItem("chicken_cheeseburger_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(15).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENCHEESEBURGERBACONLETTUCE));
		}
// Chicken Cheeseburger (Lettuce)
		if (CONFIG.isChickenCheeseburgerLettuceEnabled) {
			final Item CHICKENCHEESEBURGERLETTUCE = registerItem("chicken_cheeseburger_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENCHEESEBURGERLETTUCE));
		}
// Chicken Cheeseburger (Lettuce, Tomato)
		if (CONFIG.isChickenCheeseburgerLettuceTomatoEnabled) {
			final Item CHICKENCHEESEBURGERLETTUCETOMATO = registerItem("chicken_cheeseburger_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENCHEESEBURGERLETTUCETOMATO));
		}
// Chicken Nuggets
		if (CONFIG.isChickenNuggetsEnabled) {
			final Item CHICKENNUGGETS = registerItem("chicken_nuggets", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENNUGGETS));
		}
// Chicken Patty
		if (CONFIG.isChickenPattyEnabled) {
			final Item CHICKENPATTY = registerItem("chicken_patty", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENPATTY));
		}
// Chocolate Bottle
		if (CONFIG.isChocolateBottleEnabled) {
			final Item CHOCOLATEBOTTLE = registerItem("chocolate_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build()).maxCount(64)));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEBOTTLE));
		}
// Chocolate Chips
		if (CONFIG.isChocolateChipsEnabled) {
			final Item CHOCOLATECHIPS = registerItem("chocolate_chips", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATECHIPS));
		}
// Chocolate Cookie
		if (CONFIG.isChocolateCookieEnabled) {
			final Item CHOCOLATECOOKIE = registerItem("chocolate_cookie", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATECOOKIE));
		}
// Chocolate Covered Marshmallow Stick
		if (CONFIG.isChocolateCoveredMarshmallowStickEnabled) {
			final Item CHOCOLATECOVEREDMARSHMALLOWSTICK = registerItem("chocolate_covered_marshmallow_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATECOVEREDMARSHMALLOWSTICK));
		}
// Chocolate Cream Frosting Jar
		if (CONFIG.isChocolateCreamFrostingBottleEnabled) {
			final Item CHOCOLATECREAMFROSTINGBOTTLE = registerItem("chocolate_cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build()).maxCount(64)));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATECREAMFROSTINGBOTTLE));
		}
// Chocolate Donut Base
		if (CONFIG.isChocolateDonutBaseEnabled) {
			final Item CHOCOLATEDONUTBASE = registerItem("chocolate_donut_base", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEDONUTBASE));
		}
// Chocolate Donut Hole
		if (CONFIG.isChocolateDonutHoleEnabled) {
			final Item CHOCOLATEDONUTHOLE = registerItem("chocolate_donut_hole", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEDONUTHOLE));
		}
// Chocolate Donut Hole (Sugar)
		if (CONFIG.isChocolateDonutHoleSugarEnabled) {
			final Item CHOCOLATEDONUTHOLESUGAR = registerItem("chocolate_donut_hole_sugar", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEDONUTHOLESUGAR));
		}
// Chocolate Filled Mini Graham Cracker Pie Crust
		if (CONFIG.isChocolateFilledMiniGrahamCrackerPieCrustEnabled) {
			final Item CHOCOLATEFILLEDMINIGRAHAMCRACKERPIECRUST = registerItem("chocolate_filled_mini_graham_cracker_pie_crust", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEFILLEDMINIGRAHAMCRACKERPIECRUST));
		}
// Chocolate Filled Chocolate Pastry
		if (CONFIG.isChocolateChocolatePastryEnabled) {
			final Item CHOCOLATECHOCOLATEPASTRY = registerItem("chocolate_chocolate_pastry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATECHOCOLATEPASTRY));
		}
// Chocolate Filled Pastry
		if (CONFIG.isChocolatePastryEnabled) {
			final Item CHOCOLATEPASTRY = registerItem("chocolate_pastry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEPASTRY));
		}
// Chocolate Frosted Chocolate Sweet Roll
		if (CONFIG.isChocolateFrostedChocolateSweetRollEnabled) {
			final Item CHOCOLATEFROSTEDCHOCOLATESWEETROLL = registerItem("chocolate_frosted_chocolate_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEFROSTEDCHOCOLATESWEETROLL));
		}
// Chocolate Frosted Sweet Roll
		if (CONFIG.isChocolateFrostedSweetRollEnabled) {
			final Item CHOCOLATEFROSTEDSWEETROLL = registerItem("chocolate_frosted_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEFROSTEDSWEETROLL));
		}
// Chocolate Glazed Apple
		if (CONFIG.isChocolateGlazedAppleEnabled) {
			final Item CHOCOLATEGLAZEDAPPLE = registerItem("chocolate_glazed_apple", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEGLAZEDAPPLE));
		}
// Chocolate Glazed Chocolate Donut
		if (CONFIG.isChocolateGlazedChocolateDonutEnabled) {
			final Item CHOCOLATEGLAZEDCHOCOLATEDONUT = registerItem("chocolate_glazed_chocolate_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEGLAZEDCHOCOLATEDONUT));
		}
// Chocolate Glazed Donut
		if (CONFIG.isChocolateGlazedDonutEnabled) {
			final Item CHOCOLATEGLAZEDDONUT = registerItem("chocolate_glazed_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEGLAZEDDONUT));
		}
// Chocolate Milk Bottle
		if (CONFIG.isChocolateMilkBottleEnabled) {
			final Item CHOCOLATEMILKBOTTLE = registerItem("chocolate_milk_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEMILKBOTTLE));
		}
// Chocolate Pastry Bar Base
		if (CONFIG.isChocolatePastryBarBaseEnabled) {
			final Item CHOCOLATEPASTRYBARBASE = registerItem("chocolate_pastry_bar_base", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEPASTRYBARBASE));
		}
// Chocolate Pastry Base
		if (CONFIG.isChocolatePastryBaseEnabled) {
			final Item CHOCOLATEPASTRYBASE = registerItem("chocolate_pastry_base", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEPASTRYBASE));
		}
// Chocolate Sugar Dough
		if (CONFIG.isChocolateSugarDoughEnabled) {
			final Item CHOCOLATESUGARDOUGH = registerItem("chocolate_sugar_dough", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATESUGARDOUGH));
		}
// Chocolate Sweet Roll
		if (CONFIG.isChocolateSweetRollEnabled) {
			final Item CHOCOLATESWEETROLL = registerItem("chocolate_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATESWEETROLL));
		}
// Chocolate Sweet Roll Base
		if (CONFIG.isChocolateSweetRollBaseEnabled) {
			final Item CHOCOLATESWEETROLLBASE = registerItem("chocolate_sweet_roll_base", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATESWEETROLLBASE));
		}
// Chocolate Toast
		if (CONFIG.isChocolateToastEnabled) {
			final Item CHOCOLATETOAST = registerItem("chocolate_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATETOAST));
		}
// Chorus Fruit Cream Chocolate
		if (CONFIG.isChorusFruitCreamChocolateEnabled) {
			final Item CHORUSFRUITCREAMCHOCOLATE = registerItem("chorus_fruit_cream_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMCHOCOLATE));
		}
// Chorus Fruit Cream Dark Chocolate
		if (CONFIG.isChorusFruitCreamDarkChocolateEnabled) {
			final Item CHORUSFRUITCREAMDARKCHOCOLATE = registerItem("chorus_fruit_cream_dark_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMDARKCHOCOLATE));
		}
// Chorus Fruit Cream Glazed Chocolate Donut
		if (CONFIG.isChorusFruitCreamGlazedChocolateDonutEnabled) {
			final Item CHORUSFRUITCREAMGLAZEDCHOCOLATEDONUT = registerItem("chorus_fruit_cream_glazed_chocolate_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMGLAZEDCHOCOLATEDONUT));
		}
// Chorus Fruit Cream Glazed Donut
		if (CONFIG.isChorusFruitCreamGlazedDonutEnabled) {
			final Item CHORUSFRUITCREAMGLAZEDDONUT = registerItem("chorus_fruit_cream_glazed_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMGLAZEDDONUT));
		}
// Chorus Fruit Cream White Chocolate
		if (CONFIG.isChorusFruitCreamWhiteChocolateEnabled) {
			final Item CHORUSFRUITCREAMWHITECHOCOLATE = registerItem("chorus_fruit_cream_white_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMWHITECHOCOLATE));
		}
// Chorus Fruit Cream Filled Chocolate Pastry Bar
		if (CONFIG.isChorusFruitCreamChocolatePastryBarEnabled) {
			final Item CHORUSFRUITCREAMCHOCOLATEPASTRYBAR = registerItem("chorus_fruit_cream_chocolate_pastry_bar", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMCHOCOLATEPASTRYBAR));
		}
// Chorus Fruit Cream Filled Pastry Bar
		if (CONFIG.isChorusFruitCreamPastryBarEnabled) {
			final Item CHORUSFRUITCREAMPASTRYBAR = registerItem("chorus_fruit_cream_pastry_bar", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMPASTRYBAR));
		}
// Chorus Fruit Cream Frosting Bottle
		if (CONFIG.isChorusFruitCreamFrostingBottleEnabled) {
			final Item CHORUSFRUITCREAMFROSTINGBOTTLE = registerItem("chorus_fruit_cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMFROSTINGBOTTLE));
		}
// Chorus Fruit Cream Frosted Chocolate Sweet Roll
		if (CONFIG.isChorusFruitCreamFrostedChocolateSweetRollEnabled) {
			final Item CHORUSFRUITCREAMFROSTEDCHOCOLATESWEETROLL = registerItem("chorus_fruit_cream_frosted_chocolate_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMFROSTEDCHOCOLATESWEETROLL));
		}
// Chorus Fruit Cream Frosted Chocolate Sweet Roll (Chorus Fruit)
		if (CONFIG.isChorusFruitCreamFrostedChocolateSweetRollChorusFruitEnabled) {
			final Item CHORUSFRUITCREAMFROSTEDCHOCOLATESWEETROLLCHORUSFRUIT = registerItem("chorus_fruit_cream_frosted_chocolate_sweet_roll_chorus_fruit", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMFROSTEDCHOCOLATESWEETROLLCHORUSFRUIT));
		}
// Chorus Fruit Cream Frosted Sweet Roll
		if (CONFIG.isChorusFruitCreamFrostedSweetRollEnabled) {
			final Item CHORUSFRUITCREAMFROSTEDSWEETROLL = registerItem("chorus_fruit_cream_frosted_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMFROSTEDSWEETROLL));
		}
// Chorus Fruit Cream Frosted Sweet Roll (Chorus Fruit)
		if (CONFIG.isChorusFruitCreamFrostedSweetRollChorusFruitEnabled) {
			final Item CHORUSFRUITCREAMFROSTEDSWEETROLLCHORUSFRUIT = registerItem("chorus_fruit_cream_frosted_sweet_roll_chorus_fruit", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMFROSTEDSWEETROLLCHORUSFRUIT));
		}
// Cinnamon Sweet Roll Base
		if (CONFIG.isCinnamonSweetRollBaseEnabled) {
			final Item CINNAMONSWEETROLLBASE = registerItem("cinnamon_sweet_roll_base", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CINNAMONSWEETROLLBASE));
		}
// Cloth Filter
		if (CONFIG.isClothFilterEnabled) {
			final Item CLOTHFILTER = registerItem("cloth_filter", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CLOTHFILTER));
		}
// Cloth Filter (Cacao Mass)
		if (CONFIG.isClothFilterCacaoMassEnabled) {
			final Item CLOTHFILTERCACAOMASS = registerItem("cloth_filter_cacao_mass", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CLOTHFILTERCACAOMASS));
		}
// Cocoa Powder
		if (CONFIG.isCocoaPowderEnabled) {
			final Item COCOAPOWDER = registerItem("cocoa_powder", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(COCOAPOWDER));
		}
// Cream Filled Chocolate
		if (CONFIG.isCreamChocolateEnabled) {
			final Item CREAMCHOCOLATE = registerItem("cream_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMCHOCOLATE));
		}
// Cream Filled Chocolate Pastry
		if (CONFIG.isCreamChocolatePastryEnabled) {
			final Item CREAMCHOCOLATEPASTRY = registerItem("cream_chocolate_pastry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMCHOCOLATEPASTRY));
		}
// Cream Filled Dark Chocolate
		if (CONFIG.isCreamDarkChocolateEnabled) {
			final Item CREAMDARKCHOCOLATE = registerItem("cream_dark_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMDARKCHOCOLATE));
		}
// Cream Filled Pastry
		if (CONFIG.isCreamPastryEnabled) {
			final Item CREAMPASTRY = registerItem("cream_pastry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMPASTRY));
		}
// Cream Filled White Chocolate
		if (CONFIG.isCreamWhiteChocolateEnabled) {
			final Item CREAMWHITECHOCOLATE = registerItem("cream_white_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMWHITECHOCOLATE));
		}
// Cream Frosting Jar
		if (CONFIG.isCreamFrostingBottleEnabled) {
			final Item CREAMFROSTINGBOTTLE = registerItem("cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build()).maxCount(64)));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMFROSTINGBOTTLE));
		}
// Cream Glazed Chocolate Donut
		if (CONFIG.isCreamGlazedChocolateDonutEnabled) {
			final Item CREAMGLAZEDCHOCOLATEDONUT = registerItem("cream_glazed_chocolate_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMGLAZEDCHOCOLATEDONUT));
		}
// Cream Glazed Donut
		if (CONFIG.isCreamGlazedDonutEnabled) {
			final Item CREAMGLAZEDDONUT = registerItem("cream_glazed_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMGLAZEDDONUT));
		}
// Dark Chips Chocolate Cookie
		if (CONFIG.isDarkChipsChocolateCookieEnabled) {
			final Item DARKCHIPSCHOCOLATECOOKIE = registerItem("dark_chips_chocolate_cookie", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHIPSCHOCOLATECOOKIE));
		}
// Dark Chips Cookie
		if (CONFIG.isDarkChipsCookieEnabled) {
			final Item DARKCHIPSCOOKIE = registerItem("dark_chips_cookie", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHIPSCOOKIE));
		}
// Dark Chocolate Bottle
		if (CONFIG.isDarkChocolateBottleEnabled) {
			final Item DARKCHOCOLATEBOTTLE = registerItem("dark_chocolate_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build()).maxCount(64)));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATEBOTTLE));
		}
// Dark Chocolate Chips
		if (CONFIG.isDarkChocolateChipsEnabled) {
			final Item DARKCHOCOLATECHIPS = registerItem("dark_chocolate_chips", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATECHIPS));
		}
// Dark Chocolate Covered Marshmallow Stick
		if (CONFIG.isDarkChocolateCoveredMarshmallowStickEnabled) {
			final Item DARKCHOCOLATECOVEREDMARSHMALLOWSTICK = registerItem("dark_chocolate_covered_marshmallow_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATECOVEREDMARSHMALLOWSTICK));
		}
// Dark Chocolate Filled Chocolate Pastry
		if (CONFIG.isDarkChocolateChocolatePastryEnabled) {
			final Item DARKCHOCOLATECHOCOLATEPASTRY = registerItem("dark_chocolate_chocolate_pastry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATECHOCOLATEPASTRY));
		}
// Dark Chocolate Filled Pastry
		if (CONFIG.isDarkChocolatePastryEnabled) {
			final Item DARKCHOCOLATEPASTRY = registerItem("dark_chocolate_pastry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATEPASTRY));
		}
// Dark Chocolate Glazed Apple
		if (CONFIG.isDarkChocolateGlazedAppleEnabled) {
			final Item DARKCHOCOLATEGLAZEDAPPLE = registerItem("dark_chocolate_glazed_apple", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATEGLAZEDAPPLE));
		}
// Dark Chocolate Glazed Berries
		if (CONFIG.isDarkChocolateGlazedBerriesEnabled) {
			final Item DARKCHOCOLATEGLAZEDBERRIES = registerItem("dark_chocolate_glazed_berries", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATEGLAZEDBERRIES));
		}
// Dark Chocolate Toast
		if (CONFIG.isDarkChocolateToastEnabled) {
			final Item DARKCHOCOLATETOAST = registerItem("dark_chocolate_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATETOAST));
		}
// Diced Onion
		if (CONFIG.isDicedOnionEnabled) {
			final Item DICEDONION = registerItem("diced_onion", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DICEDONION));
		}
// Donut Base
		if (CONFIG.isDonutBaseEnabled) {
			final Item DONUTBASE = registerItem("donut_base", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1.1f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DONUTBASE));
		}
// Donut Hole
		if (CONFIG.isDonutHoleEnabled) {
			final Item DONUTHOLE = registerItem("donut_hole", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DONUTHOLE));
		}
// Donut Hole (Sugar)
		if (CONFIG.isDonutHoleSugarEnabled) {
			final Item DONUTHOLESUGAR = registerItem("donut_hole_sugar", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DONUTHOLESUGAR));
		}
// Frosted Cake
		if (CONFIG.isFrostedCakeEnabled) {
			final Item FROSTEDCAKE = registerItem("frosted_cake", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FROSTEDCAKE));
		}
// Gelatin
		if (CONFIG.isGelatinEnabled) {
			final Item GELATIN = registerItem("gelatin", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GELATIN));
		}
// Gelatin Dessert Slice
		if (CONFIG.isGelatinDessertSliceEnabled) {
			final Item GELATINDESSERTSLICE = registerItem("gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GELATINDESSERTSLICE));
		}
		if (CONFIG.isBlackGelatinDessertSliceEnabled) {
			final Item BLACKGELATINDESSERTSLICE = registerItem("black_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLACKGELATINDESSERTSLICE));
		}
		if (CONFIG.isBlueGelatinDessertSliceEnabled) {
			final Item BLUEGELATINDESSERTSLICE = registerItem("blue_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLUEGELATINDESSERTSLICE));
		}
		if (CONFIG.isBrownGelatinDessertSliceEnabled) {
			final Item BROWNGELATINDESSERTSLICE = registerItem("brown_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BROWNGELATINDESSERTSLICE));
		}
		if (CONFIG.isCyanGelatinDessertSliceEnabled) {
			final Item CYANGELATINDESSERTSLICE = registerItem("cyan_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CYANGELATINDESSERTSLICE));
		}
		if (CONFIG.isGrayGelatinDessertSliceEnabled) {
			final Item GRAYGELATINDESSERTSLICE = registerItem("gray_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAYGELATINDESSERTSLICE));
		}
		if (CONFIG.isGreenGelatinDessertSliceEnabled) {
			final Item GREENGELATINDESSERTSLICE = registerItem("green_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GREENGELATINDESSERTSLICE));
		}
		if (CONFIG.isLightBlueGelatinDessertSliceEnabled) {
			final Item LIGHTBLUEGELATINDESSERTSLICE = registerItem("light_blue_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIGHTBLUEGELATINDESSERTSLICE));
		}
		if (CONFIG.isLightGrayGelatinDessertSliceEnabled) {
			final Item LIGHTGRAYGELATINDESSERTSLICE = registerItem("light_gray_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIGHTGRAYGELATINDESSERTSLICE));
		}
		if (CONFIG.isLimeGelatinDessertSliceEnabled) {
			final Item LIMEGELATINDESSERTSLICE = registerItem("lime_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIMEGELATINDESSERTSLICE));
		}
		if (CONFIG.isMagentaGelatinDessertSliceEnabled) {
			final Item MAGENTAGELATINDESSERTSLICE = registerItem("magenta_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MAGENTAGELATINDESSERTSLICE));
		}
		if (CONFIG.isOrangeGelatinDessertSliceEnabled) {
			final Item ORANGEGELATINDESSERTSLICE = registerItem("orange_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ORANGEGELATINDESSERTSLICE));
		}
		if (CONFIG.isPinkGelatinDessertSliceEnabled) {
			final Item PINKGELATINDESSERTSLICE = registerItem("pink_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PINKGELATINDESSERTSLICE));
		}
		if (CONFIG.isPurpleGelatinDessertSliceEnabled) {
			final Item PURPLEGELATINDESSERTSLICE = registerItem("purple_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PURPLEGELATINDESSERTSLICE));
		}
		if (CONFIG.isRedGelatinDessertSliceEnabled) {
			final Item REDGELATINDESSERTSLICE = registerItem("red_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(REDGELATINDESSERTSLICE));
		}
		if (CONFIG.isYellowGelatinDessertSliceEnabled) {
			final Item YELLOWGELATINDESSERTSLICE = registerItem("yellow_gelatin_dessert_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(YELLOWGELATINDESSERTSLICE));
		}

// Glow Berry Cream Chocolate
		if (CONFIG.isGlowBerryCreamChocolateEnabled) {
			final Item GLOWBERRYCREAMCHOCOLATE = registerItem("glow_berry_cream_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMCHOCOLATE));
		}
// Glow Berry Cream Dark Chocolate
		if (CONFIG.isGlowBerryCreamDarkChocolateEnabled) {
			final Item GLOWBERRYCREAMDARKCHOCOLATE = registerItem("glow_berry_cream_dark_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMDARKCHOCOLATE));
		}
// Glow Berry Cream White Chocolate
		if (CONFIG.isGlowBerryCreamWhiteChocolateEnabled) {
			final Item GLOWBERRYCREAMWHITECHOCOLATE = registerItem("glow_berry_cream_white_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMWHITECHOCOLATE));
		}
// Glow Berry Cream Filled Chocolate Pastry Bar
		if (CONFIG.isGlowBerryCreamChocolatePastryBarEnabled) {
			final Item GLOWBERRYCREAMCHOCOLATEPASTRYBAR = registerItem("glow_berry_cream_chocolate_pastry_bar", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMCHOCOLATEPASTRYBAR));
		}
// Glow Berry Cream Filled Pastry Bar
		if (CONFIG.isGlowBerryCreamPastryBarEnabled) {
			final Item GLOWBERRYCREAMCHOCOLATEPASTRYBAR = registerItem("glow_berry_cream_pastry_bar", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMCHOCOLATEPASTRYBAR));
		}
// Glow Berry Cream Frosting Bottle
		if (CONFIG.isGlowBerryCreamFrostingBottleEnabled) {
			final Item GLOWBERRYCREAMFROSTINGBOTTLE = registerItem("glow_berry_cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMFROSTINGBOTTLE));
		}
// Glow Berry Cream Frosted Chocolate Sweet Roll
		if (CONFIG.isGlowBerryCreamFrostedChocolateSweetRollEnabled) {
			final Item GLOWBERRYCREAMFROSTEDCHOCOLATESWEETROLL = registerItem("glow_berry_cream_frosted_chocolate_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMFROSTEDCHOCOLATESWEETROLL));
		}
// Glow Berry Cream Frosted Chocolate Sweet Roll (Glow Berry)
		if (CONFIG.isGlowBerryCreamFrostedChocolateSweetRollGlowBerryEnabled) {
			final Item GLOWBERRYCREAMFROSTEDCHOCOLATESWEETROLLGLOWBERRY = registerItem("glow_berry_cream_frosted_chocolate_sweet_roll_glow_berry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMFROSTEDCHOCOLATESWEETROLLGLOWBERRY));
		}
// Glow Berry Cream Frosted Sweet Roll
		if (CONFIG.isGlowBerryCreamFrostedSweetRollEnabled) {
			final Item GLOWBERRYCREAMFROSTEDSWEETROLL = registerItem("glow_berry_cream_frosted_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMFROSTEDSWEETROLL));
		}
// Glow Berry Cream Frosted Sweet Roll (Glow Berry)
		if (CONFIG.isGlowBerryCreamFrostedSweetRollGlowBerryEnabled) {
			final Item GLOWBERRYCREAMFROSTEDSWEETROLLGLOWBERRY = registerItem("glow_berry_cream_frosted_sweet_roll_glow_berry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMFROSTEDSWEETROLLGLOWBERRY));
		}
// Glow Berry Cream Glazed Chocolate Donut
		if (CONFIG.isGlowBerryCreamGlazedChocolateDonutEnabled) {
			final Item GLOWBERRYCREAMGLAZEDCHOCOLATEDONUT = registerItem("glow_berry_cream_glazed_chocolate_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMGLAZEDCHOCOLATEDONUT));
		}
// Glow Berry Cream Glazed Donut
		if (CONFIG.isGlowBerryCreamGlazedDonutEnabled) {
			final Item GLOWBERRYCREAMGLAZEDDONUT = registerItem("glow_berry_cream_glazed_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMGLAZEDDONUT));
		}
// Glow Berry Popsicle
		if (CONFIG.isGlowBerryPopsicleEnabled) {
			final Item GLOWBERRYPOPSICLE = registerItem("glow_berry_popsicle", new StickFood(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYPOPSICLE));
		}
// Graham Cracker
		if (CONFIG.isGrahamCrackerEnabled) {
			final Item GRAHAMCRACKER = registerItem("graham_cracker", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAHAMCRACKER));
		}
// Graham Cracker Crumbs
		if (CONFIG.isGrahamCrackerCrumbsEnabled) {
			final Item GRAHAMCRACKERCRUMBS = registerItem("graham_cracker_crumbs", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAHAMCRACKERCRUMBS));
		}
// Ground Beef
		if (CONFIG.isGroundBeefEnabled) {
			final Item GROUNDBEEF = registerItem("ground_beef", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GROUNDBEEF));
		}
// Hamburger
		if (CONFIG.isHamburgerEnabled) {
			final Item HAMBURGER = registerItem("hamburger", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGER));
		}
// Hamburger (Bacon)
		if (CONFIG.isHamburgerBaconEnabled) {
			final Item HAMBURGERBACON = registerItem("hamburger_bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERBACON));
		}
// Hamburger (Bacon, Lettuce)
		if (CONFIG.isHamburgerBaconLettuceEnabled) {
			final Item HAMBURGERBACONLETTUCE = registerItem("hamburger_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERBACONLETTUCE));
		}
// Hamburger (Bacon, Lettuce, Tomato)
		if (CONFIG.isHamburgerBaconLettuceTomatoEnabled) {
			final Item HAMBURGERBACONLETTUCETOMATO = registerItem("hamburger_bacon_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERBACONLETTUCETOMATO));
		}
// Hamburger (Lettuce)
		if (CONFIG.isHamburgerLettuceEnabled) {
			final Item HAMBURGERLETTUCE = registerItem("hamburger_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERLETTUCE));
		}
// Hamburger (Lettuce, Tomato)
		if (CONFIG.isHamburgerLettuceTomatoEnabled) {
			final Item HAMBURGERLETTUCETOMATO = registerItem("hamburger_lettuce_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERLETTUCETOMATO));
		}
// Hamburger (Onion)
		if (CONFIG.isHamburgerOnionEnabled) {
			final Item HAMBURGERONION = registerItem("hamburger_onion", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERONION));
		}
// Hamburger (Onion, Bacon)
		if (CONFIG.isHamburgerOnionBaconEnabled) {
			final Item HAMBURGERONIONBACON = registerItem("hamburger_onion_bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERONIONBACON));
		}
// Hamburger (Onion, Bacon, Lettuce)
		if (CONFIG.isHamburgerOnionBaconLettuceEnabled) {
			final Item HAMBURGERONIONBACONLETTUCE = registerItem("hamburger_onion_bacon_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERONIONBACONLETTUCE));
		}
// Hamburger (Onion, Lettuce)
		if (CONFIG.isHamburgerOnionLettuceEnabled) {
			final Item HAMBURGERONIONLETTUCE = registerItem("hamburger_onion_lettuce", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERONIONLETTUCE));
		}
// Hamburger (Peanut Butter, Bacon)
		if (CONFIG.isHamburgerPeanutButterBaconEnabled) {
			final Item HAMBURGERPEANUTBUTTERBACON = registerItem("hamburger_peanut_butter_bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERPEANUTBUTTERBACON));
		}
// Hollow Chocolate
		if (CONFIG.isHollowChocolateEnabled) {
			final Item HOLLOWCHOCOLATE = registerItem("hollow_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOLLOWCHOCOLATE));
		}
// Hollow Dark Chocolate
		if (CONFIG.isHollowDarkChocolateEnabled) {
			final Item HOLLOWDARKCHOCOLATE = registerItem("hollow_dark_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.2f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOLLOWDARKCHOCOLATE));
		}
// Hollow White Chocolate
		if (CONFIG.isHollowWhiteChocolateEnabled) {
			final Item HOLLOWWHITECHOCOLATE = registerItem("hollow_white_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOLLOWWHITECHOCOLATE));
		}
// Honeyed Berries
		if (CONFIG.isHoneyedBerriesEnabled) {
			final Item HONEYEDBERRIES = registerItem("honeyed_berries", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDBERRIES));
		}
// Honeyed Biscuit
		if (CONFIG.isHoneyedBiscuitEnabled) {
			final Item HONEYEDBISCUIT = registerItem("honeyed_biscuit", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDBISCUIT));
		}
// Honeyed Chocolate Sweet Roll
		if (CONFIG.isHoneyedChocolateSweetRollEnabled) {
			final Item HONEYEDCHOCOLATESWEETROLL = registerItem("honeyed_chocolate_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDCHOCOLATESWEETROLL));
		}
// Honeyed Chocolate Donut
		if (CONFIG.isHoneyedChocolateDonutEnabled) {
			final Item HONEYEDCHOCOLATEDONUT = registerItem("honeyed_chocolate_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDCHOCOLATEDONUT));
		}
// Honeyed Donut
		if (CONFIG.isHoneyedDonutEnabled) {
			final Item HONEYEDDONUT = registerItem("honeyed_donut", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDDONUT));
		}
// Honeyed Sweet Roll
		if (CONFIG.isHoneyedSweetRollEnabled) {
			final Item HONEYEDSWEETROLL = registerItem("honeyed_sweet_roll", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDSWEETROLL));
		}
// Honey Toast
		if (CONFIG.isHoneyedToastEnabled) {
			final Item HONEYEDTOAST = registerItem("honeyed_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDTOAST));
		}
// Hot Cheese & Sausage Biscuit Sandwich
		if (CONFIG.isHotCheeseAndSausageBiscuitSandwichEnabled) {
			final Item HOTCHEESEANDSAUSAGEBISCUITSANDWICH = registerItem("hot_cheese_and_sausage_biscuit_sandwich", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(21).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTCHEESEANDSAUSAGEBISCUITSANDWICH));
		}
// Hot Cheese Biscuit Sandwich
		if (CONFIG.isHotCheeseBiscuitSandwichEnabled) {
			final Item HOTCHEESEBISCUITSANDWICH = registerItem("hot_cheese_biscuit_sandwich", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTCHEESEBISCUITSANDWICH));
		}
// Hot Chocolate Bottle
		if (CONFIG.isHotChocolateBottleEnabled) {
			final Item HOTCHOCOLATEBOTTLE = registerItem("hot_chocolate_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTCHOCOLATEBOTTLE));
		}
// Hot Dark Chocolate Bottle
		if (CONFIG.isHotDarkChocolateBottleEnabled) {
			final Item HOTDARKCHOCOLATEBOTTLE = registerItem("hot_dark_chocolate_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTDARKCHOCOLATEBOTTLE));
		}
// Hot Sausage Biscuit Sandwich
		if (CONFIG.isHotSausageBiscuitSandwichEnabled) {
			final Item HOTSAUSAGEBISCUITSANDWICH = registerItem("hot_sausage_biscuit_sandwich", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(19).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTSAUSAGEBISCUITSANDWICH));
		}
// Hot White Chocolate Bottle
		if (CONFIG.isHotWhiteChocolateBottleEnabled) {
			final Item HOTWHITECHOCOLATEBOTTLE = registerItem("hot_white_chocolate_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTWHITECHOCOLATEBOTTLE));
		}
// Marshmallow
		if (CONFIG.isMarshmallowEnabled) {
			final Item MARSHMALLOW = registerItem("marshmallow", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOW));
		}
// Marshmallow Filled Chocolate
		if (CONFIG.isMarshmallowChocolateEnabled) {
			final Item MARSHMALLOWCHOCOLATE = registerItem("marshmallow_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWCHOCOLATE));
		}
// Marshmallow Filled Dark Chocolate
		if (CONFIG.isMarshmallowDarkChocolateEnabled) {
			final Item MARSHMALLOWDARKCHOCOLATE = registerItem("marshmallow_dark_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWDARKCHOCOLATE));
		}
// Marshmallow Filled White Chocolate
		if (CONFIG.isMarshmallowWhiteChocolateEnabled) {
			final Item MARSHMALLOWWHITECHOCOLATE = registerItem("marshmallow_white_chocolate", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWWHITECHOCOLATE));
		}
// Marshmallow Stick
		if (CONFIG.isMarshmallowStickEnabled) {
			final Item MARSHMALLOWSTICK = registerItem("marshmallow_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWSTICK));
		}
// Meatball
		if (CONFIG.isMeatballEnabled) {
			final Item MEATBALL = registerItem("meatball", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MEATBALL));
		}
// Meatball Sandwich
		if (CONFIG.isMeatballSandwichEnabled) {
			final Item MEATBALLSANDWICH = registerItem("meatball_sandwich", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MEATBALLSANDWICH));
		}
// Meatball Stick
		if (CONFIG.isMeatballStickEnabled) {
			final Item MEATBALLSTICK1 = registerItem("meatball_stick_1", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MEATBALLSTICK1));
		}
		if (CONFIG.isMeatballStickEnabled) {
			final Item MEATBALLSTICK2 = registerItem("meatball_stick_2", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MEATBALLSTICK2));
		}
		if (CONFIG.isMeatballStickEnabled) {
			final Item MEATBALLSTICK3 = registerItem("meatball_stick_3", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MEATBALLSTICK3));
		}
// Mini Graham Cracker Pie Crust
		if (CONFIG.isMiniGrahamCrackerPieCrustEnabled) {
			final Item MINIGRAHAMCRACKERPIECRUST = registerItem("mini_graham_cracker_pie_crust", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MINIGRAHAMCRACKERPIECRUST));
		}
// Mini S'mores Pie
		if (CONFIG.isMiniSmoresPieEnabled) {
			final Item MINISMORESPIE = registerItem("mini_smores_pie", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MINISMORESPIE));
		}
// Paprika
		if (CONFIG.isPaprikaEnabled) {
			final Item PAPRIKA = registerItem("paprika", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PAPRIKA));
		}
// Pasta
		if (CONFIG.isPastaEnabled) {
			final Item PASTA = registerItem("pasta", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTA));
		}
// Pasta Plate
		if (CONFIG.isPastaPlateEnabled) {
			final Item PASTAPLATE = registerItem("pasta_plate", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATE));
		}
// Pasta Plate (Butter)
		if (CONFIG.isPastaPlateButterEnabled) {
			final Item PASTAPLATEBUTTER = registerItem("pasta_plate_butter", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATEBUTTER));
		}
// Pasta Plate (Tomato Sauce)
		if (CONFIG.isPastaPlateTomatoSauceEnabled) {
			final Item PASTAPLATETOMATOSAUCE = registerItem("pasta_plate_tomato_sauce", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATETOMATOSAUCE));
		}
// Pastry Bar Base
		if (CONFIG.isPastryBarBaseEnabled) {
			final Item PASTRYBARBASE = registerItem("pastry_bar_base", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTRYBARBASE));
		}
// Pastry Base
		if (CONFIG.isPastryBaseEnabled) {
			final Item PASTRYBASE = registerItem("pastry_base", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTRYBASE));
		}
// Potato Chips
		if (CONFIG.isPotatoChipsEnabled) {
			final Item POTATOCHIPS = registerItem("potato_chips", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(POTATOCHIPS));
		}
// Pressed Cocoa
		if (CONFIG.isPressedCocoaEnabled) {
			final Item PRESSEDCOCOA = registerItem("pressed_cocoa", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PRESSEDCOCOA));
		}
// Raw Cake Base
		if (CONFIG.isRawCakeBaseEnabled) {
			final Item RAWCAKEBASE = registerItem("raw_cake_base", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCAKEBASE));
		}
// Raw Chocolate Cookie
		if (CONFIG.isRawChocolateCookieEnabled) {
			final Item RAWCHOCOLATECOOKIE = registerItem("raw_chocolate_cookie", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCHOCOLATECOOKIE));
		}
// Raw Chocolate Pastry Bar Base
		if (CONFIG.isRawChocolatePastryBarBaseEnabled) {
			final Item RAWCHOCOLATEPASTRYBARBASE = registerItem("raw_chocolate_pastry_bar_base", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCHOCOLATEPASTRYBARBASE));
		}
// Raw Chocolate Pastry Base
		if (CONFIG.isRawChocolatePastryBaseEnabled) {
			final Item RAWCHOCOLATEPASTRYBASE = registerItem("raw_chocolate_pastry_base", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCHOCOLATEPASTRYBASE));
		}
// Raw Chocolate Sweet Roll Base
		if (CONFIG.isRawChocolateSweetRollBaseEnabled) {
			final Item RAWCHOCOLATESWEETROLLBASE = registerItem("raw_chocolate_sweet_roll_base", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCHOCOLATESWEETROLLBASE));
		}
// Raw Cinnamon Sweet Roll Base
		if (CONFIG.isRawCinnamonSweetRollBaseEnabled) {
			final Item RAWCINNAMONSWEETROLLBASE = registerItem("raw_cinnamon_sweet_roll_base", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCINNAMONSWEETROLLBASE));
		}
// Raw Cookie
		if (CONFIG.isRawCookieEnabled) {
			final Item RAWCOOKIE = registerItem("raw_cookie", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCOOKIE));
		}
// Raw Dark Chips Chocolate Cookie
		if (CONFIG.isRawDarkChipsChocolateCookieEnabled) {
			final Item RAWDARKCHIPSCHOCOLATECOOKIE = registerItem("raw_dark_chips_chocolate_cookie", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWDARKCHIPSCHOCOLATECOOKIE));
		}
// Raw Dark Chips Cookie
		if (CONFIG.isRawDarkChipsCookieEnabled) {
			final Item RAWDARKCHIPSCOOKIE = registerItem("raw_dark_chips_cookie", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWDARKCHIPSCOOKIE));
		}
// Raw Honey Cookie
		if (CONFIG.isRawHoneyCookieEnabled) {
			final Item RAWHONEYCOOKIE = registerItem("raw_honey_cookie", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWHONEYCOOKIE));
		}
// Raw Meatball
		if (CONFIG.isRawMeatballEnabled) {
			final Item RAWMEATBALL = registerItem("raw_meatball", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWMEATBALL));
		}
// Raw Pastry Bar Base
		if (CONFIG.isRawPastryBarBaseEnabled) {
			final Item RAWPASTRYBARBASE = registerItem("raw_pastry_bar_base", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWPASTRYBARBASE));
		}
// Raw Pastry Base
		if (CONFIG.isRawPastryBaseEnabled) {
			final Item RAWPASTRYBASE = registerItem("raw_pastry_base", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWPASTRYBASE));
		}
// Raw Sausage Patty
		if (CONFIG.isRawSausagePattyEnabled) {
			final Item RAWSAUSAGEPATTY = registerItem("raw_sausage_patty", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSAUSAGEPATTY));
		}
// Raw Snickerdoodle
		if (CONFIG.isRawSnickerdoodleEnabled) {
			final Item RAWSNICKERDOODLE = registerItem("raw_snickerdoodle", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSNICKERDOODLE));
		}
// Raw Sugar Cookie
		if (CONFIG.isRawSugarCookieEnabled) {
			final Item RAWSUGARCOOKIE = registerItem("raw_sugar_cookie", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSUGARCOOKIE));
		}
// Raw Sweet Berry Cookie
		if (CONFIG.isRawSweetBerryCookieEnabled) {
			final Item RAWSWEETBERRYCOOKIE = registerItem("raw_sweet_berry_cookie", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSWEETBERRYCOOKIE));
		}
// Raw Sweet Roll Base
		if (CONFIG.isRawSweetRollBaseEnabled) {
			final Item RAWSWEETROLLBASE = registerItem("raw_sweet_roll_base", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSWEETROLLBASE));
		}
// Raw White Chips Chocolate Cookie
		if (CONFIG.isRawWhiteChipsChocolateCookieEnabled) {
			final Item RAWWHITECHIPSCHOCOLATECOOKIE = registerItem("raw_white_chips_chocolate_cookie", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWWHITECHIPSCHOCOLATECOOKIE));
		}
// Raw White Chips Cookie
		if (CONFIG.isRawWhiteChipsCookieEnabled) {
			final Item RAWWHITECHIPSCOOKIE = registerItem("raw_white_chips_cookie", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWWHITECHIPSCOOKIE));
		}
// S'more
		if (CONFIG.isSmoreEnabled) {
			final Item SMORE = registerItem("smore", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SMORE));
		}
// Salt
		if (CONFIG.isSaltEnabled) {
			final Item SALT = registerItem("salt", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SALT));
		}
// Salt Dough
		if (CONFIG.isSaltDoughEnabled) {
			final Item SALTDOUGH = registerItem("salt_dough", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SALTDOUGH));
		}
// Sausage Biscuit
		if (CONFIG.isSausageBiscuitEnabled) {
			final Item SAUSAGEBISCUIT = registerItem("sausage_biscuit", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(14).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEBISCUIT));
		}
// Sausage Biscuit Sandwich
		if (CONFIG.isSausageBiscuitSandwichEnabled) {
			final Item SAUSAGEBISCUITSANDWICH = registerItem("sausage_biscuit_sandwich", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(19).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEBISCUITSANDWICH));
		}
// Sausage Meat
		if (CONFIG.isSausageMeatEnabled) {
			final Item SAUSAGEMEAT = registerItem("sausage_meat", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEMEAT));
		}
// Sausage Patty
		if (CONFIG.isSausagePattyEnabled) {
			final Item SAUSAGEPATTY = registerItem("sausage_patty", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEPATTY));
		}
// Shredded Chicken
		if (CONFIG.isShreddedChickenEnabled) {
			final Item SHREDDEDCHICKEN = registerItem("shredded_chicken", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SHREDDEDCHICKEN));
		}
// Small Meatballs
		if (CONFIG.isSmallMeatballsEnabled) {
			final Item SMALLMEATBALLS = registerItem("small_meatballs", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SMALLMEATBALLS));
		}
// Spicy Breakfast Sausages
		if (CONFIG.isSpicyBreakfastSausagesEnabled) {
			final Item SPICYBREAKFASTSAUSAGES = registerItem("spicy_breakfast_sausages", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SPICYBREAKFASTSAUSAGES));
		}
// Spicy Chicken Nuggets
		if (CONFIG.isSpicyChickenNuggetsEnabled) {
			final Item SPICYCHICKENNUGGETS = registerItem("spicy_chicken_nuggets", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.1f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SPICYCHICKENNUGGETS));
		}
// Sugar Dough
		if (CONFIG.isSugarDoughEnabled) {
			final Item SUGARDOUGH = registerItem("sugar_dough", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SUGARDOUGH));
		}
// Sweet Roll Base
		if (CONFIG.isSweetRollBaseEnabled) {
			final Item SWEETROLLBASE = registerItem("sweet_roll_base", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SWEETROLLBASE));
		}
// Toast Slice
		if (CONFIG.isToastSliceEnabled) {
			final Item TOASTSLICE = registerItem("toast_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOASTSLICE));
		}
// Sliced Carrot
		if (CONFIG.isSlicedCarrotEnabled) {
			final Item SLICEDCARROT = registerItem("sliced_carrot", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SLICEDCARROT));
		}
// Sliced Potato
		if (CONFIG.isSlicedPotatoEnabled) {
			final Item SLICEDPOTATO = registerItem("sliced_potato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SLICEDPOTATO));
		}
// Sliced Tomato
		if (CONFIG.isSlicedTomatoEnabled) {
			final Item SLICEDTOMATO = registerItem("sliced_tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SLICEDTOMATO));
		}
// Unbreaded Chicken Patty
		if (CONFIG.isUnbreadedChickenPattyEnabled) {
			final Item UNBREADEDCHICKENPATTY = registerItem("unbreaded_chicken_patty", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(UNBREADEDCHICKENPATTY));
		}
// White Chips Chocolate Cookie
		if (CONFIG.isWhiteChipsChocolateCookieEnabled) {
			final Item WHITECHIPSCHOCOLATECOOKIE = registerItem("white_chips_chocolate_cookie", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHIPSCHOCOLATECOOKIE));
		}
// White Chips Cookie
		if (CONFIG.isWhiteChipsCookieEnabled) {
			final Item WHITECHIPSCOOKIE = registerItem("white_chips_cookie", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHIPSCOOKIE));
		}
// White Chocolate Bottle
		if (CONFIG.isWhiteChocolateBottleEnabled) {
			final Item WHITECHOCOLATEBOTTLE = registerItem("white_chocolate_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build()).maxCount(64)));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATEBOTTLE));
		}
// White Chocolate Chips Bottle
		if (CONFIG.isWhiteChocolateChipsEnabled) {
			final Item WHITECHOCOLATECHIPS = registerItem("white_chocolate_chips", new Item(new FabricItemSettings()));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATECHIPS));
		}
// White Chocolate Covered Marshmallow Stick
		if (CONFIG.isWhiteChocolateCoveredMarshmallowStickEnabled) {
			final Item WHITECHOCOLATECOVEREDMARSHMALLOWSTICK = registerItem("white_chocolate_covered_marshmallow_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATECOVEREDMARSHMALLOWSTICK));
		}
// White Chocolate Filled Chocolate Pastry
		if (CONFIG.isWhiteChocolateChocolatePastryEnabled) {
			final Item WHITECHOCOLATECHOCOLATEPASTRY = registerItem("white_chocolate_chocolate_pastry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATECHOCOLATEPASTRY));
		}
// White Chocolate Filled Pastry
		if (CONFIG.isWhiteChocolatePastryEnabled) {
			final Item WHITECHOCOLATEPASTRY = registerItem("white_chocolate_pastry", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1.2f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATEPASTRY));
		}
// White Chocolate Glazed Apple
		if (CONFIG.isWhiteChocolateGlazedAppleEnabled) {
			final Item WHITECHOCOLATEGLAZEDAPPLE = registerItem("white_chocolate_glazed_apple", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.9f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATEGLAZEDAPPLE));
		}
// White Chocolate Glazed Berries
		if (CONFIG.isWhiteChocolateGlazedBerriesEnabled) {
			final Item WHITECHOCOLATEGLAZEDBERRIES = registerItem("white_chocolate_glazed_berries", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATEGLAZEDBERRIES));
		}
// White Chocolate Toast
		if (CONFIG.isWhiteChocolateToastEnabled) {
			final Item WHITECHOCOLATETOAST = registerItem("white_chocolate_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
			ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATETOAST));
		}


		Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
				.displayName(Text.translatable("itemgroup.createfood"))
				.icon(() -> new ItemStack(ModItems.ICON))
				.entries(((displayContext, entries) -> {
				}))
				.build());

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		register();
	}
}

