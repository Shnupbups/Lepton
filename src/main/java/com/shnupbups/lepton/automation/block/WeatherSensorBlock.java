package com.shnupbups.lepton.automation.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.EntityContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import com.shnupbups.lepton.Lepton;
import com.shnupbups.lepton.automation.block.entity.WeatherSensorBlockEntity;

import javax.annotation.Nullable;

public class WeatherSensorBlock extends Block implements BlockEntityProvider {
	public static final IntProperty POWER = IntProperty.of("power", 0, 2);
	public static final BooleanProperty INVERTED = Properties.INVERTED;
	public static final VoxelShape SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D);
	
	public WeatherSensorBlock(Settings settings) {
		super(settings);
		this.setDefaultState(this.getDefaultState().with(POWER, 0).with(INVERTED, false));
	}
	
	@Nullable
	@Override
	public BlockEntity createBlockEntity(BlockView view) {
		return new WeatherSensorBlockEntity();
	}
	
	@Override
	public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(POWER, INVERTED);
	}
	
	@Override
	public int getWeakRedstonePower(BlockState state, BlockView view, BlockPos pos, Direction facing) {
		return (int) (state.get(POWER) * 7.5f);
	}
	
	@Override
	public boolean emitsRedstonePower(BlockState state) {
		return true;
	}
	
	@Override
	public boolean hasBlockEntity() {
		return true;
	}
	
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext ePos) {
		return SHAPE;
	}
	
	public static void updateState(BlockState state, World world, BlockPos pos) {
		if (world.dimension.hasSkyLight()) {
			boolean inverted = state.get(INVERTED);
			
			if (world.isThundering()) {
				world.setBlockState(pos, state.with(POWER, inverted ? 0 : 2));
			} else if (world.isRaining() && world.getBiome(pos).getPrecipitation() != Biome.Precipitation.NONE) {
				world.setBlockState(pos, state.with(POWER, 1));
			} else {
				world.setBlockState(pos, state.with(POWER, inverted ? 2 : 0));
			}
		}
	}
	
	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (player.canModifyWorld()) {
			if (!world.isClient) {
				BlockState blockState = state.cycle(INVERTED);
				world.setBlockState(pos, blockState, 4);
				updateState(blockState, world, pos);
			}
			return ActionResult.SUCCESS;
		} else {
			return super.onUse(state, world, pos, player, hand, hit);
		}
	}
	
	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}
}
