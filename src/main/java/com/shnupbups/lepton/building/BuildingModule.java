package com.shnupbups.lepton.building;

import com.shnupbups.lepton.LeptonModule;
import com.shnupbups.lepton.building.features.*;

public class BuildingModule extends LeptonModule {
	public static final BuildingModule INSTANCE = new BuildingModule();
	
	public static final BuildingFeature CARVED_PLANKS = CarvedPlanksFeature.INSTANCE;
	public static final BuildingFeature COMPRESSED_BLOCKS = CompressedBlocksFeature.INSTANCE;
	public static final BuildingFeature DUSKBOUND_BLOCKS = DuskboundBlocksFeature.INSTANCE;
	public static final BuildingFeature FRAMED_GLASS = FramedGlassFeature.INSTANCE;
	public static final BuildingFeature IRON_GRATE = IronGrateFeature.INSTANCE;
	public static final BuildingFeature IRON_PLATES = IronPlatesFeature.INSTANCE;
	public static final BuildingFeature LEAF_CARPET = LeafCarpetFeature.INSTANCE;
	public static final BuildingFeature LIT_LAMP = LitLampFeature.INSTANCE;
	public static final BuildingFeature MIDORI = MidoriFeature.INSTANCE;
	public static final BuildingFeature MORE_BRICK_TYPES = MoreBrickTypesFeature.INSTANCE;
	public static final BuildingFeature MORE_STONE_VARIANTS = MoreStoneVariantsFeature.INSTANCE;
	public static final BuildingFeature NETHER_BRICK_FENCE_GATE = NetherBrickFenceGateFeature.INSTANCE;
	public static final BuildingFeature QUILTED_WOOL = QuiltedWoolFeature.INSTANCE;
	public static final BuildingFeature SHINGLES = ShinglesFeature.INSTANCE;
	public static final BuildingFeature SOUL_SANDSTONE = SoulSandstoneFeature.INSTANCE;
	public static final BuildingFeature STAINED_PLANKS = StainedPlanksFeature.INSTANCE;
	public static final BuildingFeature STURDY_STONE = SturdyStoneFeature.INSTANCE;
	public static final BuildingFeature THATCH = ThatchFeature.INSTANCE;
	public static final BuildingFeature TURF = TurfFeature.INSTANCE;
	public static final BuildingFeature VERTICAL_PLANKS = VerticalPlanksFeature.INSTANCE;
	
	@Override
	protected void addStuff() {
		CARVED_PLANKS.init();
		COMPRESSED_BLOCKS.init();
		DUSKBOUND_BLOCKS.init();
		FRAMED_GLASS.init();
		IRON_GRATE.init();
		IRON_PLATES.init();
		LEAF_CARPET.init();
		LIT_LAMP.init();
		MIDORI.init();
		MORE_BRICK_TYPES.init();
		MORE_STONE_VARIANTS.init();
		NETHER_BRICK_FENCE_GATE.init();
		QUILTED_WOOL.init();
		SHINGLES.init();
		SOUL_SANDSTONE.init();
		STAINED_PLANKS.init();
		STURDY_STONE.init();
		THATCH.init();
		TURF.init();
		VERTICAL_PLANKS.init();
	}
	
	@Override
	public String getName() {
		return "building";
	}
}
