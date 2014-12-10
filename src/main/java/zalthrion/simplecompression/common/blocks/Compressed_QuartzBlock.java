package zalthrion.simplecompression.common.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;


public class Compressed_QuartzBlock extends Block
{
    public static final String[] quartzBlockTypes = new String[] {"default"};
    private static final String[] quartzBlockTextureTypes = new String[] {"side", null, null};
    @SideOnly(Side.CLIENT)
    private Icon[] quartzblockIcons;
    @SideOnly(Side.CLIENT)
    private Icon quartzblock_top;
    @SideOnly(Side.CLIENT)
    private Icon quartzblock_bottom;
	
	
	public Compressed_QuartzBlock(int par1)
    {
        super(par1, Material.rock); //You can set different materials, check them out!
    }
	
    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        if (par2 != 2 && par2 != 3 && par2 != 4)
        {
            if (par1 != 1 && (par1 != 0 || par2 != 1))
            {
                if (par1 == 0)
                {
                    return this.quartzblock_bottom;
                }
                else
                {
                    if (par2 < 0 || par2 >= this.quartzblockIcons.length)
                    {
                        par2 = 0;
                    }

                    return this.quartzblockIcons[par2];
                }
            }
        }
		return quartzblock_bottom;
    }
	
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.quartzblockIcons = new Icon[quartzBlockTextureTypes.length];

        for (int i = 0; i < this.quartzblockIcons.length; ++i)
        {
            if (quartzBlockTextureTypes[i] == null)
            {
                this.quartzblockIcons[i] = this.quartzblockIcons[i - 1];
            }
            else
            {
                this.quartzblockIcons[i] = par1IconRegister.registerIcon("quartz_block_side");
            }
        }

        this.quartzblock_top = par1IconRegister.registerIcon("quartz_block_top");
        this.quartzblock_bottom = par1IconRegister.registerIcon("quartz_block_bottom");
    }
}
