package com.shnupbups.lepton.world.feature;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.core.block.LeptonStairsBlock;
import com.shnupbups.lepton.world.WorldFeature;

import java.util.ArrayList;
import java.util.List;

public class NewStoneTypesFeature extends WorldFeature {
	public static final NewStoneTypesFeature INSTANCE = new NewStoneTypesFeature();
	
	public static final Block MARBLE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).materialColor(MaterialColor.QUARTZ).build());
	public static final Block MARBLE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE_SLAB).materialColor(MaterialColor.QUARTZ).build());
	public static final Block MARBLE_STAIRS = new LeptonStairsBlock(MARBLE.getDefaultState(), FabricBlockSettings.copy(Blocks.GRANITE_STAIRS).materialColor(MaterialColor.QUARTZ).build());
	public static final Block MARBLE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.GRANITE_WALL).materialColor(MaterialColor.QUARTZ).build());
	public static final Block POLISHED_MARBLE = new Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE).materialColor(MaterialColor.QUARTZ).build());
	public static final Block POLISHED_MARBLE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE_SLAB).materialColor(MaterialColor.QUARTZ).build());
	public static final Block POLISHED_MARBLE_STAIRS = new LeptonStairsBlock(POLISHED_MARBLE.getDefaultState(), FabricBlockSettings.copy(Blocks.POLISHED_GRANITE_STAIRS).materialColor(MaterialColor.QUARTZ).build());
	
	public static final Block LIMESTONE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).materialColor(MaterialColor.STONE).build());
	public static final Block LIMESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE_SLAB).materialColor(MaterialColor.STONE).build());
	public static final Block LIMESTONE_STAIRS = new LeptonStairsBlock(LIMESTONE.getDefaultState(), FabricBlockSettings.copy(Blocks.GRANITE_STAIRS).materialColor(MaterialColor.STONE).build());
	public static final Block LIMESTONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.GRANITE_WALL).materialColor(MaterialColor.STONE).build());
	public static final Block POLISHED_LIMESTONE = new Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE).materialColor(MaterialColor.STONE).build());
	public static final Block POLISHED_LIMESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE_SLAB).materialColor(MaterialColor.STONE).build());
	public static final Block POLISHED_LIMESTONE_STAIRS = new LeptonStairsBlock(POLISHED_LIMESTONE.getDefaultState(), FabricBlockSettings.copy(Blocks.POLISHED_GRANITE_STAIRS).materialColor(MaterialColor.STONE).build());
	
	public static final Block JASPER = new Block(FabricBlockSettings.copy(Blocks.GRANITE).materialColor(MaterialColor.RED_TERRACOTTA).build());
	public static final Block JASPER_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE_SLAB).materialColor(MaterialColor.RED_TERRACOTTA).build());
	public static final Block JASPER_STAIRS = new LeptonStairsBlock(JASPER.getDefaultState(), FabricBlockSettings.copy(Blocks.GRANITE_STAIRS).materialColor(MaterialColor.RED_TERRACOTTA).build());
	public static final Block JASPER_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.GRANITE_WALL).materialColor(MaterialColor.RED_TERRACOTTA).build());
	public static final Block POLISHED_JASPER = new Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE).materialColor(MaterialColor.RED_TERRACOTTA).build());
	public static final Block POLISHED_JASPER_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE_SLAB).materialColor(MaterialColor.RED_TERRACOTTA).build());
	public static final Block POLISHED_JASPER_STAIRS = new LeptonStairsBlock(POLISHED_JASPER.getDefaultState(), FabricBlockSettings.copy(Blocks.POLISHED_GRANITE_STAIRS).materialColor(MaterialColor.RED_TERRACOTTA).build());
	
	public static final Block SLATE = new Block(FabricBlockSettings.copy(Blocks.GRANITE).materialColor(MaterialColor.ICE).build());
	public static final Block SLATE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE_SLAB).materialColor(MaterialColor.ICE).build());
	public static final Block SLATE_STAIRS = new LeptonStairsBlock(SLATE.getDefaultState(), FabricBlockSettings.copy(Blocks.GRANITE_STAIRS).materialColor(MaterialColor.ICE).build());
	public static final Block SLATE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.GRANITE_WALL).materialColor(MaterialColor.ICE).build());
	public static final Block POLISHED_SLATE = new Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE).materialColor(MaterialColor.ICE).build());
	public static final Block POLISHED_SLATE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE_SLAB).materialColor(MaterialColor.ICE).build());
	public static final Block POLISHED_SLATE_STAIRS = new LeptonStairsBlock(POLISHED_SLATE.getDefaultState(), FabricBlockSettings.copy(Blocks.POLISHED_GRANITE_STAIRS).materialColor(MaterialColor.ICE).build());
	
	public static final Block BASALT = new Block(FabricBlockSettings.copy(Blocks.GRANITE).materialColor(MaterialColor.BLACK).build());
	public static final Block BASALT_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE_SLAB).materialColor(MaterialColor.BLACK).build());
	public static final Block BASALT_STAIRS = new LeptonStairsBlock(BASALT.getDefaultState(), FabricBlockSettings.copy(Blocks.GRANITE_STAIRS).materialColor(MaterialColor.BLACK).build());
	public static final Block BASALT_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.GRANITE_WALL).materialColor(MaterialColor.BLACK).build());
	public static final Block POLISHED_BASALT = new Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE).materialColor(MaterialColor.BLACK).build());
	public static final Block POLISHED_BASALT_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE_SLAB).materialColor(MaterialColor.BLACK).build());
	public static final Block POLISHED_BASALT_STAIRS = new LeptonStairsBlock(POLISHED_BASALT.getDefaultState(), FabricBlockSettings.copy(Blocks.POLISHED_GRANITE_STAIRS).materialColor(MaterialColor.BLACK).build());
	
	private static List<Biome> addedBiomes = new ArrayList<>();
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(MARBLE, "marble");
		Lepton.registerBlock(MARBLE_SLAB, "marble_slab");
		Lepton.registerBlock(MARBLE_STAIRS, "marble_stairs");
		Lepton.registerBlock(MARBLE_WALL, "marble_wall");
		Lepton.registerBlock(POLISHED_MARBLE, "polished_marble");
		Lepton.registerBlock(POLISHED_MARBLE_SLAB, "polished_marble_slab");
		Lepton.registerBlock(POLISHED_MARBLE_STAIRS, "polished_marble_stairs");
		
		Lepton.registerBlock(LIMESTONE, "limestone");
		Lepton.registerBlock(LIMESTONE_SLAB, "limestone_slab");
		Lepton.registerBlock(LIMESTONE_STAIRS, "limestone_stairs");
		Lepton.registerBlock(LIMESTONE_WALL, "limestone_wall");
		Lepton.registerBlock(POLISHED_LIMESTONE, "polished_limestone");
		Lepton.registerBlock(POLISHED_LIMESTONE_SLAB, "polished_limestone_slab");
		Lepton.registerBlock(POLISHED_LIMESTONE_STAIRS, "polished_limestone_stairs");
		
		Lepton.registerBlock(JASPER, "jasper");
		Lepton.registerBlock(JASPER_SLAB, "jasper_slab");
		Lepton.registerBlock(JASPER_STAIRS, "jasper_stairs");
		Lepton.registerBlock(JASPER_WALL, "jasper_wall");
		Lepton.registerBlock(POLISHED_JASPER, "polished_jasper");
		Lepton.registerBlock(POLISHED_JASPER_SLAB, "polished_jasper_slab");
		Lepton.registerBlock(POLISHED_JASPER_STAIRS, "polished_jasper_stairs");
		
		Lepton.registerBlock(SLATE, "slate");
		Lepton.registerBlock(SLATE_SLAB, "slate_slab");
		Lepton.registerBlock(SLATE_STAIRS, "slate_stairs");
		Lepton.registerBlock(SLATE_WALL, "slate_wall");
		Lepton.registerBlock(POLISHED_SLATE, "polished_slate");
		Lepton.registerBlock(POLISHED_SLATE_SLAB, "polished_slate_slab");
		Lepton.registerBlock(POLISHED_SLATE_STAIRS, "polished_slate_stairs");
		
		Lepton.registerBlock(BASALT, "basalt");
		Lepton.registerBlock(BASALT_SLAB, "basalt_slab");
		Lepton.registerBlock(BASALT_STAIRS, "basalt_stairs");
		Lepton.registerBlock(BASALT_WALL, "basalt_wall");
		Lepton.registerBlock(POLISHED_BASALT, "polished_basalt");
		Lepton.registerBlock(POLISHED_BASALT_SLAB, "polished_basalt_slab");
		Lepton.registerBlock(POLISHED_BASALT_STAIRS, "polished_basalt_stairs");
		
		for(Biome biome : Registry.BIOME) {
			if(!addedBiomes.contains(biome)) {
				addedBiomes.add(biome);
				if(biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.NETHER) {
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, MARBLE.getDefaultState(), 33)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(10, 0, 0, 80))));
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, LIMESTONE.getDefaultState(), 33)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(10, 0, 0, 80))));
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, JASPER.getDefaultState(), 33)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(10, 0, 0, 80))));
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, SLATE.getDefaultState(), 33)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(10, 0, 0, 80))));
					biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, BASALT.getDefaultState(), 33)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(10, 0, 0, 80))));
				}
			}
		}
	}
	
	@Override
	public String getName() {
		return "new_stone_types";
	}
}
