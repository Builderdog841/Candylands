package net.builderdog.candylands.block.natural;

import net.builderdog.candylands.block.CandylandsBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.NotNull;

public class JellyBlock extends Block {
    public static final BooleanProperty GLAZED = CandylandsBlockStateProperties.GLAZED;

    public JellyBlock(Properties properties) {
        super(properties);
        registerDefaultState(stateDefinition.any().setValue(GLAZED, Boolean.FALSE));
    }

    public @NotNull BlockState updateShape(@NotNull BlockState state, @NotNull Direction direction, @NotNull BlockState originalState, @NotNull LevelAccessor accessor, @NotNull BlockPos pos, @NotNull BlockPos originalPos) {
        return direction == Direction.UP ? state.setValue(GLAZED, isSnowySetting(originalState)) : super.updateShape(state, direction, originalState, accessor, pos, originalPos);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState state = context.getLevel().getBlockState(context.getClickedPos().above());
        return defaultBlockState().setValue(GLAZED, isSnowySetting(state));
    }

    private static boolean isSnowySetting(BlockState state) {
        return state.is(Blocks.SNOW);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder< Block, BlockState > builder) {
        builder.add(GLAZED);
    }
}