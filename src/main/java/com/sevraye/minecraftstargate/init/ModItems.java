package com.sevraye.minecraftstargate.init;

import com.sevraye.minecraftstargate.item.*;
import com.sevraye.minecraftstargate.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModItems
{
    public static final ItemMCSG mapleLeaf = new ItemMapleLeaf();
    public static final ItemMCSG stargateMilkyWayChevron = new ItemMilkyWayChevron();
    public static final ItemMCSG stargatePegasusChevron = new ItemPegasusChevron();
    public static final ItemMCSG stargateUniverseChevron = new ItemUniverseChevron();
    public static final ItemMCSG naquadahIngot = new ItemNaquadahIngot();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(stargateMilkyWayChevron, "stargateMilkWayChevron");
        GameRegistry.registerItem(stargatePegasusChevron, "stargatePegasusChevron");
        GameRegistry.registerItem(stargateUniverseChevron, "stargateUniverseChevron");
        GameRegistry.registerItem(naquadahIngot, "naquadahIngot");
    }
}
