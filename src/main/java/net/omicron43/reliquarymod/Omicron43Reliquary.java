package omicron43.reliquarymod;

import net.fabricmc.api.ModInitializer;

import net.omicron43.reliquarymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Omicron43Reliquary implements ModInitializer {
	//getting a feel for committing changes
	public static final String MOD_ID = "reliquarymod";
	public static final Logger LOGGER = LoggerFactory.getLogger("reliquarymod");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}