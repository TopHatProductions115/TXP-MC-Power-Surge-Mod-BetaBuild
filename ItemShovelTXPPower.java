package mod_TXPMCPowerSurge;
import net.minecraft.block.Block; 
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import java.util.Random;

public class ItemShovelTXPPower extends ItemToolTXPPower
{
    private static String textureName;

    public ItemShovelTXPPower(int i, EnumToolTXPPower enumtooltxppower, String textureName)
    {
        super(i, 1, enumtooltxppower, blocksEffectiveAgainst);  
        this.textureName = textureName;
    }

    public boolean canHarvestBlock(Block block)
    {
        if(block == Block.snow)
        {
            return true;
        }
        return block == Block.blockSnow;
    }

    private static Block blocksEffectiveAgainst[];

    static 
    {
        blocksEffectiveAgainst = (new Block[] {
            Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField
        });
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg){
    	this.itemIcon = reg.registerIcon(mod_TXPMCPowerSurge.modID + ":" + textureName);
    }        
}


  