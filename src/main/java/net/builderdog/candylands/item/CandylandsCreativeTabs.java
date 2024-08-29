package net.builderdog.candylands.item;

import net.builderdog.candylands.Candylands;
import net.builderdog.candylands.block.CandylandsBlocks;
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

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_BLOCKS = CREATIVE_MODE_TABS.register("blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .withTabsAfter(CandylandsCreativeTabs.CANDYLANDS_COMBAT_AND_UTILITIES.getId())
            .icon(() -> new ItemStack(CandylandsBlocks.JELLY))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".blocks"))
            .displayItems((features, output) -> {
                output.accept(CandylandsBlocks.GLAZE);
                output.accept(CandylandsBlocks.FROZEN_YOGHURT);
                output.accept(CandylandsBlocks.STRAWBERRY_CREAM);
                output.accept(CandylandsBlocks.VANILLA_CREAM);
                output.accept(CandylandsBlocks.CHOCOLATE_CREAM);
                output.accept(CandylandsBlocks.JELLY);
                output.accept(CandylandsBlocks.DARK_JELLY);
                output.accept(CandylandsBlocks.CANDY_CANE_BLOCK);
                output.accept(CandylandsBlocks.COVERED_CANDY_CANE_BLOCK);
                output.accept(CandylandsBlocks.GREEN_CANDY_CANE_BLOCK);
                output.accept(CandylandsBlocks.COVERED_GREEN_CANDY_CANE_BLOCK);
                output.accept(CandylandsBlocks.PEPPERMINT_CANDY_CANE_BLOCK);
                output.accept(CandylandsBlocks.COVERED_PEPPERMINT_CANDY_CANE_BLOCK);
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_COMBAT_AND_UTILITIES = CREATIVE_MODE_TABS.register("combat_and_utilities", () -> CreativeModeTab.builder()
            .withTabsBefore(CandylandsCreativeTabs.CANDYLANDS_BLOCKS.getId())
            .withTabsAfter(CandylandsCreativeTabs.CANDYLANDS_CANDY_AND_TREATS.getId())
            .icon(() -> new ItemStack(Blocks.STONE))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".combat_and_utilities"))
            .displayItems((features, output) -> {

            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_CANDY_AND_TREATS = CREATIVE_MODE_TABS.register("candy_and_treats", () -> CreativeModeTab.builder()
            .withTabsBefore(CandylandsCreativeTabs.CANDYLANDS_COMBAT_AND_UTILITIES.getId())
            .withTabsAfter(CandylandsCreativeTabs.CANDYLANDS_INGREDIENTS.getId())
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
            .withTabsBefore(CandylandsCreativeTabs.CANDYLANDS_CANDY_AND_TREATS.getId())
            .withTabsAfter(CandylandsCreativeTabs.CANDYLANDS_SPAWN_EGGS.getId())
            .icon(() -> new ItemStack(CandylandsItems.CRYSTALLIZED_SUGAR.get()))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".ingredients"))
            .displayItems((features, output) -> {
                output.accept(CandylandsItems.CRYSTALLIZED_SUGAR.get());
                output.accept(CandylandsItems.CARAMEL.get());
                output.accept(CandylandsItems.SUGAR_STICK.get());
                output.accept(CandylandsItems.LICORICE.get());
                output.accept(CandylandsItems.DEXTROSE.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CANDYLANDS_SPAWN_EGGS = CREATIVE_MODE_TABS.register("spawn_eggs", () -> CreativeModeTab.builder()
            .withTabsBefore(CandylandsCreativeTabs.CANDYLANDS_INGREDIENTS.getId())
            .icon(() -> new ItemStack(Blocks.STONE))
            .title(Component.translatable("itemGroup." + Candylands.MODID + ".spawn_eggs"))
            .displayItems((features, output) -> {

            }).build());
}