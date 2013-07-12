package trag.morefoodandtools;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.entity.ai.*;
import net.minecraft.item.Item;

public class EntityDylanMob extends EntityMob{

	public EntityDylanMob(World par1World) {
		super(par1World);
//this.texture = "/mob/dylannpc.png";
this.getNavigator().setAvoidsWater(true);
this.getNavigator().setSpeed(3F);
this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));
this.tasks.addTask(2, new EntityAITempt(this, 0.3F, Block.chest.blockID, false));
this.tasks.addTask(3, new EntityAITempt(this, 0.3F, Item.appleRed.itemID, false));
this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
this.tasks.addTask(5, new EntityAILookIdle(this));
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
		
		

	public int getMaxHealth() {
		// TODO Auto-generated method stub
		return 10;
	}

}
