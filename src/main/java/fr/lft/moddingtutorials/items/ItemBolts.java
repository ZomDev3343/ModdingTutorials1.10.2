/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials.items;

import fr.lft.moddingtutorials.LFTTutoMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemBolts extends ItemLFTTutoMod
{
	public static final String[] subTypes = new String[]{"iron_", "steel_", "stone_", "golden_"};

	public ItemBolts(String name)
	{
		super(name);
		this.setHasSubtypes(true);
		this.setCreativeTab(LFTTutoMod.modTab);
	}

	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems)
	{
		for ( int i = 0; i < subTypes.length; i++ )
		{
			subItems.add(i, new ItemStack(itemIn, 1, i));
		}
	}

	@Override
	public int getMetadata(int damage)
	{

		if( damage < 0 || damage > subTypes.length )
		{
			return 0;
		}

		return damage;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return "item." + subTypes[getMetadata(stack.getItemDamage())] + super.getUnlocalizedName().substring(5);
	}
}
