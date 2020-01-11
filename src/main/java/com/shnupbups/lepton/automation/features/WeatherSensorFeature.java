package com.shnupbups.lepton.automation.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.automation.AutomationFeature;
import com.shnupbups.lepton.automation.block.WeatherSensorBlock;
import com.shnupbups.lepton.automation.block.entity.WeatherSensorBlockEntity;

public class WeatherSensorFeature extends AutomationFeature {
	public static final WeatherSensorFeature INSTANCE = new WeatherSensorFeature();
	
	public static final Block WEATHER_SENSOR = new WeatherSensorBlock(FabricBlockSettings.copy(Blocks.DAYLIGHT_DETECTOR).build());
	
	public static final BlockEntityType<WeatherSensorBlockEntity> WEATHER_SENSOR_BE_TYPE = BlockEntityType.Builder.create(WeatherSensorBlockEntity::new, WEATHER_SENSOR).build(null);
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(WEATHER_SENSOR, "weather_sensor", new Item.Settings().group(ItemGroup.REDSTONE));
		Registry.register(Registry.BLOCK_ENTITY, Lepton.id("weather_sensor"), WEATHER_SENSOR_BE_TYPE);
	}
	
	@Override
	public String getName() {
		return "weather_sensor";
	}
}
