package com.shnupbups.lepton.block.entity;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.util.Tickable;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.RayTraceContext;

import com.shnupbups.lepton.block.EnderWatcherBlock;
import com.shnupbups.lepton.misc.RayTraceHandler;
import com.shnupbups.lepton.modules.EnderWatcherModule;

import java.util.List;

public class EnderWatcherBlockEntity extends BlockEntity implements Tickable {
	public EnderWatcherBlockEntity() {
		super(EnderWatcherModule.ENDER_WATCHER_BE_TYPE);
	}
	
	@Override
	public void tick() {
		boolean wasLooking = getWorld().getBlockState(getPos()).get(EnderWatcherBlock.WATCHED);
		int range = 80;
		List<PlayerEntity> players = getWorld().getNonSpectatingEntities(PlayerEntity.class, new Box(pos.add(-range, -range, -range), pos.add(range, range, range)));
		
		boolean looking = false;
		for (PlayerEntity player : players) {
			ItemStack helm = player.getEquippedStack(EquipmentSlot.HEAD);
			if (!helm.isEmpty() && helm.getItem() == Items.PUMPKIN)
				continue;
			
			HitResult result = RayTraceHandler.rayTrace(player, getWorld(), player, RayTraceContext.ShapeType.OUTLINE, RayTraceContext.FluidHandling.NONE, 64);
			if (result instanceof BlockHitResult && ((BlockHitResult) result).getBlockPos().equals(getPos())) {
				looking = true;
				break;
			}
		}
		
		if (looking != wasLooking && !getWorld().isClient)
			getWorld().setBlockState(getPos(), getWorld().getBlockState(getPos()).with(EnderWatcherBlock.WATCHED, looking), 1 | 2);
		
		if (looking) {
			double x = getPos().getX() - 0.1 + Math.random() * 1.2;
			double y = getPos().getY() - 0.1 + Math.random() * 1.2;
			double z = getPos().getZ() - 0.1 + Math.random() * 1.2;
			
			getWorld().addParticle(new DustParticleEffect(1.0F, 0.0F, 0.0F, 1.0F), x, y, z, 0.0D, 0.0D, 0.0D);
		}
	}
}
