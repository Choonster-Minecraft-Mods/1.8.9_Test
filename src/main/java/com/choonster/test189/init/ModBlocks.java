package com.choonster.test189.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Initialises and registers this mod's blocks.
 *
 * @author Choonster
 */
public class ModBlocks {
	public static Block testBlock;

	public static void registerBlocks() {
		testBlock = GameRegistry.registerBlock(new Block(Material.iron).setRegistryName("testBlock").setCreativeTab(CreativeTabs.tabBlock));
		testBlock.setUnlocalizedName(testBlock.getRegistryName());
	}
}
