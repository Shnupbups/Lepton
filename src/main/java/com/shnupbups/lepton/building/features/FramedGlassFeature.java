package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;
import com.shnupbups.lepton.core.LeptonPaneBlock;

public class FramedGlassFeature extends BuildingFeature {
	public static final FramedGlassFeature INSTANCE = new FramedGlassFeature();
	
	public static final Block FRAMED_GLASS = new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).build());
	public static final Block FRAMED_GLASS_PANE = new LeptonPaneBlock(FabricBlockSettings.copy(Blocks.GLASS_PANE).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(FRAMED_GLASS, "framed_glass");
		Lepton.registerBlock(FRAMED_GLASS_PANE, "framed_glass_pane");
	}
	
	@Override
	public String getName() {
		return "framed_glass";
	}
}
