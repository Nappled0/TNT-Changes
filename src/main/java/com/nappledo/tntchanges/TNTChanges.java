package com.nappledo.tntchanges;

import com.nappledo.tntchanges.core.init.BlockInit;
import com.nappledo.tntchanges.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("tntchanges")
public class TNTChanges
{
    public static final String MOD_ID = "tntchanges";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup TNT_GROUP = new TNTChangesGroup("tnt_group");

    public TNTChanges() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    public static class TNTChangesGroup extends ItemGroup {

        TNTChangesGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return Items.TNT.getDefaultInstance();
        }
    }
}
