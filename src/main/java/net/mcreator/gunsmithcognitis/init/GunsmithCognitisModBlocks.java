
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunsmithcognitis.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gunsmithcognitis.block.ResearchTableBlock;
import net.mcreator.gunsmithcognitis.GunsmithCognitisMod;

public class GunsmithCognitisModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GunsmithCognitisMod.MODID);
	public static final RegistryObject<Block> RESEARCH_TABLE = REGISTRY.register("research_table", () -> new ResearchTableBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
