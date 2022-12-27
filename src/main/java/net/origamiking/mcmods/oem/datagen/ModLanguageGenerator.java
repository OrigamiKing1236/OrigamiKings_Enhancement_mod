package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.client.render.RenderLayer;
import net.origamiking.mcmods.oem.blocks.ModBlocks;
import net.origamiking.mcmods.oem.blocks.glass.ModBlocksGlass;
import net.origamiking.mcmods.oem.blocks.server_specific.ModBlocksServerSpecific;

import java.nio.file.Path;

public class ModLanguageGenerator extends FabricLanguageProvider {
    protected ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //translationBuilder.add(ITEM, "Item");
        /*translationBuilder.add(ModBlocksGlass.GLASS_SLAB, "Glass Slab");
        translationBuilder.add(ModBlocksGlass.GLASS_STAIR, "Glass Stair");
        translationBuilder.add(ModBlocksGlass.WHITE_GLASS_STAIR, "White Glass Stair");
        translationBuilder.add(ModBlocksGlass.WHITE_GLASS_SLAB, "White Glass Slab");
        translationBuilder.add(ModBlocksGlass.LIGHT_GRAY_GLASS_SLAB, "Light Gray Glass Slab");
        translationBuilder.add(ModBlocksGlass.LIGHT_GRAY_GLASS_STAIR, "Light Gray Glass Stair");
        translationBuilder.add(ModBlocksGlass.GRAY_GLASS_SLAB,"Gray Glass Slab");
        translationBuilder.add(ModBlocksGlass.GRAY_GLASS_STAIR, "Gray Glass Stair");*/
        /*translationBuilder.add(ModBlocksGlass.BLACK_GLASS_SLAB, "Black Glass Slab");
        translationBuilder.add(ModBlocksGlass.BLACK_GLASS_STAIR, "Black Glass Stair");
        translationBuilder.add(ModBlocksGlass.BROWN_GLASS_SLAB," Brown Glass Slab");
        translationBuilder.add(ModBlocksGlass.BROWN_GLASS_STAIR, "Brown Glass Stair");
        translationBuilder.add(ModBlocksGlass.RED_GLASS_SLAB, "Red Glass Slab");
        translationBuilder.add(ModBlocksGlass.RED_GLASS_STAIR, "Red Glass Stair");
        translationBuilder.add(ModBlocksGlass.ORANGE_GLASS_SLAB, "Orange Glass Slab");
        translationBuilder.add(ModBlocksGlass.ORANGE_GLASS_STAIR, "Orange Glass Stair");
        translationBuilder.add(ModBlocksGlass.YELLOW_GLASS_SLAB, "Yellow Glass slab");
        translationBuilder.add(ModBlocksGlass.YELLOW_GLASS_STAIR, "Yellow Glass Stair");
        translationBuilder.add(ModBlocksGlass.LIME_GLASS_SLAB, "Lime Glass Slab");
        translationBuilder.add(ModBlocksGlass.LIME_GLASS_STAIR, "Lime Glass Stair");
        translationBuilder.add(ModBlocksGlass.GREEN_GLASS_SLAB, "Green glass Slab");
        translationBuilder.add(ModBlocksGlass.GREEN_GLASS_STAIR, "Green Glass Stair");
        translationBuilder.add(ModBlocksGlass.CYAN_GLASS_SLAB, "Cyan Glass Slab");
        translationBuilder.add(ModBlocksGlass.CYAN_GLASS_STAIR, "Cyan Glass Stair");
        translationBuilder.add(ModBlocksGlass.LIGHT_BLUE_GLASS_SLAB, "Light Blue Glass Slab");
        translationBuilder.add(ModBlocksGlass.LIGHT_BLUE_GLASS_STAIR, "Light Blue Glass Slab");
        translationBuilder.add(ModBlocksGlass.BLUE_GLASS_SLAB, "Blue Glass Slab");
        translationBuilder.add(ModBlocksGlass.BLUE_GLASS_STAIR, "Blue Glass Stair");
        translationBuilder.add(ModBlocksGlass.PURPLE_GLASS_SLAB, "Purple Glass Slab");
        translationBuilder.add(ModBlocksGlass.PURPLE_GLASS_STAIR, "Purple Glass Stair");
        translationBuilder.add(ModBlocksGlass.MAGENTA_GLASS_SLAB, "Magenta Glass Slab");
        translationBuilder.add(ModBlocksGlass.MAGENTA_GLASS_STAIR, "Magenta Glass Stair");
        translationBuilder.add(ModBlocksGlass.PINK_GLASS_SLAB, "Pink Glass Slab");
        translationBuilder.add(ModBlocksGlass.PINK_GLASS_STAIR, "Pink Glass Stair");*/
        //translationBuilder.add(ModBlocksServerSpecific.GOLD_LANTERN, "Gold Lantern");



        try {
            Path exisingFilePath = dataOutput.getModContainer().findPath("assets/oem/lang/en_us.json").get();
            translationBuilder.add(exisingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add to existing language file.", e);
        }
    }
}
