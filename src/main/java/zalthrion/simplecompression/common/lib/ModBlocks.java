package zalthrion.simplecompression.common.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import zalthrion.simplecompression.common.SimpleCompression;
import zalthrion.simplecompression.common.blocks.*;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.block.material.*;

import java.util.List;

public class ModBlocks {

	//Compressed Blocks
	
	//STONE
	
	public static final Block Compressed_Obsidian = new Compressed_Obsidian(3400).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Compressed_Obsidian").setCreativeTab(SimpleCompression.Simple_Compression).setResistance(2000.0F).setTextureName("obsidian");
	
	public static final Block Compressed_Cobblestone = new Compressed_Cobblestone(3401).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Compressed_Cobblestone").setCreativeTab(SimpleCompression.Simple_Compression).setResistance(10.0F).setTextureName("cobblestone");	
	
	public static final Block Compressed_Stone = new Compressed_Stone(3402).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Compressed_Stone").setCreativeTab(SimpleCompression.Simple_Compression).setResistance(12.0F).setTextureName("stone");
	
	public static final Block Compressed_Sand = new Compressed_Sand(3403).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setUnlocalizedName("Compressed_Sand").setCreativeTab(SimpleCompression.Simple_Compression).setTextureName("sand");
	
	public static final Block Compressed_Gravel = new Compressed_Gravel(3404).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("Compressed_Gravel").setCreativeTab(SimpleCompression.Simple_Compression).setTextureName("gravel");
	
	public static final Block Compressed_Dirt = new Compressed_Dirt(3405).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("Compressed_Dirt").setCreativeTab(SimpleCompression.Simple_Compression).setTextureName("dirt");
	
	public static final Block Compressed_DiamondBlock = new Compressed_DiamondBlock(3406).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("Compressed_DiamondBlock").setCreativeTab(SimpleCompression.Simple_Compression).setResistance(10.0F).setTextureName("diamond_block");
	
	public static final Block Compressed_EmeraldBlock = new Compressed_EmeraldBlock(3407).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("Compressed_EmeraldBlock").setCreativeTab(SimpleCompression.Simple_Compression).setResistance(10.0F).setTextureName("emerald_block");
	
	public static final Block Compressed_IronBlock = new Compressed_IronBlock(3408).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("Compressed_IronBlock").setCreativeTab(SimpleCompression.Simple_Compression).setResistance(10.0F).setTextureName("iron_block");
	
	public static final Block Compressed_GoldBlock = new Compressed_GoldBlock(3409).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("Compressed_GoldBlock").setCreativeTab(SimpleCompression.Simple_Compression).setResistance(10.0F).setTextureName("gold_block");
	
	public static final Block Compressed_LapisBlock = new Compressed_LapisBlock(3410).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Compressed_LapisBlock").setCreativeTab(SimpleCompression.Simple_Compression).setResistance(5.0F).setTextureName("lapis_block");
	
	public static final Block Compressed_Sandstone = new Compressed_Sandstone(3411).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Compressed_Stone").setCreativeTab(SimpleCompression.Simple_Compression).setResistance(12.0F);
	
	public static final Block Compressed_RedstoneBlock = new Compressed_RedstoneBlock(3412).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("Compressed_RedstoneBlock").setCreativeTab(SimpleCompression.Simple_Compression).setResistance(10.0F).setTextureName("redstone_block");
	
	public static final Block Compressed_QuartzBlock = new Compressed_QuartzBlock(3413).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Compressed_QuartzBlock").setCreativeTab(SimpleCompression.Simple_Compression).setResistance(10.0F).setTextureName("quartz_block");
	
