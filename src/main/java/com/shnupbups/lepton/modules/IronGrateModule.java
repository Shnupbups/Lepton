package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.GrateBlock;

public class IronGrateModule extends LeptonModule {
	public static final IronGrateModule INSTANCE = new IronGrateModule();
	
	public static final Block IRON_GRATE = new GrateBlock(FabricBlockSettings.copy(Blocks.IRON_BARS).build());
	
	@Override
	public void init() {
		Lepton.registerBlock(IRON_GRATE, "iron_grate");
	}
}
