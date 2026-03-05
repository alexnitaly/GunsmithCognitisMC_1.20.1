package net.mcreator.gunsmithcognitis.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.gunsmithcognitis.init.GunsmithCognitisModEntities;
import net.mcreator.gunsmithcognitis.entity.NockVolleyGunProjectileEntity;
import net.mcreator.gunsmithcognitis.GunsmithCognitisMod;

public class NockVolleyGunRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.getOrCreateTag().putDouble("nockwait", 2);
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, itemstack) != 0) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, (y + 1.5), z, 32, 0, 0, 0, 0.025);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(2, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
			for (int index0 = 0; index0 < 8; index0++) {
				itemstack.getOrCreateTag().putDouble("nockwait", (itemstack.getOrCreateTag().getDouble("nockwait") + 4));
				GunsmithCognitisMod.queueServerWork((int) itemstack.getOrCreateTag().getDouble("nockwait"), () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("gunsmith_cognitis:musket_shot")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("gunsmith_cognitis:musket_shot")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new NockVolleyGunProjectileEntity(GunsmithCognitisModEntities.NOCK_VOLLEY_GUN_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 2, 0, (byte) 3);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, (float) 2.5);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, (y + 1.5), z, 24, 0, 0, 0, 0.004);
				});
			}
			itemstack.getOrCreateTag().putDouble("cooldown", 72);
		} else {
			if (itemstack.getOrCreateTag().getDouble("ammo") >= 1) {
				for (int index1 = 0; index1 < 8; index1++) {
					if (itemstack.getOrCreateTag().getDouble("ammo") >= 1 && itemstack.getOrCreateTag().getDouble("gunpowder") >= 2) {
						itemstack.getOrCreateTag().putDouble("gunpowder", (itemstack.getOrCreateTag().getDouble("gunpowder") - 2));
						itemstack.getOrCreateTag().putDouble("ammo", (itemstack.getOrCreateTag().getDouble("ammo") - 1));
						itemstack.getOrCreateTag().putDouble("nockwait", (itemstack.getOrCreateTag().getDouble("nockwait") + 2));
						GunsmithCognitisMod.queueServerWork((int) itemstack.getOrCreateTag().getDouble("nockwait"), () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("gunsmith_cognitis:musket_shot")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("gunsmith_cognitis:musket_shot")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new NockVolleyGunProjectileEntity(GunsmithCognitisModEntities.NOCK_VOLLEY_GUN_PROJECTILE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 2, 0, (byte) 3);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, (float) 2.5);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, (y + 1.5), z, 24, 0, 0, 0, 0.004);
						});
					} else {
						itemstack.getOrCreateTag().putDouble("gunpowder", 0);
						itemstack.getOrCreateTag().putDouble("cooldown", 24);
						itemstack.getOrCreateTag().putBoolean("ramrod loaded", false);
					}
				}
			}
		}
	}
}
