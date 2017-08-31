/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.items.armors;

import fr.zomdev.moddingtutorials.ZomTutoMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemArmorMechanical extends ItemArmor
{
	public ItemArmorMechanical(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, 2, equipmentSlotIn);

		this.setRegistryName(name);
		this.setUnlocalizedName(name);

		this.setCreativeTab(ZomTutoMod.modTab);
	}

}
