package com.jecvay.ecosuites.economysuites;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "economysuites",
        name = "EconomySuites",
        description = "Minecraft Sponge Plugin. For easily make the economy of server become more balance. ",
        authors = {
                "Jecvay"
        }
)
public class EconomySuites {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        logger.info("EconomySuites starting");
    }
}
