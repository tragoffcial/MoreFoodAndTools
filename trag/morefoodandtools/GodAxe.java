package trag.morefoodandtools;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.creativetab.CreativeTabs;

// *REMEBER* Change "ItemPickaxe" to ItemAxe, ItemHoe, ItemSword, etc if you are making those tools!
public class GodAxe extends ItemAxe {


	
public GodAxe(int ItemID, EnumToolMaterial material){
super(ItemID, material);

	setCreativeTab(Main.TabMoreFoodAndTools);

}



}