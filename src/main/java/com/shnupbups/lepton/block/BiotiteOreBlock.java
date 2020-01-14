package com.shnupbups.lepton.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BiotiteOreBlock extends Block {
	public BiotiteOreBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public void onStacksDropped(BlockState state, World world, BlockPos pos, ItemStack stack) {
		super.onStacksDropped(state, world, pos, stack);
		if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
			int i = MathHelper.nextInt(world.random, 2, 5);
			if (i > 0) {
				this.dropExperience(world, pos, i);
			}
		}
	}
}
