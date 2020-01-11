package com.shnupbups.lepton;

import net.minecraft.util.Identifier;

public abstract class LeptonModule {
	private final String type;
	LeptonModule(String type) {
		this.type=type;
	}
	protected LeptonModule() {
		this("Module");
	}
	public final void init() {
		if(isEnabled()) {
			Lepton.log("Loading Lepton "+type+" "+getID());
			addStuff();
		} else Lepton.log("Lepton "+type+" "+getID()+" is disabled");
	}
	protected abstract void addStuff();
	public abstract String getName();
	public Identifier getID() {
		return Lepton.id(getName());
	}
	public boolean isEnabled() {
		return true;
	}
}
