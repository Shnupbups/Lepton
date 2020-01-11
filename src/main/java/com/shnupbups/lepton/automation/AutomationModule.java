package com.shnupbups.lepton.automation;

import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.automation.features.EnderWatcherFeature;
import com.shnupbups.lepton.automation.features.WeatherSensorFeature;

public class AutomationModule extends LeptonModule {
	public static final AutomationModule INSTANCE = new AutomationModule();
	
	public static final AutomationFeature ENDER_WATCHER = EnderWatcherFeature.INSTANCE;
	public static final AutomationFeature WEATHER_SENSOR = WeatherSensorFeature.INSTANCE;
	
	@Override
	protected void addStuff() {
		ENDER_WATCHER.init();
		WEATHER_SENSOR.init();
	}
	
	@Override
	public String getName() {
		return "automation";
	}
}
