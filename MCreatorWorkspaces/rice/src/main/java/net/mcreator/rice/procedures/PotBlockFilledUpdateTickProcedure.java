package net.mcreator.rice.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.rice.init.RiceModBlocks;

import java.util.Map;

public class PotBlockFilledUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double X = 0;
		double Z = 0;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.FIRE
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SOUL_FIRE
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAMPFIRE
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SOUL_CAMPFIRE) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SPLASH, (x + 0.5625), (y + 0.73), (z + 0.5625), 1, 0.28, 0, 0.28, 0.2);
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "Cabbage") == 1) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("CookTime", ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "CookTime")) - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "CookTime") == 0) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = RiceModBlocks.POT_BLOCK_CABBAGE.get().defaultBlockState();
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
}
