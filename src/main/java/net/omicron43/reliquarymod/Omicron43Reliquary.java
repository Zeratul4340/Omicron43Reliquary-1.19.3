package net.omicron43.reliquarymod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.omicron43.reliquarymod.entity.ModEntities;
import net.omicron43.reliquarymod.entity.custom.MutaliskEntity;
import net.omicron43.reliquarymod.item.ModItemGroup;
import net.omicron43.reliquarymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class Omicron43Reliquary implements ModInitializer {
	//getting a feel for committing changes
	public static final String MOD_ID = "reliquarymod";
	public static final Logger LOGGER = LoggerFactory.getLogger("reliquarymod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.MUTALISK, MutaliskEntity.setAttributes());
	}
}