package net.builderdog.candylands.data.generators;

import net.builderdog.candylands.Candylands;
import net.builderdog.candylands.data.providers.CandylandsLanguageProvider;
import net.builderdog.candylands.item.CandylandsCreativeTabs;
import net.builderdog.candylands.item.CandylandsItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class CandylandsLanguageData extends CandylandsLanguageProvider {
    public CandylandsLanguageData(PackOutput output) {
        super(output, Candylands.MODID);
    }

    @Override
    protected void addTranslations() {

        this.addItem(CandylandsItems.CRYSTALLIZED_SUGAR, "Crystallized Sugar");
        this.addItem(CandylandsItems.SUGAR_STICK, "Sugar Stick");

        this.addItem(CandylandsItems.CANDY_CANE, "Candy Cane");
        this.addItem(CandylandsItems.GREEN_CANDY_CANE, "Green Candy Cane");
        this.addItem(CandylandsItems.PEPPERMINT_CANDY_CANE, "Peppermint Candy Cane");
        this.addItem(CandylandsItems.LICORICE, "Licorice");
        this.addItem(CandylandsItems.DEXTROSE, "Dextrose");
        this.addItem(CandylandsItems.WHITE_MARSHMALLOW, "White Marshmallow");
        this.addItem(CandylandsItems.PINK_MARSHMALLOW, "Pink Marshmallow");
        this.addItem(CandylandsItems.CARAMEL, "Caramel");
        this.addItem(CandylandsItems.STRAWBERRY_LOLLIPOP, "Strawberry Lollipop");
        this.addItem(CandylandsItems.LIME_LOLLIPOP, "Lime Lollipop");
        this.addItem(CandylandsItems.BLUEBERRY_LOLLIPOP, "Blueberry Lollipop");
        this.addItem(CandylandsItems.ORANGE_LOLLIPOP, "Orange Lollipop");
        this.addItem(CandylandsItems.LEMON_LOLLIPOP, "Lemon Lollipop");
        this.addItem(CandylandsItems.CAKEPOP, "Cakepop");
        this.addItem(CandylandsItems.ICE_CREAM, "Ice Cream");
        this.addItem(CandylandsItems.COTTON_CANDY, "Cotton Candy");
        this.addItem(CandylandsItems.MINT_CANDY, "Mint Candy");
        this.addItem(CandylandsItems.WARPED_POP, "Warped Pop");

        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_BUILDING_BLOCKS.get(), "Candylands Building Blocks");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_DUNGEON_BLOCKS.get(), "Candylands Dungeon Blocks");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_NATURAL_BLOCKS.get(), "Candylands Natural Blocks");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_FUNCTIONAL_BLOCKS.get(), "Candylands Functional Blocks");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_TOOLS_AND_UTILITIES.get(), "Candylands Tools & Utilities");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_COMBAT.get(), "Candylands Combat");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_CANDY_AND_TREATS.get(), "Candylands Candy & Treats");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_INGREDIENTS.get(), "Candylands Ingredients");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_EVENT_CONTENT.get(), "Candylands Event Content");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_SPAWN_EGGS.get(), "Candylands Spawn Eggs");
    }
}