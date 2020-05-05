package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;

public class NetherBrickFenceGateModule extends LeptonModule {
	public static final NetherBrickFenceGateModule INSTANCE = new NetherBrickFenceGateModule();
	
	public static final Block NETHER_BRICK_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_FENCE));
	
	@Override
	public void init() {
		Lepton.registerBlock(NETHER_BRICK_FENCE_GATE, "nether_brick_fence_gate", new Item.Settings().group(ItemGroup.DECORATIONS));
	}
}
