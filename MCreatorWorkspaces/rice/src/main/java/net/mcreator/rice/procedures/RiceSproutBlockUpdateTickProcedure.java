package net.mcreator.rice.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class RiceSproutBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(Blocks.FARMLAND == (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y + 1, z)) >= 9) {
			entity.getPersistentData().putDouble("GrowthTime", (entity.getPersistentData().getDouble("tagName") - 1));
		}
	}
}
