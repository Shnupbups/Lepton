package com.shnupbups.lepton.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.block.EntityShapeContext;
import net.minecraft.entity.Entity;

import com.shnupbups.lepton.misc.EntityGetter;

import java.util.Optional;

@Mixin(EntityShapeContext.class)
public class EntityShapeContextMixin implements EntityGetter {
	private Entity entity = null;
	
	@Inject(method = "<init>(Lnet/minecraft/entity/Entity;)V", at = @At("TAIL"))
	public void captureEntity(Entity entity, CallbackInfo ci) {
		this.entity = entity;
	}
	
	@Override
	public Optional<Entity> getEntity() {
		return Optional.ofNullable(entity);
	}
}
