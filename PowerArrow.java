package mod_TXPMCPowerSurge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;   
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import java.util.Random;            

  public class PowerArrow extends ItemFood
  {
  
    private static String textureName;  
     
    /** Number of ticks to run while 'EnumAction'ing until result. */
    public final int itemUseDuration;
    
    /** The amount this food item heals the player. */
    private final int healAmount;
    private final float saturationModifier;
    
    /** Whether wolves like this food (true for raw and cooked porkchop). */
    private final boolean isWolfsFavoriteMeat;
    
    /**
     * If this field is true, the food can be consumed even if the player don't need to eat.
     */
    private boolean alwaysEdible;
    
    /**
     * represents the potion effect that will occurr upon eating this food. Set by setPotionEffect
     */
    private int potionId;
    
    /** set by setPotionEffect */
    private int potionDuration;
    
    /** set by setPotionEffect */
    private int potionAmplifier;
    
    /** probably of the set potion effect occurring */
    private float potionEffectProbability;
  
    public PowerArrow(int par1, int par2, float par3, boolean par4, String textureName)
    {
      super(par1, par2, par4);
      maxStackSize = 64;
      this.itemUseDuration = 32;
      this.healAmount = par2;
      this.isWolfsFavoriteMeat = par4;
      this.saturationModifier = par3;
      this.textureName = textureName;  
      this.setCreativeTab(CreativeTabs.tabFood);    
    }  
  
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg){
    	this.itemIcon = reg.registerIcon(mod_TXPMCPowerSurge.modID + ":" + textureName);
    }   
  }
