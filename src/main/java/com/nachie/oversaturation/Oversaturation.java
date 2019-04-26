package com.nachie.oversaturation;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = "Oversaturation", version = Reference.VERSION)
public class Oversaturation {

    private static boolean appleCoreInstalled = false;

    public static boolean isAppleCoreInstalled() {
        return appleCoreInstalled;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        appleCoreInstalled = Loader.isModLoaded("applecore");
    }

}
