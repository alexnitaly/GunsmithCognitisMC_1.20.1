
package net.mcreator.gunsmithcognitis.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class FlintlockBlueprintMasteryItem extends Item {
	public FlintlockBlueprintMasteryItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}
}
