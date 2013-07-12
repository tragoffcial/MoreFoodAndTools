package trag.morefoodandtools;

import java.util.Random;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class RainbowOreClass extends Block {



public RainbowOreClass(int par1) {
super(par1, Material.rock);
setCreativeTab(Main.TabMoreFoodAndTools); //place in creative tabs

}

//drops when broken with pickaxe
public int idDropped(int par1, Random par2Random, int par3)
{
return Main.RainbowOre.blockID;
}
public int quantityDropped()
{
return 3;
}



//texure the block (Not sure if it's required)
public String getTextureFile(){
return "/textures/blocks/RainbowOre.png";
}


}