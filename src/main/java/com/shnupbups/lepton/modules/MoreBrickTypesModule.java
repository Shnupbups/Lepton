package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.LeptonStairsBlock;

public class MoreBrickTypesModule extends LeptonModule {
	public static final MoreBrickTypesModule INSTANCE = new MoreBrickTypesModule();
	
	public static final Block SANDY_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS).materialColor(MaterialColor.SAND));
	public static final Block SANDY_BRICK_STAIRS = new LeptonStairsBlock(SANDY_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BRICK_STAIRS).materialColor(MaterialColor.SAND));
	public static final Block SANDY_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BRICK_SLAB).materialColor(MaterialColor.SAND));
	public static final Block SANDY_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.BRICK_WALL).materialColor(MaterialColor.SAND));
	
	public static final Block SNOW_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS).materialColor(MaterialColor.WHITE));
	public static final Block SNOW_BRICK_STAIRS = new LeptonStairsBlock(SNOW_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BRICK_STAIRS).materialColor(MaterialColor.WHITE));
	public static final Block SNOW_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BRICK_SLAB).materialColor(MaterialColor.WHITE));
	public static final Block SNOW_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.BRICK_WALL).materialColor(MaterialColor.WHITE));
	
	public static final Block CHARRED_NETHER_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS).materialColor(MaterialColor.BLACK));
	public static final Block CHARRED_NETHER_BRICK_STAIRS = new LeptonStairsBlock(CHARRED_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BRICK_STAIRS).materialColor(MaterialColor.BLACK));
	public static final Block CHARRED_NETHER_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BRICK_SLAB).materialColor(MaterialColor.BLACK));
	public static final Block CHARRED_NETHER_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.BRICK_WALL).materialColor(MaterialColor.BLACK));
	
	public static final Block SANDSTONE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS).materialColor(MaterialColor.SAND));
	public static final Block SANDSTONE_BRICK_STAIRS = new LeptonStairsBlock(SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BRICK_STAIRS).materialColor(MaterialColor.SAND));
	public static final Block SANDSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BRICK_SLAB).materialColor(MaterialColor.SAND));
	public static final Block SANDSTONE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.BRICK_WALL).materialColor(MaterialColor.SAND));
	
	public static final Block RED_SANDSTONE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS).materialColor(MaterialColor.ORANGE));
	public static final Block RED_SANDSTONE_BRICK_STAIRS = new LeptonStairsBlock(RED_SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BRICK_STAIRS).materialColor(MaterialColor.ORANGE));
	public static final Block RED_SANDSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BRICK_SLAB).materialColor(MaterialColor.ORANGE));
	public static final Block RED_SANDSTONE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.BRICK_WALL).materialColor(MaterialColor.ORANGE));
	
	public static final Block SOUL_SANDSTONE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS).materialColor(MaterialColor.BROWN));
	public static final Block SOUL_SANDSTONE_BRICK_STAIRS = new LeptonStairsBlock(SOUL_SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BRICK_STAIRS).materialColor(MaterialColor.BROWN));
	public static final Block SOUL_SANDSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BRICK_SLAB).materialColor(MaterialColor.BROWN));
	public static final Block SOUL_SANDSTONE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.BRICK_WALL).materialColor(MaterialColor.BROWN));
	
	private static final FabricBlockSettings MAGMA_BRICK_SETTINGS = FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).strength(1.5f, 10f);
	
	public static final Block MAGMA_BRICKS = new Block(MAGMA_BRICK_SETTINGS);
	public static final Block MAGMA_BRICK_STAIRS = new LeptonStairsBlock(MAGMA_BRICKS.getDefaultState(), MAGMA_BRICK_SETTINGS);
	public static final Block MAGMA_BRICK_SLAB = new SlabBlock(MAGMA_BRICK_SETTINGS);
	public static final Block MAGMA_BRICK_WALL = new WallBlock(MAGMA_BRICK_SETTINGS);
	
	@Override
	public void init() {
		Lepton.registerBlock(SANDY_BRICKS, "sandy_bricks");
		Lepton.registerBlock(SANDY_BRICK_STAIRS, "sandy_brick_stairs");
		Lepton.registerBlock(SANDY_BRICK_SLAB, "sandy_brick_slab");
		Lepton.registerBlock(SANDY_BRICK_WALL, "sandy_brick_wall");
		
		Lepton.registerBlock(SNOW_BRICKS, "snow_bricks");
		Lepton.registerBlock(SNOW_BRICK_STAIRS, "snow_brick_stairs");
		Lepton.registerBlock(SNOW_BRICK_SLAB, "snow_brick_slab");
		Lepton.registerBlock(SNOW_BRICK_WALL, "snow_brick_wall");
		
		Lepton.registerBlock(CHARRED_NETHER_BRICKS, "charred_nether_bricks");
		Lepton.registerBlock(CHARRED_NETHER_BRICK_STAIRS, "charred_nether_brick_stairs");
		Lepton.registerBlock(CHARRED_NETHER_BRICK_SLAB, "charred_nether_brick_slab");
		Lepton.registerBlock(CHARRED_NETHER_BRICK_WALL, "charred_nether_brick_wall");
		
		Lepton.registerBlock(SANDSTONE_BRICKS, "sandstone_bricks");
		Lepton.registerBlock(SANDSTONE_BRICK_STAIRS, "sandstone_brick_stairs");
		Lepton.registerBlock(SANDSTONE_BRICK_SLAB, "sandstone_brick_slab");
		Lepton.registerBlock(SANDSTONE_BRICK_WALL, "sandstone_brick_wall");
		
		Lepton.registerBlock(RED_SANDSTONE_BRICKS, "red_sandstone_bricks");
		Lepton.registerBlock(RED_SANDSTONE_BRICK_STAIRS, "red_sandstone_brick_stairs");
		Lepton.registerBlock(RED_SANDSTONE_BRICK_SLAB, "red_sandstone_brick_slab");
		Lepton.registerBlock(RED_SANDSTONE_BRICK_WALL, "red_sandstone_brick_wall");
		
		if (SoulSandstoneModule.INSTANCE.isEnabled()) {
			Lepton.registerBlock(SOUL_SANDSTONE_BRICKS, "soul_sandstone_bricks");
			Lepton.registerBlock(SOUL_SANDSTONE_BRICK_STAIRS, "soul_sandstone_brick_stairs");
			Lepton.registerBlock(SOUL_SANDSTONE_BRICK_SLAB, "soul_sandstone_brick_slab");
			Lepton.registerBlock(SOUL_SANDSTONE_BRICK_WALL, "soul_sandstone_brick_wall");
		}
		
		Lepton.registerBlock(MAGMA_BRICKS, "magma_bricks");
		Lepton.registerBlock(MAGMA_BRICK_STAIRS, "magma_brick_stairs");
		Lepton.registerBlock(MAGMA_BRICK_SLAB, "magma_brick_slab");
		Lepton.registerBlock(MAGMA_BRICK_WALL, "magma_brick_wall");
	}
}
