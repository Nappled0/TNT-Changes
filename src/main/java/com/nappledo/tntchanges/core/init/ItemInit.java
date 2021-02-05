package com.nappledo.tntchanges.core.init;

import com.nappledo.tntchanges.TNTChanges;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TNTChanges.MOD_ID);
}
