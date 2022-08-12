package net.kiran.kiranmod;

import net.fabricmc.api.ClientModInitializer;
import net.kiran.kiranmod.block.ModBlocks;
import net.kiran.kiranmod.item.ModItems;
import net.kiran.kiranmod.util.ModRegistries;

public class KiranModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModRegistries.registerModStuffs();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
