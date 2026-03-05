
package net.mcreator.gunsmithcognitis.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MusketballItem extends Item {
	public MusketballItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
