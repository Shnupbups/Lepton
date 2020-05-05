package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonStairsBlock;
import com.shnupbups.lepton.block.ThatchBlock;

public class ThatchModule extends LeptonModule {
	public static final ThatchModule INSTANCE = new ThatchModule();
	
	public static final Block THATCH = new ThatchBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK));
	public static final Block THATCH_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK));
	public static final Block THATCH_STAIRS = new LeptonStairsBlock(THATCH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.HAY_BLOCK));
	
	@Override
	public void init() {
		Lepton.registerBlock(THATCH, "thatch");
		Lepton.registerBlock(THATCH_SLAB, "thatch_slab");
		Lepton.registerBlock(THATCH_STAIRS, "thatch_stairs");
	}
}
