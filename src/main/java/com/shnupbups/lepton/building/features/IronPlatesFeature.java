package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;
import com.shnupbups.lepton.core.LeptonStairsBlock;

public class IronPlatesFeature extends BuildingFeature {
	public static final IronPlatesFeature INSTANCE = new IronPlatesFeature();
	
	public static final Block IRON_PLATE = new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).build());
	public static final Block IRON_PLATE_STAIRS = new LeptonStairsBlock(IRON_PLATE.getDefaultState(), FabricBlockSettings.copy(Blocks.IRON_BLOCK).build());
	public static final Block IRON_PLATE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).build());
	public static final Block RUSTY_IRON_PLATE = new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).build());
	public static final Block RUSTY_IRON_PLATE_STAIRS = new LeptonStairsBlock(IRON_PLATE.getDefaultState(), FabricBlockSettings.copy(Blocks.IRON_BLOCK).build());
	public static final Block RUSTY_IRON_PLATE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(IRON_PLATE, "iron_plate");
		Lepton.registerBlock(IRON_PLATE_STAIRS, "iron_plate_stairs");
		Lepton.registerBlock(IRON_PLATE_SLAB, "iron_plate_slab");
		Lepton.registerBlock(RUSTY_IRON_PLATE, "rusty_iron_plate");
		Lepton.registerBlock(RUSTY_IRON_PLATE_STAIRS, "rusty_iron_plate_stairs");
		Lepton.registerBlock(RUSTY_IRON_PLATE_SLAB, "rusty_iron_plate_slab");
	}
	
	@Override
	public String getName() {
		return "iron_plates";
	}
}
