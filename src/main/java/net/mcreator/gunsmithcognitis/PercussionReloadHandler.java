package net.mcreator.gunsmithcognitis;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class PercussionReloadHandler {

    public static void execute(Entity entity) {
        if (!(entity instanceof Player player)) return;

        ItemStack gun = player.getMainHandItem();

        if (!gun.is(ItemTags.create(new ResourceLocation("gunsmith_cognitis", "precussioncap_firearm")))) {
            return; // Not a percussion cap firearm, fuck off.
        }

        Item nippleItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation("gunsmith_cognitis", "percussionnipple"));
        if (nippleItem == null) return;

        int availableNipples = 0;
        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            ItemStack slotStack = player.getInventory().getItem(i);
            if (slotStack.getItem() == nippleItem) {
                availableNipples += slotStack.getCount();
            }
        }

        if (availableNipples == 0) {
            return; 
        }

        CompoundTag nbt = gun.getOrCreateTag();

        if (gun.is(ItemTags.create(new ResourceLocation("gunsmith_cognitis", "percussioncap_single_shot")))) {
            if (nbt.getBoolean("percussion cap")) {
                return; 
            }

            consumeItems(player, nippleItem, 1);
            nbt.putBoolean("percussion cap", true);
        }
        
        else if (gun.is(ItemTags.create(new ResourceLocation("gunsmith_cognitis", "percussioncap_multi_shot")))) {
            int currentCaps = nbt.getInt("percussioncaps");
            int maxCaps = nbt.contains("ammo") ? nbt.getInt("ammo") : 6; 

            int spaceLeft = maxCaps - currentCaps;

            if (spaceLeft <= 0) {
                return; 
            }

            int amountToLoad = Math.min(spaceLeft, availableNipples);

            if (amountToLoad > 0) {
                consumeItems(player, nippleItem, amountToLoad);
                nbt.putInt("percussioncaps", currentCaps + amountToLoad);
            }
        }
    }

    // This loops through the inventory and removes the exact amount needed,
    // completely ignoring any hidden NBT tags on the items.
    // though a question remains to me in all this.
    // WHY DID I HAVE TO DO THIS TO FIX THE FUCKING PERCUSSION CAPS.
    // WHY.
    // WHY DID HAS-IN-INVENTORY BLOCK HAD TO BREAK.
    // I HATE YOU MCREATOR.
    private static void consumeItems(Player player, Item itemToConsume, int amountNeeded) {
        int amountLeft = amountNeeded;
        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            if (amountLeft <= 0) break; // Stop searching once we've consumed enough
            
            ItemStack slotStack = player.getInventory().getItem(i);
            if (slotStack.getItem() == itemToConsume) {
                int shrinkAmount = Math.min(amountLeft, slotStack.getCount());
                slotStack.shrink(shrinkAmount);
                amountLeft -= shrinkAmount;
            }
        }
    }
}