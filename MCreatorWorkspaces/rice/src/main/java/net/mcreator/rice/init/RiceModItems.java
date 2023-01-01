
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rice.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rice.item.WhiteRiceFlourItem;
import net.mcreator.rice.item.WhiteRiceFlourDustItem;
import net.mcreator.rice.item.WaterBowlWithRiceItem;
import net.mcreator.rice.item.WaterBowlWithRice2Item;
import net.mcreator.rice.item.WaterBowlItem;
import net.mcreator.rice.item.UnprocessedRiceItem;
import net.mcreator.rice.item.TapaiItem;
import net.mcreator.rice.item.SugarSyrupItem;
import net.mcreator.rice.item.RiceStemItem;
import net.mcreator.rice.item.RiceBowlItem;
import net.mcreator.rice.item.RiceBowl2Item;
import net.mcreator.rice.item.RiceAndEggItem;
import net.mcreator.rice.item.RawWhiteRiceItem;
import net.mcreator.rice.item.RawRiceAndEggItem;
import net.mcreator.rice.item.RawGroundBeefItem;
import net.mcreator.rice.item.RawBrownRiceItem;
import net.mcreator.rice.item.PoundedRiceItem;
import net.mcreator.rice.item.PoundedRiceInAPanItem;
import net.mcreator.rice.item.PotItem;
import net.mcreator.rice.item.MortarAndPestleItem;
import net.mcreator.rice.item.KnifeItem;
import net.mcreator.rice.item.HarvestedRiceItem;
import net.mcreator.rice.item.GroundBeefItem;
import net.mcreator.rice.item.GroundBeefAndRiceItem;
import net.mcreator.rice.item.GrainFlailItem;
import net.mcreator.rice.item.GolabkiItem;
import net.mcreator.rice.item.GalapongItem;
import net.mcreator.rice.item.FryingPanItem;
import net.mcreator.rice.item.FermentingRiceMixItem;
import net.mcreator.rice.item.CookedPoundedRiceInAPanItem;
import net.mcreator.rice.item.CibaCakesItem;
import net.mcreator.rice.item.BrownRiceFlourItem;
import net.mcreator.rice.item.BrownRiceFlourDustItem;
import net.mcreator.rice.item.BremItem;
import net.mcreator.rice.item.BlanchedCabbageItem;
import net.mcreator.rice.item.BibingkaItem;
import net.mcreator.rice.item.BibingkaDoneItem;
import net.mcreator.rice.RiceMod;

