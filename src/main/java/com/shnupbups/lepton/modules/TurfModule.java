package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonStairsBlock;

public class TurfModule extends LeptonModule {
	public static final TurfModule INSTANCE = new TurfModule();
	
	public static final Block TURF = new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
	public static final Block TURF_STAIRS = new LeptonStairsBlock(TURF.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
	public static final Block TURF_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
	
	@Override
	public void init() {
		Lepton.registerBlock(TURF, "turf");
		Lepton.registerBlock(TURF_STAIRS, "turf_stairs");
		Lepton.registerBlock(TURF_SLAB, "turf_slab");
	}
}
