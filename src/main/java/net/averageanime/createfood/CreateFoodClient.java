package net.averageanime.createfood;

import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import net.averageanime.createfood.fluid.ModFluids;
import net.averageanime.createfood.item.ModTags;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.SlimeBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.averageanime.createfood.CreateFood.CONFIG;
import static net.averageanime.createfood.block.ModBlocks.registerBlock;
import static net.minecraft.block.Blocks.SLIME_BLOCK;

@Environment(value= EnvType.CLIENT)
public class CreateFoodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
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
                                        new StatusEffectInstance(effect, 3200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_GLOWING)) {
                StatusEffect effect = StatusEffects.GLOWING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
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
                                        new StatusEffectInstance(effect, 3200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_NIGHT_VISION)) {
                StatusEffect effect = StatusEffects.NIGHT_VISION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
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
                                        new StatusEffectInstance(effect, 3200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_SLOW_FALLING)) {
                StatusEffect effect = StatusEffects.SLOW_FALLING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
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
                                        new StatusEffectInstance(effect, 3200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_JUMP_BOOST)) {
                StatusEffect effect = StatusEffects.JUMP_BOOST;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
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
                                        new StatusEffectInstance(effect, 3200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_SPEED)) {
                StatusEffect effect = StatusEffects.SPEED;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
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
                                        new StatusEffectInstance(effect, 3200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_HASTE)) {
                StatusEffect effect = StatusEffects.HASTE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
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
                                        new StatusEffectInstance(effect, 3200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_STRENGTH)) {
                StatusEffect effect = StatusEffects.STRENGTH;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
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
                                        new StatusEffectInstance(effect, 3200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_LUCK)) {
                StatusEffect effect = StatusEffects.LUCK;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
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
            }
        });

// Gelatin Dessert Block

        if (CONFIG.isRedGelatinDessertBlockEnabled) {
            final Block RED_GELATIN_DESSERT = registerBlock("red_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RED_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(RED_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isBlackGelatinDessertBlockEnabled) {
            final Block BLACK_GELATIN_DESSERT = registerBlock("black_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLACK_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(BLACK_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isBlueGelatinDessertBlockEnabled) {
            final Block BLUE_GELATIN_DESSERT = registerBlock("blue_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLUE_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(BLUE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isBrownGelatinDessertBlockEnabled) {
            final Block BROWN_GELATIN_DESSERT = registerBlock("brown_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BROWN_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(BROWN_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isCyanGelatinDessertBlockEnabled) {
            final Block CYAN_GELATIN_DESSERT = registerBlock("cyan_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CYAN_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(CYAN_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isGelatinDessertBlockEnabled) {
            final Block GELATIN_DESSERT = registerBlock("gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isGrayGelatinDessertBlockEnabled) {
            final Block GRAY_GELATIN_DESSERT = registerBlock("gray_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAY_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(GRAY_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isGreenGelatinDessertBlockEnabled) {
            final Block GREEN_GELATIN_DESSERT = registerBlock("green_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GREEN_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(GREEN_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isLightBlueGelatinDessertBlockEnabled) {
            final Block LIGHT_BLUE_GELATIN_DESSERT = registerBlock("light_blue_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIGHT_BLUE_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(LIGHT_BLUE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isLightGrayGelatinDessertBlockEnabled) {
            final Block LIGHT_GRAY_GELATIN_DESSERT = registerBlock("light_gray_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIGHT_GRAY_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(LIGHT_GRAY_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isLimeGelatinDessertBlockEnabled) {
            final Block LIME_GELATIN_DESSERT = registerBlock("lime_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIME_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(LIME_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isMagentaGelatinDessertBlockEnabled) {
            final Block MAGENTA_GELATIN_DESSERT = registerBlock("magenta_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MAGENTA_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(MAGENTA_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isOrangeGelatinDessertBlockEnabled) {
            final Block ORANGE_GELATIN_DESSERT = registerBlock("orange_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ORANGE_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(ORANGE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isPinkGelatinDessertBlockEnabled) {
            final Block PINK_GELATIN_DESSERT = registerBlock("pink_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PINK_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(PINK_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isPurpleGelatinDessertBlockEnabled) {
            final Block PURPLE_GELATIN_DESSERT = registerBlock("purple_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PURPLE_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(PURPLE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isYellowGelatinDessertBlockEnabled) {
            final Block YELLOW_GELATIN_DESSERT = registerBlock("yellow_gelatin_dessert_block", new SlimeBlock(FabricBlockSettings.copyOf(SLIME_BLOCK).nonOpaque()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(YELLOW_GELATIN_DESSERT));
            BlockRenderLayerMap.INSTANCE.putBlock(YELLOW_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }

// Fluids
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
    }
}
