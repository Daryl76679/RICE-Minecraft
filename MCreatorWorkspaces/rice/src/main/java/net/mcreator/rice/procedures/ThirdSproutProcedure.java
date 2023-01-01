package net.mcreator.rice.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.rice.init.RiceModBlocks;

public class ThirdSproutProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double count = 0;
		if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == RiceModBlocks.CULTIVATED_RICE_TOP.get())) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
