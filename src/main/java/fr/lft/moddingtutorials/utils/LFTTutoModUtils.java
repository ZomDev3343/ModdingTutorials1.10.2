/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials.utils;

import fr.lft.moddingtutorials.LFTTutoMod;
import fr.lft.moddingtutorials.enchants.EnchantmentPoisonDamage;
import fr.lft.moddingtutorials.gen.OreGeneration;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LFTTutoModUtils
{
	public static class ArmorUtils
	{
		public static final ItemArmor.ArmorMaterial mechanical_mat = EnumHelper.addArmorMaterial("machanical_mat", LFTTutoMod.MODID + ":mechanical_armor", 53, new int[]{2, 4, 3, 2}, 13, SoundEvents.BLOCK_ANVIL_PLACE, 0);
	}

	public static class GenUtils
	{

		private static OreGeneration oreGeneration = new OreGeneration();

		public static final void registerWorldGenerations()
		{

			GameRegistry.registerWorldGenerator(oreGeneration, 0);

		}

	}

	public static class ToolsUtils
	{
		public static final Item.ToolMaterial mechanical_mat_tools = EnumHelper.addToolMaterial("mechanical_mat", 2, 1250, 3f, 2f, 16);
	}

	public static class EnchantmentsUtils
	{

		public static final Enchantment poison_enchant = new EnchantmentPoisonDamage("poison_damage", Enchantment.Rarity.RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND});

		public static final void registerEnchantments()
		{

			GameRegistry.register(poison_enchant);

		}

	}
}
