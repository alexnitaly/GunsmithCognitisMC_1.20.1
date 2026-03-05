package net.mcreator.gunsmithcognitis;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.ChatFormatting;

import java.util.List;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class FirearmRarityHandler {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        
        TagKey<Item> UNCRAFTABLE = TagKey.create(Registries.ITEM, new ResourceLocation("gunsmith_cognitis", "uncraftable"));

        if (stack.is(UNCRAFTABLE)) {
            List<Component> tooltip = event.getToolTip();
            
            if (!tooltip.isEmpty()) {
                Component nameLine = tooltip.get(0);
                
                if (nameLine instanceof MutableComponent mutableName) {
                    mutableName.withStyle(ChatFormatting.YELLOW);
                }
            }
        }
    }
}
