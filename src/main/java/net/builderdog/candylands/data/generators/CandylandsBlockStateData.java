package net.builderdog.candylands.data.generators;

import net.builderdog.candylands.Candylands;
import net.builderdog.candylands.block.CandylandsBlocks;
import net.builderdog.candylands.data.providers.CandylandsBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class CandylandsBlockStateData extends CandylandsBlockStateProvider {
    public CandylandsBlockStateData(PackOutput output, ExistingFileHelper helper) {
        super(output, Candylands.MODID, helper);
    }
    @Override
    protected void registerStatesAndModels() {
        blockWithItem(CandylandsBlocks.GLAZE);
        blockWithItem(CandylandsBlocks.FROZEN_YOGHURT);
        blockWithItem(CandylandsBlocks.STRAWBERRY_CREAM);
        blockWithItem(CandylandsBlocks.VANILLA_CREAM);
        blockWithItem(CandylandsBlocks.CHOCOLATE_CREAM);

        blockWithItem(CandylandsBlocks.JELLY);
        blockWithItem(CandylandsBlocks.DARK_JELLY);

        logBlock(CandylandsBlocks.CANDY_CANE_BLOCK.get());
        logBlock(CandylandsBlocks.GREEN_CANDY_CANE_BLOCK.get());
        logBlock(CandylandsBlocks.PEPPERMINT_CANDY_CANE_BLOCK.get());

        axisBlock(CandylandsBlocks.COVERED_CANDY_CANE_BLOCK.get(), blockTexture(CandylandsBlocks.CANDY_CANE_BLOCK.get()), blockTexture(CandylandsBlocks.CANDY_CANE_BLOCK.get()));
        axisBlock(CandylandsBlocks.COVERED_GREEN_CANDY_CANE_BLOCK.get(), blockTexture(CandylandsBlocks.GREEN_CANDY_CANE_BLOCK.get()), blockTexture(CandylandsBlocks.GREEN_CANDY_CANE_BLOCK.get()));
        axisBlock(CandylandsBlocks.COVERED_PEPPERMINT_CANDY_CANE_BLOCK.get(), blockTexture(CandylandsBlocks.PEPPERMINT_CANDY_CANE_BLOCK.get()), blockTexture(CandylandsBlocks.PEPPERMINT_CANDY_CANE_BLOCK.get()));
    }
}