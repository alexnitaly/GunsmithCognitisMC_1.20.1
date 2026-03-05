package net.mcreator.gunsmithcognitis.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.gunsmithcognitis.init.GunsmithCognitisModItems;
import net.mcreator.gunsmithcognitis.GunsmithCognitisMod;

public class BigGame4BorePercussionRifleOverlayProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == GunsmithCognitisModItems.BIG_GAME_4_BORE_PERCUSSION_RIFLE.get()) {
			if (entity.isInWaterOrBubble()) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("4-Bore Big Game Percussion Rifle: " + "Unfit Envirorment! Can't fire.")), true);
			} else if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("4-Bore Big Game Percussion Rifle: " + "Off-hand must be empty!")), true);
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("cooldown") <= 0
					&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("jammed"))
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("ramrod loaded")
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("percussion cap")
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") > 0
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("gunpowder") > 0) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("4-Bore Big Game Percussion Rifle: " + "Loaded")), true);
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("jammed")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("4-Bore Big Game Percussion Rifle: " + "Jammed! Fix Cooldown...")), true);
				GunsmithCognitisMod.queueServerWork(50, () -> {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("jammed", false);
				});
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("cooldown") > 0) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("4-Bore Big Game Percussion Rifle: " + "On Cooldown!")), true);
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") > 0) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("4-Bore Big Game Percussion Rifle: " + "Needs to be loaded with Ramrod")), true);
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("gunpowder") > 0) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("gunpowder") >= 3) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("4-Bore Big Game Percussion Rifle: " + "Needs ammo")), true);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("4-Bore Big Game Percussion Rifle: " + "Not Enough Gunpowder")), true);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("4-Bore Big Game Percussion Rifle: " + "Empty")), true);
			}
		}
	}
}
