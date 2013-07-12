package trag.morefoodandtools;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;


// *REMEBER* Change "ItemPickaxe" to ItemAxe, ItemHoe, ItemSword, etc if you are making those tools!
public class TRAGBasicSword extends ItemSword {

public TRAGBasicSword(int ItemID, EnumToolMaterial material){
super(ItemID, material);
setCreativeTab(Main.TabMoreFoodAndTools);
}



}