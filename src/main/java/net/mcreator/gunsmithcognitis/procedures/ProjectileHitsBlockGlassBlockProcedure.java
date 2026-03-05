package net.mcreator.gunsmithcognitis.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ProjectileHitsBlockGlassBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GLASS || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GLASS_PANE
				|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:glass"))) || (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:glass_panes")))) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
