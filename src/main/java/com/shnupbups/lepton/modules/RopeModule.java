package com.shnupbups.lepton.modules;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.block.RopeBlock;
import com.shnupbups.lepton.misc.RopeDispenserBehavior;

public class RopeModule extends LeptonModule {
	public static final RopeModule INSTANCE = new RopeModule();
	
	public static final Block ROPE = new RopeBlock(FabricBlockSettings.of(Material.WOOL, MaterialColor.BROWN).strength(0.5f, 0.5f).sounds(BlockSoundGroup.WOOL));
	
	@Override
	public void init() {
		Lepton.registerBlock(ROPE, "rope", new Item.Settings().group(ItemGroup.DECORATIONS));
		FlammableBlockRegistry.getDefaultInstance().add(ROPE, 30, 60);
		DispenserBlock.registerBehavior(ROPE, new RopeDispenserBehavior());
	}
}
