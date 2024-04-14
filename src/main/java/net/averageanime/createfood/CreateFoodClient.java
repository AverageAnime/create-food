package net.averageanime.createfood;

import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import net.averageanime.createfood.block.ModBlocks;
import net.averageanime.createfood.fluid.ModFluids;
import net.averageanime.createfood.item.ModTags;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(value= EnvType.CLIENT)
public class CreateFoodClient implements ClientModInitializer {
    public static final String MOD_ID = "createfood";
    public static Identifier asId(String path) {
        return new Identifier(MOD_ID, path);
    }
    @Override
    public void onInitializeClient() {

// Resource Packs

        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container -> {
            ResourceManagerHelper.registerBuiltinResourcePack(asId("create"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("farmers_delight"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("expanded_delight"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("farmers_respite"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("ends_delight"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("cultural_delight"), container, ResourcePackActivationType.NORMAL);
        });

// Food Effect Tooltips

        ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
            if (stack.isIn(ModTags.BRIEF_COMFORT)) {
                StatusEffect effect = EffectsRegistry.COMFORT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }

            if (stack.isIn(ModTags.SHORT_COMFORT)) {
                StatusEffect effect = EffectsRegistry.COMFORT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_COMFORT)) {
                StatusEffect effect = EffectsRegistry.COMFORT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_COMFORT)) {
                StatusEffect effect = EffectsRegistry.COMFORT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }

            if (stack.isIn(ModTags.BRIEF_NOURISHMENT)) {
                StatusEffect effect = EffectsRegistry.NOURISHMENT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_NOURISHMENT)) {
                StatusEffect effect = EffectsRegistry.NOURISHMENT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_NOURISHMENT)) {
                StatusEffect effect = EffectsRegistry.NOURISHMENT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_NOURISHMENT)) {
                StatusEffect effect = EffectsRegistry.NOURISHMENT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_GLOWING)) {
                StatusEffect effect = StatusEffects.GLOWING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_GLOWING)) {
                StatusEffect effect = StatusEffects.GLOWING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_GLOWING)) {
                StatusEffect effect = StatusEffects.GLOWING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_GLOWING)) {
                StatusEffect effect = StatusEffects.GLOWING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_NIGHT_VISION)) {
                StatusEffect effect = StatusEffects.NIGHT_VISION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_NIGHT_VISION)) {
                StatusEffect effect = StatusEffects.NIGHT_VISION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_NIGHT_VISION)) {
                StatusEffect effect = StatusEffects.NIGHT_VISION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_NIGHT_VISION)) {
                StatusEffect effect = StatusEffects.NIGHT_VISION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_SLOW_FALLING)) {
                StatusEffect effect = StatusEffects.SLOW_FALLING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_SLOW_FALLING)) {
                StatusEffect effect = StatusEffects.SLOW_FALLING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_SLOW_FALLING)) {
                StatusEffect effect = StatusEffects.SLOW_FALLING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_SLOW_FALLING)) {
                StatusEffect effect = StatusEffects.SLOW_FALLING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_JUMP_BOOST)) {
                StatusEffect effect = StatusEffects.JUMP_BOOST;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_JUMP_BOOST)) {
                StatusEffect effect = StatusEffects.JUMP_BOOST;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_JUMP_BOOST)) {
                StatusEffect effect = StatusEffects.JUMP_BOOST;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_JUMP_BOOST)) {
                StatusEffect effect = StatusEffects.JUMP_BOOST;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_SPEED)) {
                StatusEffect effect = StatusEffects.SPEED;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_SPEED)) {
                StatusEffect effect = StatusEffects.SPEED;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_SPEED)) {
                StatusEffect effect = StatusEffects.SPEED;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_SPEED)) {
                StatusEffect effect = StatusEffects.SPEED;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_HASTE)) {
                StatusEffect effect = StatusEffects.HASTE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_HASTE)) {
                StatusEffect effect = StatusEffects.HASTE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_HASTE)) {
                StatusEffect effect = StatusEffects.HASTE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_HASTE)) {
                StatusEffect effect = StatusEffects.HASTE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_STRENGTH)) {
                StatusEffect effect = StatusEffects.STRENGTH;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_STRENGTH)) {
                StatusEffect effect = StatusEffects.STRENGTH;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_STRENGTH)) {
                StatusEffect effect = StatusEffects.STRENGTH;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_STRENGTH)) {
                StatusEffect effect = StatusEffects.STRENGTH;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_LUCK)) {
                StatusEffect effect = StatusEffects.LUCK;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_LUCK)) {
                StatusEffect effect = StatusEffects.LUCK;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_LUCK)) {
                StatusEffect effect = StatusEffects.LUCK;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_LUCK)) {
                StatusEffect effect = StatusEffects.LUCK;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_FIRE_RESISTANCE)) {
                StatusEffect effect = StatusEffects.FIRE_RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_FIRE_RESISTANCE)) {
                StatusEffect effect = StatusEffects.FIRE_RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_FIRE_RESISTANCE)) {
                StatusEffect effect = StatusEffects.FIRE_RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_FIRE_RESISTANCE)) {
                StatusEffect effect = StatusEffects.FIRE_RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
        });

