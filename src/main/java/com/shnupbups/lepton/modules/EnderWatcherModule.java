package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.EnderWatcherBlock;
import com.shnupbups.lepton.block.entity.EnderWatcherBlockEntity;

public class EnderWatcherModule extends LeptonModule {
	public static final EnderWatcherModule INSTANCE = new EnderWatcherModule();
	
	public static final Block ENDER_WATCHER = new EnderWatcherBlock(FabricBlockSettings.copyOf(Blocks.SEA_LANTERN));
	
	public static final BlockEntityType<EnderWatcherBlockEntity> ENDER_WATCHER_BE_TYPE = BlockEntityType.Builder.create(EnderWatcherBlockEntity::new, ENDER_WATCHER).build(null);
	
	@Override
	public void init() {
		Lepton.registerBlock(ENDER_WATCHER, "ender_watcher", new Item.Settings().group(ItemGroup.REDSTONE));
		Registry.register(Registry.BLOCK_ENTITY_TYPE, Lepton.id("ender_watcher"), ENDER_WATCHER_BE_TYPE);
	}
}
