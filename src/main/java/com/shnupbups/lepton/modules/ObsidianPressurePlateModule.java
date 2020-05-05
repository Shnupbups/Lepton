package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.ObsidianPressurePlateBlock;

public class ObsidianPressurePlateModule extends LeptonModule {
	public static final ObsidianPressurePlateModule INSTANCE = new ObsidianPressurePlateModule();
	
	public static final Block OBSIDIAN_PRESSURE_PLATE = new ObsidianPressurePlateBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).noCollision().strength(0.5F, 0.5F));
	
	@Override
	public void init() {
		Lepton.registerBlock(OBSIDIAN_PRESSURE_PLATE, "obsidian_pressure_plate", new Item.Settings().group(ItemGroup.REDSTONE));
	}
}
