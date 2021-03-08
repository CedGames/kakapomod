package net.cedgames.kakapo.setup;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;

public class ModItems
{
    public static Item kakapo_egg;

    //public static final EntityType<EntityKakapo> KAKAPO = register("kakapo_entity", EntityType.Builder.create(EntityKakapo::new, EntityClassification.AMBIENT).size(0.5F, 0.5F));

    public static final RegistryObject<Item> KAKAPO_BEAK = Registration.ITEMS.register("kakapo_beak", () ->
            new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> RIMU_BERRY = Registration.ITEMS.register("rimu_berry", () ->
            new Item(new Item.Properties().group(ItemGroup.FOOD)));

    //public static final RegistryObject<Item> KAKAPO_SPAWN_EGG = Registration.ITEMS.register("kakapo_spawn_egg", () ->
    //        new SpawnEggItem(KAKAPO, 0xB7B678, 0x6F6216, new Item.Properties().group(ItemGroup.MISC)));

    static void register() {}
}
