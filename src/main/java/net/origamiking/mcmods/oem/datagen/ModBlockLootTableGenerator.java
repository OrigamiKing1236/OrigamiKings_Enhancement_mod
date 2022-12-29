package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.entity.ai.brain.task.PrepareRamTask;
import net.origamiking.mcmods.oem.blocks.amethyst.AmethystBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteStairs;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.sculk.SculkBlocks;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.birch.BirchWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.crimson.CrimsonWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.darkoak.DarkOakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.jungle.JungleWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.ladder.LadderBlocks;
import net.origamiking.mcmods.oem.blocks.wood.mangrove.MangroveWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.oak.OakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.warped.WarpedWoodBlocks;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ConcreteStairs.WHITE_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.WHITE_CONCRETE_SLAB);
        addDrop(ConcreteStairs.LIGHT_GRAY_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.LIGHT_GRAY_CONCRETE_SLAB);
        addDrop(ConcreteStairs.GRAY_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.GRAY_CONCRETE_SLAB);
        addDrop(ConcreteStairs.BLACK_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.BLACK_CONCRETE_SLAB);
        addDrop(ConcreteStairs.BROWN_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.BROWN_CONCRETE_SLAB);
        addDrop(ConcreteStairs.RED_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.RED_CONCRETE_SLAB);
        addDrop(ConcreteStairs.ORANGE_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.ORANGE_CONCRETE_SLAB);
        addDrop(ConcreteStairs.YELLOW_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.YELLOW_CONCRETE_SLAB);
        addDrop(ConcreteStairs.LIME_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.LIME_CONCRETE_SLAB);
        addDrop(ConcreteStairs.GREEN_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.GREEN_CONCRETE_SLAB);
        addDrop(ConcreteStairs.CYAN_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.CYAN_CONCRETE_SLAB);
        addDrop(ConcreteStairs.LIGHT_BLUE_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.LIGHT_BLUE_CONCRETE_SLAB);
        addDrop(ConcreteStairs.BLUE_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.BLUE_CONCRETE_SLAB);
        addDrop(ConcreteStairs.PURPLE_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.PURPLE_CONCRETE_SLAB);
        addDrop(ConcreteStairs.MAGENTA_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.MAGENTA_CONCRETE_SLAB);
        addDrop(ConcreteStairs.PINK_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.PINK_CONCRETE_SLAB);
        addDrop(SculkBlocks.SCULK_STAIR);
        addDrop(SculkBlocks.SCULK_SLAB);
        addDrop(OakWoodBlocks.OAK_BARREL);
        addDrop(LadderBlocks.OAK_LADDER);
        addDrop(SpruceWoodBlocks.SPRUCE_BARREL);
        addDrop(LadderBlocks.SPRUCE_LADDER);
        addDrop(SpruceWoodBlocks.SPRUCE_BOOKSHELF);
        addDrop(LadderBlocks.BIRCH_LADDER);
        addDrop(BirchWoodBlocks.BIRCH_BARREL);
        addDrop(BirchWoodBlocks.BIRCH_BOOKSHELF);
        addDrop(LadderBlocks.JUNGLE_LADDER);
        addDrop(JungleWoodBlocks.JUNGLE_BOOKSHELF);
        addDrop(JungleWoodBlocks.JUNGLE_BARREL);
        addDrop(LadderBlocks.ACACIA_LADDER);
        addDrop(AcaciaWoodBlocks.ACACIA_BOOKSHELF);
        addDrop(AcaciaWoodBlocks.ACACIA_BARREL);
        addDrop(LadderBlocks.DARK_OAK_LADDER);
        addDrop(DarkOakWoodBlocks.DARK_OAK_BOOKSHELF);
        addDrop(DarkOakWoodBlocks.DARK_OAK_BARREL);
        addDrop(LadderBlocks.MANGROVE_LADDER);
        addDrop(MangroveWoodBlocks.MANGROVE_BARREL);
        addDrop(MangroveWoodBlocks.MANGROVE_BOOKSHELF);
        addDrop(LadderBlocks.CRIMSON_LADDER);
        addDrop(CrimsonWoodBlocks.CRIMSON_BARREL);
        addDrop(CrimsonWoodBlocks.CRIMSON_BOOKSHELF);
        addDrop(LadderBlocks.WARPED_LADDER);
        addDrop(WarpedWoodBlocks.WARPED_BARREL);
        addDrop(WarpedWoodBlocks.WARPED_BOOKSHELF);
        addDrop(ServerSpecificBlocks.GOLD_CHAIN);
        addDropWithSilkTouch(GlassBlocks.WHITE_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.WHITE_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.LIGHT_GRAY_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.LIGHT_GRAY_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.GRAY_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.GRAY_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.BLACK_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.BLACK_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.BROWN_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.BROWN_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.RED_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.RED_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.ORANGE_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.ORANGE_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.YELLOW_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.YELLOW_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.LIME_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.LIME_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.GREEN_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.GREEN_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.CYAN_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.CYAN_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.LIGHT_BLUE_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.LIGHT_BLUE_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.BLUE_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.BLUE_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.PURPLE_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.PURPLE_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.MAGENTA_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.MAGENTA_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.PINK_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.PINK_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.GLASS_STAIR);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_ONE);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_TWO);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_THREE);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_FOUR);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_FIVE);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_SIX);
        addDrop(ServerSpecificBlocks.GOLD_LANTERN);
        addDrop(AmethystBlocks.AMETHYST_SLAB);
        addDrop(AmethystBlocks.AMETHYST_STAIR);
        addDrop(RandomBlocks.CALSITE_SLAB);
        addDrop(RandomBlocks.CALSITE_STAIRS);
        addDrop(RandomBlocks.TUFF_SLAB);
        addDrop(RandomBlocks.TUFF_STAIRS);
        addDrop(RandomBlocks.SMOOTH_BASALT_SLAB);
        addDrop(RandomBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(RandomBlocks.DRIPSTONE_SLAB);
        addDrop(RandomBlocks.DRIPSTONE_STAIRS);
        addDrop(RandomBlocks.NETHERRACK_SLAB);
        addDrop(RandomBlocks.NETHERRACK_STAIRS);
        addDrop(RandomBlocks.SNOW_SLAB);
        addDrop(RandomBlocks.SNOW_STAIRS);

    }
}
