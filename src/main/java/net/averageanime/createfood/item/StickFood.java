/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package net.averageanime.createfood.item;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.nhoryzon.mc.farmersdelight.FarmersDelightMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public class StickFood
        extends EffectFood {
    private static final MutableText NO_EFFECTS = (Text.translatable("effect.none")).formatted(Formatting.GRAY);
    private final boolean hasFoodEffectTooltip;
    private final boolean hasCustomTooltip;
    private static final int MAX_USE_TIME = 40;

    public StickFood(Settings settings) {
        super(settings);
        this.hasFoodEffectTooltip = false;
        this.hasCustomTooltip = false;
    }
    public StickFood(Settings settings, boolean hasFoodEffectTooltip) {
        super(settings);
        this.hasFoodEffectTooltip = hasFoodEffectTooltip;
        this.hasCustomTooltip = false;
    }

    public StickFood(Settings settings, boolean hasFoodEffectTooltip, boolean hasCustomTooltip) {
        super(settings);
        this.hasFoodEffectTooltip = hasFoodEffectTooltip;
        this.hasCustomTooltip = hasCustomTooltip;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }
        if (stack.isEmpty()) {
            return new ItemStack(Items.STICK);
        }
        if (user instanceof PlayerEntity playerEntity && !((PlayerEntity)user).getAbilities().creativeMode) {
            ItemStack itemStack = new ItemStack(Items.STICK);
            if (!playerEntity.getInventory().insertStack(itemStack)) {
                playerEntity.dropItem(itemStack, false);
            }
        }
        return stack;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 40;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    @Environment(value= EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        if (FarmersDelightMod.CONFIG.isFoodEffectTooltip()) {
            if (hasCustomTooltip) {
                tooltip.add(FarmersDelightMod.i18n("tooltip." + this).formatted(Formatting.BLUE));
            }
            if (hasFoodEffectTooltip) {
                addFoodEffectTooltip(stack, tooltip, 1.f);
            }
        }
    }

    @Environment(value= EnvType.CLIENT)
    public static void addFoodEffectTooltip(ItemStack itemIn, List<Text> lores, float durationFactor) {
        FoodComponent foodStats = itemIn.getItem().getFoodComponent();
        if (foodStats == null) {
            return;
        }
        List<Pair<StatusEffectInstance, Float>> effectList = foodStats.getStatusEffects();
        List<Pair<EntityAttribute, EntityAttributeModifier>> attributeList = Lists.newArrayList();
        if (effectList.isEmpty()) {
            lores.add(NO_EFFECTS);
        } else {
            for (Pair<StatusEffectInstance, Float> effectPair : effectList) {
                StatusEffectInstance instance = effectPair.getFirst();
                MutableText iformattabletextcomponent = Text.translatable(instance.getTranslationKey());
                StatusEffect effect = instance.getEffectType();
                Map<EntityAttribute, EntityAttributeModifier> attributeMap = effect.getAttributeModifiers();
                if (!attributeMap.isEmpty()) {
                    for (Map.Entry<EntityAttribute, EntityAttributeModifier> entry : attributeMap.entrySet()) {
                        EntityAttributeModifier rawModifier = entry.getValue();
                        EntityAttributeModifier modifier = new EntityAttributeModifier(rawModifier.getName(), effect.adjustModifierAmount(instance.getAmplifier(), rawModifier), rawModifier.getOperation());
                        attributeList.add(new Pair<>(entry.getKey(), modifier));
                    }
                }

                if (instance.getAmplifier() > 0) {
                    iformattabletextcomponent = Text.translatable("potion.withAmplifier", iformattabletextcomponent, Text.translatable("potion.potency." + instance.getAmplifier()));
                }

                if (instance.getDuration() > 20) {
                    iformattabletextcomponent = Text.translatable("potion.withDuration", iformattabletextcomponent, StatusEffectUtil.getDurationText(instance, durationFactor));
                }

                lores.add(iformattabletextcomponent.formatted(effect.getCategory().getFormatting()));
            }
        }

        if (!attributeList.isEmpty()) {
            lores.add(Text.empty());
            lores.add((Text.translatable("potion.whenDrank")).formatted(Formatting.DARK_PURPLE));

            for (Pair<EntityAttribute, EntityAttributeModifier> pair : attributeList) {
                EntityAttributeModifier modifier = pair.getSecond();
                double amount = modifier.getValue();
                double formattedAmount;
                if (modifier.getOperation() != EntityAttributeModifier.Operation.MULTIPLY_BASE && modifier.getOperation() != EntityAttributeModifier.Operation.MULTIPLY_TOTAL) {
                    formattedAmount = modifier.getValue();
                } else {
                    formattedAmount = modifier.getValue() * 100.d;
                }

                if (amount > 0.0D) {
                    lores.add((Text.translatable("attribute.modifier.plus." + modifier.getOperation().getId(), ItemStack.MODIFIER_FORMAT.format(formattedAmount), Text.translatable(pair.getFirst().getTranslationKey()))).formatted(Formatting.BLUE));
                } else if (amount < 0.0D) {
                    formattedAmount = formattedAmount * -1.d;
                    lores.add((Text.translatable("attribute.modifier.take." + modifier.getOperation().getId(), ItemStack.MODIFIER_FORMAT.format(formattedAmount), Text.translatable(pair.getFirst().getTranslationKey()))).formatted(Formatting.RED));
                }
            }
        }
    }
}

