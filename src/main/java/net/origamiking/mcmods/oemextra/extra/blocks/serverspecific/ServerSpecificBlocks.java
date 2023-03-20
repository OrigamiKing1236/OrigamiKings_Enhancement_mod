package net.origamiking.mcmods.oemextra.extra.blocks.serverspecific;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.custom.PrimBlock;
import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class ServerSpecificBlocks {
    public static final Block CAVERNS_BLOCK_ONE = registerBlock(OemMain.MOD_ID, "caverns_block_one", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_TWO = registerBlock(OemMain.MOD_ID, "caverns_block_two", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_THREE = registerBlock(OemMain.MOD_ID, "caverns_block_three", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_FOUR = registerBlock(OemMain.MOD_ID, "caverns_block_four", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_FIVE = registerBlock(OemMain.MOD_ID, "caverns_block_five", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CAVERNS_BLOCK_SIX = registerBlock(OemMain.MOD_ID, "caverns_block_six", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(15).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block PRIM = registerBlock(OemMain.MOD_ID, "prim", new PrimBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).noCollision().nonOpaque().breakInstantly()));

    public static void getServerSpecific() {
        OemMain.LOGGER.info("Registering Server Specific Blocks for " + OemMain.NAME);
    }
}