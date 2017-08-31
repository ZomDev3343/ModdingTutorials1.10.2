/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentFireAspect;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class EnchantmentPoisonDamage extends Enchantment
{
	public EnchantmentPoisonDamage(String name, Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots)
	{
		super(rarityIn, typeIn, slots);

		this.setRegistryName(name);
		this.setName(name);
	}

	@Override
	public void onEntityDamaged(EntityLivingBase user, final Entity target, int level)
	{

		if( target instanceof EntityLiving )
		{

			EntityLiving entityLiving = (EntityLiving) target;

			entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("poison"), 20 * 10, level < 3 ? 0 : 1));

			if( level >= 2 )
			{
				if( user instanceof EntityPlayer )
				{

					EntityPlayer player = (EntityPlayer) user;

					player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("regeneration"), 20 * 5, 0));

				}
			}


		}
	}

	@Override
	public int getMinLevel()
	{
		return 1;
	}

	@Override
	public int getMaxLevel()
	{
		return 3;
	}

	@Override
	public int getMinEnchantability(int enchantmentLevel)
	{
		return enchantmentLevel > 1 ? 18 : 10;
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel)
	{
		return enchantmentLevel > 1 ? 35 : 26;
	}

	@Override
	protected boolean canApplyTogether(Enchantment ench)
	{

		return !(ench instanceof EnchantmentFireAspect) && !(ench instanceof EnchantmentPoisonDamage);
	}

	@Override
	public boolean isAllowedOnBooks()
	{
		return true;
	}
}