// Fluids

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_ICE_CREAM, ModFluids.FLOWING_ICE_CREAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/ice_cream_still"),
                new Identifier("createfood:block/ice_cream_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_HEAVY_CREAM, ModFluids.FLOWING_HEAVY_CREAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/heavy_cream_still"),
                new Identifier("createfood:block/heavy_cream_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SLIME, ModFluids.FLOWING_SLIME, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/slime_still"),
                new Identifier("createfood:block/slime_flow")
                ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_WHITE_CHOCOLATE_FUDGE, ModFluids.FLOWING_WHITE_CHOCOLATE_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/white_chocolate_fudge_still"),
                new Identifier("createfood:block/white_chocolate_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_DARK_CHOCOLATE_FUDGE, ModFluids.FLOWING_DARK_CHOCOLATE_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/dark_chocolate_fudge_still"),
                new Identifier("createfood:block/dark_chocolate_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHOCOLATE_FUDGE, ModFluids.FLOWING_CHOCOLATE_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chocolate_fudge_still"),
                new Identifier("createfood:block/chocolate_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_TOFFEE_FUDGE, ModFluids.FLOWING_TOFFEE_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/toffee_fudge_still"),
                new Identifier("createfood:block/toffee_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CARAMEL_FUDGE, ModFluids.FLOWING_CARAMEL_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/caramel_fudge_still"),
                new Identifier("createfood:block/caramel_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BUTTERSCOTCH_FUDGE, ModFluids.FLOWING_BUTTERSCOTCH_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/butterscotch_fudge_still"),
                new Identifier("createfood:block/butterscotch_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_APPLE_CREAM_FROSTING, ModFluids.FLOWING_APPLE_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/apple_cream_frosting_still"),
                new Identifier("createfood:block/apple_cream_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CONDENSED_MILK, ModFluids.FLOWING_CONDENSED_MILK, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/condensed_milk_still"),
                new Identifier("createfood:block/condensed_milk_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BUTTERSCOTCH, ModFluids.FLOWING_BUTTERSCOTCH, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/butterscotch_still"),
                new Identifier("createfood:block/butterscotch_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_TOFFEE, ModFluids.FLOWING_TOFFEE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/toffee_still"),
                new Identifier("createfood:block/toffee_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BLACKSTRAP_MOLASSES, ModFluids.FLOWING_BLACKSTRAP_MOLASSES, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/blackstrap_molasses_still"),
                new Identifier("createfood:block/blackstrap_molasses_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLASSES, ModFluids.FLOWING_MOLASSES, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/molasses_still"),
                new Identifier("createfood:block/molasses_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CANE_SYRUP, ModFluids.FLOWING_CANE_SYRUP, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cane_syrup_still"),
                new Identifier("createfood:block/cane_syrup_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SUGAR_CANE_JUICE, ModFluids.FLOWING_SUGAR_CANE_JUICE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/sugar_cane_juice_still"),
                new Identifier("createfood:block/sugar_cane_juice_flow")

        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_VEGETABLE_OIL, ModFluids.FLOWING_VEGETABLE_OIL);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_VEGETABLE_OIL, ModFluids.FLOWING_VEGETABLE_OIL, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xaca875
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BLACK_GELATIN_MIX, ModFluids.FLOWING_BLACK_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BLACK_GELATIN_MIX, ModFluids.FLOWING_BLACK_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x1D1D21
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BLUE_GELATIN_MIX, ModFluids.FLOWING_BLUE_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BLUE_GELATIN_MIX, ModFluids.FLOWING_BLUE_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x3C44AA
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BROWN_GELATIN_MIX, ModFluids.FLOWING_BROWN_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BROWN_GELATIN_MIX, ModFluids.FLOWING_BROWN_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x835432
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_CYAN_GELATIN_MIX, ModFluids.FLOWING_CYAN_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CYAN_GELATIN_MIX, ModFluids.FLOWING_CYAN_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x169C9C
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GRAY_GELATIN_MIX, ModFluids.FLOWING_GRAY_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GRAY_GELATIN_MIX, ModFluids.FLOWING_GRAY_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x474F52
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GREEN_GELATIN_MIX, ModFluids.FLOWING_GREEN_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GREEN_GELATIN_MIX, ModFluids.FLOWING_GREEN_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x5E7C16
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIGHT_BLUE_GELATIN_MIX, ModFluids.FLOWING_LIGHT_BLUE_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIGHT_BLUE_GELATIN_MIX, ModFluids.FLOWING_LIGHT_BLUE_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x3AB3DA
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIGHT_GRAY_GELATIN_MIX, ModFluids.FLOWING_LIGHT_GRAY_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIGHT_GRAY_GELATIN_MIX, ModFluids.FLOWING_LIGHT_GRAY_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x9D9D97
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIME_GELATIN_MIX, ModFluids.FLOWING_LIME_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIME_GELATIN_MIX, ModFluids.FLOWING_LIME_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x80C71F
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_MAGENTA_GELATIN_MIX, ModFluids.FLOWING_MAGENTA_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MAGENTA_GELATIN_MIX, ModFluids.FLOWING_MAGENTA_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xC74EBD
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_ORANGE_GELATIN_MIX, ModFluids.FLOWING_ORANGE_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_ORANGE_GELATIN_MIX, ModFluids.FLOWING_ORANGE_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xF9801D
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_PINK_GELATIN_MIX, ModFluids.FLOWING_PINK_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_PINK_GELATIN_MIX, ModFluids.FLOWING_PINK_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xF38BAA
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_PURPLE_GELATIN_MIX, ModFluids.FLOWING_PURPLE_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_PURPLE_GELATIN_MIX, ModFluids.FLOWING_PURPLE_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x8932B8
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_RED_GELATIN_MIX, ModFluids.FLOWING_RED_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_RED_GELATIN_MIX, ModFluids.FLOWING_RED_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xb02e26
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_YELLOW_GELATIN_MIX, ModFluids.FLOWING_YELLOW_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_YELLOW_GELATIN_MIX, ModFluids.FLOWING_YELLOW_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xFED83D
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GELATIN_MIX, ModFluids.FLOWING_GELATIN_MIX);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GELATIN_MIX, ModFluids.FLOWING_GELATIN_MIX, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xdfdfdf
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CREAM_FROSTING, ModFluids.FLOWING_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cream_frosting_still"),
                new Identifier("createfood:block/cream_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BERRY_CREAM_FROSTING, ModFluids.FLOWING_BERRY_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/berry_cream_frosting_still"),
                new Identifier("createfood:block/berry_cream_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CARAMEL, ModFluids.FLOWING_CARAMEL, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/caramel_still"),
                new Identifier("createfood:block/caramel_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHOCOLATE_CREAM_FROSTING, ModFluids.FLOWING_CHOCOLATE_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chocolate_frosting_still"),
                new Identifier("createfood:block/chocolate_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHOCOLATE_MILK, ModFluids.FLOWING_CHOCOLATE_MILK, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chocolate_milk_still"),
                new Identifier("createfood:block/chocolate_milk_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_HOT_CHOCOLATE, ModFluids.FLOWING_HOT_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/hot_chocolate_still"),
                new Identifier("createfood:block/hot_chocolate_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CACAO_MASS, ModFluids.FLOWING_CACAO_MASS, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cacao_mass_still"),
                new Identifier("createfood:block/cacao_mass_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CACAO_BUTTER, ModFluids.FLOWING_CACAO_BUTTER, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cacao_butter_still"),
                new Identifier("createfood:block/cacao_butter_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_WHITE_CHOCOLATE, ModFluids.FLOWING_WHITE_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/white_chocolate_still"),
                new Identifier("createfood:block/white_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_DARK_CHOCOLATE, ModFluids.FLOWING_DARK_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/dark_chocolate_still"),
                new Identifier("createfood:block/dark_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_HOT_WHITE_CHOCOLATE, ModFluids.FLOWING_HOT_WHITE_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/hot_white_chocolate_still"),
                new Identifier("createfood:block/hot_white_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_HOT_DARK_CHOCOLATE, ModFluids.FLOWING_HOT_DARK_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/hot_dark_chocolate_still"),
                new Identifier("createfood:block/hot_dark_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GLOW_BERRY_CREAM_FROSTING, ModFluids.FLOWING_GLOW_BERRY_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/glow_berry_cream_frosting_still"),
                new Identifier("createfood:block/glow_berry_cream_frosting_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHORUS_FRUIT_CREAM_FROSTING, ModFluids.FLOWING_CHORUS_FRUIT_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chorus_fruit_cream_frosting_still"),
                new Identifier("createfood:block/chorus_fruit_cream_frosting_flow")
        ));

// Gelatin Dessert Blocks

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_GELATIN_DESSERT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GELATIN_DESSERT, RenderLayer.getTranslucent());

    }
}
