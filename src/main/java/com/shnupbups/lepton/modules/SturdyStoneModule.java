package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.SturdyStoneBlock;

public class SturdyStoneModule extends LeptonModule {
	public static final SturdyStoneModule INSTANCE = new SturdyStoneModule();
	
	public static final Block STURDY_STONE = new SturdyStoneBlock(FabricBlockSettings.of(Material.STONE).strength(4f, 10f).sounds(BlockSoundGroup.STONE).build());
	
	@Override
	public void init() {
		Lepton.registerBlock(STURDY_STONE, "sturdy_stone", new Item.Settings().group(ItemGroup.REDSTONE));
	}
}
