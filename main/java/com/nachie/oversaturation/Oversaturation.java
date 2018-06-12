package com.nachie.oversaturation;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Oversaturation.MODID, name = Oversaturation.NAME, version = Oversaturation.VERSION)
public class Oversaturation
{
    public static boolean APPLECORE;
    public static final String MODID = "oversaturation";
    public static final String NAME = "Oversaturation";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        if (Loader.isModLoaded("AppleCore")) {
            APPLECORE = true;
        }else{
            APPLECORE = false;
        }
    }
}
