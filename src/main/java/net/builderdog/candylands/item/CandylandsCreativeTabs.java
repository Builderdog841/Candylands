package net.builderdog.candylands.item;

import net.builderdog.candylands.Candylands;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CandylandsCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Candylands.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_BUILDING_BLOCKS = CREATIVE_MODE_TABS.register("candylands", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .withTabsAfter(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "dungeon_blocks"))
            .icon(() -> new ItemStack(Blocks.STONE))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".building_blocks"))
            .displayItems((features, output) -> {

            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_DUNGEON_BLOCKS = CREATIVE_MODE_TABS.register("dungeon_blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "building_blocks"))
            .withTabsAfter(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "natural_blocks"))
            .icon(() -> new ItemStack(Blocks.STONE))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".dungeon_blocks"))
            .displayItems((features, output) -> {

            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_NATURAL_BLOCKS = CREATIVE_MODE_TABS.register("natural_blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "dungeon_blocks"))
            .withTabsAfter(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "functional_blocks"))
            .icon(() -> new ItemStack(Blocks.STONE))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".natural_blocks"))
            .displayItems((features, output) -> {

            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_FUNCTIONAL_BLOCKS = CREATIVE_MODE_TABS.register("functional_blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "natural_blocks"))
            .withTabsAfter(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "tools_and_utilities"))
            .icon(() -> new ItemStack(Blocks.STONE))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".functional_blocks"))
            .displayItems((features, output) -> {

            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_TOOLS_AND_UTILITIES = CREATIVE_MODE_TABS.register("tools_and_utilities", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "functional_blocks"))
            .withTabsAfter(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "combat"))
            .icon(() -> new ItemStack(Blocks.STONE))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".tools_and_utilities"))
            .displayItems((features, output) -> {

            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_COMBAT = CREATIVE_MODE_TABS.register("combat", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "tools_and_utilities"))
            .withTabsAfter(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "candy_and_treats"))
            .icon(() -> new ItemStack(Blocks.STONE))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".combat"))
            .displayItems((features, output) -> {

            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_CANDY_AND_TREATS = CREATIVE_MODE_TABS.register("candy_and_treats", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "combat"))
            .withTabsAfter(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "ingredients"))
            .icon(() -> new ItemStack(CandylandsItems.CANDY_CANE.get()))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".candy_and_treats"))
            .displayItems((features, output) -> {
                output.accept(CandylandsItems.CANDY_CANE.get());
                output.accept(CandylandsItems.GREEN_CANDY_CANE.get());
                output.accept(CandylandsItems.PEPPERMINT_CANDY_CANE.get());
                output.accept(CandylandsItems.LICORICE.get());
                output.accept(CandylandsItems.DEXTROSE.get());
                output.accept(CandylandsItems.WHITE_MARSHMALLOW.get());
                output.accept(CandylandsItems.PINK_MARSHMALLOW.get());
                output.accept(CandylandsItems.CARAMEL.get());
                output.accept(CandylandsItems.STRAWBERRY_LOLLIPOP.get());
                output.accept(CandylandsItems.LIME_LOLLIPOP.get());
                output.accept(CandylandsItems.BLUEBERRY_LOLLIPOP.get());
                output.accept(CandylandsItems.ORANGE_LOLLIPOP.get());
                output.accept(CandylandsItems.LEMON_LOLLIPOP.get());
                output.accept(CandylandsItems.CAKEPOP.get());
                output.accept(CandylandsItems.ICE_CREAM.get());
                output.accept(CandylandsItems.COTTON_CANDY.get());
                output.accept(CandylandsItems.MINT_CANDY.get());
                output.accept(CandylandsItems.WARPED_POP.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_INGREDIENTS = CREATIVE_MODE_TABS.register("ingredients", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "candy_and_treats"))
            .withTabsAfter(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "event_content"))
            .icon(() -> new ItemStack(CandylandsItems.CRYSTALLIZED_SUGAR.get()))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".ingredients"))
            .displayItems((features, output) -> {
                output.accept(CandylandsItems.CRYSTALLIZED_SUGAR.get());
                output.accept(CandylandsItems.SUGAR_STICK.get());
                output.accept(CandylandsItems.LICORICE.get());
                output.accept(CandylandsItems.DEXTROSE.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_EVENT_CONTENT = CREATIVE_MODE_TABS.register("event_content", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "ingredients"))
            .withTabsAfter(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "spawn_eggs"))
            .icon(() -> new ItemStack(Blocks.STONE))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".event_content"))
            .displayItems((features, output) -> {

            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_SPAWN_EGGS = CREATIVE_MODE_TABS.register("spawn_eggs", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Candylands.MODID, "event_content"))
            .icon(() -> new ItemStack(Blocks.STONE))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".spawn_eggs"))
            .displayItems((features, output) -> {

            }).build());
}