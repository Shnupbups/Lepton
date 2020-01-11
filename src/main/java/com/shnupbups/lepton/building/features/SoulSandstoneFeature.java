package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;
import com.shnupbups.lepton.core.block.LeptonStairsBlock;

public class SoulSandstoneFeature extends BuildingFeature {
	public static final SoulSandstoneFeature INSTANCE = new SoulSandstoneFeature();
	
	public static final Block SOUL_SANDSTONE = new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).materialColor(MaterialColor.BROWN).build());
	public static final Block SOUL_SANDSTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.SANDSTONE_SLAB).materialColor(MaterialColor.BROWN).build());
	public static final Block SOUL_SANDSTONE_STAIRS = new LeptonStairsBlock(SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(Blocks.SANDSTONE_STAIRS).materialColor(MaterialColor.BROWN).build());
	public static final Block SOUL_SANDSTONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.SANDSTONE_WALL).materialColor(MaterialColor.BROWN).build());
	public static final Block CHISELED_SOUL_SANDSTONE = new Block(FabricBlockSettings.copy(Blocks.CHISELED_SANDSTONE).materialColor(MaterialColor.BROWN).build());
	public static final Block CUT_SOUL_SANDSTONE = new Block(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE).materialColor(MaterialColor.BROWN).build());
	public static final Block CUT_SOUL_SANDSTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE_SLAB).materialColor(MaterialColor.BROWN).build());
	public static final Block SMOOTH_SOUL_SANDSTONE = new Block(FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE).materialColor(MaterialColor.BROWN).build());
	public static final Block SMOOTH_SOUL_SANDSTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE_SLAB).materialColor(MaterialColor.BROWN).build());
	public static final Block SMOOTH_SOUL_SANDSTONE_STAIRS = new LeptonStairsBlock(SMOOTH_SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE_STAIRS).materialColor(MaterialColor.BROWN).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(SOUL_SANDSTONE, "soul_sandstone");
		Lepton.registerBlock(SOUL_SANDSTONE_SLAB, "soul_sandstone_slab");
		Lepton.registerBlock(SOUL_SANDSTONE_STAIRS, "soul_sandstone_stairs");
		Lepton.registerBlock(SOUL_SANDSTONE_WALL, "soul_sandstone_wall");
		Lepton.registerBlock(CHISELED_SOUL_SANDSTONE, "chiseled_soul_sandstone");
		Lepton.registerBlock(CUT_SOUL_SANDSTONE, "cut_soul_sandstone");
		Lepton.registerBlock(CUT_SOUL_SANDSTONE_SLAB, "cut_soul_sandstone_slab");
		Lepton.registerBlock(SMOOTH_SOUL_SANDSTONE, "smooth_soul_sandstone");
		Lepton.registerBlock(SMOOTH_SOUL_SANDSTONE_SLAB, "smooth_soul_sandstone_slab");
		Lepton.registerBlock(SMOOTH_SOUL_SANDSTONE_STAIRS, "smooth_soul_sandstone_stairs");
	}
	
	@Override
	public String getName() {
		return "soul_sandstone";
	}
}
