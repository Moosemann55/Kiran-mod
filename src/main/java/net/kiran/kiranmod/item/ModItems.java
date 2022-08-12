package net.kiran.kiranmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kiran.kiranmod.KiranMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(KiranMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        KiranMod.LOGGER.debug("Registering Mod Items for " + KiranMod.MOD_ID);
    }
}
