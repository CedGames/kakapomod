package net.cedgames.kakapo.data.client;

import net.cedgames.kakapo.KakapoMod;
import net.cedgames.kakapo.setup.ModItems;
import net.cedgames.kakapo.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider
{

    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper)
    {
        super(dataGenerator, blockTagProvider, KakapoMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        copy(ModTags.Blocks.GRAVEL_KAKAPO_NEST, ModTags.Items.GRAVEL_KAKAPO_NEST);
        copy(Tags.Blocks.GRAVEL, Tags.Items.GRAVEL);
        copy(ModTags.Blocks.RIMU_LEAVES, ModTags.Items.RIMU_LEAVES);
        copy(Tags.Blocks.GRAVEL, Tags.Items.GRAVEL);
        copy(ModTags.Blocks.RIMU_LOG, ModTags.Items.RIMU_LOG);
        copy(Tags.Blocks.GRAVEL, Tags.Items.GRAVEL);
        copy(ModTags.Blocks.RIMU_LOG_MOSS, ModTags.Items.RIMU_LOG_MOSS);
        copy(Tags.Blocks.GRAVEL, Tags.Items.GRAVEL);
        copy(ModTags.Blocks.RIMU_BERRY_BRANCH, ModTags.Items.RIMU_BERRY_BRANCH);
        copy(Tags.Blocks.GRAVEL, Tags.Items.GRAVEL);
        copy(ModTags.Blocks.RIMU_PLANKS, ModTags.Items.RIMU_PLANKS);
        copy(Tags.Blocks.GRAVEL, Tags.Items.GRAVEL);

        getOrCreateBuilder(ModTags.Items.BONES_KAKAPO_BEAK).add(ModItems.KAKAPO_BEAK.get());
        getOrCreateBuilder(Tags.Items.BONES).addTag(ModTags.Items.BONES_KAKAPO_BEAK);
        getOrCreateBuilder(ModTags.Items.RIMU_BERRIES).add(ModItems.RIMU_BERRIES.get());
        getOrCreateBuilder(Tags.Items.CROPS_CARROT).addTag(ModTags.Items.RIMU_BERRIES);
        getOrCreateBuilder(ModTags.Items.KAKAPO_SPAWN_EGG).add(ModItems.KAKAPO_SPAWN_EGG.get());
        getOrCreateBuilder(Tags.Items.BONES).addTag(ModTags.Items.KAKAPO_SPAWN_EGG);
        getOrCreateBuilder(ModTags.Items.RAW_KAKAPO).add(ModItems.RAW_KAKAPO.get());
        getOrCreateBuilder(Tags.Items.BONES).addTag(ModTags.Items.RAW_KAKAPO);
        getOrCreateBuilder(ModTags.Items.COOKED_KAKAPO).add(ModItems.COOKED_KAKAPO.get());
        getOrCreateBuilder(Tags.Items.BONES).addTag(ModTags.Items.COOKED_KAKAPO);
    }
}
