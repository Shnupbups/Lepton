package com.shnupbups.lepton.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityContextImpl;

import com.shnupbups.lepton.helper.EntityGetter;

import java.util.Optional;

@Mixin(EntityContextImpl.class)
public class EntityContextImplMixin implements EntityGetter {
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
