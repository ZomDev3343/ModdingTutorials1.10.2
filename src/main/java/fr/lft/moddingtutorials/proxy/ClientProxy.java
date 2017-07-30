package fr.lft.moddingtutorials.proxy;

import fr.lft.moddingtutorials.init.ModItems;

public class ClientProxy extends CommonProxy
{

	@Override
	public void preInit()
	{
		super.preInit();

		ModItems.registerItemRenders();
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


	}


}
