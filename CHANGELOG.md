### ***1.1.1***

![111new](https://github.com/user-attachments/assets/02396822-70ce-4a71-a0e9-2943f1cf0baa)

* New cakes, pies, and cheesecakes.
  * Related additions to Farmer's Delight resource pack.
* Renamed the following items. This will delete existing versions of the items.
  * Chocolate Filled Mini Graham Cracker Pie Crust -> Mini Chocolate Pie (Graham Cracker)
  * Chocolate Filled Graham Cracker Pie Crust -> Chocolate Pie (Graham Cracker)
  * Frosted Ube Cake -> Ube Cream Frosted Ube Cake
* Changed the following items into placeable blocks. This will delete existing versions of the items.
  * Cake Base
  * Frosted Cake
  * Chocolate Pie (Graham Cracker)
  * Graham Cracker Pie Crust
  * Ube Cake Base
  * Ube Cream Frosted Ube Cake
* All cake, pie, cheesecake, and pizza blocks will now:
  * Drop full block item when broken with an empty hand.
  * Drop the appropriate number of slices when a partially eaten block is broken with a knife.
  * Drop a single slice on the final bite when broken with an empty hand.
* Compatibility for [[Let's Do] Farm & Charm](https://www.curseforge.com/minecraft/mc-mods/lets-do-farm-charm). 
  * Cooking pot, crafting bowl, and stove recipes are now for Farm & Charm.
  * New recipes for mincer, drying, & roaster.
* Various recipe & tag updates. 
  
### ***1.1.0***

* Updated textures for pizza items.
* Fix some recipes/tags.
* Fix crash ([#21](https://github.com/AverageAnime/create-food/issues/21)).

### ***1.0.9***

![newprev2](https://github.com/AverageAnime/create-food/assets/150550990/dbfe8944-55af-4e65-847d-20cbdd7bb978)

* New placeable pizzas & s'mores pie.
* Fix for salt mixing recipe ([#20](https://github.com/AverageAnime/create-food/issues/20)). 

### ***1.0.8***

![108prevbig](https://github.com/AverageAnime/create-food/assets/150550990/7837c32e-2cc5-4867-9535-bf3fe28cb4a2)

* New breakfast-themed items.
* Some texture updates.
* Fixed Gelatin Mix Blocks causing issues when disabled.
* Recipe updates: 
  * Recipes now check for tags populated. This prevents log spam when disabling recipes & offers better compatibility for recipes with optional items compared to checking for mods loaded.  
  * Fixes for recipes. Mostly increased/consistent tag usage & correcting load conditions. 
  
### ***1.0.7***

**Big Update!**
* 100+ new items/fluids. 
  * Pasta plates, ice creams, milkshakes, jams, bread slices, sandwiches, and more.
  * Various optional items for Expanded Delight, End's Delight, Cultural Delights, Farmer's Respite, Ube's Delight, Fright's Delight, and Nether's Delight. These new items are disabled by default.
* Bunch of texture, recipe, tag & resource pack updates/fixes.
* Fixed Gelatin Mix Fluids causing issues when disabled.
* Absorption, Resistance, & Regeneration effects can now be added via tags.
* All Gelatin Dessert Blocks are now dropped when broken.

### ***1.0.6***

* Fixed issue where Gelatin Dessert Blocks could not be placed on servers.

### ***1.0.5 - Fix***

* Added some tags missing from Farmer's Delight Refabricated that were needed for recipes.
* Changed some recipes to use the proper tags.

### ***1.0.5***

* Minor tag & recipe updates.
* Fix to remove log spam related to fluids.
* New resource pack for Create. Also added dough texture from Create to Farmer's Delight resource pack for visual consistency.
* Minor updates to directly support [Farmer's Delight Refabricated](https://www.curseforge.com/minecraft/mc-mods/farmers-delight-refabricated
  ).
> Note: Deprecated port is still compatible. There's no difference between the two ports in terms of what this mod does, but I still recommend switching to Refabricated.

### ***1.0.4***

* 50 new food items & 14 new fluids.
* New resource packs for Cultural Delight, End's Delight, & Farmer's Respite.
* Some features related to Farmer's Delight & Expanded Delight have been moved to their respective resource pack. 
* Various texture/tag/recipe updates & fixes.
* Fixed some long effect tags not using the correct duration 
* In the config, items from the Expanded Delight tab are now disabled by default.
>Note: [Farmer's Delight Refabricated](https://www.curseforge.com/minecraft/mc-mods/farmers-delight-refabricated
) (2.0.10+) can be used with **any**  version of Create: Food to satisfy the Farmer's Delight dependency.

### ***1.0.3***

![expandeddelightpreview](https://github.com/AverageAnime/create-food/assets/150550990/edd77810-f6fc-4434-b7f0-063e9b233828)
* 10 new items for Expanded Delight content.
* 2 built-in Resource Packs for visual consistency:
> Farmer's Delight Resource Pack includes an animated version of Farmer's Delight Hot Cocoa texture to match Create: Food.

> Expanded Delight Resource Pack includes new Sweet Roll textures to match Create: Food. Also renames them.
* Fix missing blockbuster .json for 'Light Blue Gelatin Dessert Block'. Thanks to banya457 for reporting the issue.
* Removed Baking Station recipes due to [Let's Do] Bakery 1.1.4 removing them.
* Added new Crafting Bowl recipes for Bakery for doughs.
* Fire Resistance can now be added to items via tags.

### ***1.0.2***

* 50+ new food items:
> Pastries

> Pastry Bars

> Donuts

> Donut Holes

> Berry Topped Sweet Rolls

> Colored Gelatin Dessert

> Sliced Potato & Sliced Carrot

> Potato Chips

* Tags can now be used to apply the following status effects:
> Night Vision

> Glowing

> Slow Falling

> Jump Boost

> Haste

> Speed

> Strength

> Luck

* Various new/updated recipes
* When disabling items in the config you should no longer need to manually remove smoking/smelting/campfire recipes.


### ***1.0.1***

Note: Farmer's Delight is now a required dependency.

* Various fixes.
* New tag-based system to apply Farmer's Delight food effects. You can now add Comfort and Nourishment to any item with the appropriate tag. Example: 'create:sweet_roll' has been added to the tag 'c:brief_comfort', giving 30 seconds of Comfort.
* New food gelatin dessert slice & red gelatin dessert slice.
* New blocks gelatin dessert block & red gelatin dessert block.
* New fluids gelatin mix & red gelatin mix

### ***1.0.0***

* Initial Release