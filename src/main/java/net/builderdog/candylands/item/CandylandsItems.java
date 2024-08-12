package net.builderdog.candylands.item;

import net.builderdog.candylands.Candylands;
import net.builderdog.candylands.item.food.CandylandsFoods;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CandylandsItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Candylands.MODID);

    public static final DeferredItem<Item> CRYSTALLIZED_SUGAR = ITEMS.register("crystallized_sugar", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUGAR_STICK = ITEMS.register("sugar_stick", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CANDY_CANE = ITEMS.register("candy_cane", () -> new Item(new Item.Properties().food(CandylandsFoods.CANDY_CANE)));
    public static final DeferredItem<Item> GREEN_CANDY_CANE = ITEMS.register("green_candy_cane", () -> new Item(new Item.Properties().food(CandylandsFoods.CANDY_CANE)));
    public static final DeferredItem<Item> PEPPERMINT_CANDY_CANE = ITEMS.register("peppermint_candy_cane", () -> new Item(new Item.Properties().food(CandylandsFoods.CANDY_CANE)));
    public static final DeferredItem<Item> LICORICE = ITEMS.register("licorice", () -> new Item(new Item.Properties().food(CandylandsFoods.LICORICE)));
    public static final DeferredItem<Item> DEXTROSE = ITEMS.register("dextrose", () -> new Item(new Item.Properties().food(CandylandsFoods.DEXTROSE)));
    public static final DeferredItem<Item> WHITE_MARSHMALLOW = ITEMS.register("white_marshmallow", () -> new Item(new Item.Properties().food(CandylandsFoods.MARSHMALLOW)));
    public static final DeferredItem<Item> PINK_MARSHMALLOW = ITEMS.register("pink_marshmallow", () -> new Item(new Item.Properties().food(CandylandsFoods.MARSHMALLOW)));
    public static final DeferredItem<Item> CARAMEL = ITEMS.register("caramel", () -> new Item(new Item.Properties().food(CandylandsFoods.CARAMEL)));
    public static final DeferredItem<Item> STRAWBERRY_LOLLIPOP = ITEMS.register("strawberry_lollipop", () -> new Item(new Item.Properties().food(CandylandsFoods.LOLLIPOP)));
    public static final DeferredItem<Item> LIME_LOLLIPOP = ITEMS.register("lime_lollipop", () -> new Item(new Item.Properties().food(CandylandsFoods.LOLLIPOP)));
    public static final DeferredItem<Item> BLUEBERRY_LOLLIPOP = ITEMS.register("blueberry_lollipop", () -> new Item(new Item.Properties().food(CandylandsFoods.LOLLIPOP)));
    public static final DeferredItem<Item> ORANGE_LOLLIPOP = ITEMS.register("orange_lollipop", () -> new Item(new Item.Properties().food(CandylandsFoods.LOLLIPOP)));
    public static final DeferredItem<Item> LEMON_LOLLIPOP = ITEMS.register("lemon_lollipop", () -> new Item(new Item.Properties().food(CandylandsFoods.LOLLIPOP)));
    public static final DeferredItem<Item> CAKEPOP = ITEMS.register("cakepop", () -> new Item(new Item.Properties().food(CandylandsFoods.CAKEPOP)));
    public static final DeferredItem<Item> ICE_CREAM = ITEMS.register("ice_cream", () -> new Item(new Item.Properties().food(CandylandsFoods.ICE_CREAM)));
    public static final DeferredItem<Item> COTTON_CANDY = ITEMS.register("cotton_candy", () -> new Item(new Item.Properties().food(CandylandsFoods.COTTON_CANDY)));
    public static final DeferredItem<Item> MINT_CANDY = ITEMS.register("mint_candy", () -> new Item(new Item.Properties().food(CandylandsFoods.MINT_CANDY)));
    public static final DeferredItem<Item> WARPED_POP = ITEMS.register("warped_pop", () -> new Item(new Item.Properties().food(CandylandsFoods.WARPED_POP)));
}