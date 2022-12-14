package net.swarkles.villablocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.swarkles.villablocks.VillaBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swarkles.villablocks.block.custom.EggplantCropBlock;
import net.swarkles.villablocks.block.custom.GreenChairBlock;
import net.swarkles.villablocks.block.custom.JumpyBlock;
import net.swarkles.villablocks.block.custom.SapphireLampBlock;
import net.swarkles.villablocks.item.ModItemGroup;

public class ModBlocks  {

    // REGULAR BLOCKS

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
           new Block(FabricBlockSettings.of(Material.METAL).strength(3.0f, 6.0f).requiresTool()), ModItemGroup.VILLA);

    // LOGS
    public static final Block CHERRY_LOG = registerBlock("cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2.0f).requiresTool()), ModItemGroup.VILLA);
    public static final Block CHERRY_WOOD = registerBlock("cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(2.0f).requiresTool()), ModItemGroup.VILLA);
    public static final Block STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0f).requiresTool()), ModItemGroup.VILLA);
    public static final Block STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0f).requiresTool()), ModItemGroup.VILLA);


    // PLANKS
    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f, 3.0f).requiresTool()), ModItemGroup.VILLA);
    public static final Block CHERRY_PLANKS_90 = registerBlock("cherry_planks_90",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f, 3.0f).requiresTool()), ModItemGroup.VILLA);
    public static final Block CHERRY_PLANKS_TRIM = registerBlock("cherry_planks_trim",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f, 3.0f).requiresTool()), ModItemGroup.VILLA);
    public static final Block CHERRY_PLANKS_90_TRIM = registerBlock("cherry_planks_90_trim",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f, 3.0f).requiresTool()), ModItemGroup.VILLA);
    public static final Block CHERRY_PLANKS_180_TRIM = registerBlock("cherry_planks_180_trim",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f, 3.0f).requiresTool()), ModItemGroup.VILLA);
    public static final Block CHERRY_PLANKS_270_TRIM = registerBlock("cherry_planks_270_trim",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f, 3.0f).requiresTool()), ModItemGroup.VILLA);
    public static final Block CHERRY_X = registerBlock("cherry_x",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f, 3.0f).requiresTool()), ModItemGroup.VILLA);

    // ORE BLOCKS

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
           new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(),
            UniformIntProvider.create(3, 7)), ModItemGroup.VILLA);

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.VILLA);

    public static final Block END_STONE_SAPPHIRE_ORE = registerBlock("end_stone_sapphire_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.VILLA);

    public static final Block NETHER_SAPPHIRE_ORE = registerBlock("nether_sapphire_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.VILLA);

    public static final Block RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.VILLA);

    // CUSTOM BLOCKS

    public static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
            new JumpyBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 6.0f).requiresTool()), ModItemGroup.VILLA);

    public static final Block SAPPHIRE_LAMP = registerBlock("sapphire_lamp",
            new SapphireLampBlock(FabricBlockSettings.of(Material.METAL).strength(1.0f, 6.0f).requiresTool().
                    luminance(state -> state.get(SapphireLampBlock.LIT) ? 15 : 0)), ModItemGroup.VILLA);

    public static final Block EGGPLANT_CROP = registerBlockWithoutItem("eggplant_crop",
            new EggplantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    public static final Block GREEN_CHAIR = registerBlock("green_chair",
            new GreenChairBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 6.0f).requiresTool().nonOpaque()), ModItemGroup.VILLA);

    // REST OF FUNCTIONS
        // BLOCKS WITHOUT ITEMS
    private static Block registerBlockWithoutItem (String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(VillaBlocks.MOD_ID, name), block);
    }
    // BLOCKS WITH ITEMS
    private static Block registerBlock (String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(VillaBlocks.MOD_ID, name), block);
    }
    // ITEMS
    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(VillaBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        VillaBlocks.LOGGER.debug("Registering Modblocks for " + VillaBlocks.MOD_ID);
    }
}

