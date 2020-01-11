package com.shnupbups.lepton.building;

import com.shnupbups.lepton.LeptonFeature;
import com.shnupbups.lepton.LeptonModule;

public abstract class BuildingFeature extends LeptonFeature {
	@Override
	public LeptonModule getModule() {
		return BuildingModule.INSTANCE;
	}
}
