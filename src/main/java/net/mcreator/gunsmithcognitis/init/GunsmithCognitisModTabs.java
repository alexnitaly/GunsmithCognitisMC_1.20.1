
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunsmithcognitis.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.gunsmithcognitis.GunsmithCognitisMod;

public class GunsmithCognitisModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GunsmithCognitisMod.MODID);
	public static final RegistryObject<CreativeModeTab> GUNSMITH_COGNITIS_WHEELLOCK_TAB = REGISTRY.register("gunsmith_cognitis_wheellock_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.gunsmith_cognitis.gunsmith_cognitis_wheellock_tab")).icon(() -> new ItemStack(GunsmithCognitisModItems.WHEELLOCK_PISTOL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GunsmithCognitisModItems.WHEELLOCK_PISTOL.get());
				tabData.accept(GunsmithCognitisModItems.WHEELLOCK_MUSKET.get());
				tabData.accept(GunsmithCognitisModItems.WHEELLOCK_CARBINE.get());
				tabData.accept(GunsmithCognitisModItems.WHEELLOCK_SPORTING_RIFLE.get());
				tabData.accept(GunsmithCognitisModItems.WHEELLOCK_KALTHOFF_REPEATER.get());
				tabData.accept(GunsmithCognitisModItems.WHEELLOCK_PETRONEL.get());
			})

			.build());
	public static final RegistryObject<CreativeModeTab> GUNSMITH_COGNITIS_PERCUSSIONCAP_TAB = REGISTRY.register("gunsmith_cognitis_percussioncap_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.gunsmith_cognitis.gunsmith_cognitis_percussioncap_tab")).icon(() -> new ItemStack(GunsmithCognitisModItems.FUSIL_1866_CHASSEPOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GunsmithCognitisModItems.BROWNING_HARMONICA_CLIP.get());
				tabData.accept(GunsmithCognitisModItems.DYNAMITE.get());
				tabData.accept(GunsmithCognitisModItems.DYNAMITE_PACK.get());
				tabData.accept(GunsmithCognitisModItems.PATTERN_1851MINIERIFLE.get());
				tabData.accept(GunsmithCognitisModItems.LORENZ_PISTOL.get());
				tabData.accept(GunsmithCognitisModItems.KENTUCKY_PISTOL.get());
				tabData.accept(GunsmithCognitisModItems.BROWNING_HARMONICA_RIFLE.get());
				tabData.accept(GunsmithCognitisModItems.DREYSE_NEEDLE_GUN.get());
				tabData.accept(GunsmithCognitisModItems.DOUBLE_BARREL_SHOTGUN.get());
				tabData.accept(GunsmithCognitisModItems.PATTERN_1851_MINIE_RIFLE_BAYONET.get());
				tabData.accept(GunsmithCognitisModItems.SAWN_OFF_DOUBLE_BARREL_SHOTGUN.get());
				tabData.accept(GunsmithCognitisModItems.COLT_PETERSON_1836.get());
				tabData.accept(GunsmithCognitisModItems.COLT_DRAGOON_1848.get());
				tabData.accept(GunsmithCognitisModItems.COLT_WALKER_1847.get());
				tabData.accept(GunsmithCognitisModItems.COLT_REVOLVING_RIFLE_1855.get());
				tabData.accept(GunsmithCognitisModItems.COLT_ARMY_1860.get());
				tabData.accept(GunsmithCognitisModItems.SPRINGFIELD_MODEL_1861_RIFLED_MUSKET.get());
				tabData.accept(GunsmithCognitisModItems.SPRINGFIELD_MODEL_1861_RIFLED_MUSKET_BAYONET.get());
				tabData.accept(GunsmithCognitisModItems.FUSIL_1866_CHASSEPOT.get());
				tabData.accept(GunsmithCognitisModItems.FUSIL_1866_CHASSEPOT_BAYONET.get());
				tabData.accept(GunsmithCognitisModItems.JOSEPH_EGG_PISTOL.get());
				tabData.accept(GunsmithCognitisModItems.BIG_GAME_4_BORE_PERCUSSION_RIFLE.get());
				tabData.accept(GunsmithCognitisModItems.ADAMS_1856_REVOLVER.get());
				tabData.accept(GunsmithCognitisModItems.ENFIELD_1853_MUSKET_RIFLE.get());
				tabData.accept(GunsmithCognitisModItems.SAWN_OFF_COLT_REVOLVER_1855.get());
				tabData.accept(GunsmithCognitisModItems.PORTER_TURRET_RIFLE.get());
				tabData.accept(GunsmithCognitisModItems.COLT_REVOLVING_SHOTGUN_1855.get());
				tabData.accept(GunsmithCognitisModItems.SAWN_COLT_REVOLVING_SHOTGUN_1855.get());
			})

			.build());
	public static final RegistryObject<CreativeModeTab> GUNSMITH_COGNITIS_FLINTLOCK_TAB = REGISTRY.register("gunsmith_cognitis_flintlock_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.gunsmith_cognitis.gunsmith_cognitis_flintlock_tab")).icon(() -> new ItemStack(GunsmithCognitisModItems.FLINTLOCKMUSKET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GunsmithCognitisModItems.FLINTLOCKMUSKET.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCKMUSKETBAYONET.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCKMUSKETGOLD.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_PISTOL.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_PISTOL_GOLD.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_DOUBLE_BARREL_MUSKET.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_PEPPERBOX.get());
				tabData.accept(GunsmithCognitisModItems.JEZAILMUSKET.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_RIFLED_CARBINE.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_ASUMETTE_RIFLED_WALL_GUN.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_DOUBLE_BARREL_PISTOL.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_LORENZONI_REPEATER.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_PEPPERBOX_CARBINE.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_HEAVY_DRAGOON_PISTOL.get());
				tabData.accept(GunsmithCognitisModItems.NOCK_VOLLEY_GUN.get());
				tabData.accept(GunsmithCognitisModItems.FERGUSON_RIFLE.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_HAND_MORTAR.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_COLLIER_REVOLVER.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_COLLIER_REVOLVING_CARBINE.get());
				tabData.accept(GunsmithCognitisModItems.MIQUOLET_MUSKET.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_BLUNDERBUSS.get());
			})

			.build());
	public static final RegistryObject<CreativeModeTab> GUNSMITH_COGNITIS_MELEE = REGISTRY.register("gunsmith_cognitis_melee",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gunsmith_cognitis.gunsmith_cognitis_melee")).icon(() -> new ItemStack(GunsmithCognitisModItems.CAVALRY_SABRE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GunsmithCognitisModItems.CAVALRY_SABRE.get());
				tabData.accept(GunsmithCognitisModItems.STONEPIKE.get());
				tabData.accept(GunsmithCognitisModItems.IRONPIKE.get());
				tabData.accept(GunsmithCognitisModItems.GOLDPIKE.get());
				tabData.accept(GunsmithCognitisModItems.DIAMONDPIKE.get());
				tabData.accept(GunsmithCognitisModItems.NETHERITEPIKE.get());
				tabData.accept(GunsmithCognitisModItems.STONEHALBERD.get());
				tabData.accept(GunsmithCognitisModItems.IRONHALBERD.get());
				tabData.accept(GunsmithCognitisModItems.GOLDHALBERD.get());
				tabData.accept(GunsmithCognitisModItems.DIAMONDHALBERD.get());
				tabData.accept(GunsmithCognitisModItems.NETHERITEHALBERD.get());
				tabData.accept(GunsmithCognitisModItems.CHASSEPOT_BAYONET.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> GUNSMITH_COGNITIS_MISC_TAB = REGISTRY.register("gunsmith_cognitis_misc_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gunsmith_cognitis.gunsmith_cognitis_misc_tab")).icon(() -> new ItemStack(GunsmithCognitisModItems.FULMINATEPOWDER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GunsmithCognitisModItems.FULMINATEPOWDER.get());
				tabData.accept(GunsmithCognitisModItems.MUSKETBALL.get());
				tabData.accept(GunsmithCognitisModItems.PAPER_CARTIDGE_SMALL_AMMO.get());
				tabData.accept(GunsmithCognitisModItems.MINIE_BALL.get());
				tabData.accept(GunsmithCognitisModItems.PAPER_CARTIDGE_AMMO.get());
				tabData.accept(GunsmithCognitisModItems.MORTARBALL.get());
				tabData.accept(GunsmithCognitisModItems.RAMROD.get());
				tabData.accept(GunsmithCognitisModItems.PERCUSSIONNIPPLE.get());
				tabData.accept(GunsmithCognitisModItems.MINIE_PAPER_CARTIDGE_AMMO.get());
				tabData.accept(GunsmithCognitisModItems.REVOLVER_DRUM.get());
				tabData.accept(GunsmithCognitisModItems.SHOTGUN_SHELL.get());
				tabData.accept(GunsmithCognitisModItems.CRUDE_SMOOTHBOREBARREL.get());
				tabData.accept(GunsmithCognitisModItems.NOCK_VOLLEY_GUN_FRONT_COMPONENT.get());
				tabData.accept(GunsmithCognitisModItems.MATCHLOCKGUNKIT.get());
				tabData.accept(GunsmithCognitisModItems.SMOOTHBOREBARREL.get());
				tabData.accept(GunsmithCognitisModItems.WHEELLOCKGUNKIT.get());
				tabData.accept(GunsmithCognitisModItems.CRUDE_BIGBOREBARREL.get());
				tabData.accept(GunsmithCognitisModItems.BIGBOREBARREL.get());
				tabData.accept(GunsmithCognitisModItems.RIFLEDBARREL.get());
				tabData.accept(GunsmithCognitisModItems.PERCUSSIONCAPGUNKIT.get());
				tabData.accept(GunsmithCognitisModItems.RIFLINGTOOL.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_MECHANISM.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCKGUNKIT.get());
				tabData.accept(GunsmithCognitisModItems.PERCUSSIONCAP_MECHANISM.get());
				tabData.accept(GunsmithCognitisModItems.CUIRASS_CHESTPLATE.get());
				tabData.accept(GunsmithCognitisModItems.HEAVY_MUSKETBALL.get());
				tabData.accept(GunsmithCognitisModItems.DOUBLE_BARRELS_PART.get());
				tabData.accept(GunsmithCognitisModItems.BOLT_MECHANISM.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> GUNSMITH_COGNITIS_RESEARCH_TAB = REGISTRY.register("gunsmith_cognitis_research_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gunsmith_cognitis.gunsmith_cognitis_research_tab")).icon(() -> new ItemStack(Items.PAPER)).displayItems((parameters, tabData) -> {
				tabData.accept(GunsmithCognitisModItems.PERCUSSIONCAP_BLUEPRINT.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_BLUEPRINT.get());
				tabData.accept(GunsmithCognitisModItems.ADVANCED_REVOLVERS_BLUEPRINT.get());
				tabData.accept(GunsmithCognitisModBlocks.RESEARCH_TABLE.get().asItem());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_BLUEPRINT_INTERMEDIATE.get());
				tabData.accept(GunsmithCognitisModItems.FLINTLOCK_BLUEPRINT_MASTERY.get());
				tabData.accept(GunsmithCognitisModItems.PERCUSSIONCAP_BLUEPRINT_INTERMEDIATE.get());
				tabData.accept(GunsmithCognitisModItems.PERCUSSIONCAP_BLUEPRINT_MASTERY.get());
				tabData.accept(GunsmithCognitisModItems.MATCHLOCK_BLUEPRINT.get());
				tabData.accept(GunsmithCognitisModItems.MATCHLOCK_BLUEPRINT_INTERMEDIATE.get());
				tabData.accept(GunsmithCognitisModItems.MATCHLOCK_BLUEPRINT_MASTERY.get());
				tabData.accept(GunsmithCognitisModItems.WHEELLOCK_BLUEPRINT.get());
				tabData.accept(GunsmithCognitisModItems.WHEELLOCK_BLUEPRINT_INTERMEDIATE.get());
				tabData.accept(GunsmithCognitisModItems.WHEELLOCK_BLUEPRINT_MASTERY.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> GUNSMITH_COGNITIS_TAB = REGISTRY.register("gunsmith_cognitis_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gunsmith_cognitis.gunsmith_cognitis_tab")).icon(() -> new ItemStack(GunsmithCognitisModItems.MATCHLOCK_ARQUEBUS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GunsmithCognitisModItems.MATCHLOCK_ARQUEBUS.get());
				tabData.accept(GunsmithCognitisModItems.HANDGUNNE.get());
				tabData.accept(GunsmithCognitisModItems.THREEEYEGUN.get());
				tabData.accept(GunsmithCognitisModItems.MATCHLOCK_BLUNDERBUSS.get());
				tabData.accept(GunsmithCognitisModItems.TANEGASHIMA.get());
				tabData.accept(GunsmithCognitisModItems.MATCHLOCK_SNAPHANCE_MUSKET.get());
				tabData.accept(GunsmithCognitisModItems.MATCHLOCK_AXE_PISTOL.get());
				tabData.accept(GunsmithCognitisModItems.MATCHLOCK_WALL_GUN.get());
				tabData.accept(GunsmithCognitisModItems.DIVINE_FIVE_THUNDER_MACHINE.get());
				tabData.accept(GunsmithCognitisModItems.HANDCANNON.get());
				tabData.accept(GunsmithCognitisModItems.MATCHLOCK_HEAVY_ARQUEBUS.get());
				tabData.accept(GunsmithCognitisModItems.LANDSKNECHT_HARKEBUS.get());
				tabData.accept(GunsmithCognitisModItems.MATCHLOCK_PISTOL.get());
				tabData.accept(GunsmithCognitisModItems.HAND_BOMB.get());
			})

					.build());
}
