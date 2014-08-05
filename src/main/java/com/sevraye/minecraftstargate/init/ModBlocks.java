package com.sevraye.minecraftstargate.init;

import com.sevraye.minecraftstargate.block.BlockFlag;
import com.sevraye.minecraftstargate.block.BlockMCSG;
import com.sevraye.minecraftstargate.block.BlockNaquadahOre;
import com.sevraye.minecraftstargate.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModBlocks
{
    public static final BlockMCSG flag = new BlockFlag();
    public static final BlockMCSG naquadahOre = new BlockNaquadahOre();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(naquadahOre, "naquadahOre");
    }
}
