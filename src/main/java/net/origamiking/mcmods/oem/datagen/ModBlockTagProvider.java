package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.birch.BirchWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.crimson.CrimsonWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.darkoak.DarkOakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.jungle.JungleWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.mangrove.MangroveWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.oak.OakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.warped.WarpedWoodBlocks;
import net.origamiking.mcmods.oem.blocks.woodcutter.ModWoodcutter;


import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
//        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(
        OakWoodBlocks.OAK_LOG_FENCE,
        SpruceWoodBlocks.SPRUCE_LOG_FENCE,
        BirchWoodBlocks.BIRCH_LOG_FENCE,
        JungleWoodBlocks.JUNGLE_LOG_FENCE,
        AcaciaWoodBlocks.ACACIA_LOG_FENCE,
        DarkOakWoodBlocks.DARK_OAK_LOG_FENCE,
        MangroveWoodBlocks.MANGROVE_LOG_FENCE,
        CrimsonWoodBlocks.CRIMSON_LOG_FENCE,
        WarpedWoodBlocks.WARPED_LOG_FENCE
        );
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(
                OakWoodBlocks.OAK_LOG_FENCE,
                SpruceWoodBlocks.SPRUCE_LOG_FENCE,
                BirchWoodBlocks.BIRCH_LOG_FENCE,
                JungleWoodBlocks.JUNGLE_LOG_FENCE,
                AcaciaWoodBlocks.ACACIA_LOG_FENCE,
                DarkOakWoodBlocks.DARK_OAK_LOG_FENCE,
                MangroveWoodBlocks.MANGROVE_LOG_FENCE,
                CrimsonWoodBlocks.CRIMSON_LOG_FENCE,
                WarpedWoodBlocks.WARPED_LOG_FENCE
        );
//        getOrCreateTagBuilder(BlockTags.WALLS)
//        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
//        getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
//        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
//        getOrCreateTagBuilder(BlockTags.DOORS)
//        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
//        getOrCreateTagBuilder(BlockTags.WOOL)
//        getOrCreateTagBuilder(BlockTags.OCCLUDES_VIBRATION_SIGNALS)
    }
}
