package com.nachie.oversaturation;

public class UncappedFoodStats extends net.minecraft.util.FoodStats {

    @Override
    public void addStats(int foodLevelIn, float foodSaturationModifier)
    {
        int extraSaturation = foodLevelIn - (20 - this.foodLevel);
        if (extraSaturation > 0){
            foodLevelIn = 20 - this.foodLevel;
            foodSaturationModifier += (float) extraSaturation;
        }
        this.foodLevel = foodLevelIn + this.foodLevel;
        this.foodSaturationLevel = this.foodSaturationLevel + (float)foodLevelIn * foodSaturationModifier * 2.0F;
    }

}
