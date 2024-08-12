package net.builderdog.candylands.data.generators;

import net.builderdog.candylands.Candylands;
import net.builderdog.candylands.data.providers.CandylandsItemModelProvider;
import net.builderdog.candylands.item.CandylandsItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class CandylandsItemModelData extends CandylandsItemModelProvider {
    public CandylandsItemModelData(PackOutput output, ExistingFileHelper helper) {
        super(output, Candylands.MODID, helper);
    }

    @Override
    protected void registerModels() {

        this.item(CandylandsItems.CRYSTALLIZED_SUGAR.get());
        this.handheldItem(CandylandsItems.SUGAR_STICK.get());

        this.item(CandylandsItems.CANDY_CANE.get());
        this.item(CandylandsItems.GREEN_CANDY_CANE.get());
        this.item(CandylandsItems.PEPPERMINT_CANDY_CANE.get());
        this.item(CandylandsItems.LICORICE.get());
        this.item(CandylandsItems.DEXTROSE.get());
        this.item(CandylandsItems.WHITE_MARSHMALLOW.get());
        this.item(CandylandsItems.PINK_MARSHMALLOW.get());
        this.item(CandylandsItems.CARAMEL.get());
        this.item(CandylandsItems.STRAWBERRY_LOLLIPOP.get());
        this.item(CandylandsItems.LIME_LOLLIPOP.get());
        this.item(CandylandsItems.BLUEBERRY_LOLLIPOP.get());
        this.item(CandylandsItems.ORANGE_LOLLIPOP.get());
        this.item(CandylandsItems.LEMON_LOLLIPOP.get());
        this.item(CandylandsItems.CAKEPOP.get());
        this.item(CandylandsItems.ICE_CREAM.get());
        this.item(CandylandsItems.COTTON_CANDY.get());
        this.item(CandylandsItems.MINT_CANDY.get());
        this.item(CandylandsItems.WARPED_POP.get());
    }
}