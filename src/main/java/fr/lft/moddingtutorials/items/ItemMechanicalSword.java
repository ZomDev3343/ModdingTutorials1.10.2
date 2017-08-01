package fr.lft.moddingtutorials.items;

import fr.lft.moddingtutorials.LFTTutoMod;
import net.minecraft.item.ItemSword;

public class ItemMechanicalSword extends ItemSword
{
	public ItemMechanicalSword(String name, ToolMaterial material)
	{
		super(material);

		this.setRegistryName(name);
		this.setUnlocalizedName(name);

		this.setCreativeTab(LFTTutoMod.modTab);
	}
}
