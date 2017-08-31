/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.blocks;

import fr.zomdev.moddingtutorials.ZomTutoMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLFTTutoMod extends Block
{
	public BlockLFTTutoMod(String name, Material materialIn, float hardness, float resistance)
	{
		super(materialIn);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);

		this.setHardness(hardness);
		this.setResistance(resistance);

		this.setCreativeTab(ZomTutoMod.modTab);
	}
}
