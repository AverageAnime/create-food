package net.averageanime.createfood.item;

import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.text.Text;

@SuppressWarnings("unused")
public class FoodEffects implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
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
                    StatusEffect effect = EffectsRegistry.COMFORT.get();
                    lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                    StatusEffectUtil.getDurationText(
                                            new StatusEffectInstance(effect, 600), 1))
                            .formatted(effect.getCategory().getFormatting()));
                }
                if (stack.isIn(ModTags.SHORT_NOURISHMENT)) {
                    StatusEffect effect = EffectsRegistry.COMFORT.get();
                    lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                    StatusEffectUtil.getDurationText(
                                            new StatusEffectInstance(effect, 1200), 1))
                            .formatted(effect.getCategory().getFormatting()));
                }
                if (stack.isIn(ModTags.MEDIUM_NOURISHMENT)) {
                    StatusEffect effect = EffectsRegistry.COMFORT.get();
                    lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                    StatusEffectUtil.getDurationText(
                                            new StatusEffectInstance(effect, 3600), 1))
                            .formatted(effect.getCategory().getFormatting()));
                }
                if (stack.isIn(ModTags.LONG_NOURISHMENT)) {
                    StatusEffect effect = EffectsRegistry.COMFORT.get();
                    lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                    StatusEffectUtil.getDurationText(
                                            new StatusEffectInstance(effect, 6000), 1))
                            .formatted(effect.getCategory().getFormatting()));
                }
            }
        });
    }
}
