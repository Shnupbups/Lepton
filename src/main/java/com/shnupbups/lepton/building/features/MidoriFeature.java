package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;
import com.shnupbups.lepton.core.block.LeptonStairsBlock;

public class MidoriFeature extends BuildingFeature {
	public static final MidoriFeature INSTANCE = new MidoriFeature();
	
	public static final Item CACTUS_PASTE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	
	public static final Block MIDORI_BLOCK = new Block(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK).materialColor(MaterialColor.LIME).build());
	public static final Block MIDORI_STAIRS = new LeptonStairsBlock(MIDORI_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.PURPUR_STAIRS).materialColor(MaterialColor.LIME).build());
	public static final Block MIDORI_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.PURPUR_SLAB).materialColor(MaterialColor.LIME).build());
	public static final Block MIDORI_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK).materialColor(MaterialColor.LIME).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerItem(CACTUS_PASTE, "cactus_paste");
		
		Lepton.registerBlock(MIDORI_BLOCK, "midori_block");
		Lepton.registerBlock(MIDORI_STAIRS, "midori_stairs");
		Lepton.registerBlock(MIDORI_SLAB, "midori_slab");
		Lepton.registerBlock(MIDORI_PILLAR, "midori_pillar");
	}
	
	@Override
	public String getName() {
		return "midori";
	}
}
