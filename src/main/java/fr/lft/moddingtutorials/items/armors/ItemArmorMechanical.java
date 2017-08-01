/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials.items.armors;

import fr.lft.moddingtutorials.LFTTutoMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemArmorMechanical extends ItemArmor
{
	public ItemArmorMechanical(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, 2, equipmentSlotIn);

		this.setRegistryName(name);
		this.setUnlocalizedName(name);

		this.setCreativeTab(LFTTutoMod.modTab);
	}

}
