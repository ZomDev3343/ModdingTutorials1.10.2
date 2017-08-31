/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.items;

import fr.zomdev.moddingtutorials.ZomTutoMod;
import net.minecraft.item.Item;

public class ItemLFTTutoMod extends Item
{

	public ItemLFTTutoMod(String name)
	{
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(ZomTutoMod.modTab);
	}


}
