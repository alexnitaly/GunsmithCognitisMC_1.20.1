
package net.mcreator.gunsmithcognitis.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.gunsmithcognitis.init.GunsmithCognitisModItems;

import java.util.List;

public class ExplosiveroundEnchantment extends Enchantment {
	public ExplosiveroundEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.CROSSBOW, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return List.of(Enchantments.BINDING_CURSE, Enchantments.SHARPNESS, Enchantments.MOB_LOOTING, Enchantments.UNBREAKING, Enchantments.POWER_ARROWS, Enchantments.PUNCH_ARROWS, Enchantments.INFINITY_ARROWS, Enchantments.MULTISHOT,
				Enchantments.QUICK_CHARGE, Enchantments.PIERCING, Enchantments.MENDING, Enchantments.VANISHING_CURSE).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient
				.of(new ItemStack(GunsmithCognitisModItems.MATCHLOCK_ARQUEBUS.get()), new ItemStack(GunsmithCognitisModItems.HANDGUNNE.get()), new ItemStack(GunsmithCognitisModItems.THREEEYEGUN.get()),
						new ItemStack(GunsmithCognitisModItems.MATCHLOCK_BLUNDERBUSS.get()), new ItemStack(GunsmithCognitisModItems.FLINTLOCKMUSKET.get()), new ItemStack(GunsmithCognitisModItems.FLINTLOCKMUSKETBAYONET.get()),
						new ItemStack(GunsmithCognitisModItems.FLINTLOCKMUSKETGOLD.get()), new ItemStack(GunsmithCognitisModItems.FLINTLOCK_PISTOL.get()), new ItemStack(GunsmithCognitisModItems.FLINTLOCK_PISTOL_GOLD.get()),
						new ItemStack(GunsmithCognitisModItems.WHEELLOCK_PISTOL.get()), new ItemStack(GunsmithCognitisModItems.WHEELLOCK_MUSKET.get()), new ItemStack(GunsmithCognitisModItems.FLINTLOCK_DOUBLE_BARREL_MUSKET.get()),
						new ItemStack(GunsmithCognitisModItems.FLINTLOCK_PEPPERBOX.get()), new ItemStack(Items.BOW), new ItemStack(Items.CROSSBOW), new ItemStack(GunsmithCognitisModItems.TANEGASHIMA.get()),
						new ItemStack(GunsmithCognitisModItems.MATCHLOCK_SNAPHANCE_MUSKET.get()), new ItemStack(GunsmithCognitisModItems.JEZAILMUSKET.get()), new ItemStack(GunsmithCognitisModItems.MATCHLOCK_AXE_PISTOL.get()),
						new ItemStack(GunsmithCognitisModItems.MATCHLOCK_WALL_GUN.get()), new ItemStack(GunsmithCognitisModItems.WHEELLOCK_CARBINE.get()), new ItemStack(GunsmithCognitisModItems.WHEELLOCK_SPORTING_RIFLE.get()),
						new ItemStack(GunsmithCognitisModItems.FLINTLOCK_RIFLED_CARBINE.get()), new ItemStack(GunsmithCognitisModItems.FLINTLOCK_ASUMETTE_RIFLED_WALL_GUN.get()),
						new ItemStack(GunsmithCognitisModItems.FLINTLOCK_DOUBLE_BARREL_PISTOL.get()), new ItemStack(GunsmithCognitisModItems.FLINTLOCK_LORENZONI_REPEATER.get()),
						new ItemStack(GunsmithCognitisModItems.FLINTLOCK_PEPPERBOX_CARBINE.get()), new ItemStack(GunsmithCognitisModItems.WHEELLOCK_KALTHOFF_REPEATER.get()), new ItemStack(GunsmithCognitisModItems.DIVINE_FIVE_THUNDER_MACHINE.get()),
						new ItemStack(GunsmithCognitisModItems.FLINTLOCK_HEAVY_DRAGOON_PISTOL.get()), new ItemStack(GunsmithCognitisModItems.NOCK_VOLLEY_GUN.get()), new ItemStack(GunsmithCognitisModItems.FERGUSON_RIFLE.get()),
						new ItemStack(GunsmithCognitisModItems.FLINTLOCK_HAND_MORTAR.get()), new ItemStack(GunsmithCognitisModItems.FLINTLOCK_COLLIER_REVOLVER.get()), new ItemStack(GunsmithCognitisModItems.FLINTLOCK_COLLIER_REVOLVING_CARBINE.get()))
				.test(itemstack);
	}
}
