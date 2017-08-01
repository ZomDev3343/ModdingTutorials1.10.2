/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials.ct;

import fr.lft.moddingtutorials.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabLFTTutoMod extends CreativeTabs
{
	public CreativeTabLFTTutoMod(String label)
	{
		super(label);
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.iron_gear);
	}
}
