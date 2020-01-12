package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonStairsBlock;
import com.shnupbups.lepton.block.ThatchBlock;

public class ThatchModule extends LeptonModule {
	public static final ThatchModule INSTANCE = new ThatchModule();
	
	public static final Block THATCH = new ThatchBlock(FabricBlockSettings.copy(Blocks.HAY_BLOCK).build());
	public static final Block THATCH_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.HAY_BLOCK).build());
	public static final Block THATCH_STAIRS = new LeptonStairsBlock(THATCH.getDefaultState(), FabricBlockSettings.copy(Blocks.HAY_BLOCK).build());
	
	@Override
	public void init() {
		Lepton.registerBlock(THATCH, "thatch");
		Lepton.registerBlock(THATCH_SLAB, "thatch_slab");
		Lepton.registerBlock(THATCH_STAIRS, "thatch_stairs");
	}
}
