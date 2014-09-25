package mod_TXPMCPowerSurge;
import net.minecraft.block.Block;  
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import java.util.Random;

public class ItemAxePower extends ItemToolPower
{
    private static String textureName;

    protected ItemAxePower(int i, EnumToolPower enumtoolpower, String textureName)
    {
        super(i, 3, enumtoolpower, blocksEffectiveAgainst);    
        this.textureName = textureName;
    }

    private static Block blocksEffectiveAgainst[];

    static 
    {
        blocksEffectiveAgainst = (new Block[] {
            Block.planks, Block.bookShelf, Block.wood, Block.chest
        });
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg){
    	this.itemIcon = reg.registerIcon(mod_TXPMCPowerSurge.modID + ":" + textureName);
    }        
}

  