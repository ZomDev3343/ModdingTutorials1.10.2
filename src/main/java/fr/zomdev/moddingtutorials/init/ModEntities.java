/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.init;

import fr.zomdev.moddingtutorials.ZomTutoMod;
import fr.zomdev.moddingtutorials.entity.EntityRobotPig;
import fr.zomdev.moddingtutorials.entity.render.RenderRobotPig;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities
{

	private static int mobID = 0;

	public static void registerEntities()
	{

		EntityRegistry.registerModEntity(new ResourceLocation(ZomTutoMod.MODID, "robotpig"), EntityRobotPig.class, "robot_pig", mobID++, ZomTutoMod.instance, 60, 1, true);

	}

	@SideOnly(Side.CLIENT)
	public static void registerEntitiesRenders()
	{

		RenderingRegistry.registerEntityRenderingHandler(EntityRobotPig.class, new RenderRobotPig(Minecraft.getMinecraft().getRenderManager()));

	}


}
