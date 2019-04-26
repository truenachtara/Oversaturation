package com.nachie.oversaturation;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.FoodStats;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class VanillaEventHandler {

    @SubscribeEvent
    public static void onEntityJoinWorld(EntityJoinWorldEvent event) {
        if (event.getEntity() instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) event.getEntity();
            FoodStats oldStats = player.getFoodStats();
            if (!(oldStats instanceof UncappedFoodStats)) {
                UncappedFoodStats newStats = new UncappedFoodStats();
                NBTTagCompound foodnbt = new NBTTagCompound();
                oldStats.writeNBT(foodnbt);
                newStats.readNBT(foodnbt);
                player.foodStats = newStats;
            }
        }
    }

}
