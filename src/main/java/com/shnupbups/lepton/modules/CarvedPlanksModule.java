package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;

public class CarvedPlanksModule extends LeptonModule {
	public static final CarvedPlanksModule INSTANCE = new CarvedPlanksModule();
	
	public static final Block CARVED_OAK_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).build());
	public static final Block CARVED_SPRUCE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).build());
	public static final Block CARVED_BIRCH_PLANKS = new Block(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).build());
	public static final Block CARVED_JUNGLE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).build());
	public static final Block CARVED_ACACIA_PLANKS = new Block(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).build());
	public static final Block CARVED_DARK_OAK_PLANKS = new Block(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).build());
	
	@Override
	public void init() {
		Lepton.registerBlock(CARVED_OAK_PLANKS, "carved_oak_planks");
		Lepton.registerBlock(CARVED_SPRUCE_PLANKS, "carved_spruce_planks");
		Lepton.registerBlock(CARVED_BIRCH_PLANKS, "carved_birch_planks");
		Lepton.registerBlock(CARVED_JUNGLE_PLANKS, "carved_jungle_planks");
		Lepton.registerBlock(CARVED_ACACIA_PLANKS, "carved_acacia_planks");
		Lepton.registerBlock(CARVED_DARK_OAK_PLANKS, "carved_dark_oak_planks");
	}
}
