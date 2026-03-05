
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunsmithcognitis.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.gunsmithcognitis.GunsmithCognitisMod;

public class GunsmithCognitisModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GunsmithCognitisMod.MODID);
	public static final RegistryObject<SoundEvent> GUN_SHOT_HEAVY = REGISTRY.register("gun_shot_heavy", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gunsmith_cognitis", "gun_shot_heavy")));
	public static final RegistryObject<SoundEvent> MUSKET_SHOT = REGISTRY.register("musket_shot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gunsmith_cognitis", "musket_shot")));
}
