package net.averageanime.createfood.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.averageanime.createfood.CreateFood;



@Config(name = CreateFood.MOD_ID)
public class ModConfig implements ConfigData

{
    @Comment("Enable Apple Cream Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamChocolateEnabled = true;
    @Comment("Enable Apple Cream Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamDarkChocolateEnabled = true;
    @Comment("Enable Apple Cream Frosting.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamFrostingBottleEnabled = true;
    @Comment("Enable Apple Cream White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamWhiteChocolateEnabled = true;
    @Comment("Enable Apple Cream Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Apple Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Apple Cream Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamGlazedChocolateDonutEnabled = true;
    @Comment("Enable Apple Cream Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamGlazedDonutEnabled = true;
    @Comment("Enable Apple Cream Chocolate Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamChocolatePastryBarEnabled = true;
    @Comment("Enable Apple Cream Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamPastryBarEnabled = true;
    @Comment("Enable Apple Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleIceCreamBowlEnabled = true;
    @Comment("Enable Apple Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleMilkshakeBottleEnabled = true;
    @Comment("Enable Apple Popsicle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isApplePopsicleEnabled = true;
    @Comment("Enable Apple Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleSliceEnabled = true;
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
    @Comment("Enable Berry Cream Filled Chocolate Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamChocolatePastryBarEnabled = true;
    @Comment("Enable Berry Cream Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamDarkChocolateEnabled = true;
    @Comment("Enable Berry Cream Filled Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamPastryBarEnabled = true;
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
    @Comment("Enable Berry Cream Frosted Chocolate Sweet Roll (Sweet Berry).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedChocolateSweetRollSweetBerryEnabled = true;
    @Comment("Enable Berry Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Berry Cream Frosted Sweet Roll (Sweet Berry).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedSweetRollSweetBerryEnabled = true;
    @Comment("Enable Berry Cream Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamGlazedChocolateDonutEnabled = true;
    @Comment("Enable Berry Cream Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamGlazedDonutEnabled = true;
    @Comment("Enable Berry Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryIceCreamBowlEnabled = true;
    @Comment("Enable Berry Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryMilkshakeBottleEnabled = true;
    @Comment("Enable Berry Popsicle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryPopsicleEnabled = true;
    @Comment("Enable Biscuit.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBiscuitEnabled = true;
    @Comment("Enable Black Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlackGelatinDessertSliceEnabled = true;
    @Comment("Enable Blackstrap Molasses.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlackstrapMolassesBottleEnabled = true;
    @Comment("Enable Blue Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlueGelatinDessertSliceEnabled = true;
    @Comment("Enable Brown Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBrownGelatinDessertSliceEnabled = true;
    @Comment("Enable Brown Sugar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBrownSugarEnabled = true;
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
    @Comment("Enable Bun. Recommend 'disable' with Bakery installed.")
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
    @Comment("Enable Butterscotch.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchEnabled = true;
    @Comment("Enable Butterscotch Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchChipsEnabled = true;
    @Comment("Enable Butterscotch Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchChipsChocolateCookieEnabled = true;
    @Comment("Enable Butterscotch Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchChipsCookieEnabled = true;
    @Comment("Enable Butterscotch Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchFudgeEnabled = true;
    @Comment("Enable Cacao Butter.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoButterEnabled = true;
    @Comment("Enable Cacao Nibs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoNibsEnabled = true;
    @Comment("Enable Cake Base.  Recommend 'disable' if Create Additions or Bakery installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCakeBaseEnabled = true;
    @Comment("Enable Caramel.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelEnabled = true;
    @Comment("Enable Caramel Apple Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelAppleSliceEnabled = true;
    @Comment("Enable Caramel Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChipsEnabled = true;
    @Comment("Enable Caramel Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChipsChocolateCookieEnabled = true;
    @Comment("Enable Caramel Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChipsCookieEnabled = true;
    @Comment("Enable Caramel Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChocolateEnabled = true;
    @Comment("Enable Caramel Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelDarkChocolateEnabled = true;
    @Comment("Enable Caramel Filled Chocolate Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChocolatePastryBarEnabled = true;
    @Comment("Enable Caramel Filled Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelPastryBarEnabled = true;
    @Comment("Enable Caramel Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelWhiteChocolateEnabled = true;
    @Comment("Enable Caramel Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelFudgeEnabled = true;
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
    @Comment("Enable Chocolate Cookie. Recommend 'disable' with Expanded Delight installed.")
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
    @Comment("Enable Chocolate Donut Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateDonutBaseEnabled = true;
    @Comment("Enable Chocolate Donut Hole.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateDonutHoleEnabled = true;
    @Comment("Enable Chocolate Donut Hole (Sugar).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateDonutHoleSugarEnabled = true;
    @Comment("Enable Chocolate Filled Chocolate Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateChocolatePastryEnabled = true;
    @Comment("Enable Chocolate Filled Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolatePastryEnabled = true;
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
    @Comment("Enable Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateFudgeEnabled = true;
    @Comment("Enable Chocolate Glazed Apple.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGlazedAppleEnabled = true;
    @Comment("Enable Chocolate Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGlazedChocolateDonutEnabled = true;
    @Comment("Enable Chocolate Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGlazedDonutEnabled = true;
    @Comment("Enable Chocolate Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateIceCreamBowlEnabled = true;
    @Comment("Enable Chocolate Milk Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateMilkBottleEnabled = true;
    @Comment("Enable Chocolate Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateMilkshakeBottleEnabled = true;
    @Comment("Enable Chocolate Pastry Bar Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolatePastryBarBaseEnabled = true;
    @Comment("Enable Chocolate Pastry Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolatePastryBaseEnabled = true;
    @Comment("Enable Chocolate Sugar Dough.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateSugarDoughEnabled = true;
    @Comment("Enable Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateSweetRollEnabled = true;
    @Comment("Enable Chocolate Sweet Roll Base.")
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
    @Comment("Enable Condensed Milk.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCondensedMilkBottleEnabled = true;
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
    @Comment("Enable Chorus Fruit Cream Filled Chocolate Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamChocolatePastryBarEnabled = true;
    @Comment("Enable Chorus Fruit Cream Filled Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamPastryBarEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostingBottleEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Chocolate Sweet Roll (Chorus Fruit).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedChocolateSweetRollChorusFruitEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Sweet Roll (Chorus Fruit).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedSweetRollChorusFruitEnabled = true;
    @Comment("Enable Chorus Fruit Cream Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamGlazedChocolateDonutEnabled = true;
    @Comment("Enable Chorus Fruit Cream Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamGlazedDonutEnabled = true;
    @Comment("Enable Chorus Fruit Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitIceCreamBowlEnabled = true;
    @Comment("Enable Chorus Fruit Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitMilkshakeBottleEnabled = true;
    @Comment("Enable Cream Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamChocolateEnabled = true;
    @Comment("Enable Cream Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamDarkChocolateEnabled = true;
    @Comment("Enable Cream Filled Chocolate Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamChocolatePastryEnabled = true;
    @Comment("Enable Cream Filled Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamPastryEnabled = true;
    @Comment("Enable Cream White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamWhiteChocolateEnabled = true;
    @Comment("Enable Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamFrostingBottleEnabled = true;
    @Comment("Enable Cyan Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCyanGelatinDessertSliceEnabled = true;
    @Comment("Enable Dark Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChipsChocolateCookieEnabled = true;
    @Comment("Enable Dark Chips Cookie.")
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
    @Comment("Enable Dark Chocolate Filled Chocolate Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateChocolatePastryEnabled = true;
    @Comment("Enable Dark Chocolate Filled Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolatePastryEnabled = true;
    @Comment("Enable Dark Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateFudgeEnabled = true;
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
    @Comment("Enable Donut Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDonutBaseEnabled = true;
    @Comment("Enable Donut Hole.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDonutHoleEnabled = true;
    @Comment("Enable Donut Hole (Sugar).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDonutHoleSugarEnabled = true;
    @Comment("Enable Frosted Cake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFrostedCakeEnabled = true;
    @Comment("Enable Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamGlazedChocolateDonutEnabled = true;
    @Comment("Enable Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamGlazedDonutEnabled = true;
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
    @Comment("Enable Glow Berry Cream Filled Chocolate Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamChocolatePastryBarEnabled = true;
    @Comment("Enable Glow Berry Cream Filled Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamPastryBarEnabled = true;
    @Comment("Enable Glow Berry Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostingBottleEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Chocolate Sweet Roll (Glow Berry).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedChocolateSweetRollGlowBerryEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Sweet Roll (Glow Berry).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedSweetRollGlowBerryEnabled = true;
    @Comment("Enable Glow Berry Cream Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamGlazedChocolateDonutEnabled = true;
    @Comment("Enable Glow Berry Cream Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamGlazedDonutEnabled = true;
    @Comment("Enable Glow Berry Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryIceCreamBowlEnabled = true;
    @Comment("Enable Glow Berry Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryMilkshakeBottleEnabled = true;
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
    @Comment("Enable Gray Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrayGelatinDessertSliceEnabled = true;
    @Comment("Enable Green Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGreenGelatinDessertSliceEnabled = true;
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
    @Comment("Enable Honeyed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedChocolateDonutEnabled = true;
    @Comment("Enable Honeyed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedDonutEnabled = true;
    @Comment("Enable Honey Glazed Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedSweetRollEnabled = true;
    @Comment("Enable Honeyed Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedToastEnabled = true;
    @Comment("Enable Hot Cheese & Sausage Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotCheeseAndSausageBiscuitSandwichEnabled = true;
    @Comment("Enable Hot Cheese Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotCheeseBiscuitSandwichEnabled = true;
    @Comment("Enable Hot Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotChocolateBottleEnabled = true;
    @Comment("Enable Hot Dark Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotDarkChocolateBottleEnabled = true;
    @Comment("Enable Hot Sausage Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotSausageBiscuitSandwichEnabled = true;
    @Comment("Enable Hot White Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotWhiteChocolateBottleEnabled = true;
    @Comment("Enable Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isIceCreamBowlEnabled = true;
    @Comment("Enable Light Blue Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightBlueGelatinDessertSliceEnabled = true;
    @Comment("Enable Light Gray Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightGrayGelatinDessertSliceEnabled = true;
    @Comment("Enable Lime Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLimeGelatinDessertSliceEnabled = true;
    @Comment("Enable Magenta Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMagentaGelatinDessertSliceEnabled = true;
    @Comment("Enable Marshmallow.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowEnabled = true;
    @Comment("Enable Marshmallow Butterscotch Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowButterscotchFudgeEnabled = true;
    @Comment("Enable Marshmallow Caramel Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowCaramelFudgeEnabled = true;
    @Comment("Enable Marshmallow Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowChocolateFudgeEnabled = true;
    @Comment("Enable Marshmallow Dark Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowDarkChocolateFudgeEnabled = true;
    @Comment("Enable Marshmallow Toffee Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowToffeeFudgeEnabled = true;
    @Comment("Enable Marshmallow White Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowWhiteChocolateFudgeEnabled = true;
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
    @Comment("Enable Meatball.")
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
    @Comment("Enable Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMilkshakeBottleEnabled = true;
    @Comment("Enable Mini Graham Cracker Pie Crust.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMiniGrahamCrackerPieCrustEnabled = true;
    @Comment("Enable Mini S'mores Pie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMiniSmoresPieEnabled = true;
    @Comment("Enable Milk Powder.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMilkPowderEnabled = true;
    @Comment("Enable Molasses.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMolassesBottleEnabled = true;
    @Comment("Enable Orange Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isOrangeGelatinDessertSliceEnabled = true;
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
    @Comment("Enable Pastry Bar Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastryBarBaseEnabled = true;
    @Comment("Enable Pastry Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastryBaseEnabled = true;
    @Comment("Enable Pink Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPinkGelatinDessertSliceEnabled = true;
    @Comment("Enable Potato Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPotatoChipsEnabled = true;
    @Comment("Enable Powdered Sugar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPowderedSugarEnabled = true;
    @Comment("Enable Pressed Cocoa.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPressedCocoaEnabled = true;
    @Comment("Enable Pumpernickel Bread.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPumpernickelBreadEnabled = true;
    @Comment("Enable Pumpernickel Bread Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPumpernickelBreadSliceEnabled = true;
    @Comment("Enable Pumpernickel Dough.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPumpernickelDoughEnabled = true;
    @Comment("Enable Purple Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPurpleGelatinDessertSliceEnabled = true;
    @Comment("Enable Raw Butterscotch Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawButterscotchChipsChocolateCookieEnabled = true;
    @Comment("Enable Raw Butterscotch Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawButterscotchChipsCookieEnabled = true;
    @Comment("Enable Raw Cake Base. Recommend 'disable' if Create Additions installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCakeBaseEnabled = true;
    @Comment("Enable Raw Caramel Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCaramelChipsChocolateCookieEnabled = true;
    @Comment("Enable Raw Caramel Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCaramelChipsCookieEnabled = true;
    @Comment("Enable Raw Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolateCookieEnabled = true;
    @Comment("Enable Raw Chocolate Pastry Bar Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolatePastryBarBaseEnabled = true;
    @Comment("Enable Raw Chocolate Pastry Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolatePastryBaseEnabled = true;
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
    @Comment("Enable Raw Pastry Bar Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawPastryBarBaseEnabled = true;
    @Comment("Enable Raw Pastry Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawPastryBaseEnabled = true;
    @Comment("Enable Raw Sausage Patty.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSausagePattyEnabled = true;
    @Comment("Enable Raw Sweet Roll Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSweetRollBaseEnabled = true;
    @Comment("Enable Raw Toffee Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawToffeeChipsChocolateCookieEnabled = true;
    @Comment("Enable Raw Toffee Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawToffeeChipsCookieEnabled = true;
    @Comment("Enable Raw White Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawWhiteChipsChocolateCookieEnabled = true;
    @Comment("Enable Raw White Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawWhiteChipsCookieEnabled = true;
    @Comment("Enable Red Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRedGelatinDessertSliceEnabled = true;
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
    @Comment("Enable Sausage Patty.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausagePattyEnabled = true;
    @Comment("Enable Shredded Chicken.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isShreddedChickenEnabled = true;
    @Comment("Enable Sliced Potato.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSlicedPotatoEnabled = true;
    @Comment("Enable Sliced Carrot.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSlicedCarrotEnabled = true;
    @Comment("Enable Small Meatballs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSmallMeatballsEnabled = true;
    @Comment("Enable Sugar Dough. Recommend 'disable' with Bakery installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSugarDoughEnabled = true;
    @Comment("Enable Sweet Roll Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSweetRollBaseEnabled = true;
    @Comment("Enable Toast Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToastSliceEnabled = true;
    @Comment("Enable Toffee.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeEnabled = true;
    @Comment("Enable Toffee Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeChipsEnabled = true;
    @Comment("Enable Toffee Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeChipsChocolateCookieEnabled = true;
    @Comment("Enable Toffee Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeChipsCookieEnabled = true;
    @Comment("Enable Toffee Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeFudgeEnabled = true;
    @Comment("Enable Unbreaded Chicken Patty.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUnbreadedChickenPattyEnabled = true;
    @Comment("Enable White Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChipsChocolateCookieEnabled = true;
    @Comment("Enable White Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChipsCookieEnabled = true;
    @Comment("Enable White Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateBottleEnabled = true;
    @Comment("Enable White Chocolate Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateChipsEnabled = true;
    @Comment("Enable White Chocolate Covered Marshmallow Stick.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateCoveredMarshmallowStickEnabled = true;
    @Comment("Enable White Chocolate Filled Chocolate Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateChocolatePastryEnabled = true;
    @Comment("Enable White Chocolate Filled Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolatePastryEnabled = true;
    @Comment("Enable White Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateFudgeEnabled = true;
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
    @Comment("Enable Yellow Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isYellowGelatinDessertSliceEnabled = true;

//Blocks

    @Comment("Enable Black Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlackGelatinDessertBlockEnabled = true;
    @Comment("Enable Blue Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlueGelatinDessertBlockEnabled = true;
    @Comment("Enable Brown Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBrownGelatinDessertBlockEnabled = true;
    @Comment("Enable Cyan Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCyanGelatinDessertBlockEnabled = true;
    @Comment("Enable Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGelatinDessertBlockEnabled = true;
    @Comment("Enable Gray Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrayGelatinDessertBlockEnabled = true;
    @Comment("Enable Green Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGreenGelatinDessertBlockEnabled = true;
    @Comment("Enable Light Blue Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightBlueGelatinDessertBlockEnabled = true;
    @Comment("Enable Light Gray Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightGrayGelatinDessertBlockEnabled = true;
    @Comment("Enable Lime Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLimeGelatinDessertBlockEnabled = true;
    @Comment("Enable Magenta Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMagentaGelatinDessertBlockEnabled = true;
    @Comment("Enable Orange Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isOrangeGelatinDessertBlockEnabled = true;
    @Comment("Enable Pink Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPinkGelatinDessertBlockEnabled = true;
    @Comment("Enable Purple Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPurpleGelatinDessertBlockEnabled = true;
    @Comment("Enable Red Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRedGelatinDessertBlockEnabled = true;
    @Comment("Enable Yellow Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isYellowGelatinDessertBlockEnabled = true;


    // Fluids
    @Comment("Enable Apple Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamFrostingFluidEnabled = true;
    @Comment("Enable Apple Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleIceCreamFluidEnabled = true;
    @Comment("Enable Apple Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleMilkshakeFluidEnabled = true;
    @Comment("Enable Berry Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostingFluidEnabled = true;
    @Comment("Enable Berry Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryIceCreamFluidEnabled = true;
    @Comment("Enable Berry Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryMilkshakeFluidEnabled = true;
    @Comment("Enable Blackstrap Molasses Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlackstrapMolassesFluidEnabled = true;
    @Comment("Enable Black Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlackGelatinMixFluidEnabled = true;
    @Comment("Enable Blue Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlueGelatinMixFluidEnabled = true;
    @Comment("Enable Brown Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBrownGelatinMixFluidEnabled = true;
    @Comment("Enable Butterscotch Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchFluidEnabled = true;
    @Comment("Enable Butterscotch Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchFudgeFluidEnabled = true;
    @Comment("Enable Cacao Butter Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoButterFluidEnabled = true;
    @Comment("Enable Cacao Mass Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoMassFluidEnabled = true;
    @Comment("Enable Cane Syrup Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaneSyrupFluidEnabled = true;
    @Comment("Enable Caramel Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelFluidEnabled = true;
    @Comment("Enable Caramel Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelFudgeFluidEnabled = true;
    @Comment("Enable Chocolate Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamFrostingFluidEnabled = true;
    @Comment("Enable Chocolate Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateFudgeFluidEnabled = true;
    @Comment("Enable Chocolate Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateIceCreamFluidEnabled = true;
    @Comment("Enable Chocolate Milk Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateMilkFluidEnabled = true;
    @Comment("Enable Chocolate Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateMilkshakeFluidEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostingFluidEnabled = true;
    @Comment("Enable Chorus Fruit Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitIceCreamFluidEnabled = true;
    @Comment("Enable Chorus Fruit Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitMilkshakeFluidEnabled = true;
    @Comment("Enable Condensed Milk Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCondensedMilkFluidEnabled = true;
    @Comment("Enable Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamFrostingFluidEnabled = true;
    @Comment("Enable Cyan Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCyanGelatinMixFluidEnabled = true;
    @Comment("Enable Dark Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateFluidEnabled = true;
    @Comment("Enable Dark Chocolate Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateFudgeFluidEnabled = true;
    @Comment("Enable Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGelatinMixFluidEnabled = true;
    @Comment("Enable Glow Berry Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostingFluidEnabled = true;
    @Comment("Enable Glow Berry Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryIceCreamFluidEnabled = true;
    @Comment("Enable Glow Berry Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryMilkshakeFluidEnabled = true;
    @Comment("Enable Gray Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrayGelatinMixFluidEnabled = true;
    @Comment("Enable Green Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGreenGelatinMixFluidEnabled = true;
    @Comment("Enable Heavy Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHeavyCreamFluidEnabled = true;
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
    @Comment("Enable Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isIceCreamFluidEnabled = true;
    @Comment("Enable Light Blue Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightBlueGelatinMixFluidEnabled = true;
    @Comment("Enable Light Gray Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightGrayGelatinMixFluidEnabled = true;
    @Comment("Enable Lime Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLimeGelatinMixFluidEnabled = true;
    @Comment("Enable Magenta Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMagentaGelatinMixFluidEnabled = true;
    @Comment("Enable Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMilkshakeFluidEnabled = true;
    @Comment("Enable Molasses Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMolassesFluidEnabled = true;
    @Comment("Enable Orange Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isOrangeGelatinMixFluidEnabled = true;
    @Comment("Enable Pink Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPinkGelatinMixFluidEnabled = true;
    @Comment("Enable Purple Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPurpleGelatinMixFluidEnabled = true;
    @Comment("Enable Red Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRedGelatinMixFluidEnabled = true;
    @Comment("Enable Slime Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSlimeFluidEnabled = true;
    @Comment("Enable Sugar Cane Juice Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSugarCaneJuiceFluidEnabled = true;
    @Comment("Enable Toffee Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeFluidEnabled = true;
    @Comment("Enable Toffee Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeFudgeFluidEnabled = true;
    @Comment("Enable Vegetable Oil Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isVegetableOilFluidEnabled = true;
    @Comment("Enable White Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateFluidEnabled = true;
    @Comment("Enable White Chocolate Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateFudgeFluidEnabled = true;
    @Comment("Enable Yellow Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isYellowGelatinMixFluidEnabled = true;

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

    // Expanded Delight
    @Comment("Enable Beef Bun (Peanut Butter).")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunPeanutButterEnabled = false;
    @Comment("Enable Beef Bun (Peanut Butter, Bacon).")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunPeanutButterBaconEnabled = false;
    @Comment("Enable Hamburger (Peanut Butter).")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerPeanutButterEnabled = false;
    @Comment("Enable Hamburger (Peanut Butter, Bacon).")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerPeanutButterBaconEnabled = false;
    @Comment("Enable Cinnamon Sweet Roll Base.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCinnamonSweetRollBaseEnabled = false;
    @Comment("Enable Paprika.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPaprikaEnabled = false;
    @Comment("Enable Raw Cinnamon Sweet Roll Base.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCinnamonSweetRollBaseEnabled = false;
    @Comment("Enable Raw Snickerdoodle.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSnickerdoodleEnabled = false;
    @Comment("Enable Raw Sugar Cookie.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSugarCookieEnabled = false;
    @Comment("Enable Spicy Breakfast Sausages.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSpicyBreakfastSausagesEnabled = false;
    @Comment("Enable Spicy Chicken Nuggets.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSpicyChickenNuggetsEnabled = false;

    // Farmer's Respite
    @Comment("Enable Coffee Toffee.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCoffeeToffeeEnabled = false;
    @Comment("Enable Coffee Toffee Fluid.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCoffeeToffeeFluidEnabled = false;
    @Comment("Enable Coffee Toffee Fudge.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCoffeeToffeeFudgeEnabled = false;
    @Comment("Enable Coffee Toffee Fudge Fluid.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCoffeeToffeeFudgeFluidEnabled = false;
    @Comment("Enable Dried Coffee Beans.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDriedCoffeeBeansEnabled = false;
    @Comment("Enable Espresso Powder.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEspressoPowderEnabled = false;
    @Comment("Enable Marshmallow Coffee Toffee Fudge.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowCoffeeToffeeFudgeEnabled = false;
    @Comment("Enable Raw Green Tea Cookie.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawGreenTeaCookieEnabled = false;

    // End's Delight
    @Comment("Enable Dragon Bun.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBunEnabled = false;
    @Comment("Enable Dragon Bun (Crimson Fungus).")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBunCrimsonFungusEnabled = false;
    @Comment("Enable Dragon Bun (Warped Fungus).")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBunWarpedFungusEnabled = false;
    @Comment("Enable Dragon Burger.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBurgerEnabled = false;
    @Comment("Enable Dragon Burger (Crimson Fungus).")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBurgerCrimsonFungusEnabled = false;
    @Comment("Enable Dragon Burger (Warped Fungus).")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBurgerWarpedFungusEnabled = false;
    @Comment("Enable Dragon Patty.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonPattyEnabled = false;
    @Comment("Enable Minced Dragon.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMincedDragonEnabled = false;
    @Comment("Enable Raw Chorus Cookie.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChorusCookieEnabled = false;

    // Cultural Delight
    @Comment("Enable Caramel Popcorn.")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelPopcornEnabled = false;
    @Comment("Enable Cheese and Eggplant Bun.")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndEggplantBunEnabled = false;
    @Comment("Enable Cheese and Eggplant Bun (Lettuce).")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndEggplantBunLettuceEnabled = false;
    @Comment("Enable Cheese and Eggplant Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndEggplantBunLettuceTomatoEnabled = false;
    @Comment("Enable Corn Flour.")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCornFlourEnabled = false;
    @Comment("Enable Eggplant Bun.")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantBunEnabled = false;
    @Comment("Enable Eggplant Bun (Lettuce).")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantBunLettuceEnabled = false;
    @Comment("Enable Eggplant Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantBunLettuceTomatoEnabled = false;
    @Comment("Enable Eggplant Burger (Lettuce).")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantBurgerLettuceEnabled = false;
    @Comment("Enable Eggplant Cheeseburger.")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantCheeseburgerEnabled = false;
    @Comment("Enable Eggplant Cheeseburger (Lettuce).")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantCheeseburgerLettuceEnabled = false;
    @Comment("Enable Eggplant Cheeseburger (Lettuce, Tomato).")
    @ConfigEntry.Category("CulturalDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantCheeseburgerLettuceTomatoEnabled = false;

    // Ube Delight
    @Comment("Enable Frosted Ube Cake.")
    @ConfigEntry.Category("UbeDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFrostedUbeCakeEnabled = false;
    @Comment("Enable Raw Ginger Cookie.")
    @ConfigEntry.Category("UbeDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawGingerCookieEnabled = false;
    @Comment("Enable Raw Ube Cake Base.")
    @ConfigEntry.Category("UbeDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawUbeCakeBaseEnabled = false;
    @Comment("Enable Raw Ube Cookie.")
    @ConfigEntry.Category("UbeDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawUbeCookieEnabled = false;
    @Comment("Enable Ube Cake Base.")
    @ConfigEntry.Category("UbeDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUbeCakeBaseEnabled = false;
    @Comment("Enable Ube Cream Frosting.")
    @ConfigEntry.Category("UbeDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUbeCreamFrostingBottleEnabled = false;
    @Comment("Enable Ube Cream Frosting Fluid.")
    @ConfigEntry.Category("UbeDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUbeCreamFrostingFluidEnabled = false;
    @Comment("Enable Ube Sugar Dough.")
    @ConfigEntry.Category("UbeDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUbeSugarDoughEnabled = false;

    // Fright's Delight
    @Comment("Enable Raw Flesh Cookie.")
    @ConfigEntry.Category("Fright'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawFleshCookieEnabled = false;
    @Comment("Enable Raw Soul Berry Cookie.")
    @ConfigEntry.Category("Fright'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSoulBerryCookieEnabled = false;
    @Comment("Enable Raw Spider Eye Cookie.")
    @ConfigEntry.Category("Fright'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSpiderEyeCookieEnabled = false;
}
