package net.mcreator.rice.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.rice.init.RiceModBlocks;

import java.util.Map;

public class ThirdProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double count = 0;
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y + 1, z)) >= 9) {
			count = count + 1;
		}
		if (3 == count) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = RiceModBlocks.RICE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
