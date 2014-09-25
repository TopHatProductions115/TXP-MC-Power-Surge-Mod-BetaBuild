package mod_TXPMCPowerSurge;
import net.minecraft.block.Block;
import net.minecraft.item.Item;     
import net.minecraft.item.ItemArmor;
 
import java.util.Random;
 
public enum PowerArmorMaterial
{
    POWER("POWER", 25, 29, new int[] {2, 7, 5, 3}, 10);
    private int maxDamageFactor;
    private int damageReductionAmountArray[];
    private int enchantability;
   
 
    private PowerArmorMaterial(String s, int i, int j, int ai[], int k)
    {
        maxDamageFactor = j;
        damageReductionAmountArray = ai;
        enchantability = k;
    }
 
    public int func_40576_a(int i)
    {
        return PowerItemArmor.getMaxDamageArray()[i] * maxDamageFactor;
    }
        public int getDamageReductionAmount(int i)
    {
        return damageReductionAmountArray[i];
    }
 
    public int getEnchantability()
    {
        return enchantability;
    }
 
   
  }