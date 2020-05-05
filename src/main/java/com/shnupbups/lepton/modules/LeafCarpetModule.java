package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonCarpetBlock;

public class LeafCarpetModule extends LeptonModule {
	public static final LeafCarpetModule INSTANCE = new LeafCarpetModule();
	
	public static final Block OAK_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
	public static final Block SPRUCE_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES));
	public static final Block BIRCH_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LEAVES));
	public static final Block JUNGLE_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES));
	public static final Block ACACIA_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LEAVES));
	public static final Block DARK_OAK_LEAF_CARPET = new LeptonCarpetBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES));
	
	@Override
	public void init() {
		Lepton.registerBlock(OAK_LEAF_CARPET, "oak_leaf_carpet", new Item.Settings().group(ItemGroup.DECORATIONS));
		Lepton.registerBlock(SPRUCE_LEAF_CARPET, "spruce_leaf_carpet", new Item.Settings().group(ItemGroup.DECORATIONS));
		Lepton.registerBlock(BIRCH_LEAF_CARPET, "birch_leaf_carpet", new Item.Settings().group(ItemGroup.DECORATIONS));
		Lepton.registerBlock(JUNGLE_LEAF_CARPET, "jungle_leaf_carpet", new Item.Settings().group(ItemGroup.DECORATIONS));
		Lepton.registerBlock(ACACIA_LEAF_CARPET, "acacia_leaf_carpet", new Item.Settings().group(ItemGroup.DECORATIONS));
		Lepton.registerBlock(DARK_OAK_LEAF_CARPET, "dark_oak_leaf_carpet", new Item.Settings().group(ItemGroup.DECORATIONS));
	}
}
