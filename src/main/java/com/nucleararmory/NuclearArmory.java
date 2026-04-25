package com.nucleararmory;

import com.nucleararmory.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(NuclearArmory.MOD_ID)
public class NuclearArmory {
    public static final String MOD_ID = "nucleararmory";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public NuclearArmory() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(modEventBus);
        ModItems.TABS.register(modEventBus);
        LOGGER.info("Nuclear Armory loaded - Prepare for nuclear devastation!");
    }
}
