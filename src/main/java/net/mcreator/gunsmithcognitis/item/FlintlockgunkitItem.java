
package net.mcreator.gunsmithcognitis.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.gunsmithcognitis.procedures.FlintlockgunkitRightclickedOnBlockProcedure;

public class FlintlockgunkitItem extends Item {
	public FlintlockgunkitItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		FlintlockgunkitRightclickedOnBlockProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		FlintlockgunkitRightclickedOnBlockProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
