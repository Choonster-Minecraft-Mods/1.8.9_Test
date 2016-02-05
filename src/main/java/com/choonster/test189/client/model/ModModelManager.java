package com.choonster.test189.client.model;

import com.choonster.test189.init.ModBlocks;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Manages block and item models for this mod.
 *
 * @author Choonster
 */
public class ModModelManager {
	public static void registerModels() {
		registerBlockModels();
	}

	private static void registerBlockModels() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.testBlock), 0, new ModelResourceLocation(ModBlocks.testBlock.getRegistryName(), "inventory"));
	}
}
