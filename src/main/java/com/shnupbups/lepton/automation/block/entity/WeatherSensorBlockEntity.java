package com.shnupbups.lepton.automation.block.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.Tickable;

import com.shnupbups.lepton.automation.block.WeatherSensorBlock;
import com.shnupbups.lepton.automation.features.WeatherSensorFeature;

public class WeatherSensorBlockEntity extends BlockEntity implements Tickable {
	public WeatherSensorBlockEntity() {
		super(WeatherSensorFeature.WEATHER_SENSOR_BE_TYPE);
	}
	
	@Override
	public void tick() {
		if (this.world != null && !this.world.isClient && this.world.getTime() % 20L == 0L) {
			BlockState state = this.getCachedState();
			Block block = state.getBlock();
			if (block instanceof WeatherSensorBlock) {
				WeatherSensorBlock.updateState(state, this.world, this.pos);
			}
		}
	}
}
