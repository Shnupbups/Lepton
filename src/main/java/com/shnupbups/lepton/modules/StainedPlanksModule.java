package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.DyeColor;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonStairsBlock;

public class StainedPlanksModule extends LeptonModule {
	public static final StainedPlanksModule INSTANCE = new StainedPlanksModule();
	
	public static final Block WHITE_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.WHITE).build());
	public static final Block ORANGE_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.ORANGE).build());
	public static final Block MAGENTA_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.MAGENTA).build());
	public static final Block LIGHT_BLUE_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.LIGHT_BLUE).build());
	public static final Block YELLOW_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.YELLOW).build());
	public static final Block LIME_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.LIME).build());
	public static final Block PINK_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.PINK).build());
	public static final Block GRAY_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.GRAY).build());
	public static final Block LIGHT_GRAY_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.LIGHT_GRAY).build());
	public static final Block CYAN_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.CYAN).build());
	public static final Block PURPLE_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.PURPLE).build());
	public static final Block BLUE_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.BLUE).build());
	public static final Block BROWN_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.BROWN).build());
	public static final Block GREEN_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.GREEN).build());
	public static final Block RED_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.RED).build());
	public static final Block BLACK_STAINED_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.BLACK).build());
	
	public static final Block WHITE_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.WHITE).build());
	public static final Block ORANGE_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.ORANGE).build());
	public static final Block MAGENTA_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.MAGENTA).build());
	public static final Block LIGHT_BLUE_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.LIGHT_BLUE).build());
	public static final Block YELLOW_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.YELLOW).build());
	public static final Block LIME_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.LIME).build());
	public static final Block PINK_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.PINK).build());
	public static final Block GRAY_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.GRAY).build());
	public static final Block LIGHT_GRAY_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.LIGHT_GRAY).build());
	public static final Block CYAN_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.CYAN).build());
	public static final Block PURPLE_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.PURPLE).build());
	public static final Block BLUE_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.BLUE).build());
	public static final Block BROWN_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.BROWN).build());
	public static final Block GREEN_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.GREEN).build());
	public static final Block RED_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.RED).build());
	public static final Block BLACK_STAINED_PLANK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(DyeColor.BLACK).build());
	
	public static final Block WHITE_STAINED_PLANK_STAIRS = new LeptonStairsBlock(WHITE_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(WHITE_STAINED_PLANKS).build());
	public static final Block ORANGE_STAINED_PLANK_STAIRS = new LeptonStairsBlock(ORANGE_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(ORANGE_STAINED_PLANKS).build());
	public static final Block MAGENTA_STAINED_PLANK_STAIRS = new LeptonStairsBlock(MAGENTA_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(MAGENTA_STAINED_PLANKS).build());
	public static final Block LIGHT_BLUE_STAINED_PLANK_STAIRS = new LeptonStairsBlock(LIGHT_BLUE_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(LIGHT_BLUE_STAINED_PLANKS).build());
	public static final Block YELLOW_STAINED_PLANK_STAIRS = new LeptonStairsBlock(YELLOW_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(YELLOW_STAINED_PLANKS).build());
	public static final Block LIME_STAINED_PLANK_STAIRS = new LeptonStairsBlock(LIME_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(LIME_STAINED_PLANKS).build());
	public static final Block PINK_STAINED_PLANK_STAIRS = new LeptonStairsBlock(PINK_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(PINK_STAINED_PLANKS).build());
	public static final Block GRAY_STAINED_PLANK_STAIRS = new LeptonStairsBlock(GRAY_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(GRAY_STAINED_PLANKS).build());
	public static final Block LIGHT_GRAY_STAINED_PLANK_STAIRS = new LeptonStairsBlock(LIGHT_GRAY_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(LIGHT_GRAY_STAINED_PLANKS).build());
	public static final Block CYAN_STAINED_PLANK_STAIRS = new LeptonStairsBlock(CYAN_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(CYAN_STAINED_PLANKS).build());
	public static final Block PURPLE_STAINED_PLANK_STAIRS = new LeptonStairsBlock(PURPLE_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(PURPLE_STAINED_PLANKS).build());
	public static final Block BLUE_STAINED_PLANK_STAIRS = new LeptonStairsBlock(BLUE_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(BLUE_STAINED_PLANKS).build());
	public static final Block BROWN_STAINED_PLANK_STAIRS = new LeptonStairsBlock(BROWN_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(BROWN_STAINED_PLANKS).build());
	public static final Block GREEN_STAINED_PLANK_STAIRS = new LeptonStairsBlock(GREEN_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(GREEN_STAINED_PLANKS).build());
	public static final Block RED_STAINED_PLANK_STAIRS = new LeptonStairsBlock(RED_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(RED_STAINED_PLANKS).build());
	public static final Block BLACK_STAINED_PLANK_STAIRS = new LeptonStairsBlock(BLACK_STAINED_PLANKS.getDefaultState(), FabricBlockSettings.copy(BLACK_STAINED_PLANKS).build());
	
	@Override
	public void init() {
		Lepton.registerBlock(WHITE_STAINED_PLANKS, "white_stained_planks");
		Lepton.registerBlock(ORANGE_STAINED_PLANKS, "orange_stained_planks");
		Lepton.registerBlock(MAGENTA_STAINED_PLANKS, "magenta_stained_planks");
		Lepton.registerBlock(LIGHT_BLUE_STAINED_PLANKS, "light_blue_stained_planks");
		Lepton.registerBlock(YELLOW_STAINED_PLANKS, "yellow_stained_planks");
		Lepton.registerBlock(LIME_STAINED_PLANKS, "lime_stained_planks");
		Lepton.registerBlock(PINK_STAINED_PLANKS, "pink_stained_planks");
		Lepton.registerBlock(GRAY_STAINED_PLANKS, "gray_stained_planks");
		Lepton.registerBlock(LIGHT_GRAY_STAINED_PLANKS, "light_gray_stained_planks");
		Lepton.registerBlock(CYAN_STAINED_PLANKS, "cyan_stained_planks");
		Lepton.registerBlock(PURPLE_STAINED_PLANKS, "purple_stained_planks");
		Lepton.registerBlock(BLUE_STAINED_PLANKS, "blue_stained_planks");
		Lepton.registerBlock(BROWN_STAINED_PLANKS, "brown_stained_planks");
		Lepton.registerBlock(GREEN_STAINED_PLANKS, "green_stained_planks");
		Lepton.registerBlock(RED_STAINED_PLANKS, "red_stained_planks");
		Lepton.registerBlock(BLACK_STAINED_PLANKS, "black_stained_planks");
		
		Lepton.registerBlock(WHITE_STAINED_PLANK_SLAB, "white_stained_plank_slab");
		Lepton.registerBlock(ORANGE_STAINED_PLANK_SLAB, "orange_stained_plank_slab");
		Lepton.registerBlock(MAGENTA_STAINED_PLANK_SLAB, "magenta_stained_plank_slab");
		Lepton.registerBlock(LIGHT_BLUE_STAINED_PLANK_SLAB, "light_blue_stained_plank_slab");
		Lepton.registerBlock(YELLOW_STAINED_PLANK_SLAB, "yellow_stained_plank_slab");
		Lepton.registerBlock(LIME_STAINED_PLANK_SLAB, "lime_stained_plank_slab");
		Lepton.registerBlock(PINK_STAINED_PLANK_SLAB, "pink_stained_plank_slab");
		Lepton.registerBlock(GRAY_STAINED_PLANK_SLAB, "gray_stained_plank_slab");
		Lepton.registerBlock(LIGHT_GRAY_STAINED_PLANK_SLAB, "light_gray_stained_plank_slab");
		Lepton.registerBlock(CYAN_STAINED_PLANK_SLAB, "cyan_stained_plank_slab");
		Lepton.registerBlock(PURPLE_STAINED_PLANK_SLAB, "purple_stained_plank_slab");
		Lepton.registerBlock(BLUE_STAINED_PLANK_SLAB, "blue_stained_plank_slab");
		Lepton.registerBlock(BROWN_STAINED_PLANK_SLAB, "brown_stained_plank_slab");
		Lepton.registerBlock(GREEN_STAINED_PLANK_SLAB, "green_stained_plank_slab");
		Lepton.registerBlock(RED_STAINED_PLANK_SLAB, "red_stained_plank_slab");
		Lepton.registerBlock(BLACK_STAINED_PLANK_SLAB, "black_stained_plank_slab");
		
		Lepton.registerBlock(WHITE_STAINED_PLANK_STAIRS, "white_stained_plank_stairs");
		Lepton.registerBlock(ORANGE_STAINED_PLANK_STAIRS, "orange_stained_plank_stairs");
		Lepton.registerBlock(MAGENTA_STAINED_PLANK_STAIRS, "magenta_stained_plank_stairs");
		Lepton.registerBlock(LIGHT_BLUE_STAINED_PLANK_STAIRS, "light_blue_stained_plank_stairs");
		Lepton.registerBlock(YELLOW_STAINED_PLANK_STAIRS, "yellow_stained_plank_stairs");
		Lepton.registerBlock(LIME_STAINED_PLANK_STAIRS, "lime_stained_plank_stairs");
		Lepton.registerBlock(PINK_STAINED_PLANK_STAIRS, "pink_stained_plank_stairs");
		Lepton.registerBlock(GRAY_STAINED_PLANK_STAIRS, "gray_stained_plank_stairs");
		Lepton.registerBlock(LIGHT_GRAY_STAINED_PLANK_STAIRS, "light_gray_stained_plank_stairs");
		Lepton.registerBlock(CYAN_STAINED_PLANK_STAIRS, "cyan_stained_plank_stairs");
		Lepton.registerBlock(PURPLE_STAINED_PLANK_STAIRS, "purple_stained_plank_stairs");
		Lepton.registerBlock(BLUE_STAINED_PLANK_STAIRS, "blue_stained_plank_stairs");
		Lepton.registerBlock(BROWN_STAINED_PLANK_STAIRS, "brown_stained_plank_stairs");
		Lepton.registerBlock(GREEN_STAINED_PLANK_STAIRS, "green_stained_plank_stairs");
		Lepton.registerBlock(RED_STAINED_PLANK_STAIRS, "red_stained_plank_stairs");
		Lepton.registerBlock(BLACK_STAINED_PLANK_STAIRS, "black_stained_plank_stairs");
	}
}
