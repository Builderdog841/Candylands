package net.builderdog.candylands;

import com.mojang.logging.LogUtils;
import net.builderdog.candylands.data.CandylandsData;
import net.builderdog.candylands.item.CandylandsCreativeTabs;
import net.builderdog.candylands.item.CandylandsItems;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(Candylands.MODID)
public class Candylands {
    public static final String MODID = "candylands";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Candylands(ModContainer mod, IEventBus bus, Dist dist) {
        bus.addListener(CandylandsData::dataSetup);
        bus.addListener(this::commonSetup);

        DeferredRegister<?>[] registers = {
                CandylandsItems.ITEMS,
                CandylandsCreativeTabs.CREATIVE_MODE_TABS
        };

        for (DeferredRegister<?> register : registers) {
            register.register(bus);
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
