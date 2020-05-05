package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonStairsBlock;

public class MidoriModule extends LeptonModule {
	public static final MidoriModule INSTANCE = new MidoriModule();
	
	public static final Item CACTUS_PASTE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	
	public static final Block MIDORI_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK).materialColor(MaterialColor.LIME));
	public static final Block MIDORI_STAIRS = new LeptonStairsBlock(MIDORI_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PURPUR_STAIRS).materialColor(MaterialColor.LIME));
	public static final Block MIDORI_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_SLAB).materialColor(MaterialColor.LIME));
	public static final Block MIDORI_PILLAR = new PillarBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK).materialColor(MaterialColor.LIME));
	
	@Override
	public void init() {
		Lepton.registerItem(CACTUS_PASTE, "cactus_paste");
		
		Lepton.registerBlock(MIDORI_BLOCK, "midori_block");
		Lepton.registerBlock(MIDORI_STAIRS, "midori_stairs");
		Lepton.registerBlock(MIDORI_SLAB, "midori_slab");
		Lepton.registerBlock(MIDORI_PILLAR, "midori_pillar");
	}
}
