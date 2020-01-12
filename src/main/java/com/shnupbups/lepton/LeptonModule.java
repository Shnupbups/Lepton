package com.shnupbups.lepton;

public abstract class LeptonModule {
	public abstract void init();
	
	public boolean isEnabled() {
		return true;
	}
}
