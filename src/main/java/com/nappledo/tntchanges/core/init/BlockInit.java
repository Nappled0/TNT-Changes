package com.nappledo.tntchanges.core.init;

import com.nappledo.tntchanges.TNTChanges;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TNTChanges.MOD_ID);

    public static final RegistryObject<Block> EXAMPLE_TNT = BLOCKS.register("example_tnt", () -> new Block(AbstractBlock.Properties.from(Blocks.TNT)));
}
