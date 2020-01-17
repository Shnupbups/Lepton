package com.shnupbups.lepton.misc;

import net.minecraft.block.BlockState;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.FallibleItemDispenserBehavior;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import com.shnupbups.lepton.block.RopeBlock;
import com.shnupbups.lepton.modules.RopeModule;

public class RopeDispenserBehavior extends FallibleItemDispenserBehavior {
	@Override
	protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
		Direction facing = pointer.getBlockState().get(DispenserBlock.FACING);
		BlockPos pos = pointer.getBlockPos().offset(facing);
		World world = pointer.getWorld();
		this.success = false;
		
		BlockState state = world.getBlockState(pos);
		if(state.getBlock() == RopeModule.ROPE) {
			if(((RopeBlock) state.getBlock()).pullDown(world, pos)) {
				this.success = true;
				stack.decrement(1);
				return stack;
			}
		} else if(world.isAir(pos) && RopeModule.ROPE.getDefaultState().canPlaceAt(world, pos)) {
			BlockSoundGroup bsg = RopeModule.ROPE.getSoundGroup(state);
			world.setBlockState(pos, RopeModule.ROPE.getDefaultState());
			world.playSound(null, pos, bsg.getPlaceSound(), SoundCategory.BLOCKS, (bsg.getVolume() + 1.0F) / 2.0F, bsg.getPitch() * 0.8F);
			this.success = true;
			stack.decrement(1);
			
			return stack;
		}
		
		return stack;
	}
}
