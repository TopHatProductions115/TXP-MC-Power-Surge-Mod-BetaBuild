package mod_TXPMCPowerSurge;
import net.minecraft.block.Block;
import net.minecraft.item.Item;        
import net.minecraft.item.ItemStack;
import java.util.Random;        

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;       
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "mod_TXPMCPowerSurge", name = "TXPMCPowerSurge", version = "0.1")
public class mod_TXPMCPowerSurge
{  

  public static final String modID = "txpmcpowersurge";
  
  //Declare Power-Ore
  public static Block Power-Ore;  
  //Declare Power-Circuits
  public static Block Power-Circuits;  
  //Declare PowerBlock
  public static Block PowerBlock;
  //Declare PowerStone
  public static Item PowerStone;
  //Declare PowerArrow
  public static Item PowerArrow;
  //Declare TXPPower Pickaxe                                          
  public static final Item TXPPower_pickaxe = new ItemPickaxeTXPPower(103, EnumToolTXPPower.TXPPOWER, "TXPPower")
        .setUnlocalizedName("TXPPower_pickaxe").setTextureName("TXPPower_pickaxe");
  
  //Declare TXPPower Shovel                                          
  public static final Item TXPPower_shovel = new ItemShovelTXPPower(104, EnumToolTXPPower.TXPPOWER, "TXPPower")
        .setUnlocalizedName("TXPPower_shovel").setTextureName("TXPPower_shovel");
  
  //Declare TXPPower Axe                                          
  public static final Item TXPPower_axe = new ItemAxeTXPPower(105, EnumToolTXPPower.TXPPOWER, "TXPPower")
        .setUnlocalizedName("TXPPower_axe").setTextureName("TXPPower_axe");
  
  //Declare TXPPower Hoe                                          
  public static final Item TXPPower_hoe = new ItemHoeTXPPower(106, EnumToolTXPPower.TXPPOWER, "TXPPower")
        .setUnlocalizedName("TXPPower_hoe").setTextureName("TXPPower_hoe");
  
  //Declare TXPPower Sword                                          
  public static final Item TXPPower_sword = new ItemSwordTXPPower(107, EnumToolTXPPower.TXPPOWER, "TXPPower")
        .setUnlocalizedName("TXPPower_sword").setTextureName("TXPPower_sword");
  
  //Declare Power Pickaxe                                          
  public static final Item Power_pickaxe = new ItemPickaxePower(110, EnumToolPower.POWER, "Power")
        .setUnlocalizedName("Power_pickaxe").setTextureName("Power_pickaxe");
  
  //Declare Power Shovel                                          
  public static final Item Power_shovel = new ItemShovelPower(111, EnumToolPower.POWER, "Power")
        .setUnlocalizedName("Power_shovel").setTextureName("Power_shovel");
  
  //Declare Power Axe                                          
  public static final Item Power_axe = new ItemAxePower(112, EnumToolPower.POWER, "Power")
        .setUnlocalizedName("Power_axe").setTextureName("Power_axe");
  
  //Declare Power Hoe                                          
  public static final Item Power_hoe = new ItemHoePower(113, EnumToolPower.POWER, "Power")
        .setUnlocalizedName("Power_hoe").setTextureName("Power_hoe");
  
  //Declare Power Sword                                          
  public static final Item Power_sword = new ItemSwordPower(114, EnumToolPower.POWER, "Power")
        .setUnlocalizedName("Power_sword").setTextureName("Power_sword");
                                
