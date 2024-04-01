package net.celsiusqc.ad_astra_rocketed.forge;

import net.celsiusqc.ad_astra_rocketed.common.tags.AdAstraRocketed;
import net.celsiusqc.ad_astra_rocketed.client.forge.AdAstraRocketedClientForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(AdAstraRocketed.MOD_ID)
public class AdAstraRocketedForge {

    public AdAstraRocketedForge() {
        AdAstraRocketed.init();

        if (FMLEnvironment.dist.isClient()) AdAstraRocketedClientForge.init();
    }

}
