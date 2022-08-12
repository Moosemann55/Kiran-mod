package net.kiran.kiranmod;

import net.fabricmc.api.ModInitializer;
import net.kiran.kiranmod.block.ModBlocks;
import net.kiran.kiranmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//very important comment
public class KiranMod implements ModInitializer {
	public static final String MOD_ID = "kiranmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}
