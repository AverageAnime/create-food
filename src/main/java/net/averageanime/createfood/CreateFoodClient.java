package net.averageanime.createfood;

import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import net.averageanime.createfood.fluid.ModFluids;
import net.averageanime.createfood.item.ModTags;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
@Environment(value= EnvType.CLIENT)
public class CreateFoodClient implements ClientModInitializer {
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
