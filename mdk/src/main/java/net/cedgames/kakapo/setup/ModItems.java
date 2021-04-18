package net.cedgames.kakapo.setup;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;

import static net.cedgames.kakapo.setup.ModEntites.KAKAPO;

public class ModItems
{
    //public static Item kakapo_egg;

    //public static final EntityType<EntityKakapo> KAKAPO = register("kakapo_entity", EntityType.Builder.create(EntityKakapo::new, EntityClassification.AMBIENT).size(0.5F, 0.5F));

    public static final RegistryObject<Item> KAKAPO_BEAK = Registration.ITEMS.register("kakapo_beak", () ->
            new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> RIMU_BERRIES = Registration.ITEMS.register("rimu_berries", () ->
            new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.CARROT)));

    public static final RegistryObject<Item> KAKAPO_SPAWN_EGG = Registration.ITEMS.register("kakapo_spawn_egg", () ->
            new SpawnEggItem(KAKAPO, 0xB7B678, 0x6F6216, new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> RAW_KAKAPO = Registration.ITEMS.register("raw_kakapo", () ->
            new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.BEEF)));

    public static final RegistryObject<Item> COOKED_KAKAPO = Registration.ITEMS.register("cooked_kakapo", () ->
            new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.COOKED_BEEF)));

    static void register() {}
}
