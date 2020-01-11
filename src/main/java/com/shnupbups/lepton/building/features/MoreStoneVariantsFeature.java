package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;
import com.shnupbups.lepton.core.LeptonStairsBlock;

public class MoreStoneVariantsFeature extends BuildingFeature {
	public static final MoreStoneVariantsFeature INSTANCE = new MoreStoneVariantsFeature();
	
	public static final Block GRANITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).materialColor(MaterialColor.DIRT).build());
	public static final Block GRANITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).materialColor(MaterialColor.DIRT).build());
	public static final Block GRANITE_BRICK_STAIRS = new LeptonStairsBlock(GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).materialColor(MaterialColor.DIRT).build());
	public static final Block GRANITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).materialColor(MaterialColor.DIRT).build());
	public static final Block CHISELED_GRANITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).materialColor(MaterialColor.DIRT).build());
	public static final Block GRANITE_PAVEMENT = new Block(FabricBlockSettings.copy(GRANITE_BRICKS).build());
	public static final Block GRANITE_PILLAR = new PillarBlock(FabricBlockSettings.copy(GRANITE_BRICKS).build());
	
	public static final Block DIORITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).materialColor(MaterialColor.QUARTZ).build());
	public static final Block DIORITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).materialColor(MaterialColor.QUARTZ).build());
	public static final Block DIORITE_BRICK_STAIRS = new LeptonStairsBlock(DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).materialColor(MaterialColor.QUARTZ).build());
	public static final Block DIORITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).materialColor(MaterialColor.QUARTZ).build());
	public static final Block CHISELED_DIORITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).materialColor(MaterialColor.QUARTZ).build());
	public static final Block DIORITE_PAVEMENT = new Block(FabricBlockSettings.copy(DIORITE_BRICKS).build());
	public static final Block DIORITE_PILLAR = new PillarBlock(FabricBlockSettings.copy(DIORITE_BRICKS).build());
	
	public static final Block ANDESITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).materialColor(MaterialColor.STONE).build());
	public static final Block ANDESITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).materialColor(MaterialColor.STONE).build());
	public static final Block ANDESITE_BRICK_STAIRS = new LeptonStairsBlock(ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).materialColor(MaterialColor.STONE).build());
	public static final Block ANDESITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).materialColor(MaterialColor.STONE).build());
	public static final Block CHISELED_ANDESITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).materialColor(MaterialColor.STONE).build());
	public static final Block ANDESITE_PAVEMENT = new Block(FabricBlockSettings.copy(ANDESITE_BRICKS).build());
	public static final Block ANDESITE_PILLAR = new PillarBlock(FabricBlockSettings.copy(ANDESITE_BRICKS).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(GRANITE_BRICKS, "granite_bricks");
		Lepton.registerBlock(GRANITE_BRICK_SLAB, "granite_brick_slab");
		Lepton.registerBlock(GRANITE_BRICK_STAIRS, "granite_brick_stairs");
		Lepton.registerBlock(GRANITE_BRICK_WALL, "granite_brick_wall");
		Lepton.registerBlock(CHISELED_GRANITE_BRICKS, "chiseled_granite_bricks");
		Lepton.registerBlock(GRANITE_PAVEMENT, "granite_pavement");
		Lepton.registerBlock(GRANITE_PILLAR, "granite_pillar");
		
		Lepton.registerBlock(DIORITE_BRICKS, "diorite_bricks");
		Lepton.registerBlock(DIORITE_BRICK_SLAB, "diorite_brick_slab");
		Lepton.registerBlock(DIORITE_BRICK_STAIRS, "diorite_brick_stairs");
		Lepton.registerBlock(DIORITE_BRICK_WALL, "diorite_brick_wall");
		Lepton.registerBlock(CHISELED_DIORITE_BRICKS, "chiseled_diorite_bricks");
		Lepton.registerBlock(DIORITE_PAVEMENT, "diorite_pavement");
		Lepton.registerBlock(DIORITE_PILLAR, "diorite_pillar");
		
		Lepton.registerBlock(ANDESITE_BRICKS, "andesite_bricks");
		Lepton.registerBlock(ANDESITE_BRICK_SLAB, "andesite_brick_slab");
		Lepton.registerBlock(ANDESITE_BRICK_STAIRS, "andesite_brick_stairs");
		Lepton.registerBlock(ANDESITE_BRICK_WALL, "andesite_brick_wall");
		Lepton.registerBlock(CHISELED_ANDESITE_BRICKS, "chiseled_andesite_bricks");
		Lepton.registerBlock(ANDESITE_PAVEMENT, "andesite_pavement");
		Lepton.registerBlock(ANDESITE_PILLAR, "andesite_pillar");
	}
	
	@Override
	public String getName() {
		return "more_stone_variants";
	}
}
