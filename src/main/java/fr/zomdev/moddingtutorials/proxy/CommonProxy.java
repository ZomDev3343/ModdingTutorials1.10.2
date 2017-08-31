/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.proxy;

import fr.zomdev.moddingtutorials.init.ModBlocks;
import fr.zomdev.moddingtutorials.init.ModEntities;
import fr.zomdev.moddingtutorials.init.ModItems;
import fr.zomdev.moddingtutorials.init.ModRecipes;
import fr.zomdev.moddingtutorials.utils.LFTTutoModUtils;

public class CommonProxy
{

	public void preInit()
	{
		ModItems.registerItems();
		ModBlocks.registerBlocks();

		ModRecipes.registerCraftingRecipes();

		LFTTutoModUtils.EnchantmentsUtils.registerEnchantments();

		ModEntities.registerEntities();

	}

	public void init()
	{

	}

	public void postInit()
	{

	}


}
