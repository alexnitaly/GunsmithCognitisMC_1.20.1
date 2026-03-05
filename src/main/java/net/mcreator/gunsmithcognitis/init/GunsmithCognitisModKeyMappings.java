
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gunsmithcognitis.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.gunsmithcognitis.network.AmmoReloadMessage;
import net.mcreator.gunsmithcognitis.GunsmithCognitisMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GunsmithCognitisModKeyMappings {
	public static final KeyMapping AMMO_RELOAD = new KeyMapping("key.gunsmith_cognitis.ammo_reload", GLFW.GLFW_KEY_R, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				GunsmithCognitisMod.PACKET_HANDLER.sendToServer(new AmmoReloadMessage(0, 0));
				AmmoReloadMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(AMMO_RELOAD);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				AMMO_RELOAD.consumeClick();
			}
		}
	}
}
