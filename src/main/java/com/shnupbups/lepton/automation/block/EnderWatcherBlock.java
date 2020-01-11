package com.shnupbups.lepton.automation.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

import com.shnupbups.lepton.automation.block.entity.EnderWatcherBlockEntity;

import javax.annotation.Nullable;

public class EnderWatcherBlock extends Block implements BlockEntityProvider {
	public static final BooleanProperty WATCHED = BooleanProperty.of("watched");
	
	public EnderWatcherBlock(Settings settings) {
		super(settings);
		this.setDefaultState(this.getDefaultState().with(WATCHED, false));
	}
	
	@Nullable
	@Override
	public BlockEntity createBlockEntity(BlockView view) {
		return new EnderWatcherBlockEntity();
	}
	
	@Override
	public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(WATCHED);
	}
	
	@Override
	public int getWeakRedstonePower(BlockState state, BlockView view, BlockPos pos, Direction facing) {
		return state.get(WATCHED) ? 15 : 0;
	}
	
	@Override
	public boolean emitsRedstonePower(BlockState state) {
		return true;
	}
	
	@Override
	public boolean hasBlockEntity() {
		return true;
	}
}
