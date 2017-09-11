/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.items.armors;

import fr.zomdev.moddingtutorials.ZomTutoMod;
import fr.zomdev.moddingtutorials.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorMechanical extends ItemArmor
{
	public ItemArmorMechanical(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, 2, equipmentSlotIn);

		this.setRegistryName(name);
		this.setUnlocalizedName(name);

		this.setCreativeTab(ZomTutoMod.modTab);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{

		if( player.inventory.armorInventory.get(0) != null && player.inventory.armorInventory.get(1) != null && player.inventory.armorInventory.get(2) != null && player.inventory.armorInventory.get(3) != null )
		{

			ItemStack helmet = player.inventory.armorInventory.get(3);
			ItemStack chestplate = player.inventory.armorInventory.get(2);
			ItemStack leggings = player.inventory.armorInventory.get(1);
			ItemStack boots = player.inventory.armorInventory.get(0);

			if( helmet.getItem() == ModItems.mechanical_helmet && chestplate.getItem() == ModItems.mechanical_chestplate && leggings.getItem() == ModItems.mechanical_leggings && boots.getItem() == ModItems.mechanical_boots )
			{

				player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("speed"), 5, 2));

			}
		}

	}
}
