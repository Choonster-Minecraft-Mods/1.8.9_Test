package com.choonster.test189;

import com.choonster.test189.init.ModBlocks;
import com.choonster.test189.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * A simple test mod for 1.8.9 demonstrating the basic structure of a mod and how to add a block.
 *
 * Test for this thread:
 * http://www.minecraftforge.net/forum/index.php/topic,36539.0.html
 *
 * @author Choonster
 */
@Mod(modid = Test189.MODID)
public class Test189 {
	public static final String MODID = "test189";

	@SidedProxy(clientSide = "com.choonster.test189.proxy.CombinedClientProxy", serverSide = "com.choonster.test189.proxy.DedicatedServerProxy")
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.registerBlocks();

		proxy.preInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}
}
