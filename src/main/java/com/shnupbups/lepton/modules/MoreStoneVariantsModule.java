package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonStairsBlock;

public class MoreStoneVariantsModule extends LeptonModule {
	public static final MoreStoneVariantsModule INSTANCE = new MoreStoneVariantsModule();
	
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
	
	public static final Block MARBLE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).materialColor(MaterialColor.QUARTZ).build());
	public static final Block MARBLE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).materialColor(MaterialColor.QUARTZ).build());
	public static final Block MARBLE_BRICK_STAIRS = new LeptonStairsBlock(MARBLE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).materialColor(MaterialColor.QUARTZ).build());
	public static final Block MARBLE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).materialColor(MaterialColor.QUARTZ).build());
	public static final Block CHISELED_MARBLE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).materialColor(MaterialColor.QUARTZ).build());
	public static final Block MARBLE_PAVEMENT = new Block(FabricBlockSettings.copy(MARBLE_BRICKS).build());
	public static final Block MARBLE_PILLAR = new PillarBlock(FabricBlockSettings.copy(MARBLE_BRICKS).build());
	
	public static final Block LIMESTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).materialColor(MaterialColor.STONE).build());
	public static final Block LIMESTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).materialColor(MaterialColor.STONE).build());
	public static final Block LIMESTONE_BRICK_STAIRS = new LeptonStairsBlock(LIMESTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).materialColor(MaterialColor.STONE).build());
	public static final Block LIMESTONE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).materialColor(MaterialColor.STONE).build());
	public static final Block CHISELED_LIMESTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).materialColor(MaterialColor.STONE).build());
	public static final Block LIMESTONE_PAVEMENT = new Block(FabricBlockSettings.copy(LIMESTONE_BRICKS).build());
	public static final Block LIMESTONE_PILLAR = new PillarBlock(FabricBlockSettings.copy(LIMESTONE_BRICKS).build());
	
	public static final Block JASPER_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).materialColor(MaterialColor.RED_TERRACOTTA).build());
	public static final Block JASPER_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).materialColor(MaterialColor.RED_TERRACOTTA).build());
	public static final Block JASPER_BRICK_STAIRS = new LeptonStairsBlock(JASPER_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).materialColor(MaterialColor.RED_TERRACOTTA).build());
	public static final Block JASPER_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).materialColor(MaterialColor.RED_TERRACOTTA).build());
	public static final Block CHISELED_JASPER_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).materialColor(MaterialColor.RED_TERRACOTTA).build());
	public static final Block JASPER_PAVEMENT = new Block(FabricBlockSettings.copy(JASPER_BRICKS).build());
	public static final Block JASPER_PILLAR = new PillarBlock(FabricBlockSettings.copy(JASPER_BRICKS).build());
	
	public static final Block SLATE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).materialColor(MaterialColor.ICE).build());
	public static final Block SLATE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).materialColor(MaterialColor.ICE).build());
	public static final Block SLATE_BRICK_STAIRS = new LeptonStairsBlock(SLATE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).materialColor(MaterialColor.ICE).build());
	public static final Block SLATE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).materialColor(MaterialColor.ICE).build());
	public static final Block CHISELED_SLATE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).materialColor(MaterialColor.ICE).build());
	public static final Block SLATE_PAVEMENT = new Block(FabricBlockSettings.copy(SLATE_BRICKS).build());
	public static final Block SLATE_PILLAR = new PillarBlock(FabricBlockSettings.copy(SLATE_BRICKS).build());
	
	public static final Block BASALT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).materialColor(MaterialColor.BLACK).build());
	public static final Block BASALT_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).materialColor(MaterialColor.BLACK).build());
	public static final Block BASALT_BRICK_STAIRS = new LeptonStairsBlock(BASALT_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).materialColor(MaterialColor.BLACK).build());
	public static final Block BASALT_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).materialColor(MaterialColor.BLACK).build());
	public static final Block CHISELED_BASALT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).materialColor(MaterialColor.BLACK).build());
	public static final Block BASALT_PAVEMENT = new Block(FabricBlockSettings.copy(BASALT_BRICKS).build());
	public static final Block BASALT_PILLAR = new PillarBlock(FabricBlockSettings.copy(BASALT_BRICKS).build());
	
	@Override
	public void init() {
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
		
		if (NewStoneTypesModule.INSTANCE.isEnabled()) {
			if(NewStoneTypesModule.enableMarble) {
				Lepton.registerBlock(MARBLE_BRICKS, "marble_bricks");
				Lepton.registerBlock(MARBLE_BRICK_SLAB, "marble_brick_slab");
				Lepton.registerBlock(MARBLE_BRICK_STAIRS, "marble_brick_stairs");
				Lepton.registerBlock(MARBLE_BRICK_WALL, "marble_brick_wall");
				Lepton.registerBlock(CHISELED_MARBLE_BRICKS, "chiseled_marble_bricks");
				Lepton.registerBlock(MARBLE_PAVEMENT, "marble_pavement");
				Lepton.registerBlock(MARBLE_PILLAR, "marble_pillar");
			}
			
			if(NewStoneTypesModule.enableLimestone) {
				Lepton.registerBlock(LIMESTONE_BRICKS, "limestone_bricks");
				Lepton.registerBlock(LIMESTONE_BRICK_SLAB, "limestone_brick_slab");
				Lepton.registerBlock(LIMESTONE_BRICK_STAIRS, "limestone_brick_stairs");
				Lepton.registerBlock(LIMESTONE_BRICK_WALL, "limestone_brick_wall");
				Lepton.registerBlock(CHISELED_LIMESTONE_BRICKS, "chiseled_limestone_bricks");
				Lepton.registerBlock(LIMESTONE_PAVEMENT, "limestone_pavement");
				Lepton.registerBlock(LIMESTONE_PILLAR, "limestone_pillar");
			}
			
			if(NewStoneTypesModule.enableJasper) {
				Lepton.registerBlock(JASPER_BRICKS, "jasper_bricks");
				Lepton.registerBlock(JASPER_BRICK_SLAB, "jasper_brick_slab");
				Lepton.registerBlock(JASPER_BRICK_STAIRS, "jasper_brick_stairs");
				Lepton.registerBlock(JASPER_BRICK_WALL, "jasper_brick_wall");
				Lepton.registerBlock(CHISELED_JASPER_BRICKS, "chiseled_jasper_bricks");
				Lepton.registerBlock(JASPER_PAVEMENT, "jasper_pavement");
				Lepton.registerBlock(JASPER_PILLAR, "jasper_pillar");
			}
			
			if(NewStoneTypesModule.enableSlate) {
				Lepton.registerBlock(SLATE_BRICKS, "slate_bricks");
				Lepton.registerBlock(SLATE_BRICK_SLAB, "slate_brick_slab");
				Lepton.registerBlock(SLATE_BRICK_STAIRS, "slate_brick_stairs");
				Lepton.registerBlock(SLATE_BRICK_WALL, "slate_brick_wall");
				Lepton.registerBlock(CHISELED_SLATE_BRICKS, "chiseled_slate_bricks");
				Lepton.registerBlock(SLATE_PAVEMENT, "slate_pavement");
				Lepton.registerBlock(SLATE_PILLAR, "slate_pillar");
			}
			
			if(NewStoneTypesModule.enableBasalt) {
				Lepton.registerBlock(BASALT_BRICKS, "basalt_bricks");
				Lepton.registerBlock(BASALT_BRICK_SLAB, "basalt_brick_slab");
				Lepton.registerBlock(BASALT_BRICK_STAIRS, "basalt_brick_stairs");
				Lepton.registerBlock(BASALT_BRICK_WALL, "basalt_brick_wall");
				Lepton.registerBlock(CHISELED_BASALT_BRICKS, "chiseled_basalt_bricks");
				Lepton.registerBlock(BASALT_PAVEMENT, "basalt_pavement");
				Lepton.registerBlock(BASALT_PILLAR, "basalt_pillar");
			}
		}
	}
}
