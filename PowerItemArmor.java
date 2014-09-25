package mod_TXPMCPowerSurge;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;    
import java.util.Random;
 
public class PowerItemArmor extends ItemArmor
{
    private static String textureName; 
 
    private static final int maxDamageArray[] = {
        11, 16, 15, 13
    };
    public final int armorType;
    public final int damageReduceAmount;
    public final int renderIndex;
    private final PowerArmorMaterial material;
 
    public PowerItemArmor(int i, PowerArmorMaterial enumarmormaterial, int j, int k, String textureName)
    {
        super(i, EnumArmorMaterial.DIAMOND, j, k);
        material = enumarmormaterial;
        armorType = k;
        renderIndex = j;
        damageReduceAmount = enumarmormaterial.getDamageReductionAmount(k);
        setMaxDamage(enumarmormaterial.func_40576_a(k));
        maxStackSize = 1;          
        this.textureName = textureName;     
    }
 
    public int getItemEnchantability()
    {
        return material.getEnchantability();
    }
    
    public static int[] getMaxDamageArray()
    {
        return maxDamageArray;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg){
    	this.itemIcon = reg.registerIcon(mod_TXPMCPowerSurge.modID + ":" + textureName);
    }       
 
}