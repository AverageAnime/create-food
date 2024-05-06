package net.averageanime.createfood.mixin;

import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
// import vectorwing.farmersdelight.common.registry.ModEffects;
import net.averageanime.createfood.item.ModTags;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class LivingEntityOnUseItemFinishMixin {
    @Shadow
    public abstract Item getItem();

    @Inject(method = "finishUsing", at = @At("HEAD"))
    private void canHaveStatusEffect(World world, LivingEntity entity, CallbackInfoReturnable<ItemStack> cir) {
        ItemStack itemUsing = entity.getActiveItem();
        if (entity.getActiveItem().isIn(ModTags.BRIEF_COMFORT)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(EffectsRegistry.COMFORT.get(), 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_COMFORT)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(EffectsRegistry.COMFORT.get(), 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_COMFORT)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(EffectsRegistry.COMFORT.get(), 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_COMFORT)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(EffectsRegistry.COMFORT.get(), 6000, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.BRIEF_NOURISHMENT)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_NOURISHMENT)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_NOURISHMENT)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_NOURISHMENT)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 6000, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.BRIEF_GLOWING)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.GLOWING, 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.BRIEF_GLOWING)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.GLOWING, 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_GLOWING)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.GLOWING, 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_GLOWING)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.GLOWING, 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_GLOWING)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.GLOWING, 6000, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.BRIEF_NIGHT_VISION)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_NIGHT_VISION)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_NIGHT_VISION)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_NIGHT_VISION)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.NIGHT_VISION, 6000, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.BRIEF_SLOW_FALLING)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_SLOW_FALLING)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_SLOW_FALLING)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.SLOW_FALLING, 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_SLOW_FALLING)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.SLOW_FALLING, 6000, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.BRIEF_JUMP_BOOST)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_JUMP_BOOST)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_JUMP_BOOST)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_JUMP_BOOST)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 6000, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.BRIEF_SPEED)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.SPEED, 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_SPEED)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.SPEED, 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_SPEED)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.SPEED, 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_SPEED)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.SPEED, 6000, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.BRIEF_HASTE)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.HASTE, 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_HASTE)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.HASTE, 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_HASTE)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.HASTE, 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_HASTE)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.HASTE, 6000, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.BRIEF_STRENGTH)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_STRENGTH)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_STRENGTH)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_STRENGTH)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.STRENGTH, 6000, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.BRIEF_LUCK)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.LUCK, 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_LUCK)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.LUCK, 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_LUCK)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.LUCK, 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_LUCK)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.LUCK, 6000, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.BRIEF_FIRE_RESISTANCE)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_FIRE_RESISTANCE)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_FIRE_RESISTANCE)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_FIRE_RESISTANCE)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0));
        }

        if (entity.getActiveItem().isIn(ModTags.BRIEF_ABSORPTION)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.SHORT_ABSORPTION)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.MEDIUM_ABSORPTION)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 0));
        }
        if (entity.getActiveItem().isIn(ModTags.LONG_ABSORPTION)) {
            entity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 6000, 0));
        }
    }
}