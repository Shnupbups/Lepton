package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;

public class NetherBrickFenceGateFeature extends BuildingFeature {
	public static final NetherBrickFenceGateFeature INSTANCE = new NetherBrickFenceGateFeature();
	
	public static final Block NETHER_BRICK_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICK_FENCE).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(NETHER_BRICK_FENCE_GATE, "nether_brick_fence_gate");
	}
	
	@Override
	public String getName() {
		return "nether_brick_fence_gate";
	}
}
