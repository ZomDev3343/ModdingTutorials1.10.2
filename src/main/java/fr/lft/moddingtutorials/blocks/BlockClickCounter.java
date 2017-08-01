/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials.blocks;

import fr.lft.moddingtutorials.blocks.te.TileEntityBlockClickCounter;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockClickCounter extends BlockLFTTutoMod implements ITileEntityProvider
{

	public BlockClickCounter(String name, Material materialIn, float hardness, float resistance)
	{
		super(name, materialIn, hardness, resistance);
	}

	@Override
	public boolean hasTileEntity(IBlockState state)
	{
		return true;
	}


	@Nullable
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityBlockClickCounter();
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if( !worldIn.isRemote )
		{

			if( worldIn.getTileEntity(pos) != null )
			{
				TileEntity te = worldIn.getTileEntity(pos);

				if( te instanceof TileEntityBlockClickCounter )
				{

					TileEntityBlockClickCounter tileEntityBlockClickCounter = (TileEntityBlockClickCounter) te;

					tileEntityBlockClickCounter.incrementClicks();
					playerIn.sendMessage(new TextComponentString("" + tileEntityBlockClickCounter.getTileData().getInteger("clicks")));

				}
			}
		}
		return true;
	}
}
