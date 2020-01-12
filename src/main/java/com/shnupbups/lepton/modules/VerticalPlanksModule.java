package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;

public class VerticalPlanksModule extends LeptonModule {
	public static final VerticalPlanksModule INSTANCE = new VerticalPlanksModule();
	
	public static final Block VERTICAL_OAK_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).build());
	public static final Block VERTICAL_SPRUCE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).build());
	public static final Block VERTICAL_BIRCH_PLANKS = new Block(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).build());
	public static final Block VERTICAL_JUNGLE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).build());
	public static final Block VERTICAL_ACACIA_PLANKS = new Block(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).build());
	public static final Block VERTICAL_DARK_OAK_PLANKS = new Block(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).build());
	
	public static final Block VERTICAL_WHITE_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.WHITE_STAINED_PLANKS).build());
	public static final Block VERTICAL_ORANGE_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.ORANGE_STAINED_PLANKS).build());
	public static final Block VERTICAL_MAGENTA_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.MAGENTA_STAINED_PLANKS).build());
	public static final Block VERTICAL_LIGHT_BLUE_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.LIGHT_BLUE_STAINED_PLANKS).build());
	public static final Block VERTICAL_YELLOW_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.YELLOW_STAINED_PLANKS).build());
	public static final Block VERTICAL_LIME_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.LIME_STAINED_PLANKS).build());
	public static final Block VERTICAL_PINK_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.PINK_STAINED_PLANKS).build());
	public static final Block VERTICAL_GRAY_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.GRAY_STAINED_PLANKS).build());
	public static final Block VERTICAL_LIGHT_GRAY_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.LIGHT_GRAY_STAINED_PLANKS).build());
	public static final Block VERTICAL_CYAN_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.CYAN_STAINED_PLANKS).build());
	public static final Block VERTICAL_PURPLE_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.PURPLE_STAINED_PLANKS).build());
	public static final Block VERTICAL_BLUE_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.BLUE_STAINED_PLANKS).build());
	public static final Block VERTICAL_BROWN_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.BROWN_STAINED_PLANKS).build());
	public static final Block VERTICAL_GREEN_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.GREEN_STAINED_PLANKS).build());
	public static final Block VERTICAL_RED_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.RED_STAINED_PLANKS).build());
	public static final Block VERTICAL_BLACK_STAINED_PLANKS = new Block(FabricBlockSettings.copy(StainedPlanksModule.BLACK_STAINED_PLANKS).build());
	
	@Override
	public void init() {
		Lepton.registerBlock(VERTICAL_OAK_PLANKS, "vertical_oak_planks");
		Lepton.registerBlock(VERTICAL_SPRUCE_PLANKS, "vertical_spruce_planks");
		Lepton.registerBlock(VERTICAL_BIRCH_PLANKS, "vertical_birch_planks");
		Lepton.registerBlock(VERTICAL_JUNGLE_PLANKS, "vertical_jungle_planks");
		Lepton.registerBlock(VERTICAL_ACACIA_PLANKS, "vertical_acacia_planks");
		Lepton.registerBlock(VERTICAL_DARK_OAK_PLANKS, "vertical_dark_oak_planks");
		
		if (StainedPlanksModule.INSTANCE.isEnabled()) {
			Lepton.registerBlock(VERTICAL_WHITE_STAINED_PLANKS, "vertical_white_stained_planks");
			Lepton.registerBlock(VERTICAL_ORANGE_STAINED_PLANKS, "vertical_orange_stained_planks");
			Lepton.registerBlock(VERTICAL_MAGENTA_STAINED_PLANKS, "vertical_magenta_stained_planks");
			Lepton.registerBlock(VERTICAL_LIGHT_BLUE_STAINED_PLANKS, "vertical_light_blue_stained_planks");
			Lepton.registerBlock(VERTICAL_YELLOW_STAINED_PLANKS, "vertical_yellow_stained_planks");
			Lepton.registerBlock(VERTICAL_LIME_STAINED_PLANKS, "vertical_lime_stained_planks");
			Lepton.registerBlock(VERTICAL_PINK_STAINED_PLANKS, "vertical_pink_stained_planks");
			Lepton.registerBlock(VERTICAL_GRAY_STAINED_PLANKS, "vertical_gray_stained_planks");
			Lepton.registerBlock(VERTICAL_LIGHT_GRAY_STAINED_PLANKS, "vertical_light_gray_stained_planks");
			Lepton.registerBlock(VERTICAL_CYAN_STAINED_PLANKS, "vertical_cyan_stained_planks");
			Lepton.registerBlock(VERTICAL_PURPLE_STAINED_PLANKS, "vertical_purple_stained_planks");
			Lepton.registerBlock(VERTICAL_BLUE_STAINED_PLANKS, "vertical_blue_stained_planks");
			Lepton.registerBlock(VERTICAL_BROWN_STAINED_PLANKS, "vertical_brown_stained_planks");
			Lepton.registerBlock(VERTICAL_GREEN_STAINED_PLANKS, "vertical_green_stained_planks");
			Lepton.registerBlock(VERTICAL_RED_STAINED_PLANKS, "vertical_red_stained_planks");
			Lepton.registerBlock(VERTICAL_BLACK_STAINED_PLANKS, "vertical_black_stained_planks");
		}
	}
}
