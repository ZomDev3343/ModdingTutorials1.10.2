/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials.items;

import fr.lft.moddingtutorials.LFTTutoMod;
import net.minecraft.item.Item;

public class ItemLFTTutoMod extends Item
{

	public ItemLFTTutoMod(String name)
	{
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(LFTTutoMod.modTab);
	}


}
