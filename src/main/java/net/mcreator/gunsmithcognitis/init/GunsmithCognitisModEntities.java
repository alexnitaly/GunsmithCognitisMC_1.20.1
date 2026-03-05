
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunsmithcognitis.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.gunsmithcognitis.entity.WheellockSportingRifleProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.WheellockPistolProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.WheellockPetronelProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.WheellockMusketProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.WheellockKalthoffRepeaterProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.WheellockCarbineProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.ThreeeyegunProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.TanegashimaProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.SpringfieldModel1861RifledMusketProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.SpringfieldModel1861RifledMusketBayonetProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.SawnOffDoubleBarrelShotgunProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.SawnOffColtRevolver1855ProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.SawnColtRevolvingShotgun1855ProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.RockProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.PorterTurretRifleProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.Pattern1851minierifleProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.Pattern1851MinieRifleBayonetProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.NockVolleyGunProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.MiquoletMusketProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.MatchlockWallGunProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.MatchlockSnaphanceMusketProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.MatchlockPistolProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.MatchlockHeavyArquebusProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.MatchlockBlunderbussProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.MatchlockAxePistolProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.MatchlockArquebusProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.LorenzPistolProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.LandsknechtHarkebusProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.KentuckyPistolProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.JosephEggPistolProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.JezailmusketProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.HandgunneProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.HandcannonProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.HandBombProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.Fusil1866ChassepotProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.Fusil1866ChassepotBayonetProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockmusketgoldProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockmusketbayonetProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockmusketProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockRifledCarbineProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockPistolProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockPistolGoldProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockPepperboxProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockPepperboxCarbineProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockLorenzoniRepeaterProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockHeavyDragoonPistolProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockHandMortarProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockDoubleBarrelPistolProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockDoubleBarrelMusketProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockCollierRevolvingCarbineProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockCollierRevolverProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockBlunderbussProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FlintlockAsumetteRifledWallGunProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.FergusonRifleProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.Enfield1853MusketRifleProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.DynamiteProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.DynamitePackProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.DreyseNeedleGunProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.DoubleBarrelShotgunProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.DivineFiveThunderMachineProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.ColtWalker1847ProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.ColtRevolvingShotgun1855ProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.ColtRevolvingRifle1855ProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.ColtPeterson1836ProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.ColtDragoon1848ProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.ColtArmy1860ProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.BrowningHarmonicaRifleProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.BigGame4BorePercussionRifleProjectileEntity;
import net.mcreator.gunsmithcognitis.entity.Adams1856RevolverProjectileEntity;
import net.mcreator.gunsmithcognitis.GunsmithCognitisMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GunsmithCognitisModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GunsmithCognitisMod.MODID);
	public static final RegistryObject<EntityType<MatchlockArquebusProjectileEntity>> MATCHLOCK_ARQUEBUS_PROJECTILE = register("matchlock_arquebus_projectile",
			EntityType.Builder.<MatchlockArquebusProjectileEntity>of(MatchlockArquebusProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MatchlockArquebusProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HandgunneProjectileEntity>> HANDGUNNE_PROJECTILE = register("handgunne_projectile", EntityType.Builder.<HandgunneProjectileEntity>of(HandgunneProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HandgunneProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ThreeeyegunProjectileEntity>> THREEEYEGUN_PROJECTILE = register("threeeyegun_projectile", EntityType.Builder.<ThreeeyegunProjectileEntity>of(ThreeeyegunProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ThreeeyegunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MatchlockBlunderbussProjectileEntity>> MATCHLOCK_BLUNDERBUSS_PROJECTILE = register("matchlock_blunderbuss_projectile",
			EntityType.Builder.<MatchlockBlunderbussProjectileEntity>of(MatchlockBlunderbussProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MatchlockBlunderbussProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockmusketProjectileEntity>> FLINTLOCKMUSKET_PROJECTILE = register("flintlockmusket_projectile",
			EntityType.Builder.<FlintlockmusketProjectileEntity>of(FlintlockmusketProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockmusketProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockmusketbayonetProjectileEntity>> FLINTLOCKMUSKETBAYONET_PROJECTILE = register("flintlockmusketbayonet_projectile",
			EntityType.Builder.<FlintlockmusketbayonetProjectileEntity>of(FlintlockmusketbayonetProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockmusketbayonetProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockmusketgoldProjectileEntity>> FLINTLOCKMUSKETGOLD_PROJECTILE = register("flintlockmusketgold_projectile",
			EntityType.Builder.<FlintlockmusketgoldProjectileEntity>of(FlintlockmusketgoldProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockmusketgoldProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockPistolProjectileEntity>> FLINTLOCK_PISTOL_PROJECTILE = register("flintlock_pistol_projectile",
			EntityType.Builder.<FlintlockPistolProjectileEntity>of(FlintlockPistolProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockPistolProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockPistolGoldProjectileEntity>> FLINTLOCK_PISTOL_GOLD_PROJECTILE = register("flintlock_pistol_gold_projectile",
			EntityType.Builder.<FlintlockPistolGoldProjectileEntity>of(FlintlockPistolGoldProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockPistolGoldProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WheellockPistolProjectileEntity>> WHEELLOCK_PISTOL_PROJECTILE = register("wheellock_pistol_projectile",
			EntityType.Builder.<WheellockPistolProjectileEntity>of(WheellockPistolProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(WheellockPistolProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WheellockMusketProjectileEntity>> WHEELLOCK_MUSKET_PROJECTILE = register("wheellock_musket_projectile",
			EntityType.Builder.<WheellockMusketProjectileEntity>of(WheellockMusketProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(WheellockMusketProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockDoubleBarrelMusketProjectileEntity>> FLINTLOCK_DOUBLE_BARREL_MUSKET_PROJECTILE = register("flintlock_double_barrel_musket_projectile",
			EntityType.Builder.<FlintlockDoubleBarrelMusketProjectileEntity>of(FlintlockDoubleBarrelMusketProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockDoubleBarrelMusketProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockPepperboxProjectileEntity>> FLINTLOCK_PEPPERBOX_PROJECTILE = register("flintlock_pepperbox_projectile",
			EntityType.Builder.<FlintlockPepperboxProjectileEntity>of(FlintlockPepperboxProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockPepperboxProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TanegashimaProjectileEntity>> TANEGASHIMA_PROJECTILE = register("tanegashima_projectile", EntityType.Builder.<TanegashimaProjectileEntity>of(TanegashimaProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(TanegashimaProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MatchlockSnaphanceMusketProjectileEntity>> MATCHLOCK_SNAPHANCE_MUSKET_PROJECTILE = register("matchlock_snaphance_musket_projectile",
			EntityType.Builder.<MatchlockSnaphanceMusketProjectileEntity>of(MatchlockSnaphanceMusketProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MatchlockSnaphanceMusketProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<JezailmusketProjectileEntity>> JEZAILMUSKET_PROJECTILE = register("jezailmusket_projectile", EntityType.Builder.<JezailmusketProjectileEntity>of(JezailmusketProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(JezailmusketProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MatchlockAxePistolProjectileEntity>> MATCHLOCK_AXE_PISTOL_PROJECTILE = register("matchlock_axe_pistol_projectile",
			EntityType.Builder.<MatchlockAxePistolProjectileEntity>of(MatchlockAxePistolProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MatchlockAxePistolProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MatchlockWallGunProjectileEntity>> MATCHLOCK_WALL_GUN_PROJECTILE = register("matchlock_wall_gun_projectile",
			EntityType.Builder.<MatchlockWallGunProjectileEntity>of(MatchlockWallGunProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MatchlockWallGunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WheellockCarbineProjectileEntity>> WHEELLOCK_CARBINE_PROJECTILE = register("wheellock_carbine_projectile",
			EntityType.Builder.<WheellockCarbineProjectileEntity>of(WheellockCarbineProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(WheellockCarbineProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WheellockSportingRifleProjectileEntity>> WHEELLOCK_SPORTING_RIFLE_PROJECTILE = register("wheellock_sporting_rifle_projectile",
			EntityType.Builder.<WheellockSportingRifleProjectileEntity>of(WheellockSportingRifleProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(WheellockSportingRifleProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockRifledCarbineProjectileEntity>> FLINTLOCK_RIFLED_CARBINE_PROJECTILE = register("flintlock_rifled_carbine_projectile",
			EntityType.Builder.<FlintlockRifledCarbineProjectileEntity>of(FlintlockRifledCarbineProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockRifledCarbineProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockAsumetteRifledWallGunProjectileEntity>> FLINTLOCK_ASUMETTE_RIFLED_WALL_GUN_PROJECTILE = register("flintlock_asumette_rifled_wall_gun_projectile",
			EntityType.Builder.<FlintlockAsumetteRifledWallGunProjectileEntity>of(FlintlockAsumetteRifledWallGunProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockAsumetteRifledWallGunProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockDoubleBarrelPistolProjectileEntity>> FLINTLOCK_DOUBLE_BARREL_PISTOL_PROJECTILE = register("flintlock_double_barrel_pistol_projectile",
			EntityType.Builder.<FlintlockDoubleBarrelPistolProjectileEntity>of(FlintlockDoubleBarrelPistolProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockDoubleBarrelPistolProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockLorenzoniRepeaterProjectileEntity>> FLINTLOCK_LORENZONI_REPEATER_PROJECTILE = register("flintlock_lorenzoni_repeater_projectile",
			EntityType.Builder.<FlintlockLorenzoniRepeaterProjectileEntity>of(FlintlockLorenzoniRepeaterProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockLorenzoniRepeaterProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockPepperboxCarbineProjectileEntity>> FLINTLOCK_PEPPERBOX_CARBINE_PROJECTILE = register("flintlock_pepperbox_carbine_projectile",
			EntityType.Builder.<FlintlockPepperboxCarbineProjectileEntity>of(FlintlockPepperboxCarbineProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockPepperboxCarbineProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WheellockKalthoffRepeaterProjectileEntity>> WHEELLOCK_KALTHOFF_REPEATER_PROJECTILE = register("wheellock_kalthoff_repeater_projectile",
			EntityType.Builder.<WheellockKalthoffRepeaterProjectileEntity>of(WheellockKalthoffRepeaterProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(WheellockKalthoffRepeaterProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DivineFiveThunderMachineProjectileEntity>> DIVINE_FIVE_THUNDER_MACHINE_PROJECTILE = register("divine_five_thunder_machine_projectile",
			EntityType.Builder.<DivineFiveThunderMachineProjectileEntity>of(DivineFiveThunderMachineProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DivineFiveThunderMachineProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockHeavyDragoonPistolProjectileEntity>> FLINTLOCK_HEAVY_DRAGOON_PISTOL_PROJECTILE = register("flintlock_heavy_dragoon_pistol_projectile",
			EntityType.Builder.<FlintlockHeavyDragoonPistolProjectileEntity>of(FlintlockHeavyDragoonPistolProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockHeavyDragoonPistolProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NockVolleyGunProjectileEntity>> NOCK_VOLLEY_GUN_PROJECTILE = register("nock_volley_gun_projectile",
			EntityType.Builder.<NockVolleyGunProjectileEntity>of(NockVolleyGunProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(NockVolleyGunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FergusonRifleProjectileEntity>> FERGUSON_RIFLE_PROJECTILE = register("ferguson_rifle_projectile",
			EntityType.Builder.<FergusonRifleProjectileEntity>of(FergusonRifleProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FergusonRifleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockHandMortarProjectileEntity>> FLINTLOCK_HAND_MORTAR_PROJECTILE = register("flintlock_hand_mortar_projectile",
			EntityType.Builder.<FlintlockHandMortarProjectileEntity>of(FlintlockHandMortarProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockHandMortarProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RockProjectileEntity>> ROCK_PROJECTILE = register("rock_projectile",
			EntityType.Builder.<RockProjectileEntity>of(RockProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(RockProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockCollierRevolverProjectileEntity>> FLINTLOCK_COLLIER_REVOLVER_PROJECTILE = register("flintlock_collier_revolver_projectile",
			EntityType.Builder.<FlintlockCollierRevolverProjectileEntity>of(FlintlockCollierRevolverProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockCollierRevolverProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockCollierRevolvingCarbineProjectileEntity>> FLINTLOCK_COLLIER_REVOLVING_CARBINE_PROJECTILE = register("flintlock_collier_revolving_carbine_projectile",
			EntityType.Builder.<FlintlockCollierRevolvingCarbineProjectileEntity>of(FlintlockCollierRevolvingCarbineProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockCollierRevolvingCarbineProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DynamiteProjectileEntity>> DYNAMITE_PROJECTILE = register("dynamite_projectile", EntityType.Builder.<DynamiteProjectileEntity>of(DynamiteProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DynamiteProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DynamitePackProjectileEntity>> DYNAMITE_PACK_PROJECTILE = register("dynamite_pack_projectile", EntityType.Builder.<DynamitePackProjectileEntity>of(DynamitePackProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DynamitePackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Pattern1851minierifleProjectileEntity>> PATTERN_1851MINIERIFLE_PROJECTILE = register("pattern_1851minierifle_projectile",
			EntityType.Builder.<Pattern1851minierifleProjectileEntity>of(Pattern1851minierifleProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(Pattern1851minierifleProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LorenzPistolProjectileEntity>> LORENZ_PISTOL_PROJECTILE = register("lorenz_pistol_projectile", EntityType.Builder.<LorenzPistolProjectileEntity>of(LorenzPistolProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LorenzPistolProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KentuckyPistolProjectileEntity>> KENTUCKY_PISTOL_PROJECTILE = register("kentucky_pistol_projectile",
			EntityType.Builder.<KentuckyPistolProjectileEntity>of(KentuckyPistolProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(KentuckyPistolProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BrowningHarmonicaRifleProjectileEntity>> BROWNING_HARMONICA_RIFLE_PROJECTILE = register("browning_harmonica_rifle_projectile",
			EntityType.Builder.<BrowningHarmonicaRifleProjectileEntity>of(BrowningHarmonicaRifleProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BrowningHarmonicaRifleProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HandcannonProjectileEntity>> HANDCANNON_PROJECTILE = register("handcannon_projectile", EntityType.Builder.<HandcannonProjectileEntity>of(HandcannonProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HandcannonProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MiquoletMusketProjectileEntity>> MIQUOLET_MUSKET_PROJECTILE = register("miquolet_musket_projectile",
			EntityType.Builder.<MiquoletMusketProjectileEntity>of(MiquoletMusketProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MiquoletMusketProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WheellockPetronelProjectileEntity>> WHEELLOCK_PETRONEL_PROJECTILE = register("wheellock_petronel_projectile",
			EntityType.Builder.<WheellockPetronelProjectileEntity>of(WheellockPetronelProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(WheellockPetronelProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlintlockBlunderbussProjectileEntity>> FLINTLOCK_BLUNDERBUSS_PROJECTILE = register("flintlock_blunderbuss_projectile",
			EntityType.Builder.<FlintlockBlunderbussProjectileEntity>of(FlintlockBlunderbussProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlintlockBlunderbussProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MatchlockHeavyArquebusProjectileEntity>> MATCHLOCK_HEAVY_ARQUEBUS_PROJECTILE = register("matchlock_heavy_arquebus_projectile",
			EntityType.Builder.<MatchlockHeavyArquebusProjectileEntity>of(MatchlockHeavyArquebusProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MatchlockHeavyArquebusProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LandsknechtHarkebusProjectileEntity>> LANDSKNECHT_HARKEBUS_PROJECTILE = register("landsknecht_harkebus_projectile",
			EntityType.Builder.<LandsknechtHarkebusProjectileEntity>of(LandsknechtHarkebusProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(LandsknechtHarkebusProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MatchlockPistolProjectileEntity>> MATCHLOCK_PISTOL_PROJECTILE = register("matchlock_pistol_projectile",
			EntityType.Builder.<MatchlockPistolProjectileEntity>of(MatchlockPistolProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MatchlockPistolProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DreyseNeedleGunProjectileEntity>> DREYSE_NEEDLE_GUN_PROJECTILE = register("dreyse_needle_gun_projectile",
			EntityType.Builder.<DreyseNeedleGunProjectileEntity>of(DreyseNeedleGunProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DreyseNeedleGunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DoubleBarrelShotgunProjectileEntity>> DOUBLE_BARREL_SHOTGUN_PROJECTILE = register("double_barrel_shotgun_projectile",
			EntityType.Builder.<DoubleBarrelShotgunProjectileEntity>of(DoubleBarrelShotgunProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DoubleBarrelShotgunProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Pattern1851MinieRifleBayonetProjectileEntity>> PATTERN_1851_MINIE_RIFLE_BAYONET_PROJECTILE = register("pattern_1851_minie_rifle_bayonet_projectile",
			EntityType.Builder.<Pattern1851MinieRifleBayonetProjectileEntity>of(Pattern1851MinieRifleBayonetProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(Pattern1851MinieRifleBayonetProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SawnOffDoubleBarrelShotgunProjectileEntity>> SAWN_OFF_DOUBLE_BARREL_SHOTGUN_PROJECTILE = register("sawn_off_double_barrel_shotgun_projectile",
			EntityType.Builder.<SawnOffDoubleBarrelShotgunProjectileEntity>of(SawnOffDoubleBarrelShotgunProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SawnOffDoubleBarrelShotgunProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ColtPeterson1836ProjectileEntity>> COLT_PETERSON_1836_PROJECTILE = register("colt_peterson_1836_projectile",
			EntityType.Builder.<ColtPeterson1836ProjectileEntity>of(ColtPeterson1836ProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ColtPeterson1836ProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ColtDragoon1848ProjectileEntity>> COLT_DRAGOON_1848_PROJECTILE = register("colt_dragoon_1848_projectile",
			EntityType.Builder.<ColtDragoon1848ProjectileEntity>of(ColtDragoon1848ProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ColtDragoon1848ProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ColtWalker1847ProjectileEntity>> COLT_WALKER_1847_PROJECTILE = register("colt_walker_1847_projectile",
			EntityType.Builder.<ColtWalker1847ProjectileEntity>of(ColtWalker1847ProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ColtWalker1847ProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ColtRevolvingRifle1855ProjectileEntity>> COLT_REVOLVING_RIFLE_1855_PROJECTILE = register("colt_revolving_rifle_1855_projectile",
			EntityType.Builder.<ColtRevolvingRifle1855ProjectileEntity>of(ColtRevolvingRifle1855ProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ColtRevolvingRifle1855ProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ColtArmy1860ProjectileEntity>> COLT_ARMY_1860_PROJECTILE = register("colt_army_1860_projectile",
			EntityType.Builder.<ColtArmy1860ProjectileEntity>of(ColtArmy1860ProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ColtArmy1860ProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpringfieldModel1861RifledMusketProjectileEntity>> SPRINGFIELD_MODEL_1861_RIFLED_MUSKET_PROJECTILE = register("springfield_model_1861_rifled_musket_projectile",
			EntityType.Builder.<SpringfieldModel1861RifledMusketProjectileEntity>of(SpringfieldModel1861RifledMusketProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SpringfieldModel1861RifledMusketProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpringfieldModel1861RifledMusketBayonetProjectileEntity>> SPRINGFIELD_MODEL_1861_RIFLED_MUSKET_BAYONET_PROJECTILE = register("springfield_model_1861_rifled_musket_bayonet_projectile",
			EntityType.Builder.<SpringfieldModel1861RifledMusketBayonetProjectileEntity>of(SpringfieldModel1861RifledMusketBayonetProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(SpringfieldModel1861RifledMusketBayonetProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Fusil1866ChassepotProjectileEntity>> FUSIL_1866_CHASSEPOT_PROJECTILE = register("fusil_1866_chassepot_projectile",
			EntityType.Builder.<Fusil1866ChassepotProjectileEntity>of(Fusil1866ChassepotProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(Fusil1866ChassepotProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Fusil1866ChassepotBayonetProjectileEntity>> FUSIL_1866_CHASSEPOT_BAYONET_PROJECTILE = register("fusil_1866_chassepot_bayonet_projectile",
			EntityType.Builder.<Fusil1866ChassepotBayonetProjectileEntity>of(Fusil1866ChassepotBayonetProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(Fusil1866ChassepotBayonetProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<JosephEggPistolProjectileEntity>> JOSEPH_EGG_PISTOL_PROJECTILE = register("joseph_egg_pistol_projectile",
			EntityType.Builder.<JosephEggPistolProjectileEntity>of(JosephEggPistolProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(JosephEggPistolProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BigGame4BorePercussionRifleProjectileEntity>> BIG_GAME_4_BORE_PERCUSSION_RIFLE_PROJECTILE = register("big_game_4_bore_percussion_rifle_projectile",
			EntityType.Builder.<BigGame4BorePercussionRifleProjectileEntity>of(BigGame4BorePercussionRifleProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BigGame4BorePercussionRifleProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HandBombProjectileEntity>> HAND_BOMB_PROJECTILE = register("hand_bomb_projectile", EntityType.Builder.<HandBombProjectileEntity>of(HandBombProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HandBombProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Adams1856RevolverProjectileEntity>> ADAMS_1856_REVOLVER_PROJECTILE = register("adams_1856_revolver_projectile",
			EntityType.Builder.<Adams1856RevolverProjectileEntity>of(Adams1856RevolverProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(Adams1856RevolverProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Enfield1853MusketRifleProjectileEntity>> ENFIELD_1853_MUSKET_RIFLE_PROJECTILE = register("enfield_1853_musket_rifle_projectile",
			EntityType.Builder.<Enfield1853MusketRifleProjectileEntity>of(Enfield1853MusketRifleProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(Enfield1853MusketRifleProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SawnOffColtRevolver1855ProjectileEntity>> SAWN_OFF_COLT_REVOLVER_1855_PROJECTILE = register("sawn_off_colt_revolver_1855_projectile",
			EntityType.Builder.<SawnOffColtRevolver1855ProjectileEntity>of(SawnOffColtRevolver1855ProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SawnOffColtRevolver1855ProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PorterTurretRifleProjectileEntity>> PORTER_TURRET_RIFLE_PROJECTILE = register("porter_turret_rifle_projectile",
			EntityType.Builder.<PorterTurretRifleProjectileEntity>of(PorterTurretRifleProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(PorterTurretRifleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ColtRevolvingShotgun1855ProjectileEntity>> COLT_REVOLVING_SHOTGUN_1855_PROJECTILE = register("colt_revolving_shotgun_1855_projectile",
			EntityType.Builder.<ColtRevolvingShotgun1855ProjectileEntity>of(ColtRevolvingShotgun1855ProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ColtRevolvingShotgun1855ProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SawnColtRevolvingShotgun1855ProjectileEntity>> SAWN_COLT_REVOLVING_SHOTGUN_1855_PROJECTILE = register("sawn_colt_revolving_shotgun_1855_projectile",
			EntityType.Builder.<SawnColtRevolvingShotgun1855ProjectileEntity>of(SawnColtRevolvingShotgun1855ProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SawnColtRevolvingShotgun1855ProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
