package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;
import com.shnupbups.lepton.building.block.ThatchBlock;
import com.shnupbups.lepton.core.LeptonStairsBlock;

public class ThatchFeature extends BuildingFeature {
	public static final ThatchFeature INSTANCE = new ThatchFeature();
	
	public static final Block THATCH = new ThatchBlock(FabricBlockSettings.copy(Blocks.HAY_BLOCK).build());
	public static final Block THATCH_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.HAY_BLOCK).build());
	public static final Block THATCH_STAIRS = new LeptonStairsBlock(THATCH.getDefaultState(), FabricBlockSettings.copy(Blocks.HAY_BLOCK).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(THATCH, "thatch");
		Lepton.registerBlock(THATCH_SLAB, "thatch_slab");
		Lepton.registerBlock(THATCH_STAIRS, "thatch_stairs");
	}
	
	@Override
	public String getName() {
		return "thatch";
	}
}
