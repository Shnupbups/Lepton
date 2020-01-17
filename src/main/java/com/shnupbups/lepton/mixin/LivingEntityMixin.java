package com.shnupbups.lepton.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;

import com.shnupbups.lepton.modules.RopeModule;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
	@Shadow public abstract BlockState getBlockState();
	
	@Inject(method = "isClimbing", at = @At("RETURN"), cancellable = true)
	public void isClimbing(CallbackInfoReturnable<Boolean> info) {
		BlockState inState = this.getBlockState();
		Block inBlock = inState.getBlock();
		if (inBlock == RopeModule.ROPE) info.setReturnValue(true);
	}
}
