package net.builderdog.candylands.item.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;

@SuppressWarnings("deprecation")
public class CandylandsFoods extends Foods {
    public static final FoodProperties CANDY_CANE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F).build();
    public static final FoodProperties LICORICE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.6F).build();
    public static final FoodProperties DEXTROSE = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).build();
    public static final FoodProperties MARSHMALLOW = new FoodProperties.Builder().fast().nutrition(1).saturationModifier(0.3F).build();
    public static final FoodProperties CARAMEL = new FoodProperties.Builder().nutrition(2).saturationModifier(0.5F).build();
    public static final FoodProperties LOLLIPOP = new FoodProperties.Builder().nutrition(3).saturationModifier(0.4F).build();
    public static final FoodProperties CAKEPOP = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties ICE_CREAM = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodProperties COTTON_CANDY = new FoodProperties.Builder().nutrition(4).saturationModifier(0.6F).build();
    public static final FoodProperties MINT_CANDY = new FoodProperties.Builder().alwaysEdible().nutrition(4).saturationModifier(1.0F).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 2400, 0), 1.0F).build();
    public static final FoodProperties WARPED_POP = new FoodProperties.Builder().alwaysEdible().build();
}