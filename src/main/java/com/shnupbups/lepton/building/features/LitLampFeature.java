package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;

public class LitLampFeature extends BuildingFeature {
	public static final LitLampFeature INSTANCE = new LitLampFeature();
	
	public static final Block LIT_LAMP = new Block(FabricBlockSettings.copy(Blocks.REDSTONE_LAMP).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(LIT_LAMP, "lit_lamp");
	}
	
	@Override
	public String getName() {
		return "lit_lamp";
	}
}
