/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.entity;

import fr.zomdev.moddingtutorials.ZomTutoMod;
import fr.zomdev.moddingtutorials.init.ModItems;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityRobotPig extends EntityAnimal
{

	public EntityRobotPig(World worldIn)
	{
		super(worldIn);

		this.setSize(0.9F, 0.9F);
		this.tasks.addTask(0, new EntityAILookIdle(this));
		this.tasks.addTask(1, new EntityAITempt(this, 0.70021546D, ModItems.iron_gear, false));
	}


	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();

		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.66595D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(5);

	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable()
	{
		return new ResourceLocation(ZomTutoMod.MODID, "pig/robot");
	}

	@Nullable
	@Override
	public EntityAgeable createChild(EntityAgeable ageable)
	{
		return this;
	}
}
