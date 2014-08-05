package com.sevraye.minecraftstargate.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        /*
        GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));
        */
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stargateMilkyWayChevron), "nnn", "nrn", " n ", 'n', ModItems.naquadahIngot, 'r', Items.redstone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stargatePegasusChevron), "nnn", "ndn", " n ", 'n', ModItems.naquadahIngot, 'd', Items.diamond));
        GameRegistry.addSmelting(new ItemStack(ModBlocks.naquadahOre), new ItemStack(ModItems.naquadahIngot), 0);
    }
}