  //Declare TXPArmor Helmet
  public static final Item TXPArmor_helmet = (new TXPArmorItemArmor(105, TXPArmorArmorMaterial.TXPARMOR, 7, 0, "TXPArmor"))
    .setUnlocalizedName("TXPArmor_helmet").setTextureName("TXPArmor_helmet");
  //Declare TXPArmor Chestplate
  public static final Item TXPArmor_chestplate = (new TXPArmorItemArmor(106, TXPArmorArmorMaterial.TXPARMOR, 7, 1, "TXPArmor"))
    .setUnlocalizedName("TXPArmor_chestplate").setTextureName("TXPArmor_chestplate");
  //Declare TXPArmor Leggings
  public static final Item TXPArmor_legs = (new TXPArmorItemArmor(107, TXPArmorArmorMaterial.TXPARMOR, 7, 2, "TXPArmor"))
    .setUnlocalizedName("TXPArmor_legs").setTextureName("TXPArmor_legs");
  //Declare TXPArmor Boots
  public static final Item TXPArmor_boots = (new TXPArmorItemArmor(108, TXPArmorArmorMaterial.TXPARMOR, 7, 3, "TXPArmor"))
    .setUnlocalizedName("TXPArmor_boo").setTextureName("TXPArmor_boo");                              
  //Declare Power Helmet
  public static final Item Power_helmet = (new PowerItemArmor(112, PowerArmorMaterial.POWER, 6, 0, "Power"))
    .setUnlocalizedName("Power_helmet").setTextureName("Power_helmet");
  //Declare Power Chestplate
  public static final Item Power_chestplate = (new PowerItemArmor(113, PowerArmorMaterial.POWER, 6, 1, "Power"))
    .setUnlocalizedName("Power_chestplate").setTextureName("Power_chestplate");
  //Declare Power Leggings
  public static final Item Power_legs = (new PowerItemArmor(114, PowerArmorMaterial.POWER, 6, 2, "Power"))
    .setUnlocalizedName("Power_legs").setTextureName("Power_legs");
  //Declare Power Boots
  public static final Item Power_boots = (new PowerItemArmor(115, PowerArmorMaterial.POWER, 6, 3, "Power"))
    .setUnlocalizedName("Power_boo").setTextureName("Power_boo");


