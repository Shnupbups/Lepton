package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonPaneBlock;

public class FramedGlassModule extends LeptonModule {
	public static final FramedGlassModule INSTANCE = new FramedGlassModule();
	
	public static final Block FRAMED_GLASS = new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS));
	public static final Block FRAMED_GLASS_PANE = new LeptonPaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE));
	
	@Override
	public void init() {
		Lepton.registerBlock(FRAMED_GLASS, "framed_glass");
		Lepton.registerBlock(FRAMED_GLASS_PANE, "framed_glass_pane", new Item.Settings().group(ItemGroup.DECORATIONS));
	}
}
