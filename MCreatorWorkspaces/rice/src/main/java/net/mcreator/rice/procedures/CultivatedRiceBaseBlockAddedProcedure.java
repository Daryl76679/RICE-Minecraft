package net.mcreator.rice.procedures;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.rice.init.RiceModBlocks;

public class CultivatedRiceBaseBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getFluidState(new BlockPos(x, y + 1, z)).createLegacyBlock()).getBlock() == Blocks.VOID_AIR
				|| (world.getFluidState(new BlockPos(x, y + 1, z)).createLegacyBlock()).getBlock() == Blocks.AIR
				|| (world.getFluidState(new BlockPos(x, y + 1, z)).createLegacyBlock()).getBlock() == Blocks.CAVE_AIR) {
			world.setBlock(new BlockPos(x, y + 1, z), RiceModBlocks.CULTIVATED_RICE_TOP.get().defaultBlockState(), 3);
		} else {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		{
			String _value = "lower";
			BlockPos _pos = new BlockPos(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("half") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
				world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
		}
	}
}
