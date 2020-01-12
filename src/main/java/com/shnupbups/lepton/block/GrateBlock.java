package com.shnupbups.lepton.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import com.shnupbups.lepton.helper.EntityGetter;
import it.unimi.dsi.fastutil.floats.Float2ObjectArrayMap;

import javax.annotation.Nullable;
import java.util.Optional;

public class GrateBlock extends Block implements Waterloggable {
	private static final VoxelShape TRUE_SHAPE = createCuboidShape(0, 15, 0, 16, 16, 16);
	private static final VoxelShape SPAWN_BLOCK_SHAPE = createCuboidShape(0, 15, 0, 16, 32, 16);
	private static final VoxelShape SELECTION_SHAPE;
	private static final Float2ObjectArrayMap<Float2ObjectArrayMap<VoxelShape>> WALK_BLOCK_CACHE = new Float2ObjectArrayMap<>();
	public static BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
	
	static {
		VoxelShape shape = VoxelShapes.empty();
		
		for (int x = 0; x < 4; x++)
			shape = VoxelShapes.union(shape, createCuboidShape(1 + x * 4, 15, 0, 3 + x * 4, 16, 16));
		for (int z = 0; z < 4; z++)
			shape = VoxelShapes.union(shape, createCuboidShape(0, 15, 1 + z * 4, 16, 16, 3 + z * 4));
		
		SELECTION_SHAPE = shape;
	}
	
	public GrateBlock(Settings settings) {
		super(settings);
		this.setDefaultState(getDefaultState().with(WATERLOGGED, false));
	}
	
	private static VoxelShape createNewBox(double stepHeight, double height) {
		VoxelShape shape = TRUE_SHAPE;
		
		double steps = (stepHeight + 0.0625) / height;
		for (int i = 0; i < steps; i++) {
			double plateHeight = 17 + i * 16 * height;
			double extraComponent = stepHeight - i * height;
			if (extraComponent < 1 / height)
				plateHeight += extraComponent * 16;
			shape = VoxelShapes.union(shape, createCuboidShape(0, plateHeight - 1, 0, 16, plateHeight, 16));
		}
		
		return shape;
	}
	
	private static VoxelShape getCachedShape(float stepHeight, float height) {
		Float2ObjectArrayMap<VoxelShape> heightMap = WALK_BLOCK_CACHE.computeIfAbsent(stepHeight, (k) -> new Float2ObjectArrayMap<>());
		return heightMap.computeIfAbsent(height, (k) -> createNewBox(stepHeight, height));
	}
	
	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, EntityContext context) {
		Optional<Entity> opt = ((EntityGetter) context).getEntity();
		if (opt.isPresent()) {
			Entity entity = opt.get();
			if (entity instanceof ItemEntity || entity instanceof ExperienceOrbEntity)
				return VoxelShapes.empty();
			
			if (entity instanceof AnimalEntity)
				return getCachedShape(entity.stepHeight, entity.getHeight());
		}
		return TRUE_SHAPE;
	}
	
	@Override
	public VoxelShape getCullingShape(BlockState state, BlockView view, BlockPos pos) {
		return SELECTION_SHAPE;
	}
	
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext context) {
		return context.isDescending() ? TRUE_SHAPE : SELECTION_SHAPE;
	}
	
	@Override
	public boolean canSuffocate(BlockState state, BlockView view, BlockPos pos) {
		return false;
	}
	
	@Override
	public boolean hasDynamicBounds() {
		return true;
	}
	
	@Override
	public boolean allowsSpawning(BlockState state, BlockView view, BlockPos pos, EntityType<?> type) {
		return false;
	}
	
	@Override
	public boolean isTranslucent(BlockState state, BlockView view, BlockPos pos) {
		return !state.get(WATERLOGGED);
	}
	
	@Override
	public FluidState getFluidState(BlockState state) {
		return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
	}
	
	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext context) {
		return getDefaultState().with(WATERLOGGED, context.getWorld().getFluidState(context.getBlockPos()).getFluid() == Fluids.WATER);
	}
	
	@Override
	public boolean isSimpleFullBlock(BlockState state, BlockView view, BlockPos pos) {
		return false;
	}
	
	@Override
	public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(WATERLOGGED);
	}
}
