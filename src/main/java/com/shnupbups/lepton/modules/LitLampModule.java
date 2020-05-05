package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;

public class LitLampModule extends LeptonModule {
	public static final LitLampModule INSTANCE = new LitLampModule();
	
	public static final Block LIT_LAMP = new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP).lightLevel(15));
	
	@Override
	public void init() {
		Lepton.registerBlock(LIT_LAMP, "lit_lamp");
	}
}
