package com.shnupbups.lepton.building.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.block.FabricMaterialBuilder;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.sound.BlockSoundGroup;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.building.BuildingFeature;
import com.shnupbups.lepton.building.block.SturdyStoneBlock;

public class SturdyStoneFeature extends BuildingFeature {
	public static final SturdyStoneFeature INSTANCE = new SturdyStoneFeature();
	
	public static final Block STURDY_STONE = new SturdyStoneBlock(FabricBlockSettings.of(Material.STONE).strength(4f, 10f).sounds(BlockSoundGroup.STONE).build());
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(STURDY_STONE, "sturdy_stone");
	}
	
	@Override
	public String getName() {
		return "sturdy_stone";
	}
}
