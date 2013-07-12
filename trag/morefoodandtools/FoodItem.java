package trag.morefoodandtools;

import net.minecraft.item.ItemFood;

public class FoodItem extends ItemFood{

	public FoodItem(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		setCreativeTab(Main.TabMoreFoodAndTools);
	}

}
