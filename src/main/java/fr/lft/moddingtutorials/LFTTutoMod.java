/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials;

import fr.lft.moddingtutorials.ct.CreativeTabLFTTutoMod;
import fr.lft.moddingtutorials.events.EventOnSteelOreBreak;
import fr.lft.moddingtutorials.proxy.CommonProxy;
import fr.lft.moddingtutorials.utils.LFTTutoModUtils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LFTTutoMod.MODID, name = LFTTutoMod.NAME, version = LFTTutoMod.VERSION, acceptedMinecraftVersions = "[1.11, 1.11.2]")
public class LFTTutoMod
{

	public static final String MODID = "lfttutomod";
	public static final String NAME = "LFT Tuto Mod";
	public static final String VERSION = "1.0";

	public static final String CLIENT_PROXY = "fr.lft.moddingtutorials.proxy.ClientProxy";
	public static final String SERVER_PROXY = "fr.lft.moddingtutorials.proxy.ServerProxy";
	public static final CreativeTabs modTab = new CreativeTabLFTTutoMod("lfttutomodTab");
	@Mod.Instance(MODID)
	public static LFTTutoMod instance;
	@SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		proxy.preInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e)
	{
		proxy.init();
		LFTTutoModUtils.GenUtils.registerWorldGenerations();
		MinecraftForge.EVENT_BUS.register(new EventOnSteelOreBreak());
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		proxy.postInit();
	}
}
