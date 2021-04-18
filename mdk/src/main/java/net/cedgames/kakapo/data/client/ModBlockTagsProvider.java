package net.cedgames.kakapo.data.client;

import net.cedgames.kakapo.KakapoMod;
import net.cedgames.kakapo.setup.ModBlocks;
import net.cedgames.kakapo.setup.ModItems;
import net.cedgames.kakapo.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider
{
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, KakapoMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModTags.Blocks.GRAVEL_KAKAPO_NEST).add(ModBlocks.KAKAPO_NEST.get());
        getOrCreateBuilder(Tags.Blocks.GRAVEL).addTag(ModTags.Blocks.GRAVEL_KAKAPO_NEST);

        getOrCreateBuilder(ModTags.Blocks.RIMU_LEAVES).add(ModBlocks.RIMU_LEAVES.get());
        getOrCreateBuilder(Tags.Blocks.GRAVEL).addTag(ModTags.Blocks.RIMU_LEAVES);

        getOrCreateBuilder(ModTags.Blocks.RIMU_LOG).add(ModBlocks.RIMU_LOG.get());
        getOrCreateBuilder(Tags.Blocks.GRAVEL).addTag(ModTags.Blocks.RIMU_LOG);

        getOrCreateBuilder(ModTags.Blocks.RIMU_LOG_MOSS).add(ModBlocks.RIMU_LOG_MOSS.get());
        getOrCreateBuilder(Tags.Blocks.GRAVEL).addTag(ModTags.Blocks.RIMU_LOG_MOSS);

        getOrCreateBuilder(ModTags.Blocks.RIMU_BERRY_BRANCH).add(ModBlocks.RIMU_BERRY_BRANCH.get());
        getOrCreateBuilder(Tags.Blocks.GRAVEL).addTag(ModTags.Blocks.RIMU_BERRY_BRANCH);

        getOrCreateBuilder(ModTags.Blocks.RIMU_PLANKS).add(ModBlocks.RIMU_PLANKS.get());
        getOrCreateBuilder(Tags.Blocks.GRAVEL).addTag(ModTags.Blocks.RIMU_PLANKS);
    }
}
