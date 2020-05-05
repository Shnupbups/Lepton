package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;

public class QuiltedWoolModule extends LeptonModule {
	public static final QuiltedWoolModule INSTANCE = new QuiltedWoolModule();
	
	public static final Block WHITE_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block ORANGE_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL));
	public static final Block MAGENTA_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL));
	public static final Block LIGHT_BLUE_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL));
	public static final Block YELLOW_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL));
	public static final Block LIME_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.LIME_WOOL));
	public static final Block PINK_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.PINK_WOOL));
	public static final Block GRAY_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL));
	public static final Block LIGHT_GRAY_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL));
	public static final Block CYAN_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL));
	public static final Block PURPLE_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL));
	public static final Block BLUE_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL));
	public static final Block BROWN_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL));
	public static final Block GREEN_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.GREEN_WOOL));
	public static final Block RED_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.RED_WOOL));
	public static final Block BLACK_QUILTED_WOOL = new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL));
	
	@Override
	public void init() {
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
}
