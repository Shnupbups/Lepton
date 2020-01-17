package com.shnupbups.lepton.misc;

import blue.endless.jankson.Jankson;
import blue.endless.jankson.JsonGrammar;
import blue.endless.jankson.JsonObject;
import blue.endless.jankson.api.SyntaxError;
import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class LeptonConfig {
	private static final Jankson JANKSON = Jankson.builder().build();
	
	public static void load() {
		File configFile = new File("config/lepton.json5");
		JsonObject config = new JsonObject();
		if(configFile.exists()) {
			try {
				config = JANKSON.load(configFile);
				loadFrom(config);
				writeConfigFile(configFile, config);
			} catch (IOException | SyntaxError e) {
				Lepton.LOGGER.error("Lepton config could not be loaded. Default values will be used.", e);
			}
		} else {
			saveTo(config);
			writeConfigFile(configFile, config);
		}
	}
	
	private static void writeConfigFile(File file, JsonObject config) {
		saveTo(config);
		try(OutputStream out = new BufferedOutputStream(new FileOutputStream(file))) {
			out.write(config.toJson(JsonGrammar.JANKSON).getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			Lepton.LOGGER.error("Lepton config could not be written. This probably won't cause any problems, but it shouldn't happen.", e);
		}
	}
	
	public static void loadFrom(JsonObject obj) {
		for(LeptonModule module : Lepton.MODULES) {
			JsonObject moduleConfig = getObjectOrEmpty(Lepton.MODULES.getId(module).toString(), obj);
			module.setEnabled(moduleConfig);
			module.configure(moduleConfig);
		}
	}
	
	public static void saveTo(JsonObject obj) {
		for(LeptonModule module : Lepton.MODULES) {
			JsonObject moduleConfig = module.getConfig();
			obj.put(Lepton.MODULES.getId(module).toString(), moduleConfig);
		}
	}
	
	public static JsonObject getObjectOrEmpty(String key, JsonObject on) {
		JsonObject obj = on.getObject(key);
		return obj != null ? obj : new JsonObject();
	}
}
