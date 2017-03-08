package com.toastertim.spikemod.tab;

import com.toastertim.spikemod.block.SpikeBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Tim on 10/6/2016.
 */
public class SpikeTab extends CreativeTabs {

    public SpikeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(SpikeBlocks.diamondSpike);
    }
}
