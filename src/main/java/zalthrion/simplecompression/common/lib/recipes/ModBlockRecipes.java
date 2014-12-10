package zalthrion.simplecompression.common.lib.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import zalthrion.simplecompression.common.SimpleCompression;
import zalthrion.simplecompression.common.lib.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import java.util.List;

public class ModBlockRecipes {
	
	public static final ItemStack Compressed_ObsidianStack = new ItemStack(ModBlocks.Compressed_Obsidian);
	
	public static final ItemStack Compressed_CobblestoneStack = new ItemStack(ModBlocks.Compressed_Cobblestone);
	
	public static final ItemStack Compressed_StoneStack = new ItemStack(ModBlocks.Compressed_Stone);
	
	public static final ItemStack Compressed_SandStack = new ItemStack(ModBlocks.Compressed_Sand);
	
	public static final ItemStack Compressed_GravelStack = new ItemStack(ModBlocks.Compressed_Gravel);
	
	public static final ItemStack Compressed_DirtStack = new ItemStack(ModBlocks.Compressed_Dirt);

	public static final ItemStack Compressed_DiamondBlockStack = new ItemStack(ModBlocks.Compressed_DiamondBlock);
	
	public static final ItemStack Compressed_EmeraldBlockStack = new ItemStack(ModBlocks.Compressed_EmeraldBlock);
	
	public static final ItemStack Compressed_IronBlockStack = new ItemStack(ModBlocks.Compressed_IronBlock);
	
	public static final ItemStack Compressed_GoldBlockStack = new ItemStack(ModBlocks.Compressed_GoldBlock);
	
	public static final ItemStack Compressed_LapisBlockStack = new ItemStack(ModBlocks.Compressed_LapisBlock);
	
	public static final ItemStack Compressed_SandstoneStack = new ItemStack(ModBlocks.Compressed_Sandstone);
	
	public static final ItemStack Compressed_RedstoneBlockStack = new ItemStack(ModBlocks.Compressed_RedstoneBlock);
	
	public static final ItemStack Compressed_QuartzBlockStack = new ItemStack(ModBlocks.Compressed_QuartzBlock);
	
	public static final ItemStack Compressed_NetherrackStack = new ItemStack(ModBlocks.Compressed_Netherrack);
	
	
    public static void init() {
    	registerShapelessRecipes();
        registerShapedRecipes();
        
    }

    private static void registerShapelessRecipes() {
    	
    GameRegistry.addShapelessRecipe(new ItemStack(Block.obsidian, 9), ModBlocks.Compressed_Obsidian);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone, 9), ModBlocks.Compressed_Cobblestone);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.stone, 9), ModBlocks.Compressed_Stone);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.sand, 9), ModBlocks.Compressed_Sand);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.gravel, 9), ModBlocks.Compressed_Gravel);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.dirt, 9), ModBlocks.Compressed_Dirt);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.blockDiamond, 9), ModBlocks.Compressed_DiamondBlock);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.blockEmerald, 9), ModBlocks.Compressed_EmeraldBlock);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.blockIron, 9), ModBlocks.Compressed_IronBlock);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.blockGold, 9), ModBlocks.Compressed_GoldBlock);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.blockLapis, 9), ModBlocks.Compressed_LapisBlock);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.sandStone, 9), ModBlocks.Compressed_Sandstone);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.blockRedstone, 9), ModBlocks.Compressed_RedstoneBlock);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.blockNetherQuartz, 9), ModBlocks.Compressed_QuartzBlock);
    
    GameRegistry.addShapelessRecipe(new ItemStack(Block.netherrack, 9), ModBlocks.Compressed_Netherrack);
    
    	
    }
    
    private static void registerShapedRecipes() {
    	
    //Obsidian
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_Obsidian, 1), "BBB", "BBB", "BBB", 'B', Block.obsidian);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_Cobblestone, 1), "BBB", "BBB", "BBB", 'B', Block.cobblestone);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_Stone, 1), "BBB", "BBB", "BBB", 'B', Block.stone);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_Sand, 1), "BBB", "BBB", "BBB", 'B', Block.sand);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_Gravel, 1), "BBB", "BBB", "BBB", 'B', Block.gravel);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_Dirt, 1), "BBB", "BBB", "BBB", 'B', Block.dirt);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_DiamondBlock, 1), "BBB", "BBB", "BBB", 'B', Block.blockDiamond);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_EmeraldBlock, 1), "BBB", "BBB", "BBB", 'B', Block.blockEmerald);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_IronBlock, 1), "BBB", "BBB", "BBB", 'B', Block.blockIron);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_GoldBlock, 1), "BBB", "BBB", "BBB", 'B', Block.blockGold);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_LapisBlock, 1), "BBB", "BBB", "BBB", 'B', Block.blockLapis);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_Sandstone, 1), "BBB", "BBB", "BBB", 'B', Block.sandStone);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_RedstoneBlock, 1), "BBB", "BBB", "BBB", 'B', Block.blockRedstone);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_QuartzBlock, 1), "BBB", "BBB", "BBB", 'B', Block.blockNetherQuartz);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Compressed_Netherrack, 1), "BBB", "BBB", "BBB", 'B', Block.netherrack);

    }

}