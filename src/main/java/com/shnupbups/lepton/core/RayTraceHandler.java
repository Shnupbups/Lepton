package com.shnupbups.lepton.core;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RayTraceContext;
import net.minecraft.world.World;

import org.apache.commons.lang3.tuple.Pair;

public class RayTraceHandler {
	public static HitResult rayTrace(Entity entity, World world, PlayerEntity player, RayTraceContext.ShapeType shapeType, RayTraceContext.FluidHandling fluidHandling) {
		return rayTrace(entity, world, player, shapeType, fluidHandling, getEntityRange(player));
	}
	
	public static HitResult rayTrace(Entity entity, World world, Entity player, RayTraceContext.ShapeType shapeType, RayTraceContext.FluidHandling fluidHandling, double range) {
		Pair<Vec3d, Vec3d> params = getEntityParams(player);
		
		return rayTrace(entity, world, params.getLeft(), params.getRight(), shapeType, fluidHandling, range);
	}
	
	public static HitResult rayTrace(Entity entity, World world, Vec3d startPos, Vec3d ray, RayTraceContext.ShapeType shapeType, RayTraceContext.FluidHandling fluidHandling, double range) {
		return rayTrace(entity, world, startPos, ray.multiply(range), shapeType, fluidHandling);
	}
	
	public static HitResult rayTrace(Entity entity, World world, Vec3d startPos, Vec3d ray, RayTraceContext.ShapeType shapeType, RayTraceContext.FluidHandling fluidHandling) {
		Vec3d end = startPos.add(ray);
		RayTraceContext context = new RayTraceContext(startPos, end, shapeType, fluidHandling, entity);
		return world.rayTrace(context);
	}
	
	public static double getEntityRange(LivingEntity player) {
		return player instanceof PlayerEntity && ((PlayerEntity) player).isCreative() ? 5.0d : 4.0d;
	}
	
	public static Pair<Vec3d, Vec3d> getEntityParams(Entity player) {
		float scale = 1.0F;
		float pitch = player.prevPitch + (player.pitch - player.prevPitch) * scale;
		float yaw = player.prevYaw + (player.yaw - player.prevYaw) * scale;
		double posX = player.prevX + (player.getX() - player.prevX) * scale;
		double posY = player.prevY + (player.getY() - player.prevY) * scale;
		if (player instanceof PlayerEntity)
			posY += player.getEyeHeight(player.getPose());
		double posZ = player.prevZ + (player.getZ() - player.prevZ) * scale;
		Vec3d rayPos = new Vec3d(posX, posY, posZ);
		
		float zYaw = -MathHelper.cos(yaw * (float) Math.PI / 180);
		float xYaw = MathHelper.sin(yaw * (float) Math.PI / 180);
		float pitchMod = -MathHelper.cos(pitch * (float) Math.PI / 180);
		float azimuth = -MathHelper.sin(pitch * (float) Math.PI / 180);
		float xLen = xYaw * pitchMod;
		float yLen = zYaw * pitchMod;
		Vec3d ray = new Vec3d(xLen, azimuth, yLen);
		
		return Pair.of(rayPos, ray);
	}
}
