/*
 * Copyright (c) 2017. ZomDev
 */

package fr.lft.moddingtutorials.events;

import fr.lft.moddingtutorials.init.ModBlocks;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class EventOnSteelOreBreak
{

	@SubscribeEvent
	public void onBreak(BlockEvent.BreakEvent e)
	{

		World world = e.getWorld();
		EntityPlayer player = e.getPlayer();


		if( !world.isRemote )
		{

			if( e.getState().getBlock() == ModBlocks.steel_ore )
			{

				int random = new Random().nextInt(100);

				if( random > 95 )
				{
					world.spawnEntity(new EntityItem(world, player.posX, player.posY, player.posZ, new ItemStack(Items.COAL)));
				}


			}

		}

	}

}
