package fr.lft.moddingtutorials.init;

import fr.lft.moddingtutorials.LFTTutoMod;
import fr.lft.moddingtutorials.items.ItemBolts;
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

	public static final Item bolts = new ItemBolts("bolt");

	//Initialisation des items
	private static void initItems()
	{

	}

	public static void registerItems()
	{

		initItems();

		registerItem(iron_gear);
		registerItem(bolts);

	}

	public static void registerItemRenders()
	{
		registerItemRender(iron_gear, 0);

		for ( int i = 0; i < ItemBolts.subTypes.length; i++ )
		{

			registerItemRenderWithMeta(bolts, i, ItemBolts.subTypes);

		}

	}

	private static void registerItem(Item item)
	{
		GameRegistry.register(item);
	}

	private static void registerItemRender(Item item, int meta)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(LFTTutoMod.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}

	private static void registerItemRenderWithMeta(Item item, int meta, String[] variants)
	{

		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(LFTTutoMod.MODID, variants[meta] + item.getUnlocalizedName().substring(5)), "inventory"));

	}

}
