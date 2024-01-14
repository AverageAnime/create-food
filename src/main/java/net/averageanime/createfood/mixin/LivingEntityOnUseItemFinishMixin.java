package net.averageanime.createfood.mixin;

import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import net.averageanime.createfood.item.ModTags;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
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
}
}