/*
 * Copyright (c) 2017. ZomDev
 */

package fr.zomdev.moddingtutorials.items;

import fr.zomdev.moddingtutorials.ZomTutoMod;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ItemMechanicalSword extends ItemSword
{
	public ItemMechanicalSword(String name, ToolMaterial material)
	{
		super(material);

		this.setRegistryName(name);
		this.setUnlocalizedName(name);

		this.setCreativeTab(ZomTutoMod.modTab);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{

		RayTraceResult rayTraceResult = player.rayTrace(20, 1);

		worldIn.spawnEntity(new EntityLightningBolt(worldIn, rayTraceResult.getBlockPos().getX(), rayTraceResult.getBlockPos().getY(), rayTraceResult.getBlockPos().getZ(), true));

		player.inventory.getCurrentItem().damageItem(10, player);

		return EnumActionResult.FAIL;
	}
}
