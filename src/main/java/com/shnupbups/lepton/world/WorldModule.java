package com.shnupbups.lepton.world;

import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.world.feature.NewStoneTypesFeature;

public class WorldModule extends LeptonModule {
	public static final WorldModule INSTANCE = new WorldModule();
	
	public static final WorldFeature NEW_STONE_TYPES = NewStoneTypesFeature.INSTANCE;
	
	@Override
	protected void addStuff() {
		NEW_STONE_TYPES.init();
	}
	
	@Override
	public String getName() {
		return "world";
	}
}
