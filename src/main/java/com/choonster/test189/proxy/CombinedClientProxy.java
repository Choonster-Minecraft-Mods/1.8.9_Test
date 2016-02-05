package com.choonster.test189.proxy;

import com.choonster.test189.client.model.ModModelManager;

/**
 * The client proxy.
 *
 * @author Choonster
 */
public class CombinedClientProxy implements IProxy {

	@Override
	public void preInit() {
		ModModelManager.registerModels();
	}

	@Override
	public void init() {

	}

	@Override
	public void postInit() {

	}
}