public class RiceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RiceMod.MODID);
	public static final RegistryObject<Item> RICE = doubleBlock(RiceModBlocks.RICE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> UNPROCESSED_RICE = REGISTRY.register("unprocessed_rice", () -> new UnprocessedRiceItem());
	public static final RegistryObject<Item> SECOND_STATE = block(RiceModBlocks.SECOND_STATE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> THIRD_STATE = doubleBlock(RiceModBlocks.THIRD_STATE, null);
	public static final RegistryObject<Item> HARVESTED_RICE = REGISTRY.register("harvested_rice", () -> new HarvestedRiceItem());
	public static final RegistryObject<Item> GRAIN_FLAIL = REGISTRY.register("grain_flail", () -> new GrainFlailItem());
	public static final RegistryObject<Item> RICE_SPROUT_BLOCK = block(RiceModBlocks.RICE_SPROUT_BLOCK, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RICE_SPROUT_SECOND_STATE = block(RiceModBlocks.RICE_SPROUT_SECOND_STATE, null);
	public static final RegistryObject<Item> RICE_SPROUT_THIRD_STATE = block(RiceModBlocks.RICE_SPROUT_THIRD_STATE, null);
	public static final RegistryObject<Item> TEST = block(RiceModBlocks.TEST, null);
	public static final RegistryObject<Item> RICE_SPROUT_TOP = block(RiceModBlocks.RICE_SPROUT_TOP, null);
	public static final RegistryObject<Item> CULTIVATED_RICE_BASE = block(RiceModBlocks.CULTIVATED_RICE_BASE, null);
	public static final RegistryObject<Item> CULTIVATED_RICE_TOP = block(RiceModBlocks.CULTIVATED_RICE_TOP, null);
	public static final RegistryObject<Item> WATER_BOWL_WITH_RICE = REGISTRY.register("water_bowl_with_rice", () -> new WaterBowlWithRiceItem());
	public static final RegistryObject<Item> RAW_BROWN_RICE = REGISTRY.register("raw_brown_rice", () -> new RawBrownRiceItem());
	public static final RegistryObject<Item> MORTAR_AND_PESTLE = REGISTRY.register("mortar_and_pestle", () -> new MortarAndPestleItem());
	public static final RegistryObject<Item> RICE_STEM = REGISTRY.register("rice_stem", () -> new RiceStemItem());
	public static final RegistryObject<Item> WATER_BOWL = REGISTRY.register("water_bowl", () -> new WaterBowlItem());
	public static final RegistryObject<Item> RICE_BOWL = REGISTRY.register("rice_bowl", () -> new RiceBowlItem());
	public static final RegistryObject<Item> RAW_WHITE_RICE = REGISTRY.register("raw_white_rice", () -> new RawWhiteRiceItem());
	public static final RegistryObject<Item> RICE_BOWL_2 = REGISTRY.register("rice_bowl_2", () -> new RiceBowl2Item());
	public static final RegistryObject<Item> WATER_BOWL_WITH_RICE_2 = REGISTRY.register("water_bowl_with_rice_2", () -> new WaterBowlWithRice2Item());
	public static final RegistryObject<Item> FRYING_PAN = REGISTRY.register("frying_pan", () -> new FryingPanItem());
	public static final RegistryObject<Item> RAW_RICE_AND_EGG = REGISTRY.register("raw_rice_and_egg", () -> new RawRiceAndEggItem());
	public static final RegistryObject<Item> RICE_AND_EGG = REGISTRY.register("rice_and_egg", () -> new RiceAndEggItem());
	public static final RegistryObject<Item> BROWN_RICE_FLOUR = REGISTRY.register("brown_rice_flour", () -> new BrownRiceFlourItem());
	public static final RegistryObject<Item> WHITE_RICE_FLOUR = REGISTRY.register("white_rice_flour", () -> new WhiteRiceFlourItem());
	public static final RegistryObject<Item> BUBOD_DOUGH = block(RiceModBlocks.BUBOD_DOUGH, CreativeModeTab.TAB_FOOD);
	public static final RegistryObject<Item> BUBOD = block(RiceModBlocks.BUBOD, CreativeModeTab.TAB_FOOD);
	public static final RegistryObject<Item> FERMENTING_RICE_MIX = REGISTRY.register("fermenting_rice_mix", () -> new FermentingRiceMixItem());
	public static final RegistryObject<Item> TAPAYAN = block(RiceModBlocks.TAPAYAN, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TAPAYAN_FULL = block(RiceModBlocks.TAPAYAN_FULL, null);
	public static final RegistryObject<Item> TAPAYAN_DONE = block(RiceModBlocks.TAPAYAN_DONE, null);
	public static final RegistryObject<Item> TAPAI = REGISTRY.register("tapai", () -> new TapaiItem());
	public static final RegistryObject<Item> TAPAYAN_DONE_BREM = block(RiceModBlocks.TAPAYAN_DONE_BREM, null);
	public static final RegistryObject<Item> BREM = REGISTRY.register("brem", () -> new BremItem());
	public static final RegistryObject<Item> WHITE_RICE_FLOUR_DUST = REGISTRY.register("white_rice_flour_dust", () -> new WhiteRiceFlourDustItem());
	public static final RegistryObject<Item> GALAPONG = REGISTRY.register("galapong", () -> new GalapongItem());
	public static final RegistryObject<Item> BIBINGKA_DOUGH = REGISTRY.register("bibingka_dough", () -> new BibingkaItem());
	public static final RegistryObject<Item> BIBINGKA = REGISTRY.register("bibingka", () -> new BibingkaDoneItem());
	public static final RegistryObject<Item> BROWN_RICE_FLOUR_DUST = REGISTRY.register("brown_rice_flour_dust", () -> new BrownRiceFlourDustItem());
	public static final RegistryObject<Item> GOLABKI = REGISTRY.register("golabki", () -> new GolabkiItem());
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> RAW_GROUND_BEEF = REGISTRY.register("raw_ground_beef", () -> new RawGroundBeefItem());
	public static final RegistryObject<Item> GROUND_BEEF = REGISTRY.register("ground_beef", () -> new GroundBeefItem());
	public static final RegistryObject<Item> POT = REGISTRY.register("pot", () -> new PotItem());
	public static final RegistryObject<Item> BLANCHED_CABBAGE = REGISTRY.register("blanched_cabbage", () -> new BlanchedCabbageItem());
	public static final RegistryObject<Item> POT_BLOCK = block(RiceModBlocks.POT_BLOCK, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> POT_BLOCK_FILLED = block(RiceModBlocks.POT_BLOCK_FILLED, null);
	public static final RegistryObject<Item> POT_BLOCK_CABBAGE = block(RiceModBlocks.POT_BLOCK_CABBAGE, null);
	public static final RegistryObject<Item> POUNDED_RICE = REGISTRY.register("pounded_rice", () -> new PoundedRiceItem());
	public static final RegistryObject<Item> SUGAR_SYRUP = REGISTRY.register("sugar_syrup", () -> new SugarSyrupItem());
	public static final RegistryObject<Item> POUNDED_RICE_IN_A_PAN = REGISTRY.register("pounded_rice_in_a_pan", () -> new PoundedRiceInAPanItem());
	public static final RegistryObject<Item> COOKED_POUNDED_RICE_IN_A_PAN = REGISTRY.register("cooked_pounded_rice_in_a_pan",
			() -> new CookedPoundedRiceInAPanItem());
	public static final RegistryObject<Item> CIBA_CAKES = REGISTRY.register("ciba_cakes", () -> new CibaCakesItem());
	public static final RegistryObject<Item> GROUND_BEEF_AND_RICE = REGISTRY.register("ground_beef_and_rice", () -> new GroundBeefAndRiceItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
