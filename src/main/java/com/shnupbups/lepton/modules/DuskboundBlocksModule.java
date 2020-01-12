package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonStairsBlock;

public class DuskboundBlocksModule extends LeptonModule {
	public static final DuskboundBlocksModule INSTANCE = new DuskboundBlocksModule();
	
	public static final Block DUSKBOUND_BLOCK = new Block(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK).build());
	public static final Block DUSKBOUND_STAIRS = new LeptonStairsBlock(DUSKBOUND_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.PURPUR_STAIRS).build());
	public static final Block DUSKBOUND_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.PURPUR_SLAB).build());
	public static final Block DUSKBOUND_LANTERN = new Block(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK).lightLevel(15).build());
	
	@Override
	public void init() {
		Lepton.registerBlock(DUSKBOUND_BLOCK, "duskbound_block");
		Lepton.registerBlock(DUSKBOUND_STAIRS, "duskbound_stairs");
		Lepton.registerBlock(DUSKBOUND_SLAB, "duskbound_slab");
		Lepton.registerBlock(DUSKBOUND_LANTERN, "duskbound_lantern");
	}
}