	public static final Block Compressed_Netherrack = new Compressed_Netherrack(3414).setHardness(0.4F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Compressed_Netherrack").setCreativeTab(SimpleCompression.Simple_Compression).setTextureName("netherrack");
	
	
	 public static void init() {
	
		 registerCompressedBlocks();
		 
	 }
	 
	 public static void registerCompressedBlocks(){
		 
		 //Stone
		 
		 GameRegistry.registerBlock(Compressed_Obsidian, Names.CObsidian); //Register
		 MinecraftForge.setBlockHarvestLevel(Compressed_Obsidian, "pickaxe", 3); //Properties of the Block
		 LanguageRegistry.addName(ModBlocks.Compressed_Obsidian, "Compressed Obsidian"); //Name Registering
		 
		 GameRegistry.registerBlock(Compressed_Cobblestone, Names.CCobblestone);
		 MinecraftForge.setBlockHarvestLevel(Compressed_Cobblestone, "pickaxe", 0);
		 LanguageRegistry.addName(ModBlocks.Compressed_Cobblestone, "Compressed Cobblestone");
		 
		 GameRegistry.registerBlock(Compressed_Stone, Names.CStone);
		 MinecraftForge.setBlockHarvestLevel(Compressed_Stone, "pickaxe", 0);
		 LanguageRegistry.addName(ModBlocks.Compressed_Stone, "Compressed Stone");
		 
		 GameRegistry.registerBlock(Compressed_Sandstone, Names.CSandstone);
		 MinecraftForge.setBlockHarvestLevel(Compressed_Sandstone, "pickaxe", 0);
		 LanguageRegistry.addName(ModBlocks.Compressed_Sandstone, "Compressed Sandstone");
		 
		 GameRegistry.registerBlock(Compressed_Netherrack, Names.CNetherrack);
		 MinecraftForge.setBlockHarvestLevel(Compressed_Netherrack, "pickaxe", 0);
		 LanguageRegistry.addName(ModBlocks.Compressed_Netherrack, "Compressed Netherrack");
		 
		 
		 //Gravel
		 
		 GameRegistry.registerBlock(Compressed_Sand, Names.CSand);
		 MinecraftForge.setBlockHarvestLevel(Compressed_Sand, "shovel", 0);
		 LanguageRegistry.addName(ModBlocks.Compressed_Sand, "Compressed Sand");
		 
		 GameRegistry.registerBlock(Compressed_Gravel, Names.CGravel);
		 MinecraftForge.setBlockHarvestLevel(Compressed_Gravel, "shovel", 0);
		 LanguageRegistry.addName(ModBlocks.Compressed_Gravel, "Compressed Gravel");
		 
		 GameRegistry.registerBlock(Compressed_Dirt, Names.CDirt);
		 MinecraftForge.setBlockHarvestLevel(Compressed_Dirt, "shovel", 0);
		 LanguageRegistry.addName(ModBlocks.Compressed_Dirt, "Compressed Dirt");
		 
		 
		 //Metals
		 
		 GameRegistry.registerBlock(Compressed_DiamondBlock, Names.CDiamondBlock);
		 MinecraftForge.setBlockHarvestLevel(Compressed_DiamondBlock, "pickaxe", 2);
		 LanguageRegistry.addName(ModBlocks.Compressed_DiamondBlock, "Compressed Diamond Block");
		 
		 GameRegistry.registerBlock(Compressed_EmeraldBlock, Names.CEmeraldBlock);
		 MinecraftForge.setBlockHarvestLevel(Compressed_EmeraldBlock, "pickaxe", 2);
		 LanguageRegistry.addName(ModBlocks.Compressed_EmeraldBlock, "Compressed Emerald Block");
		 
		 GameRegistry.registerBlock(Compressed_IronBlock, Names.CIronBlock);
		 MinecraftForge.setBlockHarvestLevel(Compressed_IronBlock, "pickaxe", 1);
		 LanguageRegistry.addName(ModBlocks.Compressed_IronBlock, "Compressed Iron Block");
		 
		 GameRegistry.registerBlock(Compressed_GoldBlock, Names.CGoldBlock);
		 MinecraftForge.setBlockHarvestLevel(Compressed_GoldBlock, "pickaxe", 2);
		 LanguageRegistry.addName(ModBlocks.Compressed_GoldBlock, "Compressed Gold Block");
		 
		 GameRegistry.registerBlock(Compressed_LapisBlock, Names.CLapisBlock);
		 MinecraftForge.setBlockHarvestLevel(Compressed_LapisBlock, "pickaxe", 1);
		 LanguageRegistry.addName(ModBlocks.Compressed_LapisBlock, "Compressed Lapis Lazuli Block");
		 
		 GameRegistry.registerBlock(Compressed_RedstoneBlock, Names.CRedstoneBlock);
		 MinecraftForge.setBlockHarvestLevel(Compressed_RedstoneBlock, "pickaxe", 0);
		 LanguageRegistry.addName(ModBlocks.Compressed_RedstoneBlock, "Compressed Redstone Block");
		 
		 GameRegistry.registerBlock(Compressed_QuartzBlock, Names.CQuartzBlock);
		 MinecraftForge.setBlockHarvestLevel(Compressed_QuartzBlock, "pickaxe", 0);
		 LanguageRegistry.addName(ModBlocks.Compressed_QuartzBlock, "Compressed Quartz Block");
		 
		 
	 }
	
	 
	 public static class Names {
		 
		 //Stone
		 
		 public static final String CObsidian = "Compressed_Obsidian";
		 
		 public static final String CCobblestone = "Compressed_Cobblestone";
		 
		 public static final String CStone = "Compressed_Stone";
		 
		 public static final String CSandstone = "Compressed_Sandstone";
		 
		 public static final String CNetherrack = "Compressed_Netherrack";
		
		 
		 //Gravel
		 
		 public static final String CSand = "Compressed_Sand";
		 
		 public static final String CGravel = "Compressed_Gravel";
		 
		 public static final String CDirt = "Compressed_Dirt";
		 
		 
		 //Metals
		 
		 public static final String CDiamondBlock = "Compressed_DiamondBlock";
		 
		 public static final String CEmeraldBlock = "Compressed_EmeraldBlock";
		 
		 public static final String CIronBlock = "Compressed_IronBlock";
		 
		 public static final String CGoldBlock = "Compressed_GoldBlock";
		 
		 public static final String CLapisBlock = "Compressed_LapisBlock";
		 
		 public static final String CRedstoneBlock = "Compressed_RedstoneBlock";
		 
		 public static final String CQuartzBlock = "Compressed_QuartzBlock";
		  
	 }

}
