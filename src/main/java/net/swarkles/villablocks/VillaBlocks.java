package net.swarkles.villablocks;

import net.fabricmc.api.ModInitializer;
import net.swarkles.villablocks.block.ModBlocks;
import net.swarkles.villablocks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// VERY IMPORTANT COMMENT TESTING HERE
public class VillaBlocks implements ModInitializer {
	public static final String MOD_ID = "villablocks";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
