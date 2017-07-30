package fr.lft.moddingtutorials.proxy;

import fr.lft.moddingtutorials.init.ModBlocks;
import fr.lft.moddingtutorials.init.ModItems;

public class CommonProxy
{

	public void preInit()
	{
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}

	public void init()
	{

	}

	public void postInit()
	{

	}


}
