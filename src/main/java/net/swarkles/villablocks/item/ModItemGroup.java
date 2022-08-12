package net.swarkles.villablocks.item;


import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.swarkles.villablocks.VillaBlocks;

public class ModItemGroup {
    public static final ItemGroup VILLA = FabricItemGroupBuilder.build(
            new Identifier(VillaBlocks.MOD_ID, "villa"), () -> new ItemStack(ModItems.SAPPHIRE));
}
