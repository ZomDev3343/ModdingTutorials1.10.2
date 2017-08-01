/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials.proxy;

import fr.lft.moddingtutorials.init.ModBlocks;
import fr.lft.moddingtutorials.init.ModItems;
import fr.lft.moddingtutorials.init.ModRecipes;
import fr.lft.moddingtutorials.utils.LFTTutoModUtils;

public class CommonProxy
{

	public void preInit()
	{
		ModItems.registerItems();
		ModBlocks.registerBlocks();

		ModRecipes.registerCraftingRecipes();

		LFTTutoModUtils.EnchantmentsUtils.registerEnchantments();
	}

	public void init()
	{

	}

	public void postInit()
	{

	}


}
