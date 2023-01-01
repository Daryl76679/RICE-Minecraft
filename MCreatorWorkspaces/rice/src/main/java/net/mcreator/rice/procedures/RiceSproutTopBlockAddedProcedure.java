package net.mcreator.rice.procedures;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RiceSproutTopBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			String _value = "upper";
			BlockPos _pos = new BlockPos(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("half") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
				world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
		}
	}
}
