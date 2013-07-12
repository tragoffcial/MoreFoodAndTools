package trag.morefoodandtools;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;


// *REMEBER* Change "ItemPickaxe" to ItemAxe, ItemHoe, ItemSword, etc if you are making those tools!
public class RainbowBasicSword extends ItemSword {

public RainbowBasicSword(int ItemID, EnumToolMaterial material){
super(ItemID, material);
setCreativeTab(Main.TabMoreFoodAndTools);
}



}