package fr.lft.moddingtutorials.init;

import fr.lft.moddingtutorials.LFTTutoMod;
import fr.lft.moddingtutorials.items.ItemBolts;
import fr.lft.moddingtutorials.items.ItemFoodLFTTuto;
import fr.lft.moddingtutorials.items.ItemLFTTutoMod;
import fr.lft.moddingtutorials.items.ItemMechanicalSword;
import fr.lft.moddingtutorials.items.armors.ItemArmorMechanical;
import fr.lft.utils.ArmorUtils;
import fr.lft.utils.ToolsUtils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{

	// Création de l'item
	public static final Item iron_gear = new ItemLFTTutoMod("iron_gear");

	public static final Item bolts = new ItemBolts("bolt");

	public static final Item mechanical_food = new ItemFoodLFTTuto("mechanical_food", 4, 0.6f, false, false);

	// Mechanical Armor

	public static final Item mechanical_helmet = new ItemArmorMechanical("mechanical_helmet", ArmorUtils.mechanical_mat, EntityEquipmentSlot.HEAD);
	public static final Item mechanical_chestplate = new ItemArmorMechanical("mechanical_chestplate", ArmorUtils.mechanical_mat, EntityEquipmentSlot.CHEST);
	public static final Item mechanical_leggings = new ItemArmorMechanical("mechanical_leggings", ArmorUtils.mechanical_mat, EntityEquipmentSlot.LEGS);
	public static final Item mechanical_boots = new ItemArmorMechanical("mechanical_boots", ArmorUtils.mechanical_mat, EntityEquipmentSlot.FEET);

	// Sword
	public static final Item mechanical_sword = new ItemMechanicalSword("mechanical_sword", ToolsUtils.mechanical_mat_tools);


	//Initialisation des items
	private static void initItems()
	{

	}

	public static void registerItems()
	{

		initItems();

		registerItem(iron_gear);
		registerItem(bolts);
		registerItem(mechanical_food);

		registerItem(mechanical_helmet);
		registerItem(mechanical_chestplate);
		registerItem(mechanical_leggings);
		registerItem(mechanical_boots);

		registerItem(mechanical_sword);

	}

	public static void registerItemRenders()
	{
		registerItemRender(iron_gear);

		for ( int i = 0; i < ItemBolts.subTypes.length; i++ )
		{

			registerItemRenderWithMeta(bolts, i, ItemBolts.subTypes);

		}

		registerItemRender(mechanical_food);

		registerItemRender(mechanical_helmet);
		registerItemRender(mechanical_chestplate);
		registerItemRender(mechanical_leggings);
		registerItemRender(mechanical_boots);


		// Dans le json n'oubliez pas de mettre le parent = "item/handheld" sinon vous aurez des problèmes de rotation
		registerItemRender(mechanical_sword);

	}

	private static void registerItem(Item item)
	{
		GameRegistry.register(item);
	}

	private static void registerItemRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(LFTTutoMod.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}

	private static void registerItemRenderWithMeta(Item item, int meta, String[] variants)
	{

		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(LFTTutoMod.MODID, variants[meta] + item.getUnlocalizedName().substring(5)), "inventory"));

	}

}
