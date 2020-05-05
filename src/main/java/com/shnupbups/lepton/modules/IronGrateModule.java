package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.GrateBlock;

public class IronGrateModule extends LeptonModule {
	public static final IronGrateModule INSTANCE = new IronGrateModule();
	
	public static final Block IRON_GRATE = new GrateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).allowsSpawning((state, world, pos, type) -> false).dynamicBounds().suffocates((state, world, pos) -> false));
	
	@Override
	public void init() {
		Lepton.registerBlock(IRON_GRATE, "iron_grate");
	}
}
