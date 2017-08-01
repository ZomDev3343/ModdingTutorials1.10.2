/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials.items;

import com.google.common.collect.Sets;
import fr.lft.moddingtutorials.LFTTutoMod;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import javax.annotation.Nullable;
import java.util.Set;

public class ItemMechanicalMultiTool extends ItemTool
{

	private static Set<Block> effectives = Sets.newHashSet(Blocks.IRON_BLOCK, Blocks.DIRT, Blocks.PLANKS);

	public ItemMechanicalMultiTool(String name, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn)
	{
		super(attackDamageIn, attackSpeedIn, materialIn, effectives);

		this.setRegistryName(name);
		this.setUnlocalizedName(name);

		this.setCreativeTab(LFTTutoMod.modTab);
	}

	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state)
	{
		return effectives.contains(state.getBlock()) ? this.toolMaterial.getEfficiencyOnProperMaterial() : 0;

	}

	@Override
	public boolean canHarvestBlock(IBlockState blockIn)
	{
		return effectives.contains(blockIn.getBlock());
	}

	@Override
	public int getHarvestLevel(ItemStack stack, String toolClass, @Nullable EntityPlayer player, @Nullable IBlockState blockState)
	{
		return effectives.contains(blockState.getBlock()) ? 2 : 0;
	}


}
