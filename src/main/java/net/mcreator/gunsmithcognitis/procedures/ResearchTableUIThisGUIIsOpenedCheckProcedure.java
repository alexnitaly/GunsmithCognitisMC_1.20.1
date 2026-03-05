package net.mcreator.gunsmithcognitis.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.gunsmithcognitis.network.GunsmithCognitisModVariables;

public class ResearchTableUIThisGUIIsOpenedCheckProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("gunsmith_cognitis:matchlock_intermediate_advancement"))).isDone()
				&& (entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GunsmithCognitisModVariables.PlayerVariables())).progression_matchlock < 2) {
			{
				double _setval = 2;
				entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.progression_matchlock = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel
				&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("gunsmith_cognitis:matchlock_mastery_advancement"))).isDone()
				&& (entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GunsmithCognitisModVariables.PlayerVariables())).progression_matchlock < 3) {
			{
				double _setval = 3;
				entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.progression_matchlock = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
				&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("gunsmith_cognitis:wheellock_entry_advancement"))).isDone()
				&& (entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GunsmithCognitisModVariables.PlayerVariables())).progression_wheellock < 1) {
			{
				double _setval = 1;
				entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.progression_wheellock = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel
				&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("gunsmith_cognitis:wheellock_intermediate_advancement"))).isDone()
				&& (entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GunsmithCognitisModVariables.PlayerVariables())).progression_wheellock < 2) {
			{
				double _setval = 2;
				entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.progression_wheellock = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel
				&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("gunsmith_cognitis:wheellock_mastery_advancement"))).isDone()
				&& (entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GunsmithCognitisModVariables.PlayerVariables())).progression_wheellock < 3) {
			{
				double _setval = 3;
				entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.progression_wheellock = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof ServerPlayer _plr5 && _plr5.level() instanceof ServerLevel
				&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("gunsmith_cognitis:flintlock_entry_advancement"))).isDone()
				&& (entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GunsmithCognitisModVariables.PlayerVariables())).progression_flintlock < 1) {
			{
				double _setval = 1;
				entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.progression_flintlock = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel
				&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("gunsmith_cognitis:flintlock_intermediate_advancement"))).isDone()
				&& (entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GunsmithCognitisModVariables.PlayerVariables())).progression_flintlock < 2) {
			{
				double _setval = 2;
				entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.progression_flintlock = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel
				&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("gunsmith_cognitis:flintlock_mastery_advancement"))).isDone()
				&& (entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GunsmithCognitisModVariables.PlayerVariables())).progression_flintlock < 3) {
			{
				double _setval = 3;
				entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.progression_flintlock = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof ServerPlayer _plr8 && _plr8.level() instanceof ServerLevel
				&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("gunsmith_cognitis:percussion_entry_advancement"))).isDone()
				&& (entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GunsmithCognitisModVariables.PlayerVariables())).progression_percussioncap < 1) {
			{
				double _setval = 1;
				entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.progression_percussioncap = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity instanceof ServerPlayer _plr9 && _plr9.level() instanceof ServerLevel
				&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("gunsmith_cognitis:percussion_intermediate_advancement"))).isDone()
				&& (entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GunsmithCognitisModVariables.PlayerVariables())).progression_percussioncap < 2) {
			{
				double _setval = 2;
				entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.progression_percussioncap = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel
				&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("gunsmith_cognitis:percussion_mastery_advancement"))).isDone()
				&& (entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GunsmithCognitisModVariables.PlayerVariables())).progression_percussioncap < 3) {
			{
				double _setval = 3;
				entity.getCapability(GunsmithCognitisModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.progression_percussioncap = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
