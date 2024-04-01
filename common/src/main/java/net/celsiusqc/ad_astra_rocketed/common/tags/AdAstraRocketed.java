package net.celsiusqc.ad_astra_rocketed.common.tags;

import net.celsiusqc.ad_astra_rocketed.common.registry.ModCreativeTab;
import net.celsiusqc.ad_astra_rocketed.common.registry.ModEntityTypes;
import net.celsiusqc.ad_astra_rocketed.common.registry.ModItems;

public class AdAstraRocketed {
    public static final String MOD_ID = "ad_astra_rocketed";

    public static void init() {
        ModItems.ITEMS.init();
        ModCreativeTab.init();
        ModEntityTypes.ENTITY_TYPES.init();
    }

    public static void postInit() {}
}
