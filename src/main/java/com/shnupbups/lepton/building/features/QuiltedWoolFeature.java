package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;

public class QuiltedWoolFeature extends BuildingFeature {
	public static final QuiltedWoolFeature INSTANCE = new QuiltedWoolFeature();
	
	public static final Block WHITE_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).build());
	public static final Block ORANGE_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.ORANGE_WOOL).build());
	public static final Block MAGENTA_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.MAGENTA_WOOL).build());
	public static final Block LIGHT_BLUE_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_WOOL).build());
	public static final Block YELLOW_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.YELLOW_WOOL).build());
	public static final Block LIME_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.LIME_WOOL).build());
	public static final Block PINK_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.PINK_WOOL).build());
	public static final Block GRAY_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.GRAY_WOOL).build());
	public static final Block LIGHT_GRAY_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_WOOL).build());
	public static final Block CYAN_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.CYAN_WOOL).build());
	public static final Block PURPLE_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.PURPLE_WOOL).build());
	public static final Block BLUE_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.BLUE_WOOL).build());
	public static final Block BROWN_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.BROWN_WOOL).build());
	public static final Block GREEN_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.GREEN_WOOL).build());
	public static final Block RED_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.RED_WOOL).build());
	public static final Block BLACK_QUILTED_WOOL = new Block(FabricBlockSettings.copy(Blocks.BLACK_WOOL).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(WHITE_QUILTED_WOOL, "white_quilted_wool");
		Lepton.registerBlock(ORANGE_QUILTED_WOOL, "orange_quilted_wool");
		Lepton.registerBlock(MAGENTA_QUILTED_WOOL, "magenta_quilted_wool");
		Lepton.registerBlock(LIGHT_BLUE_QUILTED_WOOL, "light_blue_quilted_wool");
		Lepton.registerBlock(YELLOW_QUILTED_WOOL, "yellow_quilted_wool");
		Lepton.registerBlock(LIME_QUILTED_WOOL, "lime_quilted_wool");
		Lepton.registerBlock(PINK_QUILTED_WOOL, "pink_quilted_wool");
		Lepton.registerBlock(GRAY_QUILTED_WOOL, "gray_quilted_wool");
		Lepton.registerBlock(LIGHT_GRAY_QUILTED_WOOL, "light_gray_quilted_wool");
		Lepton.registerBlock(CYAN_QUILTED_WOOL, "cyan_quilted_wool");
		Lepton.registerBlock(PURPLE_QUILTED_WOOL, "purple_quilted_wool");
		Lepton.registerBlock(BLUE_QUILTED_WOOL, "blue_quilted_wool");
		Lepton.registerBlock(BROWN_QUILTED_WOOL, "brown_quilted_wool");
		Lepton.registerBlock(GREEN_QUILTED_WOOL, "green_quilted_wool");
		Lepton.registerBlock(RED_QUILTED_WOOL, "red_quilted_wool");
		Lepton.registerBlock(BLACK_QUILTED_WOOL, "black_quilted_wool");
	}
	
	@Override
	public String getName() {
		return "quilted_wool";
	}
}
