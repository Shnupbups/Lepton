package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.WeatherSensorBlock;
import com.shnupbups.lepton.block.entity.WeatherSensorBlockEntity;

public class WeatherSensorModule extends LeptonModule {
	public static final WeatherSensorModule INSTANCE = new WeatherSensorModule();
	
	public static final Block WEATHER_SENSOR = new WeatherSensorBlock(FabricBlockSettings.copyOf(Blocks.DAYLIGHT_DETECTOR));
	
	public static final BlockEntityType<WeatherSensorBlockEntity> WEATHER_SENSOR_BE_TYPE = BlockEntityType.Builder.create(WeatherSensorBlockEntity::new, WEATHER_SENSOR).build(null);
	
	@Override
	public void init() {
		Lepton.registerBlock(WEATHER_SENSOR, "weather_sensor", new Item.Settings().group(ItemGroup.REDSTONE));
		Registry.register(Registry.BLOCK_ENTITY_TYPE, Lepton.id("weather_sensor"), WEATHER_SENSOR_BE_TYPE);
	}
}
