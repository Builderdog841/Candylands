package net.builderdog.candylands.data.generators;

import net.builderdog.candylands.Candylands;
import net.builderdog.candylands.item.CandylandsItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class CandylandsLanguageData extends LanguageProvider {
    public CandylandsLanguageData(PackOutput output) {
        super(output, Candylands.MODID, "en_us");
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
    }
}