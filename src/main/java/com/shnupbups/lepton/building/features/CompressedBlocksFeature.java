package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;

public class CompressedBlocksFeature extends BuildingFeature {
	public static final CompressedBlocksFeature INSTANCE = new CompressedBlocksFeature();
	
	private static final FabricBlockSettings PILLAR_SETTINGS = FabricBlockSettings.of(Material.WOOD).strength(0.5f, 0.5f).sounds(BlockSoundGroup.WOOD);
	private static final FabricBlockSettings CRATE_SETTINGS = FabricBlockSettings.of(Material.WOOD).strength(1.5f, 1.5f).sounds(BlockSoundGroup.WOOD);
	private static final FabricBlockSettings SACK_SETTINGS = FabricBlockSettings.of(Material.WOOL).strength(0.5f, 0.5f).sounds(BlockSoundGroup.WOOL);
	
	public static final Block CHARCOAL_BLOCK = new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK).build());
	
	public static final Block SUGAR_CANE_BUNDLE = new PillarBlock(PILLAR_SETTINGS.materialColor(MaterialColor.LIME).build());
	public static final Block BAMBOO_BUNDLE = new PillarBlock(PILLAR_SETTINGS.materialColor(MaterialColor.YELLOW).build());
	public static final Block CACTUS_BATCH = new PillarBlock(PILLAR_SETTINGS.materialColor(MaterialColor.GREEN).build());
	public static final Block CHORUS_FRUIT_BATCH = new PillarBlock(PILLAR_SETTINGS.materialColor(MaterialColor.PURPLE).build());
	public static final Block STICK_STACK = new PillarBlock(PILLAR_SETTINGS.materialColor(MaterialColor.WOOD).build());
	
	public static final Block GOLDEN_APPLE_CRATE = new Block(CRATE_SETTINGS.materialColor(MaterialColor.GOLD).build());
	public static final Block APPLE_CRATE = new Block(CRATE_SETTINGS.materialColor(MaterialColor.RED).build());
	public static final Block POTATO_CRATE = new Block(CRATE_SETTINGS.materialColor(MaterialColor.ORANGE).build());
	public static final Block CARROT_CRATE = new Block(CRATE_SETTINGS.materialColor(MaterialColor.ORANGE_TERRACOTTA).build());
	public static final Block BEETROOT_CRATE = new Block(CRATE_SETTINGS.materialColor(MaterialColor.RED).build());
	
	public static final Block COCOA_BEAN_SACK = new Block(SACK_SETTINGS.materialColor(MaterialColor.BROWN).build());
	public static final Block NETHER_WART_SACK = new Block(SACK_SETTINGS.materialColor(MaterialColor.RED).build());
	public static final Block GUNPOWDER_SACK = new Block(SACK_SETTINGS.materialColor(MaterialColor.GRAY).build());
	public static final Block SWEET_BERRY_SACK = new Block(SACK_SETTINGS.materialColor(MaterialColor.RED).build());
	
	public static final Block BLAZE_LANTERN = new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).materialColor(DyeColor.YELLOW).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(CHARCOAL_BLOCK, "charcoal_block");
		
		Lepton.registerBlock(SUGAR_CANE_BUNDLE, "sugar_cane_bundle");
		Lepton.registerBlock(BAMBOO_BUNDLE, "bamboo_bundle");
		Lepton.registerBlock(CACTUS_BATCH, "cactus_batch");
		Lepton.registerBlock(CHORUS_FRUIT_BATCH, "chorus_fruit_batch");
		Lepton.registerBlock(STICK_STACK, "stick_stack");
		
		Lepton.registerBlock(GOLDEN_APPLE_CRATE, "golden_apple_crate");
		Lepton.registerBlock(APPLE_CRATE, "apple_crate");
		Lepton.registerBlock(POTATO_CRATE, "potato_crate");
		Lepton.registerBlock(CARROT_CRATE, "carrot_crate");
		Lepton.registerBlock(BEETROOT_CRATE, "beetroot_crate");
		
		Lepton.registerBlock(COCOA_BEAN_SACK, "cocoa_bean_sack");
		Lepton.registerBlock(NETHER_WART_SACK, "nether_wart_sack");
		Lepton.registerBlock(GUNPOWDER_SACK, "gunpowder_sack");
		Lepton.registerBlock(SWEET_BERRY_SACK, "sweet_berry_sack");
		
		Lepton.registerBlock(BLAZE_LANTERN, "blaze_lantern");
	}
	
	@Override
	public String getName() {
		return "compressed_blocks";
	}
}
