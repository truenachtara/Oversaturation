package com.nachie.oversaturation;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Oversaturation.MODID, name = "Oversaturation", version = "1.1")
public class Oversaturation {

    public static final String MODID = "oversaturation";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        if (Loader.isModLoaded("applecore"))
            MinecraftForge.EVENT_BUS.register(new AppleCoreEventHandler());
        else
            MinecraftForge.EVENT_BUS.register(new VanillaEventHandler());
    }

}
