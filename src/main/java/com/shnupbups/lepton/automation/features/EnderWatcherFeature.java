package com.shnupbups.lepton.automation.features;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.automation.AutomationFeature;
import com.shnupbups.lepton.automation.block.EnderWatcherBlock;
import com.shnupbups.lepton.automation.block.entity.EnderWatcherBlockEntity;

public class EnderWatcherFeature extends AutomationFeature {
	public static final EnderWatcherFeature INSTANCE = new EnderWatcherFeature();
	
	public static final Block ENDER_WATCHER = new EnderWatcherBlock(FabricBlockSettings.copy(Blocks.SEA_LANTERN).build());
	
	public static final BlockEntityType<EnderWatcherBlockEntity> ENDER_WATCHER_BE_TYPE = BlockEntityType.Builder.create(EnderWatcherBlockEntity::new, ENDER_WATCHER).build(null);
	
	@Override
	protected void addStuff() {
		Lepton.registerBlock(ENDER_WATCHER, "ender_watcher", new Item.Settings().group(ItemGroup.REDSTONE));
		Registry.register(Registry.BLOCK_ENTITY, Lepton.id("ender_watcher"), ENDER_WATCHER_BE_TYPE);
	}
	
	@Override
	public String getName() {
		return "ender_watcher";
	}
}
