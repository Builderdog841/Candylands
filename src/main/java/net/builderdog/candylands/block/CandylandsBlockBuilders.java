package net.builderdog.candylands.block;

import net.builderdog.candylands.block.natural.JellyBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class CandylandsBlockBuilders {

    public static Block cream(MapColor mapColor) {
        return new Block(
                BlockBehaviour.Properties.of()
                        .mapColor(mapColor)
                        .strength(0.5F)
                        .sound(SoundType.SNOW)
        );
    }

    public static JellyBlock jelly(MapColor mapColor) {
        return new JellyBlock(
                BlockBehaviour.Properties.of()
                        .mapColor(mapColor)
                        .strength(0.4F)
                        .sound(SoundType.HONEY_BLOCK)
        );
    }

    public static RotatedPillarBlock candyCane(MapColor topMapColor, MapColor sideMapColor) {
        return new RotatedPillarBlock(
                BlockBehaviour.Properties.of()
                        .mapColor(block -> block.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0F)
                        .sound(SoundType.WOOD)
                        .ignitedByLava()
        );
    }

    public static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }

    public static boolean always(BlockState state, BlockGetter getter, BlockPos pos) {
        return true;
    }

    public static <A> boolean never(BlockState state, BlockGetter getter, BlockPos pos, A block) {
        return false;
    }
}