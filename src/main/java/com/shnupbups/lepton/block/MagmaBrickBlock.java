package com.shnupbups.lepton.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class MagmaBrickBlock extends Block {
	public MagmaBrickBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public boolean allowsSpawning(BlockState state, BlockView view, BlockPos pos, EntityType<?> type) {
		return type.isFireImmune();
	}
	
	@Environment(EnvType.CLIENT)
	@Override
	public boolean hasEmissiveLighting(BlockState state) {
		return true;
	}
	
	@Override
	public boolean shouldPostProcess(BlockState state, BlockView view, BlockPos pos) {
		return true;
	}
}