  @Init
  public void load(FMLInitializationEvent event)
  {
  Power-Ore = new Power-Ore(98, "Power-Ore")
    .setHardness(8F).setResistance(2000F)
    .setLightValue(1.0F).setUnlocalizedName("Power-Ore")
    .setTextureName("Power-Ore");  
  
  Power-Circuits = new Power-Circuits(100, "Power-Circuits")
    .setHardness(11F).setResistance(2000F)
    .setLightValue(1.0F).setUnlocalizedName("Power-Circuits")
    .setTextureName("Power-Circuits");  
  
  PowerBlock = new PowerBlock(106, "PowerBlock")
    .setHardness(10F).setResistance(2000F)
    .setLightValue(1.0F).setUnlocalizedName("PowerBlock")
    .setTextureName("PowerBlock");  
  
  //Done with blocks
    PowerStone = new PowerStone(99, 7, 0.3F, false,  "PowerStone")
      .setUnlocalizedName("PowerStone").setTextureName("PowerStone");
    
    PowerArrow = new PowerArrow(111, 3, 0.3F, false,  "PowerArrow")
      .setUnlocalizedName("PowerArrow").setTextureName("PowerArrow");
    
  //Done with items     
    GameRegistry.registerBlock(Power-Ore, "Power-Ore"); //Power-Ore     
    GameRegistry.registerBlock(Power-Ore, "Power-Ore"); //Power-Ore     
    GameRegistry.registerBlock(Power-Circuits, "Power-Circuits"); //Power-Circuits     
    GameRegistry.registerBlock(Power-Ore, "Power-Ore"); //Power-Ore     
    GameRegistry.registerBlock(Power-Ore, "Power-Ore"); //Power-Ore     
    GameRegistry.registerBlock(Power-Circuits, "Power-Circuits"); //Power-Circuits     
    GameRegistry.registerBlock(PowerBlock, "PowerBlock"); //PowerBlock

    //Add Tooltips
      //Blocks       
    LanguageRegistry.addName(Power-Ore, "Availability-2of10 Use-7of10 Power Level-8of10 Main Feature-crafting"); //Power-Ore        
    LanguageRegistry.addName(Power-Circuits, "Availability- 5of10 Use- 6of10 Power Level- 7of10 Main Feature- crafting aid"); //Power-Circuits        
    LanguageRegistry.addName(PowerBlock, "Availability- 7of10 Use- 5of10 Power Level- 8of10 Main Feature- crafting con"); //PowerBlock 
     //Items
    LanguageRegistry.addName(PowerStone, "Availability- 3of10 Use- 6of10 Power Level- 7of10 Main Feature- crafting aid"); //PowerStone
    LanguageRegistry.addName(PowerArrow, "Use-required to use Power Bow Properly"); //PowerArrow
     //Armor Sets
    LanguageRegistry.addName(TXPArmor_helmet, "TXPArmor Helmet");
    LanguageRegistry.addName(TXPArmor_chestplate, "TXPArmor Chestplate");
    LanguageRegistry.addName(TXPArmor_legs, "TXPArmor Leggings");
    LanguageRegistry.addName(TXPArmor_boots, "TXPArmor Boots");
    LanguageRegistry.addName(Power_helmet, "Power Helmet");
    LanguageRegistry.addName(Power_chestplate, "Power Chestplate");
    LanguageRegistry.addName(Power_legs, "Power Leggings");
    LanguageRegistry.addName(Power_boots, "Power Boots");
     //ToolSets
    LanguageRegistry.addName(TXPPower_pickaxe, "TXPPower Pickaxe"); //TXPPower Pickaxe
    LanguageRegistry.addName(TXPPower_shovel, "TXPPower Shovel"); //TXPPower Shovel
    LanguageRegistry.addName(TXPPower_axe, "TXPPower Axe"); //TXPPower Axe
    LanguageRegistry.addName(TXPPower_hoe, "TXPPower Hoe"); //TXPPower Hoe
    LanguageRegistry.addName(TXPPower_sword, "TXPPower Sword"); //TXPPower Sword    
  
    LanguageRegistry.addName(Power_pickaxe, "Power Pickaxe"); //Power Pickaxe
    LanguageRegistry.addName(Power_shovel, "Power Shovel"); //Power Shovel
    LanguageRegistry.addName(Power_axe, "Power Axe"); //Power Axe
    LanguageRegistry.addName(Power_hoe, "Power Hoe"); //Power Hoe
    LanguageRegistry.addName(Power_sword, "Power Sword"); //Power Sword    
  

    //Textures
     //Blocks
     //Items
     //ToolSets

    //Recipes
     //Power-Circuits Recipe    
     GameRegistry.addRecipe(new ItemStack(Power-Circuits, 1), new Object[] {"ACA" , "C C" , "ACA" ,
       'A', mod_.Power-Ore
       , 'B', mod_.Power-Circuits   , 'C', mod_.PowerStone});
     //PowerBlock Recipe    
     GameRegistry.addRecipe(new ItemStack(PowerBlock, 1), new Object[] {"BDB" , "CAC" , " D " ,
       'A', mod_.Power-Ore
       , 'B', mod_.PowerStone   , 'C', Block.oreGold   , 'D', Block.blockDiamond});
    //TXPPower Pickaxe Recipe    
    GameRegistry.addRecipe(new ItemStack(TXPPower_pickaxe, 1), new Object []{ "yyy" , " z " , " z " ,
      Character.valueOf('y'), 
      , Character.valueOf('z'), Item.stick });
    //TXPPower Shovel Recipe    
    GameRegistry.addRecipe(new ItemStack(TXPPower_shovel, 1), new Object []{ " y " , " z " , " z " ,
      Character.valueOf('y'), 
      , Character.valueOf('z'), Item.stick });
    //TXPPower Axe Recipe    
    GameRegistry.addRecipe(new ItemStack(TXPPower_axe, 1), new Object []{ "yy " , "yz " , " z " ,
      Character.valueOf('y'), 
      , Character.valueOf('z'), Item.stick });
    //TXPPower Hoe Recipe    
    GameRegistry.addRecipe(new ItemStack(TXPPower_hoe, 1), new Object []{ "yy " , " z " , " z " ,
      Character.valueOf('y'), 
      , Character.valueOf('z'), Item.stick });
    //TXPPower Sword Recipe    
    GameRegistry.addRecipe(new ItemStack(TXPPower_sword, 1), new Object []{ " y " , " y " , " z " ,
      Character.valueOf('y'), 
      , Character.valueOf('z'), Item.stick });
    //Power Pickaxe Recipe    
    GameRegistry.addRecipe(new ItemStack(Power_pickaxe, 1), new Object []{ "yyy" , " z " , " z " ,
      Character.valueOf('y'), 
      , Character.valueOf('z'), Item.stick });
    //Power Shovel Recipe    
    GameRegistry.addRecipe(new ItemStack(Power_shovel, 1), new Object []{ " y " , " z " , " z " ,
      Character.valueOf('y'), 
      , Character.valueOf('z'), Item.stick });
    //Power Axe Recipe    
    GameRegistry.addRecipe(new ItemStack(Power_axe, 1), new Object []{ "yy " , "yz " , " z " ,
      Character.valueOf('y'), 
      , Character.valueOf('z'), Item.stick });
    //Power Hoe Recipe    
    GameRegistry.addRecipe(new ItemStack(Power_hoe, 1), new Object []{ "yy " , " z " , " z " ,
      Character.valueOf('y'), 
      , Character.valueOf('z'), Item.stick });
    //Power Sword Recipe    
    GameRegistry.addRecipe(new ItemStack(Power_sword, 1), new Object []{ " y " , " y " , " z " ,
      Character.valueOf('y'), 
      , Character.valueOf('z'), Item.stick });
    //TXPArmorL Helmet Recipe
    GameRegistry.addRecipe(new ItemStack (TXPArmor_helmet, 1), (new Object[] {"XXX", "X  X","   ", 
      'X', mod_TXPMCPowerSurge.PowerStone}));
    //TXPArmorL Chestplate Recipe
    GameRegistry.addRecipe(new ItemStack (TXPArmor_chestplate, 1), (new Object[] {"X X", "XXX","XXX", 
      'X', mod_TXPMCPowerSurge.PowerStone}));
    //TXPArmorL Legs Recipe
    GameRegistry.addRecipe(new ItemStack (TXPArmor_legs, 1), (new Object[] {"XXX", "X  X","X X", 
      'X', mod_TXPMCPowerSurge.PowerStone}));
    //TXPArmorL Boots Recipe
    GameRegistry.addRecipe(new ItemStack (TXPArmor_boots, 1), (new Object[] {"X X", "X  X","   ", 
      'X', mod_TXPMCPowerSurge.PowerStone})); 
    //PowerL Helmet Recipe
    GameRegistry.addRecipe(new ItemStack (Power_helmet, 1), (new Object[] {"XXX", "X  X","   ", 
      'X', mod_TXPMCPowerSurge.Power-Circuits}));
    //PowerL Chestplate Recipe
    GameRegistry.addRecipe(new ItemStack (Power_chestplate, 1), (new Object[] {"X X", "XXX","XXX", 
      'X', mod_TXPMCPowerSurge.Power-Circuits}));
    //PowerL Legs Recipe
    GameRegistry.addRecipe(new ItemStack (Power_legs, 1), (new Object[] {"XXX", "X  X","X X", 
      'X', mod_TXPMCPowerSurge.Power-Circuits}));
    //PowerL Boots Recipe
    GameRegistry.addRecipe(new ItemStack (Power_boots, 1), (new Object[] {"X X", "X  X","   ", 
      'X', mod_TXPMCPowerSurge.Power-Circuits})); 

    //Furnace Recipes
      //Power-Ore Smelting Recipe
      GameRegistry.addSmelting(Power-Ore.blockID, new ItemStack(Block.blockDiamond, 9), 0.2F ); 
  
      //PowerBlock Smelting Recipe
      GameRegistry.addSmelting(PowerBlock.blockID, new ItemStack(mod_.PowerStone, 3), 0.2F ); 
  
      //PowerStone Smelting Recipe
      GameRegistry.addSmelting(PowerStone.itemID, new ItemStack (mod_.Power-Ore, 9), 0.2F );
  
      //PowerArrow Smelting Recipe
      GameRegistry.addSmelting(PowerArrow.itemID, new ItemStack (mod_.PowerStone, 3), 0.2F );
  
  }

}
