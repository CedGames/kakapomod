package net.cedgames.kakapo.setup;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks
{
    public static List<Block> BLOCKS = new ArrayList<Block>();

    public static final RegistryObject<Block> KAKAPO_NEST = register("kakapo_nest", () ->
            new Block(AbstractBlock.Properties.create(Material.GOURD)
                    .hardnessAndResistance(0.5f, 0.5f)
                    .harvestLevel(0)
                    .harvestTool(ToolType.HOE)
                    .sound(SoundType.PLANT)));

    public static final RegistryObject<LeavesBlock> RIMU_LEAVES = register("rimu_leaves", () ->
            new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2f, 0.2f)
                    .harvestLevel(0)
                    .harvestTool(ToolType.HOE)
                    .sound(SoundType.PLANT)));

    public static final RegistryObject<RotatedPillarBlock> RIMU_LOG = register("rimu_log", () ->
            new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .hardnessAndResistance(2f, 2f)
                    .harvestLevel(0)
                    .harvestTool(ToolType.AXE)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<RotatedPillarBlock> RIMU_LOG_MOSS = register("rimu_log_moss", () ->
            new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .hardnessAndResistance(2f, 2f)
                    .harvestLevel(0)
                    .harvestTool(ToolType.AXE)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> RIMU_BERRY_BRANCH = register("rimu_berry_branch", () ->
            new Block(AbstractBlock.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.2f, 3f)
                    .harvestLevel(0)
                    .harvestTool(ToolType.HOE)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> RIMU_PLANKS = register("rimu_planks", () ->
            new Block(AbstractBlock.Properties.create(Material.WOOD)
                    .hardnessAndResistance(2f, 2f)
                    .harvestLevel(0)
                    .harvestTool(ToolType.AXE)
                    .sound(SoundType.WOOD)));


    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block)
    {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return ret;
    }


}