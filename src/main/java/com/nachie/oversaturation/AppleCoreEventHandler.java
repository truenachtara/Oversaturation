package com.nachie.oversaturation;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import squeek.applecore.api.AppleCoreAPI;
import squeek.applecore.api.food.FoodEvent;

/**
 * Created on 4/26/2019.
 */
@Mod.EventBusSubscriber(modid = Reference.MODID)
public class AppleCoreEventHandler {

    @SubscribeEvent
    public void onFoodStatsAddition(FoodEvent.FoodStatsAddition event) {
        event.setCanceled(true);
        int playerFoodLevel = event.player.getFoodStats().getFoodLevel();
        int foodLevelIn = event.foodValuesToBeAdded.hunger;
        float playerSaturationLevel = event.player.getFoodStats().getSaturationLevel();
        float foodSaturationModifier = event.foodValuesToBeAdded.saturationModifier;
        int extraSaturation = foodLevelIn - (20 - playerFoodLevel);
        if (extraSaturation > 0){
            foodLevelIn = 20 - playerFoodLevel;
            foodSaturationModifier += (float) extraSaturation;
        }
        event.player.getFoodStats().setFoodLevel(foodLevelIn + playerFoodLevel);
        AppleCoreAPI.mutator.setSaturation(event.player, playerSaturationLevel + (float)foodLevelIn * foodSaturationModifier * 2.0F);
    }

}
