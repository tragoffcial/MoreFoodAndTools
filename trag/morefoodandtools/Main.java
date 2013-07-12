package trag.morefoodandtools; //Package directory

/*
* Basic importing
*/

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/*
* Basic needed forge stuff
*/
@Mod(modid="More food and tools",name="More Food And Tools",version="WIP Mod V2")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)

public class Main {

	//Block Code
	 
/*
* ToolMaterial
*/
	
//Emerald Tool Material

	public static EnumToolMaterial EnumToolMaterialEmerald = EnumHelper.addToolMaterial("MedPower", 3, 1175, 9.0F, 6, 10);

	public static EnumToolMaterial EnumToolMaterialRainbow = EnumHelper.addToolMaterial("HighPower Rainbow", 3, 2000, 6.0F, 5, 10);
	
	public static EnumToolMaterial EnumToolMaterialGod = EnumHelper.addToolMaterial("God",99, 999999, 100.0F, 100, 10);

	
	//Telling forge that we are creating these

//Items
	public static Item emeraldnugget;
	public static Item EmeraldAxe;
	public static Item EmeraldShovel;
	public static Item EmeraldSword;
	public static Item EmeraldPickaxe;
	public static Item EmeraldHoe;
	public static Block RainbowOre;
	public static Item RainbowIngot;
	public static Block MagicCoalOre;
	public static Item MagicCoal;
	public static Item RainbowAxe;
	public static Item RainbowPickaxe;
	public static Item RainbowHoe;
	public static Item RainbowShovel;
	public static Item RainbowSword;
	public static Item EmeraldApple1;
	public static Item EmeraldApple2;
	public static Item RawDogFood;
	public static Item CookedDogFood;
	public static Item AntiFood;
	public static Item GodPickaxe;
	public static Item GodShovel;
	public static Item GodSword;
	public static Item GodAxe;
	public static Item GodHoe;
	public static Item GodFood;
		
	//Creative Tabs
	
