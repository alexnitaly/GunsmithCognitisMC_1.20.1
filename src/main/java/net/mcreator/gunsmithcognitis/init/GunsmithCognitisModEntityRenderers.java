
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunsmithcognitis.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GunsmithCognitisModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GunsmithCognitisModEntities.MATCHLOCK_ARQUEBUS_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.HANDGUNNE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.THREEEYEGUN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.MATCHLOCK_BLUNDERBUSS_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCKMUSKET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCKMUSKETBAYONET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCKMUSKETGOLD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_PISTOL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_PISTOL_GOLD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.WHEELLOCK_PISTOL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.WHEELLOCK_MUSKET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_DOUBLE_BARREL_MUSKET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_PEPPERBOX_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.TANEGASHIMA_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.MATCHLOCK_SNAPHANCE_MUSKET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.JEZAILMUSKET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.MATCHLOCK_AXE_PISTOL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.MATCHLOCK_WALL_GUN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.WHEELLOCK_CARBINE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.WHEELLOCK_SPORTING_RIFLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_RIFLED_CARBINE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_ASUMETTE_RIFLED_WALL_GUN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_DOUBLE_BARREL_PISTOL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_LORENZONI_REPEATER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_PEPPERBOX_CARBINE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.WHEELLOCK_KALTHOFF_REPEATER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.DIVINE_FIVE_THUNDER_MACHINE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_HEAVY_DRAGOON_PISTOL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.NOCK_VOLLEY_GUN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FERGUSON_RIFLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_HAND_MORTAR_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.ROCK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_COLLIER_REVOLVER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_COLLIER_REVOLVING_CARBINE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.DYNAMITE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.DYNAMITE_PACK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.PATTERN_1851MINIERIFLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.LORENZ_PISTOL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.KENTUCKY_PISTOL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.BROWNING_HARMONICA_RIFLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.HANDCANNON_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.MIQUOLET_MUSKET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.WHEELLOCK_PETRONEL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FLINTLOCK_BLUNDERBUSS_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.MATCHLOCK_HEAVY_ARQUEBUS_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.LANDSKNECHT_HARKEBUS_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.MATCHLOCK_PISTOL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.DREYSE_NEEDLE_GUN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.DOUBLE_BARREL_SHOTGUN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.PATTERN_1851_MINIE_RIFLE_BAYONET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.SAWN_OFF_DOUBLE_BARREL_SHOTGUN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.COLT_PETERSON_1836_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.COLT_DRAGOON_1848_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.COLT_WALKER_1847_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.COLT_REVOLVING_RIFLE_1855_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.COLT_ARMY_1860_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.SPRINGFIELD_MODEL_1861_RIFLED_MUSKET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.SPRINGFIELD_MODEL_1861_RIFLED_MUSKET_BAYONET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FUSIL_1866_CHASSEPOT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.FUSIL_1866_CHASSEPOT_BAYONET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.JOSEPH_EGG_PISTOL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.BIG_GAME_4_BORE_PERCUSSION_RIFLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.HAND_BOMB_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.ADAMS_1856_REVOLVER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.ENFIELD_1853_MUSKET_RIFLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.SAWN_OFF_COLT_REVOLVER_1855_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.PORTER_TURRET_RIFLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.COLT_REVOLVING_SHOTGUN_1855_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GunsmithCognitisModEntities.SAWN_COLT_REVOLVING_SHOTGUN_1855_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
