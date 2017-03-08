package com.toastertim.spikemod.block;

import com.toastertim.spikemod.SpikeMod;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import static com.toastertim.spikemod.Config.*;


/**
 * Created by Tim on 10/6/2016.
 */
public class SpikeBlocks {
    public static Block woodenSpike;
    public static Block stoneSpike;
    public static Block ironSpike;
    public static Block goldSpike;
    public static Block diamondSpike;
    public static Block lootingSpike;

    public static void preInit(){
        woodenSpike = new BlockSpike("wooden_spike", woodenDamage);
        stoneSpike = new BlockSpike("stone_spike", stoneDamage);
        ironSpike = new BlockSpike("iron_spike", ironDamage);
        goldSpike = new BlockSpike("golden_spike", goldDamage);
        diamondSpike = new BlockSpike("diamond_spike", diamondDamage);
        lootingSpike = new LootingSpike("looting_spike", lootingDamage);
        registerBlocks();
    }

    public static void registerBlocks(){
        registerBlock(woodenSpike, "wooden_spike");
        registerBlock(stoneSpike, "stone_spike");
        registerBlock(goldSpike, "golden_spike");
        registerBlock(ironSpike, "iron_spike");
        registerBlock(diamondSpike, "diamond_spike");
        registerBlock(lootingSpike, "looting_spike");
    }

    public static void registerBlock(Block block, String name){
        GameRegistry.register(block, new ResourceLocation(SpikeMod.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(SpikeMod.MODID, name));
    }

    public static void registerRenders(){
        registerRender(woodenSpike);
        registerRender(ironSpike);
        registerRender(stoneSpike);
        registerRender(goldSpike);
        registerRender(diamondSpike);
        registerRender(lootingSpike);

    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(SpikeMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }

}
