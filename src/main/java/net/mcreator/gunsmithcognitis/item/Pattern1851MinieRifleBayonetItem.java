
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
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.gunsmithcognitis.procedures.Pattern1851minierifleRangedItemUsedProcedure;
import net.mcreator.gunsmithcognitis.procedures.Pattern1851minierifleCanUseRangedItemProcedure;
import net.mcreator.gunsmithcognitis.entity.Pattern1851MinieRifleBayonetProjectileEntity;

import java.util.List;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class Pattern1851MinieRifleBayonetItem extends Item {
	public Pattern1851MinieRifleBayonetItem() {
		super(new Item.Properties().durability(799).rarity(Rarity.COMMON));
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
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
			builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Item modifier", 5.5d, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Item modifier", -2.4, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getDefaultAttributeModifiers(equipmentSlot);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Percussion Cap tier: Requires 2 gunpowder and minie ball in inventory OR a minie paper cartidge in inventory to load"));
		list.add(Component.literal("needs a percussion cap from inventory in order to fire."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = InteractionResultHolder.fail(entity.getItemInHand(hand));
		if (Pattern1851minierifleCanUseRangedItemProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity))
			if (entity.getAbilities().instabuild || findAmmo(entity) != ItemStack.EMPTY) {
				ar = InteractionResultHolder.success(entity.getItemInHand(hand));
				entity.startUsingItem(hand);
			}
		return ar;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		itemstack.hurtAndBreak(1, entity, i -> i.broadcastBreakEvent(EquipmentSlot.MAINHAND));
		return true;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		if (!world.isClientSide() && entity instanceof ServerPlayer player) {
			ItemStack stack = findAmmo(player);
			if (player.getAbilities().instabuild || stack != ItemStack.EMPTY) {
				Pattern1851MinieRifleBayonetProjectileEntity projectile = Pattern1851MinieRifleBayonetProjectileEntity.shoot(world, entity, world.getRandom());
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
				Pattern1851minierifleRangedItemUsedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
			}
		}
	}

	private ItemStack findAmmo(Player player) {
		ItemStack stack = ProjectileWeaponItem.getHeldProjectile(player, e -> e.getItem() == Pattern1851MinieRifleBayonetProjectileEntity.PROJECTILE_ITEM.getItem());
		if (stack == ItemStack.EMPTY) {
			for (int i = 0; i < player.getInventory().items.size(); i++) {
				ItemStack teststack = player.getInventory().items.get(i);
				if (teststack != null && teststack.getItem() == Pattern1851MinieRifleBayonetProjectileEntity.PROJECTILE_ITEM.getItem()) {
					stack = teststack;
					break;
				}
			}
		}
		return stack;
	}
}
