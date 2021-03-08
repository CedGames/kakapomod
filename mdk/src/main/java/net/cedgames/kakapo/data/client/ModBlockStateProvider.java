package net.cedgames.kakapo.data.client;

import net.cedgames.kakapo.KakapoMod;
import net.cedgames.kakapo.setup.ModBlocks;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, KakapoMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        simpleBlock(ModBlocks.KAKAPO_NEST.get());
        simpleBlock(ModBlocks.RIMU_LEAVES.get());
    }
}

