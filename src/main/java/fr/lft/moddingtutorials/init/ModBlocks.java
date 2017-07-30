package fr.lft.moddingtutorials.init;

import fr.lft.moddingtutorials.LFTTutoMod;
import fr.lft.moddingtutorials.blocks.BlockLFTTutoMod;
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

	private static void initBlocks()
	{

	}

	public static void registerBlocks()
	{

		initBlocks();

		registerBlock(steel_block);

	}

	public static void registerBlockRenders()
	{
		registerBlockRender(steel_block);
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

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(LFTTutoMod.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
}
