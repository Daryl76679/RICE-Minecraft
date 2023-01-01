package net.mcreator.rice.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.rice.init.RiceModBlocks;

public class CultivatedRiceBaseUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == RiceModBlocks.CULTIVATED_RICE_TOP.get())) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
				|| !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.ROOTED_DIRT
						|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.FARMLAND
						|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK)) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
