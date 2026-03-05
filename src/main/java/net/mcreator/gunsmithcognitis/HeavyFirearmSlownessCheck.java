package net.mcreator.gunsmithcognitis;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.tags.TagKey;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;

@Mod.EventBusSubscriber
public class HeavyFirearmSlownessCheck  {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            Player player = event.player;
            
            TagKey<Item> HEAVY = TagKey.create(Registries.ITEM, new ResourceLocation("gunsmith_cognitis", "heavyfirearm"));
            TagKey<Item> DEFENSIVE = TagKey.create(Registries.ITEM, new ResourceLocation("gunsmith_cognitis", "is_protective"));

            // Check both Main Hand and Offhand
            ItemStack mainHand = player.getMainHandItem();
            ItemStack offHand = player.getOffhandItem();

            if (mainHand.is(HEAVY) || offHand.is(HEAVY)) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, false, false, true));
            }
            if (mainHand.is(DEFENSIVE) || offHand.is(DEFENSIVE)) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 0, false, false, true));
            }
            
        }
    }
}
