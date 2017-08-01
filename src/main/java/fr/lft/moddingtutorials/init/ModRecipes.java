package fr.lft.moddingtutorials.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{

	public static final void registerCraftingRecipes()
	{
		// Iron Gear Recipe
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.iron_gear, 2), " I ", "ISI", " I ", 'I', Items.IRON_INGOT, 'S', Blocks.STONE);

	}


}
