package net.cedgames.kakapo.setup;

import net.cedgames.kakapo.KakapoMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

public abstract class EntityKakapo extends Entity {

    public EntityKakapo(EntityType<?> entityTypeIn, World worldIn) {
        super(entityTypeIn, worldIn);
    }
}
