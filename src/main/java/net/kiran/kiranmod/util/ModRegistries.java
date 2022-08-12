package net.kiran.kiranmod.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.kiran.kiranmod.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFlammableBlock();
        registerStrippables();
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.JACARANDA_LOG, ModBlocks.STRIPPED_JACARANDA_LOG);
        StrippableBlockRegistry.register(ModBlocks.JACARANDA_WOOD, ModBlocks.STRIPPED_JACARANDA_WOOD);
    }



    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.JACARANDA_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_JACARANDA_LOG, 5, 5);
        instance.add(ModBlocks.JACARANDA_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_JACARANDA_WOOD, 5, 5);
        instance.add(ModBlocks.JACARANDA_PLANKS, 5, 20);

    }
}
