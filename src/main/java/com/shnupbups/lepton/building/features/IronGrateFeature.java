package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;
import com.shnupbups.lepton.building.block.GrateBlock;

public class IronGrateFeature extends BuildingFeature {
	public static final IronGrateFeature INSTANCE = new IronGrateFeature();
	
	public static final Block IRON_GRATE = new GrateBlock(FabricBlockSettings.copy(Blocks.IRON_BARS).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(IRON_GRATE, "iron_grate");
	}
	
	@Override
	public String getName() {
		return "iron_grate";
	}
}
