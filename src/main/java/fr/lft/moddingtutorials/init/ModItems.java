package fr.lft.moddingtutorials.init;

import fr.lft.moddingtutorials.LFTTutoMod;
import fr.lft.moddingtutorials.items.ItemLFTTutoMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{

	// Création de l'item
	public static final Item iron_gear = new ItemLFTTutoMod("iron_gear");

	//Initialisation des items
	private static void initItems()
	{

	}

	public static void registerItems()
	{

		initItems();

		registerItem(iron_gear);

	}

	public static void registerItemRenders()
	{
		registerItemRender(iron_gear);
	}

	private static void registerItem(Item item)
	{
		GameRegistry.register(item);
	}

	private static void registerItemRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(LFTTutoMod.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}

}
