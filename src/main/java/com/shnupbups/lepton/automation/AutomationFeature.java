package com.shnupbups.lepton.automation;

import com.shnupbups.lepton.LeptonFeature;
import com.shnupbups.lepton.LeptonModule;

public abstract class AutomationFeature extends LeptonFeature {
	@Override
	public LeptonModule getModule() {
		return AutomationModule.INSTANCE;
	}
}
