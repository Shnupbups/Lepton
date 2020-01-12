package com.shnupbups.lepton;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl;

import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;

import com.shnupbups.lepton.modules.FramedGlassModule;
import com.shnupbups.lepton.modules.IronGrateModule;
import com.shnupbups.lepton.modules.LeafCarpetModule;
import com.shnupbups.lepton.modules.TurfModule;

public class LeptonClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		if (FramedGlassModule.INSTANCE.isEnabled()) {
			BlockRenderLayerMapImpl.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
					FramedGlassModule.FRAMED_GLASS, FramedGlassModule.FRAMED_GLASS_PANE
			);
		}
		if (IronGrateModule.INSTANCE.isEnabled()) {
			BlockRenderLayerMapImpl.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(), IronGrateModule.IRON_GRATE);
		}
		if (TurfModule.INSTANCE.isEnabled()) {
			ColorProviderRegistryImpl.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getGrassColor(view, pos) : GrassColors.getColor(0.5D, 1.0D),
					TurfModule.TURF, TurfModule.TURF_SLAB, TurfModule.TURF_STAIRS
			);
			ColorProviderRegistryImpl.ITEM.register((stack, tintIndex) -> GrassColors.getColor(0.5D, 1.0D),
					TurfModule.TURF, TurfModule.TURF_SLAB, TurfModule.TURF_STAIRS
			);
		}
		if (LeafCarpetModule.INSTANCE.isEnabled()) {
			ColorProviderRegistryImpl.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getSpruceColor(),
					LeafCarpetModule.SPRUCE_LEAF_CARPET
			);
			ColorProviderRegistryImpl.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getBirchColor(),
					LeafCarpetModule.BIRCH_LEAF_CARPET
			);
			ColorProviderRegistryImpl.BLOCK.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getFoliageColor(view, pos) : FoliageColors.getDefaultColor(),
					LeafCarpetModule.OAK_LEAF_CARPET, LeafCarpetModule.JUNGLE_LEAF_CARPET,
					LeafCarpetModule.ACACIA_LEAF_CARPET, LeafCarpetModule.DARK_OAK_LEAF_CARPET
			);
			ColorProviderRegistryImpl.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(),
					LeafCarpetModule.OAK_LEAF_CARPET, LeafCarpetModule.SPRUCE_LEAF_CARPET,
					LeafCarpetModule.BIRCH_LEAF_CARPET, LeafCarpetModule.JUNGLE_LEAF_CARPET,
					LeafCarpetModule.ACACIA_LEAF_CARPET, LeafCarpetModule.DARK_OAK_LEAF_CARPET
			);
			BlockRenderLayerMapImpl.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
					LeafCarpetModule.OAK_LEAF_CARPET, LeafCarpetModule.SPRUCE_LEAF_CARPET,
					LeafCarpetModule.BIRCH_LEAF_CARPET, LeafCarpetModule.JUNGLE_LEAF_CARPET,
					LeafCarpetModule.ACACIA_LEAF_CARPET, LeafCarpetModule.DARK_OAK_LEAF_CARPET
			);
		}
	}
}
