
package net.mcreator.rice.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class PoundedRiceInAPanItem extends Item {
	public PoundedRiceInAPanItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.COMMON));
	}
}
