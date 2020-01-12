package com.shnupbups.lepton;

import blue.endless.jankson.JsonObject;
import blue.endless.jankson.JsonPrimitive;

public abstract class LeptonModule {
	private boolean enabled = true;
	
	public abstract void init();
	
	public final boolean isEnabled() {
		return enabled;
	}
	
	public final void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public final void setEnabled(JsonObject obj) {
		setEnabled(obj.getBoolean("enabled", true));
	}
	
	public void configure(JsonObject obj) {}
	
	public final JsonObject getConfig() {
		JsonObject obj = new JsonObject();
		obj.put("enabled", new JsonPrimitive(isEnabled()));
		writeToConfig(obj);
		return obj;
	}
	
	public void writeToConfig(JsonObject obj) {}
}
