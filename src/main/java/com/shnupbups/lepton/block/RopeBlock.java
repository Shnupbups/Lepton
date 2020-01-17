package com.shnupbups.lepton.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class RopeBlock extends Block {
	private static final VoxelShape SHAPE = createCuboidShape(6, 0, 6, 10, 16, 10);
	
	public RopeBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if(hand == Hand.MAIN_HAND) {
			ItemStack stack = player.getStackInHand(hand);
			if(stack.getItem() == asItem() && !player.isSneaking()) {
				if(pullDown(world, pos)) {
					if(!player.isCreative())
						stack.decrement(1);
					
					world.playSound(null, pos, this.getSoundGroup(state).getPlaceSound(), SoundCategory.BLOCKS, 0.5F, 1F);
					return ActionResult.SUCCESS;
				}
			} else if (stack.getItem() == Items.GLASS_BOTTLE) {
				BlockPos bottomPos = getBottomPos(world, pos);
				FluidState stateAt = world.getFluidState(bottomPos);
				if (stateAt.getFluid() == Fluids.WATER) {
					world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);
					stack.decrement(1);
					ItemStack bottleStack = PotionUtil.setPotion(new ItemStack(Items.POTION), Potions.WATER);
					player.incrementStat(Stats.USED.getOrCreateStat(stack.getItem()));
					
					if (stack.isEmpty())
						player.setStackInHand(hand, bottleStack);
					else if (!player.inventory.insertStack(bottleStack))
						player.dropItem(bottleStack, false);
					
					
					return ActionResult.SUCCESS;
				}
				
				return ActionResult.PASS;
			} else {
				if(pullUp(world, pos)) {
					if(!player.isCreative()) {
						if(!player.giveItemStack(new ItemStack(this)))
							player.dropItem(new ItemStack(this), false);
					}
					
					world.playSound(null, pos, this.getSoundGroup(state).getBreakSound(), SoundCategory.BLOCKS, 0.5F, 1F);
					return ActionResult.SUCCESS;
				}
			}
		}
		
		return ActionResult.PASS;
	}
	
	public boolean pullUp(World world, BlockPos pos) {
		BlockPos basePos = pos;
		
		while(true) {
			pos = pos.down();
			BlockState state = world.getBlockState(pos);
			if(state.getBlock() != this)
				break;
		}
		
		BlockPos ropePos = pos.up();
		if(ropePos.equals(basePos))
			return false;
		
		world.setBlockState(ropePos, Blocks.AIR.getDefaultState());
		moveBlock(world, pos, ropePos);
		
		return true;
	}
	
	public boolean pullDown(World world, BlockPos pos) {
		boolean can;
		boolean endRope = false;
		boolean wasAirAtEnd = false;
		
		do {
			pos = pos.down();
			if (!World.isValid(pos))
				return false;
			
			BlockState state = world.getBlockState(pos);
			Block block = state.getBlock();
			
			if(block == this)
				continue;
			
			if(endRope) {
				can = wasAirAtEnd || world.isAir(pos) || state.getMaterial().isReplaceable();
				break;
			}
			
			endRope = true;
			wasAirAtEnd = world.isAir(pos);
		} while(true);
		
		if(can) {
			BlockPos ropePos = pos.up();
			moveBlock(world, ropePos, pos);
			
			BlockState ropePosState = world.getBlockState(ropePos);
			
			if(world.isAir(ropePos) || ropePosState.getMaterial().isReplaceable()) {
				world.setBlockState(ropePos, getDefaultState());
				return true;
			}
		}
		
		return false;
	}
	
	private BlockPos getBottomPos(World worldIn, BlockPos pos) {
		Block block = this;
		while (block == this) {
			pos = pos.down();
			BlockState state = worldIn.getBlockState(pos);
			block = state.getBlock();
		}
		
		return pos;
		
	}
	
	private void moveBlock(World world, BlockPos srcPos, BlockPos dstPos) {
		BlockState state = world.getBlockState(srcPos);
		Block block = state.getBlock();
		
		if(world.getBlockEntity(srcPos) != null || state.getHardness(world, srcPos) == -1 || !state.canPlaceAt(world, dstPos) ||
				block.isAir(state) || state.getPistonBehavior() != PistonBehavior.NORMAL || block == Blocks.OBSIDIAN)
			return;
			
		world.setBlockState(srcPos, Blocks.AIR.getDefaultState());
		world.setBlockState(dstPos, state);
		
		world.updateNeighbors(dstPos, state.getBlock());
		this.updateNeighborStates(state, world, srcPos, 2);
	}
	
	@Override
	public boolean canPlaceAt(BlockState state, WorldView worldIn, BlockPos pos) {
		return sideCoversSmallSquare(worldIn, pos.up(), Direction.DOWN);
	}
	
	@Override
	public void neighborUpdate(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
		if(!state.canPlaceAt(worldIn, pos)) {
			worldIn.playLevelEvent(2001, pos, Block.getRawIdFromState(worldIn.getBlockState(pos)));
			dropStacks(state, worldIn, pos);
			worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
		}
	}
	
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView worldIn, BlockPos pos, EntityContext context) {
		return SHAPE;
	}
}
