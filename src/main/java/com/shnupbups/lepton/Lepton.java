package com.shnupbups.lepton;

import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.SimpleRegistry;

import blue.endless.jankson.JsonElement;
import blue.endless.jankson.JsonPrimitive;
import com.shnupbups.lepton.misc.LeptonConfig;
import com.shnupbups.lepton.modules.BiotiteModule;
import com.shnupbups.lepton.modules.CarvedPlanksModule;
import com.shnupbups.lepton.modules.CompressedBlocksModule;
import com.shnupbups.lepton.modules.DuskboundBlocksModule;
import com.shnupbups.lepton.modules.EnderWatcherModule;
import com.shnupbups.lepton.modules.FramedGlassModule;
import com.shnupbups.lepton.modules.IronGrateModule;
import com.shnupbups.lepton.modules.IronPlatesModule;
import com.shnupbups.lepton.modules.LeafCarpetModule;
import com.shnupbups.lepton.modules.LitLampModule;
import com.shnupbups.lepton.modules.MidoriModule;
import com.shnupbups.lepton.modules.MoreBrickTypesModule;
import com.shnupbups.lepton.modules.MoreStoneVariantsModule;
import com.shnupbups.lepton.modules.NetherBrickFenceGateModule;
import com.shnupbups.lepton.modules.NewStoneTypesModule;
import com.shnupbups.lepton.modules.ObsidianPressurePlateModule;
import com.shnupbups.lepton.modules.QuiltedWoolModule;
import com.shnupbups.lepton.modules.RopeModule;
import com.shnupbups.lepton.modules.ShinglesModule;
import com.shnupbups.lepton.modules.SoulSandstoneModule;
import com.shnupbups.lepton.modules.StainedPlanksModule;
import com.shnupbups.lepton.modules.SturdyStoneModule;
import com.shnupbups.lepton.modules.ThatchModule;
import com.shnupbups.lepton.modules.TurfModule;
import com.shnupbups.lepton.modules.VerticalPlanksModule;
import com.shnupbups.lepton.modules.WeatherSensorModule;
import io.github.cottonmc.libcd.api.CDSyntaxError;
import io.github.cottonmc.libcd.api.condition.ConditionManager;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class Lepton implements ModInitializer {
	public static final String MOD_ID = "lepton";
	
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	
	public static final Registry<LeptonModule> MODULES = new SimpleRegistry<>();
	
	public static final LeptonModule BIOTITE = BiotiteModule.INSTANCE;
	public static final LeptonModule CARVED_PLANKS = CarvedPlanksModule.INSTANCE;
	public static final LeptonModule COMPRESSED_BLOCKS = CompressedBlocksModule.INSTANCE;
	public static final LeptonModule DUSKBOUND_BLOCKS = DuskboundBlocksModule.INSTANCE;
	public static final LeptonModule ENDER_WATCHER = EnderWatcherModule.INSTANCE;
	public static final LeptonModule FRAMED_GLASS = FramedGlassModule.INSTANCE;
	public static final LeptonModule IRON_GRATE = IronGrateModule.INSTANCE;
	public static final LeptonModule IRON_PLATES = IronPlatesModule.INSTANCE;
	public static final LeptonModule LEAF_CARPET = LeafCarpetModule.INSTANCE;
	public static final LeptonModule LIT_LAMP = LitLampModule.INSTANCE;
	public static final LeptonModule MIDORI = MidoriModule.INSTANCE;
	public static final LeptonModule MORE_BRICK_TYPES = MoreBrickTypesModule.INSTANCE;
	public static final LeptonModule MORE_STONE_VARIANTS = MoreStoneVariantsModule.INSTANCE;
	public static final LeptonModule NETHER_BRICK_FENCE_GATE = NetherBrickFenceGateModule.INSTANCE;
	public static final LeptonModule NEW_STONE_TYPES = NewStoneTypesModule.INSTANCE;
	public static final LeptonModule OBSIDIAN_PRESSURE_PLATE = ObsidianPressurePlateModule.INSTANCE;
	public static final LeptonModule QUILTED_WOOL = QuiltedWoolModule.INSTANCE;
	public static final LeptonModule ROPE = RopeModule.INSTANCE;
	public static final LeptonModule SHINGLES = ShinglesModule.INSTANCE;
	public static final LeptonModule SOUL_SANDSTONE = SoulSandstoneModule.INSTANCE;
	public static final LeptonModule STAINED_PLANKS = StainedPlanksModule.INSTANCE;
	public static final LeptonModule STURDY_STONE = SturdyStoneModule.INSTANCE;
	public static final LeptonModule THATCH = ThatchModule.INSTANCE;
	public static final LeptonModule TURF = TurfModule.INSTANCE;
	public static final LeptonModule VERTICAL_PLANKS = VerticalPlanksModule.INSTANCE;
	public static final LeptonModule WEATHER_SENSOR = WeatherSensorModule.INSTANCE;
	
	public static LeptonModule getModule(Identifier id) {
		return MODULES.get(id);
	}
	
	public static <T extends LeptonModule> T registerModule(T module, String id) {
		return Registry.register(MODULES, Lepton.id(id), module);
	}
	
	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}
	
	public static <T extends Block> T registerBlock(T block, String id) {
		return registerBlock(block, id, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
	}
	
	public static <T extends Block> T registerBlock(T block, String id, Item.Settings itemSettings) {
		if (itemSettings != null) {
			return registerBlock(block, id, new BlockItem(block, itemSettings));
		}
		return registerBlock(block, id, (BlockItem) null);
	}
	
	public static <T extends Block> T registerBlock(T block, String id, BlockItem item) {
		Registry.register(Registry.BLOCK, id(id), block);
		if (item != null) {
			item.appendBlocks(Item.BLOCK_ITEMS, item);
			Registry.register(Registry.ITEM, id(id), item);
		}
		return block;
	}
	
	public static <T extends Item> T registerItem(T item, String id) {
		Registry.register(Registry.ITEM, id(id), item);
		return item;
	}
	
	public static void log(String text) {
		log(text, Level.INFO);
	}
	
	public static void log(String text, Level level) {
		LOGGER.log(level, text);
	}
	
	@Override
	public void onInitialize() {
		registerModule(BIOTITE, "biotite");
		registerModule(CARVED_PLANKS, "carved_planks");
		registerModule(COMPRESSED_BLOCKS, "compressed_blocks");
		registerModule(DUSKBOUND_BLOCKS, "duskbound_blocks");
		registerModule(ENDER_WATCHER, "ender_watcher");
		registerModule(FRAMED_GLASS, "framed_glass");
		registerModule(IRON_GRATE, "iron_grate");
		registerModule(IRON_PLATES, "iron_plates");
		registerModule(LEAF_CARPET, "leaf_carpet");
		registerModule(LIT_LAMP, "lit_lamp");
		registerModule(MIDORI, "midori");
		registerModule(MORE_BRICK_TYPES, "more_brick_types");
		registerModule(MORE_STONE_VARIANTS, "more_stone_variants");
		registerModule(NETHER_BRICK_FENCE_GATE, "nether_brick_fence_gate");
		registerModule(NEW_STONE_TYPES, "new_stone_types");
		registerModule(OBSIDIAN_PRESSURE_PLATE, "obsidian_pressure_plate");
		registerModule(QUILTED_WOOL, "quilted_wool");
		registerModule(ROPE, "rope");
		registerModule(SHINGLES, "shingles");
		registerModule(SOUL_SANDSTONE, "soul_sandstone");
		registerModule(STAINED_PLANKS, "stained_planks");
		registerModule(STURDY_STONE, "sturdy_stone");
		registerModule(THATCH, "thatch");
		registerModule(TURF, "turf");
		registerModule(VERTICAL_PLANKS, "vertical_planks");
		registerModule(WEATHER_SENSOR, "weather_sensor");
		
		LeptonConfig.load();
		
		ConditionManager.INSTANCE.registerCondition(id("module_enabled"), value -> {
			if (value instanceof String) return getModule(new Identifier((String) value)).isEnabled();
			if (value instanceof List) {
				for (JsonElement el : (List<JsonElement>) value) {
					if (!(el instanceof JsonPrimitive)) return false;
					Object obj = ((JsonPrimitive) el).getValue();
					if (obj instanceof String) {
						if (!getModule(new Identifier((String) obj)).isEnabled()) return false;
					} else return false;
				}
				return true;
			}
			throw new CDSyntaxError("module_enabled must accept either a String or an Array!");
		});
		
		for (LeptonModule module : MODULES) {
			if (module.isEnabled()) {
				Lepton.log("Loading Lepton module " + MODULES.getId(module));
				module.init();
			} else {
				Lepton.log("Lepton module " + MODULES.getId(module) + " is disabled");
			}
		}
	}
}
