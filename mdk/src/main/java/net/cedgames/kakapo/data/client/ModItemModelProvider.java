package net.cedgames.kakapo.data.client;

import net.cedgames.kakapo.KakapoMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, KakapoMod.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels()
    {
        withExistingParent("kakapo_nest", modLoc("block/kakapo_nest"));

        withExistingParent("rimu_leaves", modLoc("block/rimu_leaves"));

        withExistingParent("rimu_log", modLoc("block/rimu_log"));

        withExistingParent("rimu_log_moss", modLoc("block/rimu_log_moss"));

        withExistingParent("rimu_berry_branch", modLoc("block/rimu_berry_branch"));

        withExistingParent("rimu_planks", modLoc("block/rimu_planks"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "kakapo_beak");
        builder(itemGenerated, "rimu_berries");
        builder(itemGenerated, "raw_kakapo");
        builder(itemGenerated, "cooked_kakapo");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name)
    {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
