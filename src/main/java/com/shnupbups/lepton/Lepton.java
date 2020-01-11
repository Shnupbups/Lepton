package com.shnupbups.lepton;

import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import com.shnupbups.lepton.automation.AutomationModule;
import com.shnupbups.lepton.building.BuildingModule;
import com.shnupbups.lepton.world.WorldModule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Lepton implements ModInitializer {
	public static final String MOD_ID = "lepton";
	
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	
	public static final AutomationModule AUTOMATION = AutomationModule.INSTANCE;
	public static final BuildingModule BUILDING = BuildingModule.INSTANCE;
	public static final WorldModule WORLD = WorldModule.INSTANCE;
	
	@Override
	public void onInitialize() {
		AUTOMATION.init();
		BUILDING.init();
		WORLD.init();
	}
	
	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}
	
	public static <T extends Block> T registerBlock(T block, String id) {
		return registerBlock(block, id, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
	}
	
	public static <T extends Block> T registerBlock(T block, String id, Item.Settings itemSettings) {
		if(itemSettings != null) {
			return registerBlock(block, id, new BlockItem(block, itemSettings));
		} return registerBlock(block, id, (BlockItem) null);
	}
	
	public static <T extends Block> T registerBlock(T block, String id, BlockItem item) {
		Registry.register(Registry.BLOCK, id(id), block);
		if(item != null) {
			item.appendBlocks(Item.BLOCK_ITEMS, item);
			Registry.register(Registry.ITEM, id(id), item);
		}
		return block;
	}
	
	public static <T extends Item> T registerItem(T item, String id) {
		Registry.register(Registry.ITEM, id(id), item);
		return item;
	}
	
	public static void log(String text) {
		LOGGER.info(text);
	}
}
