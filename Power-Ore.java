package mod_TXPMCPowerSurge;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
        
  public class Power-Ore extends Block
  { 
    private static String textureName; 
  
    public Power-Ore(int par1, String textureName)
    {
        super(par1, Material.circuits);
        this.setCreativeTab(CreativeTabs.tabBlock); 
        this.textureName = textureName;
    }    

    public int idDropped(int par1, Random par2Random, int par3)
    {
    
      return none;
      
    }

    public int quantityDropped(Random random)
    {
      return 7;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg){
    	this.blockIcon = reg.registerIcon(mod_TXPMCPowerSurge.modID + ":" + textureName);
    }   

}