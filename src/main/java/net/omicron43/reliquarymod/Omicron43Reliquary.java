package omicron43.reliquarymod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Omicron43Reliquary implements ModInitializer {
	//getting a feel for committing changes
	public static final String MOD_ID = "omicron43s-reliquary";
	public static final Logger LOGGER = LoggerFactory.getLogger("omicron43reliquary");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}