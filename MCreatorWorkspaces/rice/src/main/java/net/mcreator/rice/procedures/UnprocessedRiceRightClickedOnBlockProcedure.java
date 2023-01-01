package net.mcreator.rice.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.rice.init.RiceModBlocks;

public class UnprocessedRiceRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction) {
		if (direction == null)
			return;
		if (direction.getAxis() == Direction.Axis.Y && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.FARMLAND) {
			world.setBlock(new BlockPos(x, 1 + y, z), RiceModBlocks.RICE_SPROUT_BLOCK.get().defaultBlockState(), 3);
		}
	}
}
