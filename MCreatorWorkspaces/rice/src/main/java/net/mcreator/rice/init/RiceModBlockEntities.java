
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rice.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.rice.block.entity.TestBlockEntity;
import net.mcreator.rice.block.entity.TapayanFullBlockEntity;
import net.mcreator.rice.block.entity.SecondStateBlockEntity;
import net.mcreator.rice.block.entity.RiceSproutTopBlockEntity;
import net.mcreator.rice.block.entity.RiceSproutThirdStateBlockEntity;
import net.mcreator.rice.block.entity.RiceSproutSecondStateBlockEntity;
import net.mcreator.rice.block.entity.RiceSproutBlockBlockEntity;
import net.mcreator.rice.block.entity.PotBlockFilledBlockEntity;
import net.mcreator.rice.block.entity.PotBlockBlockEntity;
import net.mcreator.rice.block.entity.CultivatedRiceTopBlockEntity;
import net.mcreator.rice.block.entity.CultivatedRiceBaseBlockEntity;
import net.mcreator.rice.block.entity.BubodDoughBlockEntity;
import net.mcreator.rice.RiceMod;

public class RiceModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, RiceMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SECOND_STATE = register("second_state", RiceModBlocks.SECOND_STATE,
			SecondStateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_SPROUT_BLOCK = register("rice_sprout_block", RiceModBlocks.RICE_SPROUT_BLOCK,
			RiceSproutBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_SPROUT_SECOND_STATE = register("rice_sprout_second_state",
			RiceModBlocks.RICE_SPROUT_SECOND_STATE, RiceSproutSecondStateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_SPROUT_THIRD_STATE = register("rice_sprout_third_state",
			RiceModBlocks.RICE_SPROUT_THIRD_STATE, RiceSproutThirdStateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEST = register("test", RiceModBlocks.TEST, TestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_SPROUT_TOP = register("rice_sprout_top", RiceModBlocks.RICE_SPROUT_TOP,
			RiceSproutTopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CULTIVATED_RICE_BASE = register("cultivated_rice_base", RiceModBlocks.CULTIVATED_RICE_BASE,
			CultivatedRiceBaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CULTIVATED_RICE_TOP = register("cultivated_rice_top", RiceModBlocks.CULTIVATED_RICE_TOP,
			CultivatedRiceTopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUBOD_DOUGH = register("bubod_dough", RiceModBlocks.BUBOD_DOUGH,
			BubodDoughBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TAPAYAN_FULL = register("tapayan_full", RiceModBlocks.TAPAYAN_FULL,
			TapayanFullBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_BLOCK = register("pot_block", RiceModBlocks.POT_BLOCK, PotBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_BLOCK_FILLED = register("pot_block_filled", RiceModBlocks.POT_BLOCK_FILLED,
			PotBlockFilledBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
