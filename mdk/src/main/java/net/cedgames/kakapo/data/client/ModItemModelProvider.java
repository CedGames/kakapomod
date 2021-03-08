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

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "kakapo_beak");
        builder(itemGenerated, "rimu_berry");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name)
    {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
