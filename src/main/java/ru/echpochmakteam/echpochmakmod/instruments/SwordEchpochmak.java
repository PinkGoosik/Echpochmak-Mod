package ru.echpochmakteam.echpochmakmod.instruments;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import ru.echpochmakteam.echpochmakmod.EchpochmakMod;

public class SwordEchpochmak extends SwordItem {
    public SwordEchpochmak(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 0, -2, new Item.Settings().group(EchpochmakMod.ECH_GENERAL));
    }
}
