package net.mcreator.gunsmithcognitis;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.network.chat.Component;

public class PercussionFirearmReloadHandler {

//For anyone reading this, 1.20.1 fucked Minie rifles so hard i'm forced to make a code SPECIFICALLY to stop them from SHITTING THEMSELVES.
//If I ever make cartidge-based weaponry, i'm gonna use this as reference, i'm NEVER porting ANYTHING from version to version ever again.
//I now understand why modders never bother update mods to newer versions.

     public static void execute(Entity entity) {
        if (!(entity instanceof Player player)) return;
        if (player.level().isClientSide()) return; // Prevents ghost items because java sucks

        ItemStack gun = player.getMainHandItem();
        CompoundTag nbt = gun.getOrCreateTag();
        int stage = nbt.getInt("ReloadStage");

        // Stupid german rifle
        if (gun.is(ItemTags.create(new ResourceLocation("gunsmith_cognitis", "dreyse_rifles")))) {
            Item dreyseAmmo = getItem("paper_cartidge_ammo"); 
            
            if (stage == 0 && hasItem(player, dreyseAmmo, 1)) {
                consumeItem(player, dreyseAmmo, 1);
                
                // apply nbt tags
                nbt.putInt("ReloadStage", 2); 
                nbt.putInt("ammo", 1);
                nbt.putInt("cooldown", 50);
                nbt.putBoolean("percussioncap", true);

                playSound(player, "item.flintandsteel.use"); 
                player.displayClientMessage(Component.literal("Bolt closed. Ready to fire."), true);
            } else if (stage == 0) {
                player.displayClientMessage(Component.literal("You need a Paper Cartridge!"), true);
            }
            return;
        }

        // Stupid french rifle
        if (gun.is(ItemTags.create(new ResourceLocation("gunsmith_cognitis", "chassepot_rifles")))) {
            Item chassepotAmmo = getItem("minie_paper_cartidge_ammo"); 
            
            if (stage == 0 && hasItem(player, chassepotAmmo, 1)) {
                consumeItem(player, chassepotAmmo, 1);
                
                // apply nbt tags
                nbt.putInt("ReloadStage", 2); 
                nbt.putInt("ammo", 1);
                nbt.putInt("cooldown", 40);
                nbt.putBoolean("percussioncap", true);

                playSound(player, "item.flintandsteel.use"); 
                player.displayClientMessage(Component.literal("Bolt closed. Ready to fire."), true);
            } else if (stage == 0) {
                player.displayClientMessage(Component.literal("You need a Minie Paper Cartridge!"), true);
            }
            return;
        }

        // Minie muzzleloaders
        if (gun.is(ItemTags.create(new ResourceLocation("gunsmith_cognitis", "minie_muzzleloaders")))) {
            Item minieAmmo = getItem("minie_paper_cartidge_ammo");
            Item minieBall = getItem("minie_ball"); 
            Item gunpowder = Items.GUNPOWDER; 
            Item percussionCap = getItem("percussionnipple");
            Item ramrod = getItem("ramrod"); 

            // Stage 0: Insert Ammo and Ram it down
            if (stage == 0) {
                if (player.getOffhandItem().getItem() != ramrod) {
                    return;
                }

                boolean loaded = false;

                // Check 1: Paper Cartridge
                if (hasItem(player, minieAmmo, 1)) {
                    consumeItem(player, minieAmmo, 1);
                    loaded = true;
                } 
                // Check 2: Loose Powder and Ball
                else if (hasItem(player, gunpowder, 2) && hasItem(player, minieBall, 1)) {
                    consumeItem(player, gunpowder, 2);
                    consumeItem(player, minieBall, 1);
                    loaded = true;
                } 

                if (loaded) {
                    // apply tags
                    nbt.putInt("ReloadStage", 1);
                    nbt.putInt("ammo", 1);
                    nbt.putInt("gunpowder", 2);
                    nbt.putBoolean("ramrod loaded", true);
                    if (gun.is(ItemTags.create(new ResourceLocation("gunsmith_cognitis", "long_rifle")))) {
                		nbt.putInt("cooldown", 90);
                    } else {
                		nbt.putInt("cooldown", 75);
                    }
                    
                    playSound(player, "block.metal.place"); 
            }
            
            // Stage 1: Place Percussion Cap
            else if (stage == 1) {
                if (hasItem(player, percussionCap, 1)) {
                    consumeItem(player, percussionCap, 1);
                    
                    // apply tags
                    nbt.putInt("ReloadStage", 2); 
                    nbt.putBoolean("percussioncap", true);

                    playSound(player, "block.metal.place"); 
                }
            return;
        }
    }
        }
     }
     //look I know it looks awful but i'm tired man.
     //I've been coding with the help of that fuck-ass GoogleAIstudio for the last 8 hours I just want to wrap this up.


    // Methods that prevents the code from DYING.
    private static Item getItem(String registryName) {
        return ForgeRegistries.ITEMS.getValue(new ResourceLocation("gunsmith_cognitis", registryName));
    }

    private static boolean hasItem(Player player, Item item, int amountNeeded) {
        int count = 0;
        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            ItemStack stack = player.getInventory().getItem(i);
            if (stack.getItem() == item) {
                count += stack.getCount();
            }
        }
        return count >= amountNeeded;
    }

    private static void consumeItem(Player player, Item itemToConsume, int amountNeeded) {
        int amountLeft = amountNeeded;
        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            if (amountLeft <= 0) break;
            ItemStack slotStack = player.getInventory().getItem(i);
            if (slotStack.getItem() == itemToConsume) {
                int shrinkAmount = Math.min(amountLeft, slotStack.getCount());
                slotStack.shrink(shrinkAmount);
                amountLeft -= shrinkAmount;
            }
        }
    }

    private static void playSound(Player player, String soundName) {
        player.level().playSound(null, player.getX(), player.getY(), player.getZ(), 
            ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(soundName)), 
            SoundSource.PLAYERS, 1.0F, 1.0F);
    }
}