package com.shnupbups.lepton.building.block;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ThatchBlock extends Block {
	public ThatchBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public void onLandedUpon(World world, BlockPos pos, Entity entity, float distance) {
		entity.handleFallDamage(distance, 0.2F);
	}
}
