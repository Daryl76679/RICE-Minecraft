package net.mcreator.rice.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.rice.init.RiceModBlocks;

public class PotPlacingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity) {
		if (direction == null || entity == null)
			return;
		double localRayTraceDistance = 0;
		if (direction == Direction.UP && ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(new BlockPos(x, y + 1, z), RiceModBlocks.POT_BLOCK.get().defaultBlockState(), 3);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				_setstack.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (direction == Direction.DOWN && ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(new BlockPos(x, y - 1, z), RiceModBlocks.POT_BLOCK.get().defaultBlockState(), 3);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				_setstack.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (direction == Direction.NORTH && ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(new BlockPos(x, y, z - 1), RiceModBlocks.POT_BLOCK.get().defaultBlockState(), 3);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				_setstack.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (direction == Direction.EAST && ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(new BlockPos(x + 1, y, z), RiceModBlocks.POT_BLOCK.get().defaultBlockState(), 3);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				_setstack.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (direction == Direction.SOUTH && ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(new BlockPos(x, y, z + 1), RiceModBlocks.POT_BLOCK.get().defaultBlockState(), 3);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				_setstack.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (direction == Direction.WEST && ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(new BlockPos(x - 1, y, z), RiceModBlocks.POT_BLOCK.get().defaultBlockState(), 3);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				_setstack.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
