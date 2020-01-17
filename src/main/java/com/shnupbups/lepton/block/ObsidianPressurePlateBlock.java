package com.shnupbups.lepton.block;

import net.minecraft.block.AbstractPressurePlateBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;

public class ObsidianPressurePlateBlock extends AbstractPressurePlateBlock {
	public static final BooleanProperty POWERED = Properties.POWERED;
	
	public ObsidianPressurePlateBlock(Settings settings) {
		super(settings);
		this.setDefaultState(getDefaultState().with(POWERED, false));
	}
	
	@Override
	protected void playPressSound(IWorld world, BlockPos pos) {
		world.playSound(null, pos, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F);
	}
	
	@Override
	protected void playDepressSound(IWorld world, BlockPos pos) {
		world.playSound(null, pos, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.5F);
	}
	
	@Override
	protected int getRedstoneOutput(World world, BlockPos pos) {
		Box box = BOX.offset(pos);
		List list3 = world.getNonSpectatingEntities(PlayerEntity.class, box);
		
		if (!list3.isEmpty()) {
			Iterator var5 = list3.iterator();
			
			while(var5.hasNext()) {
				Entity entity = (Entity)var5.next();
				if (!entity.canAvoidTraps()) {
					return 15;
				}
			}
		}
		
		return 0;
	}
	
	@Override
	protected int getRedstoneOutput(BlockState state) {
		return state.get(POWERED) ? 15 : 0;
	}
	
	@Override
	protected BlockState setRedstoneOutput(BlockState state, int rsOut) {
		return state.with(POWERED, rsOut > 0);
	}
	
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(POWERED);
	}
}
