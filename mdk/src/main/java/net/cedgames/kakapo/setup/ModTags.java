package net.cedgames.kakapo.setup;

import net.cedgames.kakapo.KakapoMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> GRAVEL_KAKAPO_NEST = forge("gravel/kakapo_nest");

        public static final ITag.INamedTag<Block> RIMU_LEAVES = forge("gravel/rimu_leaves");

        public static final ITag.INamedTag<Block> RIMU_LOG = forge("gravel/rimu_log");

        public static final ITag.INamedTag<Block> RIMU_LOG_MOSS = forge("gravel/rimu_log_moss");

        public static final ITag.INamedTag<Block> RIMU_BERRY_BRANCH = forge("gravel/rimu_berry_branch");

        public static final ITag.INamedTag<Block> RIMU_PLANKS = forge("gravel/rimu_planks");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation(KakapoMod.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> GRAVEL_KAKAPO_NEST = forge("gravel/kakapo_nest");

        public static final ITag.INamedTag<Item> BONES_KAKAPO_BEAK = forge("bones/kakapo_beak");

        public static final ITag.INamedTag<Item> RIMU_LEAVES = forge("gravel/rimu_leaves");

        public static final ITag.INamedTag<Item> RIMU_LOG = forge("gravel/rimu_log");

        public static final ITag.INamedTag<Item> RIMU_LOG_MOSS = forge("gravel/rimu_log_moss");

        public static final ITag.INamedTag<Item> RIMU_BERRIES = forge("crops_carrot/rimu_berries");

        public static final ITag.INamedTag<Item> RIMU_BERRY_BRANCH = forge("gravel/rimu_berry_branch");

        public static final ITag.INamedTag<Item> RIMU_PLANKS = forge("gravel/rimu_planks");

        public static final ITag.INamedTag<Item> KAKAPO_SPAWN_EGG = forge("bones/kakapo_spawn_egg");

        public static final ITag.INamedTag<Item> RAW_KAKAPO = forge("bones/raw_kakapo");

        public static final ITag.INamedTag<Item> COOKED_KAKAPO = forge("bones/cooked_kakapo");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation(KakapoMod.MOD_ID, path).toString());
        }
    }
}