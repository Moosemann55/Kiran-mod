package net.kiran.kiranmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kiran.kiranmod.KiranMod;
import net.kiran.kiranmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.TANZANITE);

    public static final Block JACARANDA_LOG = registerBlock("jacaranda_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroup.TANZANITE);

    public static final Block JACARANDA_WOOD = registerBlock("jacaranda_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroup.TANZANITE);

    public static final Block STRIPPED_JACARANDA_LOG = registerBlock("stripped_jacaranda_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroup.TANZANITE);

    public static final Block STRIPPED_JACARANDA_WOOD = registerBlock("stripped_jacaranda_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroup.TANZANITE);

    public static final Block JACARANDA_PLANKS = registerBlock("jacaranda_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.TANZANITE);























    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.BLOCK, new Identifier(KiranMod.MOD_ID, name), block);
    }


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(KiranMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(KiranMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }




    public static void registerModBlocks() {
        KiranMod.LOGGER.debug("Registering ModBlocks for" + KiranMod.MOD_ID);
    }
}
