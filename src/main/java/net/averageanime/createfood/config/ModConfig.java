package net.averageanime.createfood.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.averageanime.createfood.CreateFood;



@Config(name = CreateFood.MOD_ID)
public class ModConfig implements ConfigData

{
    @Comment("Enable Apple Popsicle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isApplePopsicleEnabled = true;
    @Comment("Enable Bar of Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateBarEnabled = true;
    @Comment("Enable Bar of White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateBarEnabled = true;
    @Comment("Enable Beef Bun.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunEnabled = true;
    @Comment("Enable Beef Bun (Bacon).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunBaconEnabled = true;
    @Comment("Enable Berry Cream Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamChocolateEnabled = true;
    @Comment("Enable Berry Cream Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamDarkChocolateEnabled = true;
    @Comment("Enable Berry Cream Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamWhiteChocolateEnabled = true;
    @Comment("Enable Berry Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostingBottleEnabled = true;
    @Comment("Enable Berry Cream Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Berry Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Berry Popsicle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryPopsicleEnabled = true;
    @Comment("Enable Biscuit. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBiscuitEnabled = true;
    @Comment("Enable Bread (Lettuce).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadLettuceEnabled = true;
    @Comment("Enable Bread (Lettuce, Carrot).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadLettuceCarrotEnabled = true;
    @Comment("Enable Bread Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceEnabled = true;
    @Comment("Enable Bread Slice (Bacon, Lettuce, Tomato).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceBaconLettuceTomatoEnabled = true;
    @Comment("Enable Bread Slice (Lettuce).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceLettuceEnabled = true;
    @Comment("Enable Bread Slice (Lettuce, Tomato).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceLettuceTomatoEnabled = true;
    @Comment("Enable Breakfast Sausages.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreakfastSausagesEnabled = true;
    @Comment("Enable Bun. Recommend 'disable' with Bakery installed. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBunEnabled = true;
    @Comment("Enable Butter.  Recommend 'disable' if Croptopia or Candlelight installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterEnabled = true;
    @Comment("Enable Butter Dough.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterDoughEnabled = true;
    @Comment("Enable Cacao Butter.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoButterEnabled = true;
    @Comment("Enable Cacao Nibs. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoNibsEnabled = true;
    @Comment("Enable Cake Base.  Recommend 'disable' if Create Additions or Bakery installed. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCakeBaseEnabled = true;
    @Comment("Enable Caramel.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelEnabled = true;
    @Comment("Enable Caramel Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChocolateEnabled = true;
    @Comment("Enable Caramel Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelDarkChocolateEnabled = true;
    @Comment("Enable Caramel Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelWhiteChocolateEnabled = true;
    @Comment("Enable Caramel Glazed Apple.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelGlazedAppleEnabled = true;
    @Comment("Enable Caramel Glazed Berries.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelGlazedBerriesEnabled = true;
    @Comment("Enable Caramel Glazed Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelGlazedChocolateSweetRollEnabled = true;
    @Comment("Enable Caramel Glazed Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelGlazedSweetRollEnabled = true;
    @Comment("Enable Caramel Glazed Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelToastEnabled = true;
    @Comment("Enable Cheese and Beef Bun.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Bacon).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunBaconEnabled = true;
    @Comment("Enable Cheese and Chicken Bun.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndChickenBunEnabled = true;
    @Comment("Enable Cheese and Sausage Biscuit.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndSausageBiscuitEnabled = true;
    @Comment("Enable Cheese and Sausage Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndSausageBiscuitSandwichEnabled = true;
    @Comment("Enable Cheese Biscuit.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseBiscuitEnabled = true;
    @Comment("Enable Cheese Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseBiscuitSandwichEnabled = true;
    @Comment("Enable Cheese (Block & Slice). Recommend 'disable' if Expanded Delight, Brewin' and Chewin', or Meadow installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseEnabled = true;
    @Comment("Enable Cheeseburger.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerEnabled = true;
    @Comment("Enable Cheeseburger (Bacon).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerBaconEnabled = true;
    @Comment("Enable Chicken Bun.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBunEnabled = true;
    @Comment("Enable Chicken Burger.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBurgerEnabled = true;
    @Comment("Enable Chicken Cheeseburger.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenCheeseburgerEnabled = true;
    @Comment("Enable Chicken Nuggets.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenNuggetsEnabled = true;
    @Comment("Enable Chicken Patty.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenPattyEnabled = true;
    @Comment("Enable Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateBottleEnabled = true;
    @Comment("Enable Chocolate Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateChipsEnabled = true;
    @Comment("Enable Chocolate Cookie. Recommend 'disable' with Expanded Delight installed. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCookieEnabled = true;
    @Comment("Enable Chocolate Covered Marshmallow Stick.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCoveredMarshmallowStickEnabled = true;
    @Comment("Enable Chocolate Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamFrostingBottleEnabled = true;
    @Comment("Enable Chocolate Filled Mini Graham Cracker Pie Crust.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateFilledMiniGrahamCrackerPieCrustEnabled = true;
    @Comment("Enable Chocolate Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Chocolate Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateFrostedSweetRollEnabled = true;
    @Comment("Enable Chocolate Glazed Apple.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGlazedAppleEnabled = true;
    @Comment("Enable Chocolate Milk Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateMilkBottleEnabled = true;
    @Comment("Enable Chocolate Sugar Dough.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateSugarDoughEnabled = true;
    @Comment("Enable Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateSweetRollEnabled = true;
    @Comment("Enable Chocolate Sweet Roll Base. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateSweetRollBaseEnabled = true;
    @Comment("Enable Chocolate Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateToastEnabled = true;
    @Comment("Enable Cloth Filter.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isClothFilterEnabled = true;
    @Comment("Enable Cloth Filter (Cacao Mass).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isClothFilterCacaoMassEnabled = true;
    @Comment("Enable Cocoa Powder.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCocoaPowderEnabled = true;
    @Comment("Enable Chorus Fruit Cream Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamChocolateEnabled = true;
    @Comment("Enable Chorus Fruit Cream Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamDarkChocolateEnabled = true;
    @Comment("Enable Chorus Fruit Cream Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamWhiteChocolateEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostingBottleEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Cream Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamChocolateEnabled = true;
    @Comment("Enable Cream Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamDarkChocolateEnabled = true;
    @Comment("Enable Cream White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamWhiteChocolateEnabled = true;
    @Comment("Enable Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamFrostingBottleEnabled = true;
    @Comment("Enable Dark Chips Chocolate Cookie. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChipsChocolateCookieEnabled = true;
    @Comment("Enable Dark Chips Cookie. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChipsCookieEnabled = true;
    @Comment("Enable Dark Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateBottleEnabled = true;
    @Comment("Enable Dark Chocolate Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateChipsEnabled = true;
    @Comment("Enable Dark Chocolate Covered Marshmallow Stick.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateCoveredMarshmallowStickEnabled = true;
    @Comment("Enable Dark Chocolate Glazed Apple.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateGlazedAppleEnabled = true;
    @Comment("Enable Dark Chocolate Glazed Berries.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateGlazedBerriesEnabled = true;
    @Comment("Enable Dark Chocolate Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateToastEnabled = true;
    @Comment("Enable Frosted Cake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFrostedCakeEnabled = true;
    @Comment("Enable Gelatin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGelatinEnabled = true;
    @Comment("Enable Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGelatinDessertSliceEnabled = true;
    @Comment("Enable Glow Berry Cream Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamChocolateEnabled = true;
    @Comment("Enable Glow Berry Cream Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamDarkChocolateEnabled = true;
    @Comment("Enable Glow Berry Cream Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamWhiteChocolateEnabled = true;
    @Comment("Enable Glow Berry Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostingBottleEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Glow Berry Popsicle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryPopsicleEnabled = true;
    @Comment("Enable Graham Cracker.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrahamCrackerEnabled = true;
    @Comment("Enable Graham Cracker Crumbs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrahamCrackerCrumbsEnabled = true;
    @Comment("Enable Ground Beef.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGroundBeefEnabled = true;
    @Comment("Enable Hamburger.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerEnabled = true;
    @Comment("Enable Hamburger (Bacon).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerBaconEnabled = true;
    @Comment("Enable Hollow Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHollowChocolateEnabled = true;
    @Comment("Enable Hollow Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHollowDarkChocolateEnabled = true;
    @Comment("Enable Hollow White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHollowWhiteChocolateEnabled = true;
    @Comment("Enable Honeyed Berries.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedBerriesEnabled = true;
    @Comment("Enable Honeyed Biscuit.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedBiscuitEnabled = true;
    @Comment("Enable Honeyed Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedChocolateSweetRollEnabled = true;
    @Comment("Enable Honey Glazed Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedSweetRollEnabled = true;
    @Comment("Enable Honeyed Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedToastEnabled = true;
    @Comment("Enable Hot Cheese & Sausage Biscuit Sandwich. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotCheeseAndSausageBiscuitSandwichEnabled = true;
    @Comment("Enable Hot Cheese Biscuit Sandwich. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotCheeseBiscuitSandwichEnabled = true;
    @Comment("Enable Hot Chocolate Bottle. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotChocolateBottleEnabled = true;
    @Comment("Enable Hot Dark Chocolate Bottle. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotDarkChocolateBottleEnabled = true;
    @Comment("Enable Hot Sausage Biscuit Sandwich. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotSausageBiscuitSandwichEnabled = true;
    @Comment("Enable Hot White Chocolate Bottle. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotWhiteChocolateBottleEnabled = true;
    @Comment("Enable Marshmallow.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowEnabled = true;
    @Comment("Enable Marshmallow Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowChocolateEnabled = true;
    @Comment("Enable Marshmallow Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowDarkChocolateEnabled = true;
    @Comment("Enable Marshmallow Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowWhiteChocolateEnabled = true;
    @Comment("Enable Marshmallow Stick.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowStickEnabled = true;
    @Comment("Enable Meatball. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMeatballEnabled = true;
    @Comment("Enable Meatball Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMeatballSandwichEnabled = true;
    @Comment("Enable Meatball Stick.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMeatballStickEnabled = true;
    @Comment("Enable Mini Graham Cracker Pie Crust.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMiniGrahamCrackerPieCrustEnabled = true;
    @Comment("Enable Mini S'mores Pie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMiniSmoresPieEnabled = true;
    @Comment("Enable Pasta.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaEnabled = true;
    @Comment("Enable Pasta Plate. Recommend 'disable' with Delightful Creators installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateEnabled = true;
    @Comment("Enable Pasta Plate (Butter).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateButterEnabled = true;
    @Comment("Enable Pressed Cocoa.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPressedCocoaEnabled = true;
    @Comment("Enable Raw Cake Base. Recommend 'disable' if Create Additions installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCakeBaseEnabled = true;
    @Comment("Enable Raw Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolateCookieEnabled = true;
    @Comment("Enable Raw Chocolate Sweet Roll Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolateSweetRollBaseEnabled = true;
    @Comment("Enable Raw Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCookieEnabled = true;
    @Comment("Enable Raw Dark Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawDarkChipsChocolateCookieEnabled = true;
    @Comment("Enable Raw Dark Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawDarkChipsCookieEnabled = true;
    @Comment("Enable Raw Meatball.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMeatballEnabled = true;
    @Comment("Enable Raw Sausage Patty.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSausagePattyEnabled = true;
    @Comment("Enable Raw Sweet Roll Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSweetRollBaseEnabled = true;
    @Comment("Enable Raw White Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawWhiteChipsChocolateCookieEnabled = true;
    @Comment("Enable Raw White Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawWhiteChipsCookieEnabled = true;
    @Comment("Enable S'more.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSmoreEnabled = true;
    @Comment("Enable Salt. Recommend 'disable' with Expanded Delight, Brewin' and Chewin', or Meadow installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSaltEnabled = true;
    @Comment("Enable Salt Dough.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSaltDoughEnabled = true;
    @Comment("Enable Sausage Biscuit.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausageBiscuitEnabled = true;
    @Comment("Enable Sausage Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausageBiscuitSandwichEnabled = true;
    @Comment("Enable Sausage Meat.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausageMeatEnabled = true;
    @Comment("Enable Sausage Patty. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausagePattyEnabled = true;
    @Comment("Enable Shredded Chicken.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isShreddedChickenEnabled = true;
    @Comment("Enable Small Meatballs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSmallMeatballsEnabled = true;
    @Comment("Enable Sugar Dough. Recommend 'disable' with Bakery installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSugarDoughEnabled = true;
    @Comment("Enable Sweet Roll Base. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSweetRollBaseEnabled = true;
    @Comment("Enable Toast Slice. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToastSliceEnabled = true;
    @Comment("Enable Unbreaded Chicken Patty.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUnbreadedChickenPattyEnabled = true;
    @Comment("Enable White Chips Chocolate Cookie. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChipsChocolateCookieEnabled = true;
    @Comment("Enable White Chips Cookie. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChipsCookieEnabled = true;
    @Comment("Enable White Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateBottleEnabled = true;
    @Comment("Enable White Chocolate Chips. Requires manual removal of smelting/smoking/campfire recipes if disabled.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateChipsEnabled = true;
    @Comment("Enable White Chocolate Covered Marshmallow Stick.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateCoveredMarshmallowStickEnabled = true;
    @Comment("Enable White Chocolate Glazed Apple.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateGlazedAppleEnabled = true;
    @Comment("Enable White Chocolate Glazed Berries.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateGlazedBerriesEnabled = true;
    @Comment("Enable White Chocolate Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateToastEnabled = true;

//Blocks
    @Comment("Enable Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGelatinDessertBlockEnabled = true;


// Fluids
    @Comment("Enable Berry Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostingFluidEnabled = true;
    @Comment("Enable Cacao Butter Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoButterFluidEnabled = true;
    @Comment("Enable Cacao Mass Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoMassFluidEnabled = true;
    @Comment("Enable Caramel Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelFluidEnabled = true;
    @Comment("Enable Chocolate Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamFrostingFluidEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostingFluidEnabled = true;
    @Comment("Enable Chocolate Milk Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateMilkFluidEnabled = true;
    @Comment("Enable Dark Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateFluidEnabled = true;
    @Comment("Enable Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGelatinMixFluidEnabled = true;
    @Comment("Enable Glow Berry Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostingFluidEnabled = true;
    @Comment("Enable Hot Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotChocolateFluidEnabled = true;
    @Comment("Enable Hot Dark Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotDarkChocolateFluidEnabled = true;
    @Comment("Enable Hot White Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotWhiteChocolateFluidEnabled = true;
    @Comment("Enable White Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateFluidEnabled = true;
    @Comment("Enable Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamFrostingFluidEnabled = true;

// Farmer's Delight
    @Comment("Enable Beef Bun (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunBaconLettuceEnabled = true;
    @Comment("Enable Beef Bun (Bacon, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunBaconLettuceTomatoEnabled = true;
    @Comment("Enable Beef Bun (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunLettuceEnabled = true;
    @Comment("Enable Beef Bun (Onion).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunOnionEnabled = true;
    @Comment("Enable Beef Bun (Onion, Bacon).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunOnionBaconEnabled = true;
    @Comment("Enable Beef Bun (Onion, Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunOnionBaconLettuceEnabled = true;
    @Comment("Enable Beef Bun (Onion, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunOnionLettuceEnabled = true;
    @Comment("Enable Beef Bun (Onion, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunOnionLettuceTomatoEnabled = true;
    @Comment("Enable Beef Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunLettuceTomatoEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunBaconLettuceEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Bacon, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunBaconLettuceTomatoEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Onion).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunOnionEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Onion, Bacon).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunOnionBaconEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Onion, Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunOnionBaconLettuceEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Onion, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunOnionLettuceEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Onion, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunOnionLettuceTomatoEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunLettuceEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunLettuceTomatoEnabled = true;
    @Comment("Enable Cheese and Chicken Bun (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndChickenBunBaconLettuceEnabled = true;
    @Comment("Enable Cheese and Chicken Bun (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndChickenBunLettuceEnabled = true;
    @Comment("Enable Cheese and Chicken Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndChickenBunLettuceTomatoEnabled = true;
    @Comment("Enable Cheeseburger (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerBaconLettuceEnabled = true;
    @Comment("Enable Cheeseburger (Bacon, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerBaconLettuceTomatoEnabled = true;
    @Comment("Enable Cheeseburger (Onion).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerOnionEnabled = true;
    @Comment("Enable Cheeseburger (Onion, Bacon).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerOnionBaconEnabled = true;
    @Comment("Enable Cheeseburger (Onion, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerOnionLettuceEnabled = true;
    @Comment("Enable Cheeseburger (Onion, Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerOnionBaconLettuceEnabled = true;
    @Comment("Enable Cheeseburger (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerLettuceEnabled = true;
    @Comment("Enable Cheeseburger (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerLettuceTomatoEnabled = true;
    @Comment("Enable Cheeseburger (Onion, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerOnionLettuceTomatoEnabled = true;
    @Comment("Enable Chicken Bun (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBunBaconLettuceEnabled = true;
    @Comment("Enable Chicken Bun (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBunLettuceEnabled = true;
    @Comment("Enable Chicken Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBunLettuceTomatoEnabled = true;
    @Comment("Enable Chicken Burger (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBurgerBaconLettuceEnabled = true;
    @Comment("Enable Chicken Burger (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBurgerLettuceEnabled = true;
    @Comment("Enable Chicken Burger (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBurgerLettuceTomatoEnabled = true;
    @Comment("Enable Chicken Cheeseburger (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenCheeseburgerBaconLettuceEnabled = true;
    @Comment("Enable Chicken Cheeseburger (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenCheeseburgerLettuceEnabled = true;
    @Comment("Enable Chicken Cheeseburger (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenCheeseburgerLettuceTomatoEnabled = true;
    @Comment("Enable Diced Onion.")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDicedOnionEnabled = true;
    @Comment("Enable Hamburger (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerBaconLettuceEnabled = true;
    @Comment("Enable Hamburger (Onion).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerOnionEnabled = true;
    @Comment("Enable Hamburger (Onion, Bacon).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerOnionBaconEnabled = true;
    @Comment("Enable Hamburger (Onion, Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerOnionBaconLettuceEnabled = true;
    @Comment("Enable Hamburger (Onion, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerOnionLettuceEnabled = true;
    @Comment("Enable Hamburger (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerLettuceEnabled = true;
    @Comment("Enable Hamburger (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerLettuceTomatoEnabled = true;
    @Comment("Enable Hamburger (Bacon, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerBaconLettuceTomatoEnabled = true;
    @Comment("Enable Pasta Plate (Tomato Sauce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateTomatoSauceEnabled = true;
    @Comment("Enable Raw Honey Cookie.")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawHoneyCookieEnabled = true;
    @Comment("Enable Raw Sweet Berry Cookie.")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSweetBerryCookieEnabled = true;
    @Comment("Enable Sliced Tomato.")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSlicedTomatoEnabled = true;


}
