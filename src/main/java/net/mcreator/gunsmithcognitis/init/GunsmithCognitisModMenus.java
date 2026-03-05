
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunsmithcognitis.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.gunsmithcognitis.world.inventory.ResearchTableUIMenu;
import net.mcreator.gunsmithcognitis.GunsmithCognitisMod;

public class GunsmithCognitisModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GunsmithCognitisMod.MODID);
	public static final RegistryObject<MenuType<ResearchTableUIMenu>> RESEARCH_TABLE_UI = REGISTRY.register("research_table_ui", () -> IForgeMenuType.create(ResearchTableUIMenu::new));
}
