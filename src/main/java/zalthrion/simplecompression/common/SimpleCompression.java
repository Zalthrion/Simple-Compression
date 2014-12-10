package zalthrion.simplecompression.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import zalthrion.simplecompression.common.lib.*;
import zalthrion.simplecompression.common.lib.recipes.ModBlockRecipes;
import zalthrion.simplecompression.common.SimpleCompressionCommonProxy;
import zalthrion.simplecompression.common.blocks.Compressed_Obsidian;
import zalthrion.simplecompression.common.blocks.Compressed_Cobblestone;
import zalthrion.simplecompression.common.handlers.SimpleCompressionServerPacketHandler;
import zalthrion.simplecompression.common.handlers.SimpleCompressionClientPacketHandler;


@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed

clientPacketHandlerSpec = @SidedPacketHandler(channels = {"EasyCompression"}, packetHandler = SimpleCompressionClientPacketHandler.class), //For clientside packet handling

serverPacketHandlerSpec = @SidedPacketHandler(channels = {"EasyCompression"}, packetHandler = SimpleCompressionServerPacketHandler.class)) //For serverside packet handling


//MOD BASICS

@Mod(modid="SimpleCompression",name="Simple Compression",version="Alpha")


public class SimpleCompression {


@Instance("SimpleCompression") //The instance, this is very important later on

public static SimpleCompression instance ;


@SidedProxy(clientSide = "zalthrion.simplecompression.client.SimpleCompressionClientProxy", serverSide = "zalthrion.simplecompression.common.SimpleCompressionCommonProxy") //Tells Forge the location of your proxies

public static SimpleCompressionCommonProxy proxy;


//Creative Tabs

//Simple Compression

public static CreativeTabs Simple_Compression = new CreativeTabs("Simple Compression") {

    public ItemStack getIconItemStack() {

        return new ItemStack(ModBlocks.Compressed_Obsidian, 1, 0);
    }
};

@EventHandler

public void PreInit(FMLPreInitializationEvent e){
	
ModBlocks.init();

}


@EventHandler

public void InitSimpleCompression(FMLInitializationEvent event){ //Your main initialization method
	
ModBlockRecipes.init();

//Simple Compression

LanguageRegistry.instance().addStringLocalization("itemGroup.Simple Compression", "en_US", "Simple Compression");

//BLOCKS (METHOD)

proxy.registerBlocks(); //Calls the registerBlocks method


//ITEMS (METHOD)

proxy.registerItems(); //Calls the RegisterItems method


//MULTIPLAYER ABILITY

//	NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data


}


}