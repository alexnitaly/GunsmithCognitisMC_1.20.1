
package net.mcreator.gunsmithcognitis.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MortarballItem extends Item {
	public MortarballItem() {
		super(new Item.Properties().stacksTo(32).rarity(Rarity.COMMON));
	}
}
