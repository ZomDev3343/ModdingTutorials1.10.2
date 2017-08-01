package fr.lft.moddingtutorials.proxy;

import fr.lft.moddingtutorials.init.ModBlocks;
import fr.lft.moddingtutorials.init.ModItems;
import fr.lft.moddingtutorials.init.ModRecipes;

public class CommonProxy
{

	public void preInit()
	{
		ModItems.registerItems();
		ModBlocks.registerBlocks();

		ModRecipes.registerCraftingRecipes();
	}

	public void init()
	{

	}

	public void postInit()
	{

	}


}
