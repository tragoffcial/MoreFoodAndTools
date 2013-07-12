package trag.morefoodandtools;

import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.CreativeTabs;


public class toolItems extends Item {
public toolItems(int par1) {
super(par1); //Returns super constructor: par1 is ID
setCreativeTab(Main.TabMoreFoodAndTools); //Tells the game what creative mode tab it goes in
}
}