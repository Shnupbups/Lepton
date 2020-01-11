package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarpetBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;
import com.shnupbups.lepton.building.block.LeptonCarpetBlock;

public class LeafCarpetFeature extends BuildingFeature {
	public static final LeafCarpetFeature INSTANCE = new LeafCarpetFeature();
	
	public static final Block OAK_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).build());
	public static final Block SPRUCE_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copy(Blocks.SPRUCE_LEAVES).build());
	public static final Block BIRCH_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copy(Blocks.BIRCH_LEAVES).build());
	public static final Block JUNGLE_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copy(Blocks.JUNGLE_LEAVES).build());
	public static final Block ACACIA_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copy(Blocks.ACACIA_LEAVES).build());
	public static final Block DARK_OAK_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LEAVES).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(OAK_LEAF_CARPET, "oak_leaf_carpet");
		Lepton.registerBlock(SPRUCE_LEAF_CARPET, "spruce_leaf_carpet");
		Lepton.registerBlock(BIRCH_LEAF_CARPET, "birch_leaf_carpet");
		Lepton.registerBlock(JUNGLE_LEAF_CARPET, "jungle_leaf_carpet");
		Lepton.registerBlock(ACACIA_LEAF_CARPET, "acacia_leaf_carpet");
		Lepton.registerBlock(DARK_OAK_LEAF_CARPET, "dark_oak_leaf_carpet");
	}
	
	@Override
	public String getName() {
		return "leaf_carpet";
	}
}
