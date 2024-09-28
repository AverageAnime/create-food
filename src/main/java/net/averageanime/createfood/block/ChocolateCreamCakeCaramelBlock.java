package net.averageanime.createfood.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CakeBlock;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import vectorwing.farmersdelight.common.tag.ModTags;
import vectorwing.farmersdelight.common.utility.ItemUtils;

public class ChocolateCreamCakeCaramelBlock extends CakeBlock {

    public final Item cakeSlice;

    public ChocolateCreamCakeCaramelBlock(Item pieSlice) {
        super(FabricBlockSettings.copyOf(Blocks.CAKE));
        this.cakeSlice = pieSlice;
    }

    public ItemStack getPieSliceItem() {
        return new ItemStack(this.cakeSlice);
    }

    public int getMaxBites() {
        return 7;
    }

    protected static ActionResult tryEat(WorldAccess world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.canConsume(false)) {
            return ActionResult.PASS;
        } else {
            player.incrementStat(Stats.EAT_CAKE_SLICE);
            player.getHungerManager().add(2, 0.4F);
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0));
            int i = (Integer)state.get(BITES);
            world.emitGameEvent(player, GameEvent.EAT, pos);
            if (i < 6) {
                world.setBlockState(pos, (BlockState)state.with(BITES, i + 1), 3);
            } else {
                world.removeBlock(pos, false);
                world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }

            return ActionResult.SUCCESS;
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack heldStack = player.getStackInHand(hand);
        if (level.isClient) {
            if (heldStack.isIn(ModTags.KNIVES)) {
                return cutSlice(level, pos, state, player);
            }

            if (this.tryEat(level, pos, state, player) == ActionResult.SUCCESS) {
                return ActionResult.SUCCESS;
            }

            if (heldStack.isEmpty()) {
                return ActionResult.CONSUME;
            }
        }

        if (heldStack.isIn(ModTags.KNIVES)) {
            return cutSlice(level, pos, state, player);
        }

        return this.tryEat(level, pos, state, player);
    }

    protected ActionResult cutSlice(World level, BlockPos pos, BlockState state, PlayerEntity player) {
        int bites = state.get(BITES);
        if (bites < getMaxBites() - 1) {
            level.setBlockState(pos, state.with(BITES, bites + 1), 3);
        } else {
            level.removeBlock(pos, false);
        }

        Direction direction = player.getHorizontalFacing().getOpposite();
        ItemUtils.spawnItemEntity(level, this.getPieSliceItem(), pos.getX() + 0.5, pos.getY() + 0.3, pos.getZ() + 0.5,
                direction.getOffsetX() * 0.15, 0.05, direction.getOffsetZ() * 0.15);
        level.playSound(null, pos, SoundEvents.BLOCK_WOOL_BREAK, SoundCategory.PLAYERS, 0.8F, 0.8F);
        return ActionResult.SUCCESS;
    }

}
