
package net.mcreator.gunsmithcognitis.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.gunsmithcognitis.procedures.WheellockPistolRangedItemUsedProcedure;
import net.mcreator.gunsmithcognitis.procedures.WheellockPistolEntitySwingsItemProcedure;
import net.mcreator.gunsmithcognitis.procedures.WheellockPistolCanUseRangedItemProcedure;
import net.mcreator.gunsmithcognitis.entity.WheellockPistolProjectileEntity;

import java.util.List;

public class WheellockPistolItem extends Item {
	public WheellockPistolItem() {
		super(new Item.Properties().durability(101).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Wheellock tier: Wheel must be spun"));
		list.add(Component.literal("then requires gunpowder and musket ball to load."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = InteractionResultHolder.fail(entity.getItemInHand(hand));
		if (WheellockPistolCanUseRangedItemProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity))
			if (entity.getAbilities().instabuild || findAmmo(entity) != ItemStack.EMPTY) {
				ar = InteractionResultHolder.success(entity.getItemInHand(hand));
				entity.startUsingItem(hand);
			}
		return ar;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		WheellockPistolEntitySwingsItemProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		if (!world.isClientSide() && entity instanceof ServerPlayer player) {
			ItemStack stack = findAmmo(player);
			if (player.getAbilities().instabuild || stack != ItemStack.EMPTY) {
				WheellockPistolProjectileEntity projectile = WheellockPistolProjectileEntity.shoot(world, entity, world.getRandom());
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				if (player.getAbilities().instabuild) {
					projectile.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
				} else {
					if (stack.isDamageableItem()) {
						if (stack.hurt(1, world.getRandom(), player)) {
							stack.shrink(1);
							stack.setDamageValue(0);
							if (stack.isEmpty())
								player.getInventory().removeItem(stack);
						}
					} else {
						stack.shrink(1);
						if (stack.isEmpty())
							player.getInventory().removeItem(stack);
					}
				}
				WheellockPistolRangedItemUsedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
			}
		}
	}

	private ItemStack findAmmo(Player player) {
		ItemStack stack = ProjectileWeaponItem.getHeldProjectile(player, e -> e.getItem() == WheellockPistolProjectileEntity.PROJECTILE_ITEM.getItem());
		if (stack == ItemStack.EMPTY) {
			for (int i = 0; i < player.getInventory().items.size(); i++) {
				ItemStack teststack = player.getInventory().items.get(i);
				if (teststack != null && teststack.getItem() == WheellockPistolProjectileEntity.PROJECTILE_ITEM.getItem()) {
					stack = teststack;
					break;
				}
			}
		}
		return stack;
	}
}
