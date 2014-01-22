package redstoneGlassMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = RedstoneGlassMod.modId, name = "RedstoneGlass", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class RedstoneGlassMod{
    public static final String modId = "krizzmp_RedstoneGlassMod";

    public static Block redstoneGlassBlock;

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        redstoneGlassBlock = new BlockRedstoneGlass(500, Material.glass, false).setUnlocalizedName("redstoneGlassBlock");

        GameRegistry.registerBlock(redstoneGlassBlock, modId + redstoneGlassBlock.getUnlocalizedName().substring(5));

        LanguageRegistry.addName(redstoneGlassBlock, "Redstone Glass");
    }
}

