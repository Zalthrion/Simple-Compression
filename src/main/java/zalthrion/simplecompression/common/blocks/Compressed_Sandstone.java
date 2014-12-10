package zalthrion.simplecompression.common.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;


public class Compressed_Sandstone extends Block
{
    public static final String[] SAND_STONE_TYPES = new String[] {"default"};
    private static final String[] field_94405_b = new String[] {"normal"};
	private boolean blockType;
    @SideOnly(Side.CLIENT)
    private Icon[] field_94406_c;
    @SideOnly(Side.CLIENT)
    private Icon field_94403_cO;
    @SideOnly(Side.CLIENT)
    private Icon field_94404_cP;
	 
	 
	public Compressed_Sandstone(int par1)
    {
        super(par1, Material.rock); //You can set different materials, check them out!
    }
	
    public Icon getIcon(int par1, int par2)
    {
        if (par1 != 1 && (par1 != 0 || par2 != 1 && par2 != 2))
        {
            if (par1 == 0)
            {
                return this.field_94404_cP;
            }
            else
            {
                if (par2 < 0 || par2 >= this.field_94406_c.length)
                {
                    par2 = 0;
                }

                return this.field_94406_c[par2];
            }
        }
        else
        {
            return this.field_94403_cO;
        }
    }
	
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.field_94406_c = new Icon[field_94405_b.length];

        for (int i = 0; i < this.field_94406_c.length; ++i)
        {
            this.field_94406_c[i] = par1IconRegister.registerIcon("sandstone_normal");
        }

        this.field_94403_cO = par1IconRegister.registerIcon("sandstone_top");
        this.field_94404_cP = par1IconRegister.registerIcon("sandstone_bottom");
    }
}
