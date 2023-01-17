package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.origamiking.mcmods.oem.blocks.amethyst.AmethystBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteStairs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteWalls;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafSlabs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafWalls;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.sculk.SculkBlocks;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.birch.BirchWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.crimson.CrimsonWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.darkoak.DarkOakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.jungle.JungleWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.mangrove.MangroveWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.oak.OakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.warped.WarpedWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wool.black.BlackWool;
import net.origamiking.mcmods.oem.blocks.wool.blue.BlueWool;
import net.origamiking.mcmods.oem.blocks.wool.brown.BrownWool;
import net.origamiking.mcmods.oem.blocks.wool.cyan.CyanWool;
import net.origamiking.mcmods.oem.blocks.wool.gray.GrayWool;
import net.origamiking.mcmods.oem.blocks.wool.green.GreenWool;
import net.origamiking.mcmods.oem.blocks.wool.light_gray.LightGrayWool;
import net.origamiking.mcmods.oem.blocks.wool.lightblue.LightBlueWool;
import net.origamiking.mcmods.oem.blocks.wool.lime.LimeWool;
import net.origamiking.mcmods.oem.blocks.wool.magenta.MagentaWool;
import net.origamiking.mcmods.oem.blocks.wool.orange.OrangeWool;
import net.origamiking.mcmods.oem.blocks.wool.pink.PinkWool;
import net.origamiking.mcmods.oem.blocks.wool.purple.PurpleWool;
import net.origamiking.mcmods.oem.blocks.wool.red.RedWool;
import net.origamiking.mcmods.oem.blocks.wool.white.WhiteWool;
import net.origamiking.mcmods.oem.blocks.wool.yellow.YellowWool;


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
        addDrop(OakWoodBlocks.OAK_LADDER);
        addDrop(SpruceWoodBlocks.SPRUCE_BARREL);
        addDrop(SpruceWoodBlocks.SPRUCE_LADDER);
        addDrop(SpruceWoodBlocks.SPRUCE_BOOKSHELF);
        addDrop(BirchWoodBlocks.BIRCH_LADDER);
        addDrop(BirchWoodBlocks.BIRCH_BARREL);
        addDrop(BirchWoodBlocks.BIRCH_BOOKSHELF);
        addDrop(JungleWoodBlocks.JUNGLE_LADDER);
        addDrop(JungleWoodBlocks.JUNGLE_BOOKSHELF);
        addDrop(JungleWoodBlocks.JUNGLE_BARREL);
        addDrop(AcaciaWoodBlocks.ACACIA_LADDER);
        addDrop(AcaciaWoodBlocks.ACACIA_BOOKSHELF);
        addDrop(AcaciaWoodBlocks.ACACIA_BARREL);
        addDrop(DarkOakWoodBlocks.DARK_OAK_LADDER);
        addDrop(DarkOakWoodBlocks.DARK_OAK_BOOKSHELF);
        addDrop(DarkOakWoodBlocks.DARK_OAK_BARREL);
        addDrop(MangroveWoodBlocks.MANGROVE_LADDER);
        addDrop(MangroveWoodBlocks.MANGROVE_BARREL);
        addDrop(MangroveWoodBlocks.MANGROVE_BOOKSHELF);
        addDrop(CrimsonWoodBlocks.CRIMSON_LADDER);
        addDrop(CrimsonWoodBlocks.CRIMSON_BARREL);
        addDrop(CrimsonWoodBlocks.CRIMSON_BOOKSHELF);
        addDrop(WarpedWoodBlocks.WARPED_LADDER);
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
        addDrop(AmethystBlocks.AMETHYST_WALL);
        addDrop(RandomBlocks.CALSITE_WALL);
        addDrop(RandomBlocks.TUFF_WALL);
        addDrop(RandomBlocks.SMOOTH_BASALT_WALL);
        addDrop(RandomBlocks.NETHERRACK_WALL);
        addDrop(RandomBlocks.DRIPSTONE_WALL);
        addDrop(RandomBlocks.SNOW_WALL);
        addDrop(CopperBlocks.COPPER_CHAIN);
        addDrop(CopperBlocks.COPPER_BARS);
        addDrop(CopperBlocks.WEATHERED_COPPER_BARS);
        addDrop(CopperBlocks.EXPOSED_COPPER_BARS);
        addDrop(CopperBlocks.OXIDIZED_COPPER_BARS);
        addDrop(CopperBlocks.COPPER_LANTERN);
        addDrop(CopperBlocks.COPPER_PRESSURE_PLATE);
        addDrop(CopperBlocks.EXPOSED_COPPER_CHAIN);
        addDrop(CopperBlocks.WEATHERED_COPPER_CHAIN);
        addDrop(CopperBlocks.OXIDIZED_COPPER_CHAIN);
        addDrop(CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        addDrop(CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        addDrop(CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        addDrop(CopperBlocks.COPPER_BUTTON);
        addDrop(CopperBlocks.EXPOSED_COPPER_BUTTON);
        addDrop(CopperBlocks.WEATHERED_COPPER_BUTTON);
        addDrop(CopperBlocks.OXIDIZED_COPPER_BUTTON);
        addDrop(CopperBlocks.COPPER_DOOR);
        addDrop(CopperBlocks.COPPER_TRAPDOOR);
        addDrop(WhiteWool.WHITE_WOOL_STAIRS);
        addDrop(WhiteWool.WHITE_WOOL_WALL);
        addDrop(WhiteWool.WHITE_WOOL_SLAB);
        addDrop(LightGrayWool.LIGHT_GRAY_WOOL_STAIRS);
        addDrop(LightGrayWool.LIGHT_GRAY_WOOL_WALL);
        addDrop(LightGrayWool.LIGHT_GRAY_WOOL_SLAB);
        addDrop(GrayWool.GRAY_WOOL_STAIRS);
        addDrop(GrayWool.GRAY_WOOL_WALL);
        addDrop(GrayWool.GRAY_WOOL_SLAB);
        addDrop(BlackWool.BLACK_WOOL_STAIRS);
        addDrop(BlackWool.BLACK_WOOL_WALL);
        addDrop(BlackWool.BLACK_WOOL_SLAB);
        addDrop(BrownWool.BROWN_WOOL_STAIRS);
        addDrop(BrownWool.BROWN_WOOL_WALL);
        addDrop(BrownWool.BROWN_WOOL_SLAB);
        addDrop(RedWool.RED_WOOL_STAIRS);
        addDrop(RedWool.RED_WOOL_WALL);
        addDrop(RedWool.RED_WOOL_SLAB);
        addDrop(OrangeWool.ORANGE_WOOL_STAIRS);
        addDrop(OrangeWool.ORANGE_WOOL_WALL);
        addDrop(OrangeWool.ORANGE_WOOL_SLAB);
        addDrop(YellowWool.YELLOW_WOOL_STAIRS);
        addDrop(YellowWool.YELLOW_WOOL_WALL);
        addDrop(YellowWool.YELLOW_WOOL_SLAB);
        addDrop(LimeWool.LIME_WOOL_STAIRS);
        addDrop(LimeWool.LIME_WOOL_WALL);
        addDrop(LimeWool.LIME_WOOL_SLAB);
        addDrop(GreenWool.GREEN_WOOL_STAIRS);
        addDrop(GreenWool.GREEN_WOOL_WALL);
        addDrop(GreenWool.GREEN_WOOL_SLAB);
        addDrop(CyanWool.CYAN_WOOL_STAIRS);
        addDrop(CyanWool.CYAN_WOOL_WALL);
        addDrop(CyanWool.CYAN_WOOL_SLAB);
        addDrop(LightBlueWool.LIGHT_BLUE_WOOL_STAIRS);
        addDrop(LightBlueWool.LIGHT_BLUE_WOOL_WALL);
        addDrop(LightBlueWool.LIGHT_BLUE_WOOL_SLAB);
        addDrop(BlueWool.BLUE_WOOL_STAIRS);
        addDrop(BlueWool.BLUE_WOOL_WALL);
        addDrop(BlueWool.BLUE_WOOL_SLAB);
        addDrop(PurpleWool.PURPLE_WOOL_STAIRS);
        addDrop(PurpleWool.PURPLE_WOOL_WALL);
        addDrop(PurpleWool.PURPLE_WOOL_SLAB);
        addDrop(MagentaWool.MAGENTA_WOOL_STAIRS);
        addDrop(MagentaWool.MAGENTA_WOOL_WALL);
        addDrop(MagentaWool.MAGENTA_WOOL_SLAB);
        addDropWithSilkTouch(LeafStairs.OAK_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafStairs.SPRUCE_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafStairs.BIRCH_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafStairs.ACACIA_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafStairs.JUNGLE_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafStairs.MANGROVE_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafSlabs.OAK_LEAVES_SLAB);
        addDropWithSilkTouch(LeafSlabs.SPRUCE_LEAVES_SLAB);
        addDropWithSilkTouch(LeafSlabs.BIRCH_LEAVES_SLAB);
        addDropWithSilkTouch(LeafSlabs.ACACIA_LEAVES_SLAB);
        addDropWithSilkTouch(LeafSlabs.JUNGLE_LEAVES_SLAB);
        addDropWithSilkTouch(LeafSlabs.MANGROVE_LEAVES_SLAB);
        addDropWithSilkTouch(LeafWalls.OAK_LEAVES_WALL);
        addDropWithSilkTouch(LeafWalls.SPRUCE_LEAVES_WALL);
        addDropWithSilkTouch(LeafWalls.BIRCH_LEAVES_WALL);
        addDropWithSilkTouch(LeafWalls.ACACIA_LEAVES_WALL);
        addDropWithSilkTouch(LeafWalls.JUNGLE_LEAVES_WALL);
        addDropWithSilkTouch(LeafWalls.MANGROVE_LEAVES_WALL);
        addDrop(CopperBlocks.EXPOSED_COPPER_DOOR);
        addDrop(CopperBlocks.EXPOSED_COPPER_TRAPDOOR);
        addDrop(CopperBlocks.WEATHERED_COPPER_DOOR);
        addDrop(CopperBlocks.WEATHERED_COPPER_TRAPDOOR);
        addDrop(CopperBlocks.OXIDIZED_COPPER_DOOR);
        addDrop(CopperBlocks.OXIDIZED_COPPER_TRAPDOOR);
        addDrop(ConcreteWalls.WHITE_CONCRETE_WALL);
        addDrop(ConcreteWalls.LIGHT_GRAY_CONCRETE_WALL);
        addDrop(ConcreteWalls.GRAY_CONCRETE_WALL);
        addDrop(ConcreteWalls.BLACK_CONCRETE_WALL);
        addDrop(ConcreteWalls.BROWN_CONCRETE_WALL);
        addDrop(ConcreteWalls.RED_CONCRETE_WALL);
        addDrop(ConcreteWalls.ORANGE_CONCRETE_WALL);
        addDrop(ConcreteWalls.YELLOW_CONCRETE_WALL);
        addDrop(ConcreteWalls.LIME_CONCRETE_WALL);
        addDrop(ConcreteWalls.GREEN_CONCRETE_WALL);
        addDrop(ConcreteWalls.CYAN_CONCRETE_WALL);
        addDrop(ConcreteWalls.LIGHT_BLUE_CONCRETE_WALL);
        addDrop(ConcreteWalls.BLUE_CONCRETE_WALL);
        addDrop(ConcreteWalls.PURPLE_CONCRETE_WALL);
        addDrop(ConcreteWalls.MAGENTA_CONCRETE_WALL);
        addDrop(ConcreteWalls.PINK_CONCRETE_WALL);
        addDrop(GoldBlocks.GOLD_BARS);
        addDrop(PinkWool.PINK_WOOL_STAIRS);
        addDrop(PinkWool.PINK_WOOL_SLAB);
        addDrop(PinkWool.PINK_WOOL_WALL);
        addDrop(SculkBlocks.SCULK_WALL);


    }
}
