package net.mcreator.rice.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;

import net.mcreator.rice.block.CultivatedRiceTopBlock;
import net.mcreator.rice.RiceMod;

import java.util.Map;

public class ThirdSproutProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RiceMod.LOGGER.warn("Failed to load dependency world for procedure ThirdSprout!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RiceMod.LOGGER.warn("Failed to load dependency x for procedure ThirdSprout!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RiceMod.LOGGER.warn("Failed to load dependency y for procedure ThirdSprout!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RiceMod.LOGGER.warn("Failed to load dependency z for procedure ThirdSprout!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double count = 0;
		if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CultivatedRiceTopBlock.block)) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z)), (World) world, new BlockPos(x, y, z));
				world.destroyBlock(new BlockPos(x, y, z), false);
			}
		}
	}
}
