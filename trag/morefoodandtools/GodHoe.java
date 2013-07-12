package trag.morefoodandtools;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.creativetab.CreativeTabs;

// *REMEBER* Change "ItemPickaxe" to ItemAxe, ItemHoe, ItemSword, etc if you are making those tools!
public class GodHoe extends ItemHoe {


	
public GodHoe(int ItemID, EnumToolMaterial material){
super(ItemID, material);

	setCreativeTab(Main.TabMoreFoodAndTools);

}



}