/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.gen;

import fr.zomdev.moddingtutorials.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGeneration implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{

		switch ( world.provider.getDimensionType() )
		{

			case NETHER:
				generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;


			case OVERWORLD:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;


			case THE_END:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
				break;
		}

	}

	private void generateEnd(World world, Random random, int x, int z)
	{

	}

	private void generateSurface(World world, Random random, int x, int z)
	{
		this.generateOre(ModBlocks.steel_ore.getDefaultState(), Blocks.STONE.getDefaultState(), world, random, x, z, 16, 16, 5, 53, 23, 44);
	}

	private void generateNether(World world, Random random, int x, int z)
	{

	}


	// Merci à agabou sur Minecraft Forge France pour cette méthode :D
	public void generateOre(IBlockState oreState, IBlockState targetState, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{

		assert maxY > minY : "La position Y maximum doit être supérieure à la position Y minimum.";
		assert maxX > 0 && maxX <= 16 : "X doit se trouver entre 0 et 16.";
		assert minY > 0 : "La position Y minimum doit être supérieure à 0.";
		assert maxY < 256 && maxY > 0 : "La position Y maximum doit se trouver entre 0 et 256.";
		assert maxZ > 0 && maxZ <= 16 : "Z doit se trouver entre 0 et 16.";

		for ( int i = 0; i < chancesToSpawn; i++ )
		{

			int posY = random.nextInt(128);

			if( (posY <= maxY) && (posY >= minY) )
			{

				new WorldGenMinable(oreState, maxVeinSize, BlockMatcher.forBlock(targetState.getBlock())).generate(world, random, new BlockPos(blockXPos + random.nextInt(16), posY, blockZPos + random.nextInt(16)));

			}

		}

	}
}
