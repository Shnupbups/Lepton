package com.shnupbups.lepton.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

import com.shnupbups.lepton.modules.RopeModule;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {
	@Inject(method = "shouldCancelInteraction()Z", at = @At("RETURN"), cancellable = true)
	public void shouldCancelInteraction(CallbackInfoReturnable<Boolean> cir) {
		if(cir.getReturnValue() && ((LivingEntity)(Object)this).getMainHandStack().getItem() == RopeModule.ROPE.asItem()) {
			cir.setReturnValue(false);
		}
	}
}
