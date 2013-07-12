package trag.morefoodandtools;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.creativetab.CreativeTabs;

// *REMEBER* Change "ItemPickaxe" to ItemAxe, ItemHoe, ItemSword, etc if you are making those tools!
public class GodSword extends ItemSword {


	
public GodSword(int ItemID, EnumToolMaterial material){
super(ItemID, material);

	setCreativeTab(Main.TabMoreFoodAndTools);

}



}