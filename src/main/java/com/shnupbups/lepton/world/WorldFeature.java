package com.shnupbups.lepton.world;

import com.shnupbups.lepton.LeptonFeature;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.building.BuildingModule;

public abstract class WorldFeature extends LeptonFeature {
	@Override
	public LeptonModule getModule() {
		return WorldModule.INSTANCE;
	}
}
