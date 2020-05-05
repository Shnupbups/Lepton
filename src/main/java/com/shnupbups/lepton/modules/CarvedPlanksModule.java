package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;

public class CarvedPlanksModule extends LeptonModule {
	public static final CarvedPlanksModule INSTANCE = new CarvedPlanksModule();
	
	public static final Block CARVED_OAK_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final Block CARVED_SPRUCE_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS));
	public static final Block CARVED_BIRCH_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS));
	public static final Block CARVED_JUNGLE_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS));
	public static final Block CARVED_ACACIA_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS));
	public static final Block CARVED_DARK_OAK_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS));
	
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
