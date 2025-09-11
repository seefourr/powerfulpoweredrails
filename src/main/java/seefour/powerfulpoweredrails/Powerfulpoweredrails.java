package seefour.powerfulpoweredrails;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Powerfulpoweredrails implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("powerfulpoweredrails");

    public static double ACCELERATION = 0.24; // our desired value for minecart acceleration in meters per tick per tick. If you want to change the acceleration this is the value you want.

    @Override
    public void onInitialize() {
        LOGGER.info("Powerful Powered Rails mod loaded!");
    }
}
