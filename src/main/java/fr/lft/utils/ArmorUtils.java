package fr.lft.utils;

import fr.lft.moddingtutorials.LFTTutoMod;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorUtils
{
	public static final ItemArmor.ArmorMaterial mechanical_mat = EnumHelper.addArmorMaterial("machanical_mat", LFTTutoMod.MODID + ":mechanical_armor", 53, new int[]{2, 4, 3, 2}, 13, SoundEvents.BLOCK_ANVIL_PLACE, 0);
}
