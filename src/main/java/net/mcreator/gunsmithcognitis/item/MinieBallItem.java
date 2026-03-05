
package net.mcreator.gunsmithcognitis.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MinieBallItem extends Item {
	public MinieBallItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
