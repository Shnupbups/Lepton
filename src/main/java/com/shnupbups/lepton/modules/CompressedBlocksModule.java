package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;

public class CompressedBlocksModule extends LeptonModule {
	public static final CompressedBlocksModule INSTANCE = new CompressedBlocksModule();
	public static final Block CHARCOAL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK));
	public static final Block BLAZE_LANTERN = new Block(FabricBlockSettings.copyOf(Blocks.SEA_LANTERN).materialColor(DyeColor.YELLOW));
	private static final FabricBlockSettings PILLAR_SETTINGS = FabricBlockSettings.of(Material.WOOD).strength(0.5f, 0.5f).sounds(BlockSoundGroup.WOOD);
	public static final Block SUGAR_CANE_BUNDLE = new PillarBlock(PILLAR_SETTINGS.materialColor(MaterialColor.LIME));
	public static final Block BAMBOO_BUNDLE = new PillarBlock(PILLAR_SETTINGS.materialColor(MaterialColor.YELLOW));
	public static final Block CACTUS_BATCH = new PillarBlock(PILLAR_SETTINGS.materialColor(MaterialColor.GREEN));
	public static final Block CHORUS_FRUIT_BATCH = new PillarBlock(PILLAR_SETTINGS.materialColor(MaterialColor.PURPLE));
	public static final Block STICK_STACK = new PillarBlock(PILLAR_SETTINGS.materialColor(MaterialColor.WOOD));
	private static final FabricBlockSettings CRATE_SETTINGS = FabricBlockSettings.of(Material.WOOD).strength(1.5f, 1.5f).sounds(BlockSoundGroup.WOOD);
	public static final Block GOLDEN_APPLE_CRATE = new Block(CRATE_SETTINGS.materialColor(MaterialColor.GOLD));
	public static final Block APPLE_CRATE = new Block(CRATE_SETTINGS.materialColor(MaterialColor.RED));
	public static final Block POTATO_CRATE = new Block(CRATE_SETTINGS.materialColor(MaterialColor.ORANGE));
	public static final Block CARROT_CRATE = new Block(CRATE_SETTINGS.materialColor(MaterialColor.ORANGE_TERRACOTTA));
	public static final Block BEETROOT_CRATE = new Block(CRATE_SETTINGS.materialColor(MaterialColor.RED));
	private static final FabricBlockSettings SACK_SETTINGS = FabricBlockSettings.of(Material.WOOL).strength(0.5f, 0.5f).sounds(BlockSoundGroup.WOOL);
	public static final Block COCOA_BEAN_SACK = new Block(SACK_SETTINGS.materialColor(MaterialColor.BROWN));
	public static final Block NETHER_WART_SACK = new Block(SACK_SETTINGS.materialColor(MaterialColor.RED));
	public static final Block GUNPOWDER_SACK = new Block(SACK_SETTINGS.materialColor(MaterialColor.GRAY));
	public static final Block SWEET_BERRY_SACK = new Block(SACK_SETTINGS.materialColor(MaterialColor.RED));
	
	@Override
	public void init() {
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
}
