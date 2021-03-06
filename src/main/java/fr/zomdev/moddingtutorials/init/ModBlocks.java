/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.init;

import fr.zomdev.moddingtutorials.ZomTutoMod;
import fr.zomdev.moddingtutorials.blocks.BlockClickCounter;
import fr.zomdev.moddingtutorials.blocks.BlockLFTTutoMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{

	public static final Block steel_block = new BlockLFTTutoMod("steel_block", Material.IRON, 5f, 20f);

	public static final Block steel_ore = new BlockLFTTutoMod("steel_ore", Material.ROCK, 5f, 20f);

	public static final Block click_counter_block = new BlockClickCounter("block_click_counter", Material.ROCK, 5f, 20f);

	private static void initBlocks()
	{

		steel_block.setHarvestLevel("pickaxe", 2);

	}

	public static void registerBlocks()
	{

		initBlocks();

		registerBlock(steel_block);

		registerBlock(steel_ore);

		registerBlock(click_counter_block);

	}

	public static void registerBlockRenders()
	{
		registerBlockRender(steel_block);

		registerBlockRender(steel_ore);

		registerBlockRender(click_counter_block);
	}

	private static void registerBlock(Block block)
	{
		GameRegistry.register(block);
	}

	private static void registerBlockRender(Block block)
	{
		ItemBlock ib = new ItemBlock(block);
		ib.setRegistryName(block.getRegistryName());
		GameRegistry.register(ib);

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(ZomTutoMod.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
}
