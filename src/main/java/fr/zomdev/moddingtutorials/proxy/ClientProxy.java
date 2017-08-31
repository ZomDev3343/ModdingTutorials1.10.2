/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.proxy;

import fr.zomdev.moddingtutorials.init.ModBlocks;
import fr.zomdev.moddingtutorials.init.ModEntities;
import fr.zomdev.moddingtutorials.init.ModItems;

public class ClientProxy extends CommonProxy
{

	@Override
	public void preInit()
	{
		super.preInit();

		ModItems.registerItemRenders();
		ModBlocks.registerBlockRenders();
	}

	@Override
	public void init()
	{
		super.init();


	}

	@Override
	public void postInit()
	{
		super.postInit();

		ModEntities.registerEntitiesRenders();

	}


}
