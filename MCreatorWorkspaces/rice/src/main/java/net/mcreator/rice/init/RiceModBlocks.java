
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rice.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.rice.block.ThirdStateBlock;
import net.mcreator.rice.block.TestBlock;
import net.mcreator.rice.block.TapayanFullBlock;
import net.mcreator.rice.block.TapayanDoneBremBlock;
import net.mcreator.rice.block.TapayanDoneBlock;
import net.mcreator.rice.block.TapayanBlock;
import net.mcreator.rice.block.SecondStateBlock;
import net.mcreator.rice.block.RiceSproutTopBlock;
import net.mcreator.rice.block.RiceSproutThirdStateBlock;
import net.mcreator.rice.block.RiceSproutSecondStateBlock;
import net.mcreator.rice.block.RiceSproutBlockBlock;
import net.mcreator.rice.block.RiceBlock;
import net.mcreator.rice.block.PotBlockFilledBlock;
import net.mcreator.rice.block.PotBlockCabbageBlock;
import net.mcreator.rice.block.PotBlockBlock;
import net.mcreator.rice.block.CultivatedRiceTopBlock;
import net.mcreator.rice.block.CultivatedRiceBaseBlock;
import net.mcreator.rice.block.BubodDoughBlock;
import net.mcreator.rice.block.BubodBlock;
import net.mcreator.rice.RiceMod;

public class RiceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RiceMod.MODID);
	public static final RegistryObject<Block> RICE = REGISTRY.register("rice", () -> new RiceBlock());
	public static final RegistryObject<Block> SECOND_STATE = REGISTRY.register("second_state", () -> new SecondStateBlock());
	public static final RegistryObject<Block> THIRD_STATE = REGISTRY.register("third_state", () -> new ThirdStateBlock());
	public static final RegistryObject<Block> RICE_SPROUT_BLOCK = REGISTRY.register("rice_sprout_block", () -> new RiceSproutBlockBlock());
	public static final RegistryObject<Block> RICE_SPROUT_SECOND_STATE = REGISTRY.register("rice_sprout_second_state",
			() -> new RiceSproutSecondStateBlock());
	public static final RegistryObject<Block> RICE_SPROUT_THIRD_STATE = REGISTRY.register("rice_sprout_third_state",
			() -> new RiceSproutThirdStateBlock());
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	public static final RegistryObject<Block> RICE_SPROUT_TOP = REGISTRY.register("rice_sprout_top", () -> new RiceSproutTopBlock());
	public static final RegistryObject<Block> CULTIVATED_RICE_BASE = REGISTRY.register("cultivated_rice_base", () -> new CultivatedRiceBaseBlock());
	public static final RegistryObject<Block> CULTIVATED_RICE_TOP = REGISTRY.register("cultivated_rice_top", () -> new CultivatedRiceTopBlock());
	public static final RegistryObject<Block> BUBOD_DOUGH = REGISTRY.register("bubod_dough", () -> new BubodDoughBlock());
	public static final RegistryObject<Block> BUBOD = REGISTRY.register("bubod", () -> new BubodBlock());
	public static final RegistryObject<Block> TAPAYAN = REGISTRY.register("tapayan", () -> new TapayanBlock());
	public static final RegistryObject<Block> TAPAYAN_FULL = REGISTRY.register("tapayan_full", () -> new TapayanFullBlock());
	public static final RegistryObject<Block> TAPAYAN_DONE = REGISTRY.register("tapayan_done", () -> new TapayanDoneBlock());
	public static final RegistryObject<Block> TAPAYAN_DONE_BREM = REGISTRY.register("tapayan_done_brem", () -> new TapayanDoneBremBlock());
	public static final RegistryObject<Block> POT_BLOCK = REGISTRY.register("pot_block", () -> new PotBlockBlock());
	public static final RegistryObject<Block> POT_BLOCK_FILLED = REGISTRY.register("pot_block_filled", () -> new PotBlockFilledBlock());
	public static final RegistryObject<Block> POT_BLOCK_CABBAGE = REGISTRY.register("pot_block_cabbage", () -> new PotBlockCabbageBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RiceBlock.registerRenderLayer();
			SecondStateBlock.registerRenderLayer();
			ThirdStateBlock.registerRenderLayer();
			RiceSproutBlockBlock.registerRenderLayer();
			RiceSproutSecondStateBlock.registerRenderLayer();
			RiceSproutThirdStateBlock.registerRenderLayer();
			TestBlock.registerRenderLayer();
			RiceSproutTopBlock.registerRenderLayer();
			CultivatedRiceBaseBlock.registerRenderLayer();
			CultivatedRiceTopBlock.registerRenderLayer();
			BubodDoughBlock.registerRenderLayer();
			BubodBlock.registerRenderLayer();
			TapayanBlock.registerRenderLayer();
			TapayanFullBlock.registerRenderLayer();
			TapayanDoneBlock.registerRenderLayer();
			TapayanDoneBremBlock.registerRenderLayer();
			PotBlockBlock.registerRenderLayer();
			PotBlockFilledBlock.registerRenderLayer();
			PotBlockCabbageBlock.registerRenderLayer();
		}
	}
}
