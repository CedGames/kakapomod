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

        public static final ITag.INamedTag<Item> RIMU_BERRY = forge("crops_carrot/rimu_berry");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation(KakapoMod.MOD_ID, path).toString());
        }
    }
}