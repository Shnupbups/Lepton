package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;

public class VerticalPlanksModule extends LeptonModule {
	public static final VerticalPlanksModule INSTANCE = new VerticalPlanksModule();
	
	public static final Block VERTICAL_OAK_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final Block VERTICAL_SPRUCE_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS));
	public static final Block VERTICAL_BIRCH_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS));
	public static final Block VERTICAL_JUNGLE_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS));
	public static final Block VERTICAL_ACACIA_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS));
	public static final Block VERTICAL_DARK_OAK_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS));
	
	public static final Block VERTICAL_WHITE_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.WHITE_STAINED_PLANKS));
	public static final Block VERTICAL_ORANGE_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.ORANGE_STAINED_PLANKS));
	public static final Block VERTICAL_MAGENTA_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.MAGENTA_STAINED_PLANKS));
	public static final Block VERTICAL_LIGHT_BLUE_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.LIGHT_BLUE_STAINED_PLANKS));
	public static final Block VERTICAL_YELLOW_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.YELLOW_STAINED_PLANKS));
	public static final Block VERTICAL_LIME_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.LIME_STAINED_PLANKS));
	public static final Block VERTICAL_PINK_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.PINK_STAINED_PLANKS));
	public static final Block VERTICAL_GRAY_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.GRAY_STAINED_PLANKS));
	public static final Block VERTICAL_LIGHT_GRAY_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.LIGHT_GRAY_STAINED_PLANKS));
	public static final Block VERTICAL_CYAN_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.CYAN_STAINED_PLANKS));
	public static final Block VERTICAL_PURPLE_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.PURPLE_STAINED_PLANKS));
	public static final Block VERTICAL_BLUE_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.BLUE_STAINED_PLANKS));
	public static final Block VERTICAL_BROWN_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.BROWN_STAINED_PLANKS));
	public static final Block VERTICAL_GREEN_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.GREEN_STAINED_PLANKS));
	public static final Block VERTICAL_RED_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.RED_STAINED_PLANKS));
	public static final Block VERTICAL_BLACK_STAINED_PLANKS = new Block(FabricBlockSettings.copyOf(StainedPlanksModule.BLACK_STAINED_PLANKS));
	
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
