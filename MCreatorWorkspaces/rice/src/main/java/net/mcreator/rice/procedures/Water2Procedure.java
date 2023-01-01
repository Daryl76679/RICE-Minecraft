package net.mcreator.rice.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import net.mcreator.rice.init.RiceModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Water2Procedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double localRayTraceDistance = 0;
		localRayTraceDistance = 0.5;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BOWL) {
			for (int index0 = 0; index0 < (int) (5); index0++) {
				if ((world
						.getFluidState(
								new BlockPos(
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRayTraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getX(),
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRayTraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getY(),
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRayTraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getZ()))
						.createLegacyBlock()).getFluidState().isSource() == true
						&& ((world
								.getFluidState(new BlockPos(
										entity.level.clip(
												new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f)
														.add(entity.getViewVector(1f).scale(localRayTraceDistance)), ClipContext.Block.OUTLINE,
														ClipContext.Fluid.NONE, entity))
												.getBlockPos().getX(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRayTraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRayTraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getZ()))
								.createLegacyBlock()).getBlock() == Blocks.WATER
								|| (world
										.getFluidState(
												new BlockPos(
														entity.level
																.clip(new ClipContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity
																				.getViewVector(1f).scale(localRayTraceDistance)),
																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX(),
														entity.level
																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f)
																		.add(entity.getViewVector(1f).scale(localRayTraceDistance)),
																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY(),
														entity.level
																.clip(new ClipContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f)
																				.add(entity.getViewVector(1f).scale(localRayTraceDistance)),
																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ()))
										.createLegacyBlock()).getBlock() == Blocks.WATER
								|| (world
										.getFluidState(
												new BlockPos(
														entity.level.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(localRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
														entity.level
																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f)
																		.add(entity.getViewVector(1f).scale(localRayTraceDistance)),
																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY(),
														entity.level
																.clip(new ClipContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f)
																				.add(entity.getViewVector(1f).scale(localRayTraceDistance)),
																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ()))
										.createLegacyBlock()).getBlock() == Blocks.BUBBLE_COLUMN)) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Items.BOWL);
						_setstack.setCount(
								(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(RiceModItems.WATER_BOWL.get());
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(RiceModItems.WATER_BOWL.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
					break;
				}
				localRayTraceDistance = localRayTraceDistance + 1;
			}
		}
	}
}
