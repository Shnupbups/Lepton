package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonStairsBlock;

public class ShinglesModule extends LeptonModule {
	public static final ShinglesModule INSTANCE = new ShinglesModule();
	
	public static final Block WHITE_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA));
	public static final Block ORANGE_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA));
	public static final Block MAGENTA_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA));
	public static final Block LIGHT_BLUE_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA));
	public static final Block YELLOW_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA));
	public static final Block LIME_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA));
	public static final Block PINK_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA));
	public static final Block GRAY_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA));
	public static final Block LIGHT_GRAY_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA));
	public static final Block CYAN_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA));
	public static final Block PURPLE_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA));
	public static final Block BLUE_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA));
	public static final Block BROWN_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA));
	public static final Block GREEN_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA));
	public static final Block RED_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA));
	public static final Block BLACK_SHINGLES = new Block(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA));
	
	public static final Block WHITE_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA));
	public static final Block ORANGE_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA));
	public static final Block MAGENTA_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA));
	public static final Block LIGHT_BLUE_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA));
	public static final Block YELLOW_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA));
	public static final Block LIME_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA));
	public static final Block PINK_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA));
	public static final Block GRAY_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA));
	public static final Block LIGHT_GRAY_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA));
	public static final Block CYAN_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA));
	public static final Block PURPLE_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA));
	public static final Block BLUE_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA));
	public static final Block BROWN_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA));
	public static final Block GREEN_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA));
	public static final Block RED_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA));
	public static final Block BLACK_SHINGLES_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA));
	
	public static final Block WHITE_SHINGLES_STAIRS = new LeptonStairsBlock(WHITE_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(WHITE_SHINGLES));
	public static final Block ORANGE_SHINGLES_STAIRS = new LeptonStairsBlock(ORANGE_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(ORANGE_SHINGLES));
	public static final Block MAGENTA_SHINGLES_STAIRS = new LeptonStairsBlock(MAGENTA_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(MAGENTA_SHINGLES));
	public static final Block LIGHT_BLUE_SHINGLES_STAIRS = new LeptonStairsBlock(LIGHT_BLUE_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(LIGHT_BLUE_SHINGLES));
	public static final Block YELLOW_SHINGLES_STAIRS = new LeptonStairsBlock(YELLOW_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(YELLOW_SHINGLES));
	public static final Block LIME_SHINGLES_STAIRS = new LeptonStairsBlock(LIME_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(LIME_SHINGLES));
	public static final Block PINK_SHINGLES_STAIRS = new LeptonStairsBlock(PINK_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(PINK_SHINGLES));
	public static final Block GRAY_SHINGLES_STAIRS = new LeptonStairsBlock(GRAY_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(GRAY_SHINGLES));
	public static final Block LIGHT_GRAY_SHINGLES_STAIRS = new LeptonStairsBlock(LIGHT_GRAY_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(LIGHT_GRAY_SHINGLES));
	public static final Block CYAN_SHINGLES_STAIRS = new LeptonStairsBlock(CYAN_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(CYAN_SHINGLES));
	public static final Block PURPLE_SHINGLES_STAIRS = new LeptonStairsBlock(PURPLE_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(PURPLE_SHINGLES));
	public static final Block BLUE_SHINGLES_STAIRS = new LeptonStairsBlock(BLUE_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(BLUE_SHINGLES));
	public static final Block BROWN_SHINGLES_STAIRS = new LeptonStairsBlock(BROWN_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(BROWN_SHINGLES));
	public static final Block GREEN_SHINGLES_STAIRS = new LeptonStairsBlock(GREEN_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(GREEN_SHINGLES));
	public static final Block RED_SHINGLES_STAIRS = new LeptonStairsBlock(RED_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(RED_SHINGLES));
	public static final Block BLACK_SHINGLES_STAIRS = new LeptonStairsBlock(BLACK_SHINGLES.getDefaultState(), FabricBlockSettings.copyOf(BLACK_SHINGLES));
	
	@Override
	public void init() {
		Lepton.registerBlock(WHITE_SHINGLES, "white_shingles");
		Lepton.registerBlock(ORANGE_SHINGLES, "orange_shingles");
		Lepton.registerBlock(MAGENTA_SHINGLES, "magenta_shingles");
		Lepton.registerBlock(LIGHT_BLUE_SHINGLES, "light_blue_shingles");
		Lepton.registerBlock(YELLOW_SHINGLES, "yellow_shingles");
		Lepton.registerBlock(LIME_SHINGLES, "lime_shingles");
		Lepton.registerBlock(PINK_SHINGLES, "pink_shingles");
		Lepton.registerBlock(GRAY_SHINGLES, "gray_shingles");
		Lepton.registerBlock(LIGHT_GRAY_SHINGLES, "light_gray_shingles");
		Lepton.registerBlock(CYAN_SHINGLES, "cyan_shingles");
		Lepton.registerBlock(PURPLE_SHINGLES, "purple_shingles");
		Lepton.registerBlock(BLUE_SHINGLES, "blue_shingles");
		Lepton.registerBlock(BROWN_SHINGLES, "brown_shingles");
		Lepton.registerBlock(GREEN_SHINGLES, "green_shingles");
		Lepton.registerBlock(RED_SHINGLES, "red_shingles");
		Lepton.registerBlock(BLACK_SHINGLES, "black_shingles");
		
		Lepton.registerBlock(WHITE_SHINGLES_SLAB, "white_shingles_slab");
		Lepton.registerBlock(ORANGE_SHINGLES_SLAB, "orange_shingles_slab");
		Lepton.registerBlock(MAGENTA_SHINGLES_SLAB, "magenta_shingles_slab");
		Lepton.registerBlock(LIGHT_BLUE_SHINGLES_SLAB, "light_blue_shingles_slab");
		Lepton.registerBlock(YELLOW_SHINGLES_SLAB, "yellow_shingles_slab");
		Lepton.registerBlock(LIME_SHINGLES_SLAB, "lime_shingles_slab");
		Lepton.registerBlock(PINK_SHINGLES_SLAB, "pink_shingles_slab");
		Lepton.registerBlock(GRAY_SHINGLES_SLAB, "gray_shingles_slab");
		Lepton.registerBlock(LIGHT_GRAY_SHINGLES_SLAB, "light_gray_shingles_slab");
		Lepton.registerBlock(CYAN_SHINGLES_SLAB, "cyan_shingles_slab");
		Lepton.registerBlock(PURPLE_SHINGLES_SLAB, "purple_shingles_slab");
		Lepton.registerBlock(BLUE_SHINGLES_SLAB, "blue_shingles_slab");
		Lepton.registerBlock(BROWN_SHINGLES_SLAB, "brown_shingles_slab");
		Lepton.registerBlock(GREEN_SHINGLES_SLAB, "green_shingles_slab");
		Lepton.registerBlock(RED_SHINGLES_SLAB, "red_shingles_slab");
		Lepton.registerBlock(BLACK_SHINGLES_SLAB, "black_shingles_slab");
		
		Lepton.registerBlock(WHITE_SHINGLES_STAIRS, "white_shingles_stairs");
		Lepton.registerBlock(ORANGE_SHINGLES_STAIRS, "orange_shingles_stairs");
		Lepton.registerBlock(MAGENTA_SHINGLES_STAIRS, "magenta_shingles_stairs");
		Lepton.registerBlock(LIGHT_BLUE_SHINGLES_STAIRS, "light_blue_shingles_stairs");
		Lepton.registerBlock(YELLOW_SHINGLES_STAIRS, "yellow_shingles_stairs");
		Lepton.registerBlock(LIME_SHINGLES_STAIRS, "lime_shingles_stairs");
		Lepton.registerBlock(PINK_SHINGLES_STAIRS, "pink_shingles_stairs");
		Lepton.registerBlock(GRAY_SHINGLES_STAIRS, "gray_shingles_stairs");
		Lepton.registerBlock(LIGHT_GRAY_SHINGLES_STAIRS, "light_gray_shingles_stairs");
		Lepton.registerBlock(CYAN_SHINGLES_STAIRS, "cyan_shingles_stairs");
		Lepton.registerBlock(PURPLE_SHINGLES_STAIRS, "purple_shingles_stairs");
		Lepton.registerBlock(BLUE_SHINGLES_STAIRS, "blue_shingles_stairs");
		Lepton.registerBlock(BROWN_SHINGLES_STAIRS, "brown_shingles_stairs");
		Lepton.registerBlock(GREEN_SHINGLES_STAIRS, "green_shingles_stairs");
		Lepton.registerBlock(RED_SHINGLES_STAIRS, "red_shingles_stairs");
		Lepton.registerBlock(BLACK_SHINGLES_STAIRS, "black_shingles_stairs");
	}
}
