/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials.blocks.te;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBlockClickCounter extends TileEntity
{
	private static int clicks;

	@Override
	public void readFromNBT(NBTTagCompound compound)
	{

		if( compound.hasKey("clicks") )
		{

			clicks = compound.getInteger("clicks");

		}

		super.readFromNBT(compound);
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{

		if( !compound.hasKey("clicks") )
		{
			compound.setInteger("clicks", 0);
		}

		return compound;

	}

	public void incrementClicks()
	{
		getTileData().setInteger("clicks", getTileData().getInteger("clicks") + 1);
	}

}
