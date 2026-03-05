
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.gunsmithcognitis.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GunsmithCognitisModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8),

					new ItemStack(GunsmithCognitisModItems.IRONPIKE.get()), 10, 8, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8),

					new ItemStack(GunsmithCognitisModItems.IRONHALBERD.get()), 10, 8, 0.1f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(GunsmithCognitisModItems.DIAMONDPIKE.get()), 10, 15, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(GunsmithCognitisModItems.DIAMONDHALBERD.get()), 10, 15, 0.1f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24),

					new ItemStack(GunsmithCognitisModItems.CAVALRY_SABRE.get()), 10, 30, 0.15f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 14),

					new ItemStack(GunsmithCognitisModItems.CUIRASS_CHESTPLATE.get()), 10, 20, 0.15f));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4),

					new ItemStack(GunsmithCognitisModItems.ROCK.get(), 8), 20, 3, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 16),

					new ItemStack(GunsmithCognitisModItems.HANDGUNNE.get()), 8, 15, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24),

					new ItemStack(GunsmithCognitisModItems.HANDCANNON.get()), 8, 20, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 40),

					new ItemStack(GunsmithCognitisModItems.MATCHLOCK_HEAVY_ARQUEBUS.get()), 6, 35, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32),

					new ItemStack(GunsmithCognitisModItems.MATCHLOCK_SNAPHANCE_MUSKET.get()), 6, 35, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 40), new ItemStack(Items.CLOCK), new ItemStack(GunsmithCognitisModItems.WHEELLOCK_SPORTING_RIFLE.get()), 4, 50, 0.2f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(GunsmithCognitisModItems.HEAVY_MUSKETBALL.get(), 4), 16, 5, 0.05f));
		}
		if (event.getType() == GunsmithCognitisModVillagerProfessions.GUNSMITH_VILLAGER_NEW.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.GUNPOWDER, 12),

					new ItemStack(Items.EMERALD), 16, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.STRING),

					new ItemStack(Items.EMERALD), 16, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GunsmithCognitisModItems.CRUDE_SMOOTHBOREBARREL.get(), 7),

					new ItemStack(Items.EMERALD, 2), 12, 3, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GunsmithCognitisModItems.CRUDE_BIGBOREBARREL.get(), 4),

					new ItemStack(Items.EMERALD, 2), 10, 3, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(GunsmithCognitisModItems.MATCHLOCKGUNKIT.get()), 12, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(GunsmithCognitisModItems.MUSKETBALL.get(), 3), 16, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(GunsmithCognitisModItems.HEAVY_MUSKETBALL.get(), 4), 16, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4),

					new ItemStack(GunsmithCognitisModItems.HANDGUNNE.get()), 9, 10, 0.08f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(GunsmithCognitisModItems.HANDCANNON.get()), 9, 10, 0.08f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(GunsmithCognitisModItems.MATCHLOCK_PISTOL.get()), 10, 8, 0.08f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4),

					new ItemStack(GunsmithCognitisModItems.LANDSKNECHT_HARKEBUS.get()), 8, 10, 0.08f));
		}
		if (event.getType() == GunsmithCognitisModVillagerProfessions.GUNSMITH_VILLAGER_NEW.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(GunsmithCognitisModItems.SMOOTHBOREBARREL.get()),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(GunsmithCognitisModItems.BIGBOREBARREL.get()),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8),

					new ItemStack(GunsmithCognitisModItems.MATCHLOCK_SNAPHANCE_MUSKET.get()), 8, 15, 0.08f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7),

					new ItemStack(GunsmithCognitisModItems.MATCHLOCK_HEAVY_ARQUEBUS.get()), 8, 15, 0.08f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(GunsmithCognitisModItems.MATCHLOCK_ARQUEBUS.get()), 9, 10, 0.08f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(GunsmithCognitisModItems.MATCHLOCK_BLUNDERBUSS.get()), 9, 10, 0.08f));
		}
		if (event.getType() == GunsmithCognitisModVillagerProfessions.GUNSMITH_VILLAGER_NEW.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(GunsmithCognitisModItems.RIFLEDBARREL.get(), 2), 12, 6, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(GunsmithCognitisModItems.RIFLINGTOOL.get()), 8, 4, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6),

					new ItemStack(GunsmithCognitisModItems.WHEELLOCKGUNKIT.get()), 10, 8, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(GunsmithCognitisModItems.WHEELLOCK_PISTOL.get()), 12, 10, 0.08f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7),

					new ItemStack(GunsmithCognitisModItems.WHEELLOCK_CARBINE.get()), 10, 10, 0.08f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 11),

					new ItemStack(GunsmithCognitisModItems.WHEELLOCK_SPORTING_RIFLE.get()), 7, 15, 0.1f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(GunsmithCognitisModItems.PAPER_CARTIDGE_AMMO.get(), 5), 15, 4, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(GunsmithCognitisModItems.PAPER_CARTIDGE_SMALL_AMMO.get(), 7), 15, 4, 0.05f));
		}
		if (event.getType() == GunsmithCognitisModVillagerProfessions.GUNSMITH_VILLAGER_NEW.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7),

					new ItemStack(GunsmithCognitisModItems.FLINTLOCKGUNKIT.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8),

					new ItemStack(GunsmithCognitisModItems.FLINTLOCKMUSKET.get()), 12, 12, 0.08f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6),

					new ItemStack(GunsmithCognitisModItems.FLINTLOCK_PISTOL.get()), 12, 8, 0.08f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9),

					new ItemStack(GunsmithCognitisModItems.FLINTLOCK_RIFLED_CARBINE.get()), 10, 16, 0.08f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(GunsmithCognitisModItems.HAND_BOMB.get(), 2), 6, 8, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 21),

					new ItemStack(GunsmithCognitisModItems.WHEELLOCK_KALTHOFF_REPEATER.get()), 4, 25, 0.1f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9),

					new ItemStack(GunsmithCognitisModItems.FLINTLOCK_BLUNDERBUSS.get()), 8, 12, 0.08f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(GunsmithCognitisModItems.FLINTLOCK_MECHANISM.get(), 4),

					new ItemStack(Items.EMERALD, 5), 6, 6, 0.05f));
		}
		if (event.getType() == GunsmithCognitisModVillagerProfessions.GUNSMITH_VILLAGER_NEW.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(GunsmithCognitisModItems.FULMINATEPOWDER.get(), 12),

					new ItemStack(Items.EMERALD), 8, 4, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(GunsmithCognitisModItems.PERCUSSIONCAP_MECHANISM.get(), 4),

					new ItemStack(Items.EMERALD, 6), 8, 4, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(GunsmithCognitisModItems.PERCUSSIONCAPGUNKIT.get()), 8, 6, 0.08f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(GunsmithCognitisModItems.PERCUSSIONNIPPLE.get(), 8), 12, 3, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(GunsmithCognitisModItems.MUSKET_BALL_PROJECTILE.get(), 5), new ItemStack(GunsmithCognitisModItems.MINIE_BALL.get(), 5), 15, 4, 0.05f));
			event.getTrades().get(5)
					.add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(GunsmithCognitisModItems.PAPER_CARTIDGE_AMMO.get(), 5), new ItemStack(GunsmithCognitisModItems.MINIE_PAPER_CARTIDGE_AMMO.get(), 5), 10, 4, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(GunsmithCognitisModItems.PATTERN_1851MINIERIFLE.get()), 8, 10, 0.08f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 18),

					new ItemStack(GunsmithCognitisModItems.FUSIL_1866_CHASSEPOT.get()), 7, 20, 0.12f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9),

					new ItemStack(GunsmithCognitisModItems.LORENZ_PISTOL.get()), 10, 8, 0.08f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(GunsmithCognitisModItems.SPRINGFIELD_MODEL_1861_RIFLED_MUSKET.get()), 8, 15, 0.1f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 12),

					new ItemStack(GunsmithCognitisModItems.FLINTLOCK_PEPPERBOX.get()), 10, 15, 0.1f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(GunsmithCognitisModItems.FLINTLOCK_COLLIER_REVOLVER.get()), 6, 20, 0.1f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(GunsmithCognitisModItems.REVOLVER_DRUM.get(), 3),

					new ItemStack(Items.EMERALD), 8, 4, 0.05f));
		}
	}
}
