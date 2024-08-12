package net.builderdog.candylands.data;

import net.builderdog.candylands.data.generators.CandylandsItemModelData;
import net.builderdog.candylands.data.generators.CandylandsLanguageData;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class CandylandsData {
    public static void dataSetup(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        PackOutput packOutput = generator.getPackOutput();

        // Client Data
        generator.addProvider(event.includeClient(), new CandylandsItemModelData(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new CandylandsLanguageData(packOutput));
    }
}