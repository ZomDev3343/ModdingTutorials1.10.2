/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.entity.render;

import fr.zomdev.moddingtutorials.ZomTutoMod;
import fr.zomdev.moddingtutorials.entity.EntityRobotPig;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderRobotPig extends RenderLiving<EntityRobotPig>
{

	private static final ResourceLocation texture = new ResourceLocation(ZomTutoMod.MODID, "textures/entity/robotpig/texture.png");

	public RenderRobotPig(RenderManager rendermanagerIn)
	{
		super(rendermanagerIn, new ModelPig(), 0.7f);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityRobotPig entity)
	{
		return getEntityTextureLocation();
	}

	private ResourceLocation getEntityTextureLocation()
	{
		return texture;
	}

}
