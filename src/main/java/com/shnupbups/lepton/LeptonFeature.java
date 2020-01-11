package com.shnupbups.lepton;

import net.minecraft.util.Identifier;

public abstract class LeptonFeature extends LeptonModule {
	LeptonFeature(String type) {
		super(type);
	}
	protected LeptonFeature() {
		this("Feature");
	}
	public abstract LeptonModule getModule();
	@Override
	public Identifier getID() {
		return new Identifier(getModule().getID().getNamespace()+"_"+getModule().getName(), getName());
	}
	@Override
	public boolean isEnabled() {
		return getModule().isEnabled();
	}
}
