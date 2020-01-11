package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;
import com.shnupbups.lepton.core.block.LeptonStairsBlock;

public class TurfFeature extends BuildingFeature {
	public static final TurfFeature INSTANCE = new TurfFeature();
	
	public static final Block TURF = new Block(FabricBlockSettings.copy(Blocks.GRASS_BLOCK).build());
	public static final Block TURF_STAIRS = new LeptonStairsBlock(TURF.getDefaultState(), FabricBlockSettings.copy(Blocks.GRASS_BLOCK).build());
	public static final Block TURF_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(TURF, "turf");
		Lepton.registerBlock(TURF_STAIRS, "turf_stairs");
		Lepton.registerBlock(TURF_SLAB, "turf_slab");
	}
	
	@Override
	public String getName() {
		return "turf";
	}
}
