/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials.utils;

import fr.lft.moddingtutorials.gen.OreGeneration;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GenUtils
{

	private static OreGeneration oreGeneration = new OreGeneration();

	public static final void registerWorldGenerations()
	{

		GameRegistry.registerWorldGenerator(oreGeneration, 0);

	}

}
