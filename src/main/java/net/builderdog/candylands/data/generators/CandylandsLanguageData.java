package net.builderdog.candylands.data.generators;

import net.builderdog.candylands.Candylands;
import net.builderdog.candylands.block.CandylandsBlocks;
import net.builderdog.candylands.data.providers.CandylandsLanguageProvider;
import net.builderdog.candylands.item.CandylandsCreativeTabs;
import net.builderdog.candylands.item.CandylandsItems;
import net.minecraft.data.PackOutput;

public class CandylandsLanguageData extends CandylandsLanguageProvider {
    public CandylandsLanguageData(PackOutput output) {
        super(output, Candylands.MODID);
    }

    @Override
    protected void addTranslations() {
        this.addBlock(CandylandsBlocks.GLAZE, "Glaze");
        this.addBlock(CandylandsBlocks.FROZEN_YOGHURT, "Frozen Yoghurt");
        this.addBlock(CandylandsBlocks.STRAWBERRY_CREAM, "Strawberry Cream");
        this.addBlock(CandylandsBlocks.VANILLA_CREAM, "Vanilla Cream");
        this.addBlock(CandylandsBlocks.CHOCOLATE_CREAM, "Chocolate Cream");

        this.addBlock(CandylandsBlocks.JELLY, "Jelly");
        this.addBlock(CandylandsBlocks.DARK_JELLY, "Dark Jelly");

        this.addBlock(CandylandsBlocks.CANDY_CANE_BLOCK, "Candy Cane Block");
        this.addBlock(CandylandsBlocks.GREEN_CANDY_CANE_BLOCK, "Green Candy Cane Block");
        this.addBlock(CandylandsBlocks.PEPPERMINT_CANDY_CANE_BLOCK, "Peppermint Candy Cane Block");

        this.addBlock(CandylandsBlocks.COVERED_CANDY_CANE_BLOCK, "Covered Candy Cane Block");
        this.addBlock(CandylandsBlocks.COVERED_GREEN_CANDY_CANE_BLOCK, "Covered Green Candy Cane Block");
        this.addBlock(CandylandsBlocks.COVERED_PEPPERMINT_CANDY_CANE_BLOCK, "Covered Peppermint Candy Cane Block");

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

        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_BLOCKS.get(), "Candylands Blocks");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_COMBAT_AND_UTILITIES.get(), "Candylands Combat and Utilities");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_CANDY_AND_TREATS.get(), "Candylands Candy and Treats");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_INGREDIENTS.get(), "Candylands Ingredients");
        this.addCreativeTab(CandylandsCreativeTabs.CANDYLANDS_SPAWN_EGGS.get(), "Candylands Spawn Eggs");
    }
}