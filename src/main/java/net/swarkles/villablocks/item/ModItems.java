package net.swarkles.villablocks.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.swarkles.villablocks.VillaBlocks;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.swarkles.villablocks.item.custom.EightBallItem;

public class ModItems {

    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroup.VILLA)));
    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new FabricItemSettings().group(ModItemGroup.VILLA)));
    public static final Item SAPPHIRE_INGOT = registerItem("sapphire_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.VILLA)));

    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.VILLA).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VillaBlocks.MOD_ID, name), item);
    }

    public static void registerModItems(){
        VillaBlocks.LOGGER.debug("Registering Mod Items for " + VillaBlocks.MOD_ID);
    }
}
