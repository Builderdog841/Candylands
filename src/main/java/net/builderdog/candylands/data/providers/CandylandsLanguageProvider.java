package net.builderdog.candylands.data.providers;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.common.data.LanguageProvider;

public abstract class CandylandsLanguageProvider extends LanguageProvider {

    public CandylandsLanguageProvider(PackOutput output, String modid) {
        super(output, modid, "en_us");
    }

    public void addCreativeTab(CreativeModeTab tab, String name) {
        this.add(tab.getDisplayName().getString(), name);
    }
}
