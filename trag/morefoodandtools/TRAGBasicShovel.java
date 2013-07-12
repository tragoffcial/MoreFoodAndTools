package trag.morefoodandtools;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;


// *REMEBER* Change "ItemPickaxe" to ItemAxe, ItemHoe, ItemSword, etc if you are making those tools!
public class TRAGBasicShovel extends ItemSpade {

public TRAGBasicShovel(int ItemID, EnumToolMaterial material){
super(ItemID, material);
setCreativeTab(Main.TabMoreFoodAndTools);
}



}