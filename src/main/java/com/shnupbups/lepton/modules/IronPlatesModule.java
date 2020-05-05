package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonStairsBlock;

public class IronPlatesModule extends LeptonModule {
	public static final IronPlatesModule INSTANCE = new IronPlatesModule();
	
	public static final Block IRON_PLATE = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
	public static final Block IRON_PLATE_STAIRS = new LeptonStairsBlock(IRON_PLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
	public static final Block IRON_PLATE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
	public static final Block RUSTY_IRON_PLATE = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
	public static final Block RUSTY_IRON_PLATE_STAIRS = new LeptonStairsBlock(IRON_PLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
	public static final Block RUSTY_IRON_PLATE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
	
	@Override
	public void init() {
		Lepton.registerBlock(IRON_PLATE, "iron_plate");
		Lepton.registerBlock(IRON_PLATE_STAIRS, "iron_plate_stairs");
		Lepton.registerBlock(IRON_PLATE_SLAB, "iron_plate_slab");
		Lepton.registerBlock(RUSTY_IRON_PLATE, "rusty_iron_plate");
		Lepton.registerBlock(RUSTY_IRON_PLATE_STAIRS, "rusty_iron_plate_stairs");
		Lepton.registerBlock(RUSTY_IRON_PLATE_SLAB, "rusty_iron_plate_slab");
	}
}
