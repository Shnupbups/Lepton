package com.shnupbups.lepton;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl;

import net.minecraft.block.BlockState;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.resource.GrassColormapResourceSupplier;
import net.minecraft.item.BlockItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;

import com.shnupbups.lepton.building.BuildingModule;
import com.shnupbups.lepton.building.features.FramedGlassFeature;
import com.shnupbups.lepton.building.features.IronGrateFeature;
import com.shnupbups.lepton.building.features.LeafCarpetFeature;
import com.shnupbups.lepton.building.features.TurfFeature;

public class LeptonClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		if(Lepton.BUILDING.isEnabled()) {
			if(BuildingModule.FRAMED_GLASS.isEnabled()) {
				BlockRenderLayerMapImpl.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
						FramedGlassFeature.FRAMED_GLASS, FramedGlassFeature.FRAMED_GLASS_PANE
				);
			}
			if(BuildingModule.IRON_GRATE.isEnabled()) {
				BlockRenderLayerMapImpl.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(), IronGrateFeature.IRON_GRATE);
			}
			if(BuildingModule.TURF.isEnabled()) {
				ColorProviderRegistryImpl.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D),
						TurfFeature.TURF, TurfFeature.TURF_SLAB, TurfFeature.TURF_STAIRS
				);
				ColorProviderRegistryImpl.ITEM.register((stack, tintIndex) -> GrassColors.getColor(0.5D, 1.0D),
						TurfFeature.TURF, TurfFeature.TURF_SLAB, TurfFeature.TURF_STAIRS
				);
			}
			if(BuildingModule.LEAF_CARPET.isEnabled()) {
				ColorProviderRegistryImpl.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getSpruceColor(),
						LeafCarpetFeature.SPRUCE_LEAF_CARPET
				);
				ColorProviderRegistryImpl.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getBirchColor(),
						LeafCarpetFeature.BIRCH_LEAF_CARPET
				);
				ColorProviderRegistryImpl.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getFoliageColor(view, pos) : FoliageColors.getDefaultColor(),
						LeafCarpetFeature.OAK_LEAF_CARPET, LeafCarpetFeature.JUNGLE_LEAF_CARPET,
						LeafCarpetFeature.ACACIA_LEAF_CARPET, LeafCarpetFeature.DARK_OAK_LEAF_CARPET
				);
				ColorProviderRegistryImpl.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(),
						LeafCarpetFeature.OAK_LEAF_CARPET, LeafCarpetFeature.SPRUCE_LEAF_CARPET,
						LeafCarpetFeature.BIRCH_LEAF_CARPET, LeafCarpetFeature.JUNGLE_LEAF_CARPET,
						LeafCarpetFeature.ACACIA_LEAF_CARPET, LeafCarpetFeature.DARK_OAK_LEAF_CARPET
				);
				BlockRenderLayerMapImpl.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
						LeafCarpetFeature.OAK_LEAF_CARPET, LeafCarpetFeature.SPRUCE_LEAF_CARPET,
						LeafCarpetFeature.BIRCH_LEAF_CARPET, LeafCarpetFeature.JUNGLE_LEAF_CARPET,
						LeafCarpetFeature.ACACIA_LEAF_CARPET, LeafCarpetFeature.DARK_OAK_LEAF_CARPET
				);
			}
		}
	}
}
