
package net.mcreator.gunsmithcognitis.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.gunsmithcognitis.procedures.DynamiteWhileProjectileFlyingTickProcedure;
import net.mcreator.gunsmithcognitis.init.GunsmithCognitisModItems;
import net.mcreator.gunsmithcognitis.init.GunsmithCognitisModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class DynamiteProjectileEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(GunsmithCognitisModItems.DYNAMITE.get());

	public DynamiteProjectileEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(GunsmithCognitisModEntities.DYNAMITE_PROJECTILE.get(), world);
	}

	public DynamiteProjectileEntity(EntityType<? extends DynamiteProjectileEntity> type, Level world) {
		super(type, world);
	}

	public DynamiteProjectileEntity(EntityType<? extends DynamiteProjectileEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public DynamiteProjectileEntity(EntityType<? extends DynamiteProjectileEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		DynamiteWhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
		if (this.level() != null && !this.level().isClientSide()) {
			DynamiteWhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
		}
	}

	public static DynamiteProjectileEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1.1f, 1, 0);
	}

	public static DynamiteProjectileEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		DynamiteProjectileEntity entityarrow = new DynamiteProjectileEntity(GunsmithCognitisModEntities.DYNAMITE_PROJECTILE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static DynamiteProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
		DynamiteProjectileEntity entityarrow = new DynamiteProjectileEntity(GunsmithCognitisModEntities.DYNAMITE_PROJECTILE.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1.1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(1);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(true);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}

	@Override
	protected void onHitBlock(net.minecraft.world.phys.BlockHitResult blockHitResult) {
		
		net.minecraft.core.Direction face = blockHitResult.getDirection();
		net.minecraft.world.phys.Vec3 motion = this.getDeltaMovement();
		
		double bounceFactor = 0.45D; 
		
		double motX = motion.x;
		double motY = motion.y;
		double motZ = motion.z;
		
		if (face.getAxis() == net.minecraft.core.Direction.Axis.X) {
			motX = -motX * bounceFactor;
		} else if (face.getAxis() == net.minecraft.core.Direction.Axis.Y) {
			motY = -motY * bounceFactor;
			motX *= 0.75D;
			motZ *= 0.75D;
		} else if (face.getAxis() == net.minecraft.core.Direction.Axis.Z) {
			motZ = -motZ * bounceFactor;
		}
		
		if (Math.abs(motY) < 0.05D && face.getAxis() == net.minecraft.core.Direction.Axis.Y) {
			motY = 0.0D;
		} else {
			this.playSound(net.minecraft.sounds.SoundEvents.STONE_HIT, 0.5F, 1.2F);
		}
		
		this.setDeltaMovement(motX, motY, motZ);
		
		this.setPos(this.getX() + motX * 0.05, this.getY() + motY * 0.05, this.getZ() + motZ * 0.05);
	}
		
	@Override
	protected void onHitEntity(net.minecraft.world.phys.EntityHitResult entityHitResult) {

		net.minecraft.world.phys.Vec3 motion = this.getDeltaMovement();
		
		this.setDeltaMovement(motion.x * -0.4D, motion.y * -0.4D, motion.z * -0.4D);
		
		this.playSound(net.minecraft.sounds.SoundEvents.STONE_HIT, 1.0F, 1.2F);
	}
}
