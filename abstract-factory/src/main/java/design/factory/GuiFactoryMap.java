package design.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory for factory.
 * @version 1.0
 */
public class GuiFactoryMap {

    private static final Map<String, IGuiFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("windows 10", new WinFactory());
        cachedFactories.put("default", new HtmlFactory());
    }

    public static IGuiFactory getFactory(String osName) {
        if (osName == null || osName.isEmpty()) {
            osName = "default";
        }
        return cachedFactories.get(osName.toLowerCase());
    }

}
