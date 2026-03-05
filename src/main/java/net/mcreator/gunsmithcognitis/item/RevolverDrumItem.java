
package net.mcreator.gunsmithcognitis.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RevolverDrumItem extends Item {
	public RevolverDrumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
