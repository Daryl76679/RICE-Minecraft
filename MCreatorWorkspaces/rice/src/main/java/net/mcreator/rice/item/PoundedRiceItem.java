
package net.mcreator.rice.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class PoundedRiceItem extends Item {
	public PoundedRiceItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.9f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 12;
	}
}
