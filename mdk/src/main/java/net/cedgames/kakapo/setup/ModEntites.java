package net.cedgames.kakapo.setup;

import net.cedgames.kakapo.KakapoMod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ModEntites
{

    public static EntityType<?> KAKAPO;
/*
    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll();
        ModItems.kakapo_egg = registerEntitySpawnEgg(KAKAPO, 0xB7B678, 0x6F6216, "kakapo_egg");
    }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
    {

        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ItemGroup.MISC));
        item.setRegistryName(new ResourceLocation(KakapoMod.MOD_ID, name));
        return item;


    }
 */

/*

    public static void registerEntityWorldSpawns()
    {
        registerEntityWorldSpawn(KAKAPO,
                Biomes.JUNGLE,
                Biomes.JUNGLE_EDGE,
                Biomes.JUNGLE_HILLS,
                Biomes.MODIFIED_JUNGLE,
                Biomes.MODIFIED_JUNGLE_EDGE);
    }


    public static void registerEntityWorldSpawn(EntityType<?> entity, Biome... biomes)
    {
        for(Biome biome : biomes)
        {
            if(biome != null)
            {
                //biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 10, 1, 5));
            }
        }
    }

*/

    static void register() {}
}
