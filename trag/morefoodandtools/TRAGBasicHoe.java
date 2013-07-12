package trag.morefoodandtools;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;


// *REMEBER* Change "ItemPickaxe" to ItemAxe, ItemHoe, ItemSword, etc if you are making those tools!
public class TRAGBasicHoe extends ItemHoe {

public TRAGBasicHoe(int ItemID, EnumToolMaterial material){
super(ItemID, material);
setCreativeTab(Main.TabMoreFoodAndTools);
}



}