	static CreativeTabs TabMoreFoodAndTools = new TabMoreFoodAndTools(CreativeTabs.getNextID(), "More Food And Tools");

//Declaring Init
@Init
public void load(FMLInitializationEvent event){
	// define items/blocks
//Tools
	EmeraldAxe = new TRAGBasicAxe(2014, EnumToolMaterialEmerald).setUnlocalizedName("emeraldaxe");
	EmeraldShovel = new TRAGBasicShovel(2015, EnumToolMaterialEmerald).setUnlocalizedName("emeraldshovel");
	EmeraldPickaxe = new TRAGBasicPickaxe(2016, EnumToolMaterialEmerald).setUnlocalizedName("emeraldpickaxe");
	EmeraldHoe = new TRAGBasicHoe(2017, EnumToolMaterialEmerald).setUnlocalizedName("emeraldhoe");
	EmeraldSword = new TRAGBasicSword(2018, EnumToolMaterialEmerald).setUnlocalizedName("emeraldsword");
	RainbowAxe = new RainbowBasicAxe(2028, EnumToolMaterialRainbow).setUnlocalizedName("rainbowaxe");
	RainbowPickaxe = new RainbowBasicPickaxe(2029, EnumToolMaterialRainbow).setUnlocalizedName("rainbowpickaxe");
	RainbowHoe = new RainbowBasicHoe(2030, EnumToolMaterialRainbow).setUnlocalizedName("rainbowhoe");
	RainbowShovel = new RainbowBasicShovel(2031, EnumToolMaterialRainbow).setUnlocalizedName("rainbowshovel");
	RainbowSword = new RainbowBasicSword(2032, EnumToolMaterialRainbow).setUnlocalizedName("rainbowsword");
	GodAxe = new GodAxe(2220, EnumToolMaterialGod).setUnlocalizedName("godaxe");
	GodShovel = new GodShovel(2221, EnumToolMaterialGod).setUnlocalizedName("godshovel");
	GodPickaxe = new GodPickaxe(2222, EnumToolMaterialGod).setUnlocalizedName("godpickaxe");
	GodHoe = new GodHoe(2223, EnumToolMaterialGod).setUnlocalizedName("godhoe");
	GodSword = new GodSword(2224, EnumToolMaterialGod).setUnlocalizedName("godsword");

	
	//Items
	emeraldnugget = new craftingItems(2013).setUnlocalizedName("emeraldnugget");
	MagicCoal = new craftingItems(2026).setUnlocalizedName("magiccoal");
	//Foods
	EmeraldApple1 = new FoodItem(2033, 8, 3.0F, false).setAlwaysEdible().setUnlocalizedName("emeraldapple1");
	EmeraldApple2 = new FoodItem(2034, 16, 6.0F, false).setAlwaysEdible().setUnlocalizedName("emeraldapple2");
	RawDogFood = new FoodItem(2035, 2, 3.0F, true).setUnlocalizedName("rawdogfood");
	CookedDogFood = new FoodItem(2036, 4, 6.0F, true).setUnlocalizedName("cookeddogfood");
	AntiFood = new FoodItem(2037, -4,0F, false).setAlwaysEdible().setUnlocalizedName("antifood");
	//Ingots
	RainbowIngot = new craftingItems(2019).setUnlocalizedName("rainbowingot");
	//Rainbow Ore
	
	RainbowOre = new RainbowOreClass(2025).setUnlocalizedName("rainbowore").setHardness(2.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
	GameRegistry.registerBlock(RainbowOre, "rainbowore");
	LanguageRegistry.addName(RainbowOre, "Rainbow Ore");
	//Magic Coal Ore
	
	MagicCoalOre = new MagicCoalOreClass(2026).setUnlocalizedName("magiccoalore").setHardness(2.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
	GameRegistry.registerBlock(MagicCoalOre, "magiccoalore");
	LanguageRegistry.addName(MagicCoalOre, "Magic Coal Ore");
	
	//World Generation
	
	//Rainbow Ore
	GameRegistry.registerWorldGenerator(new WorldGeneratorRainbowOre());
	
	//Magic Coal Ore
	GameRegistry.registerWorldGenerator(new WorldGeneratorMagicCoalOre());
	
	

	
//adding names
LanguageRegistry.addName(emeraldnugget, "Emerald Nugget");
LanguageRegistry.addName(EmeraldAxe, "Emerald Axe");
LanguageRegistry.addName(EmeraldShovel, "Emerald Shovel");
LanguageRegistry.addName(EmeraldPickaxe, "Emerald Pickaxe");
LanguageRegistry.addName(EmeraldHoe, "Emerald Hoe");
LanguageRegistry.addName(EmeraldSword, "Emerald Sword");
LanguageRegistry.addName(RainbowIngot, "Rainbow Ingot");
LanguageRegistry.addName(MagicCoal, "Magic Coal");
LanguageRegistry.addName(RainbowAxe, "Rainbow Axe");
LanguageRegistry.addName(RainbowPickaxe, "Rainbow Pickaxe");
LanguageRegistry.addName(RainbowSword, "Rainbow Sword");
LanguageRegistry.addName(RainbowHoe, "Rainbow Hoe");
LanguageRegistry.addName(RainbowShovel, "Rainbow Shovel");
LanguageRegistry.addName(EmeraldApple1, "Emerald Apple");
LanguageRegistry.addName(EmeraldApple2, "Emerald Apple");
LanguageRegistry.addName(RawDogFood, "Raw Dog Food");
LanguageRegistry.addName(CookedDogFood, "Cooked Dog Food");
LanguageRegistry.addName(AntiFood, "The Anti Food");
LanguageRegistry.addName(GodAxe, "God Axe");
LanguageRegistry.addName(GodShovel, "God Shovel");

//crafting

//Emerald to emerald nugget-------
GameRegistry.addShapelessRecipe(new ItemStack(emeraldnugget,9), new Object[]{Item.emerald });
//Emerald nugget to emerald
GameRegistry.addRecipe(new ItemStack(Item.emerald,1), new Object[]{"EEE","EEE","EEE",'E',emeraldnugget,});
//Emerald Pickaxe
GameRegistry.addRecipe(new ItemStack(EmeraldPickaxe,1), new Object[]{"EEE"," S "," S ",'E',Item.emerald,'S', Item.stick,});
//Emerald Axe 1
GameRegistry.addRecipe(new ItemStack(EmeraldAxe,1), new Object[]{" EE"," SE"," S ",'E',Item.emerald,'S', Item.stick,});
//Emerald Axe 2
GameRegistry.addRecipe(new ItemStack(EmeraldAxe,1), new Object[]{"EE ","ES "," S ",'E',Item.emerald,'S', Item.stick,});
//Emerald Shovel
GameRegistry.addRecipe(new ItemStack(EmeraldShovel,1), new Object[]{" E "," S "," S ",'E',Item.emerald,'S', Item.stick,});
//Emerald Hoe 2
GameRegistry.addRecipe(new ItemStack(EmeraldHoe,1), new Object[]{" EE"," S "," S ",'E',Item.emerald,'S', Item.stick,});
//Emerald Hoe 2
GameRegistry.addRecipe(new ItemStack(EmeraldHoe,1), new Object[]{"EE "," S "," S ",'E',Item.emerald,'S', Item.stick,});
//Emerald Sword
GameRegistry.addRecipe(new ItemStack(EmeraldSword,1), new Object[]{" E "," E "," S ",'E',Item.emerald,'S', Item.stick,});
//Rainbow Axe 1
GameRegistry.addRecipe(new ItemStack(RainbowAxe, 1), new Object[]{" RR"," SR"," S ",'R',RainbowIngot,'S',Item.stick,});
//Rainbow Axe 2
GameRegistry.addRecipe(new ItemStack(RainbowAxe, 1), new Object[]{"RR ","RS "," S ",'R',RainbowIngot,'S',Item.stick,});
//Rainbow Pickaxe
GameRegistry.addRecipe(new ItemStack(RainbowPickaxe, 1), new Object[]{"RRR"," S "," S ",'R',RainbowIngot,'S',Item.stick,});
//Rainbow Shovel
GameRegistry.addRecipe(new ItemStack(RainbowShovel, 1), new Object[]{" R "," S "," S ",'R',RainbowIngot,'S',Item.stick,});
//Rainbow Hoe 1
GameRegistry.addRecipe(new ItemStack(RainbowHoe, 1), new Object[]{" RR"," S "," S ",'R',RainbowIngot,'S',Item.stick,});
//Rainbow Hoe 2
GameRegistry.addRecipe(new ItemStack(RainbowHoe, 1), new Object[]{"RR "," S "," S ",'R',RainbowIngot,'S',Item.stick,});
//Rainbow Sword
GameRegistry.addRecipe(new ItemStack(RainbowSword, 1), new Object[]{" R "," R "," S ",'R',RainbowIngot,'S',Item.stick,});
//Emerald Apple 1
GameRegistry.addRecipe(new ItemStack(EmeraldApple1, 1), new Object[]{"EEE","EAE","EEE", 'E', emeraldnugget, 'A', Item.appleRed,});
//Emerald Apple 2
GameRegistry.addRecipe(new ItemStack(EmeraldApple2, 1), new Object[]{"EEE","EAE","EEE", 'E', Item.emerald, 'A', Item.appleRed,});
//Dog Food
GameRegistry.addShapelessRecipe(new ItemStack(RawDogFood, 4), new Object[]{Item.beefRaw, Item.bowlEmpty});
//Anti Food
GameRegistry.addShapelessRecipe(new ItemStack(AntiFood, 2), new Object[]{Item.rottenFlesh , Item.spiderEye, Item.bowlEmpty});
//God Axe1
GameRegistry.addRecipe(new ItemStack(GodAxe, 1),new Object[]{"BB ","BS "," S ", 'B',Block.bedrock,'S',Item.stick});
//God Axe 2
GameRegistry.addRecipe(new ItemStack(GodAxe, 1),new Object[]{" BB"," SB"," S ",'B',Block.bedrock,'S',Item.stick});
//God Shovel
GameRegistry.addRecipe(new ItemStack(GodShovel, 1),new Object[]{" B "," S "," S ",'B',Block.bedrock,'S',Item.stick});

//Smelting
//RainbowOre To RainbowIngot
GameRegistry.addSmelting(RainbowOre.blockID, new ItemStack(RainbowIngot, 1), 4F);
//Magic Coal Ore To Magic Coal
GameRegistry.addSmelting(MagicCoalOre.blockID, new ItemStack(MagicCoal, 1), 2F);
//Raw Dog Food To Cooked Dog Food
GameRegistry.addSmelting(RawDogFood.itemID, new ItemStack(CookedDogFood, 1), 3F);


//Chest Generation
// Mineshaft : Rainbow Ingot
ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(RainbowIngot), 1, 4, 025));
// Bonus Chest : Rainbow Ingot
ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack (RainbowIngot), 1, 5, 010));
//Bonus Chest : Cooked Dog Food
ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack (CookedDogFood), 1, 6, 030));
//Village Chest : Rainbow Ingot
ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack (RainbowIngot), 2, 5, 030));


//Custom Mob
//EntityRegistry.registerGlobalEntityID(EntityDylanMob.class , "DirpyDylan", EntityRegistry.findGlobalUniqueEntityId());
//EntityRegistry.addSpawn(EntityDylanMob.class, 12, 2, 8, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.forest);
//LanguageRegistry.instance().addStringLocalization("MoreFoodAndTools.DirpyDylan", "Dirpy Dylan");

}

}