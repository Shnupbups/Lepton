package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.BiotiteOreBlock;
import com.shnupbups.lepton.block.LeptonStairsBlock;

public class BiotiteModule extends LeptonModule {
	public static final BiotiteModule INSTANCE = new BiotiteModule();
	
	public static final Item BIOTITE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	
	public static final Block BIOTITE_ORE = new BiotiteOreBlock(FabricBlockSettings.copy(Blocks.END_STONE).strength(3.2F, 15F).build());
	public static final Block BIOTITE_BLOCK = new Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK).materialColor(MaterialColor.BLACK).build());
	public static final Block BIOTITE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.QUARTZ_SLAB).materialColor(MaterialColor.BLACK).build());
	public static final Block BIOTITE_STAIRS = new LeptonStairsBlock(BIOTITE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.QUARTZ_STAIRS).materialColor(MaterialColor.BLACK).build());
	public static final Block SMOOTH_BIOTITE = new Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).materialColor(MaterialColor.BLACK).build());
	public static final Block SMOOTH_BIOTITE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ_SLAB).materialColor(MaterialColor.BLACK).build());
	public static final Block SMOOTH_BIOTITE_STAIRS = new LeptonStairsBlock(SMOOTH_BIOTITE.getDefaultState(), FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ_STAIRS).materialColor(MaterialColor.BLACK).build());
	public static final Block CHISELED_BIOTITE_BLOCK = new Block(FabricBlockSettings.copy(Blocks.CHISELED_QUARTZ_BLOCK).materialColor(MaterialColor.BLACK).build());
	public static final Block BIOTITE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).materialColor(MaterialColor.BLACK).build());
	
	@Override
	public void init() {
		Lepton.registerItem(BIOTITE, "biotite");
		
		Lepton.registerBlock(BIOTITE_ORE, "biotite_ore");
		Lepton.registerBlock(BIOTITE_BLOCK, "biotite_block");
		Lepton.registerBlock(BIOTITE_SLAB, "biotite_slab");
		Lepton.registerBlock(BIOTITE_STAIRS, "biotite_stairs");
		Lepton.registerBlock(SMOOTH_BIOTITE, "smooth_biotite");
		Lepton.registerBlock(SMOOTH_BIOTITE_SLAB, "smooth_biotite_slab");
		Lepton.registerBlock(SMOOTH_BIOTITE_STAIRS, "smooth_biotite_stairs");
		Lepton.registerBlock(CHISELED_BIOTITE_BLOCK, "chiseled_biotite_block");
		Lepton.registerBlock(BIOTITE_PILLAR, "biotite_pillar");
	}
}
