package com.shnupbups.lepton.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class MagmaBrickSlabBlock extends SlabBlock {
	public MagmaBrickSlabBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public boolean allowsSpawning(BlockState state, BlockView view, BlockPos pos, EntityType<?> type) {
		return type.isFireImmune() && super.allowsSpawning(state, view, pos, type);
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
