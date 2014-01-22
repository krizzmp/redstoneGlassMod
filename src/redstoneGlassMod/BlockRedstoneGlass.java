package redstoneGlassMod;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRedstoneGlass extends BlockBreakable {
    public BlockRedstoneGlass(int id, Material material, boolean active) {
        super(id,"glass",material,active);
        setCreativeTab(CreativeTabs.tabBlock);

    }
}
