package org.ccsunnyfd.design.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory for factory.
 * @version 1.0
 */
public class ButtonFactoryMap {

    private static final Map<String, ButtonFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("windows 10", new WinButtonFactory());
        cachedFactories.put("default", new HtmlButtonFactory());
    }

    public static ButtonFactory getButtonFactory(String osName) {
        if (osName == null || osName.isEmpty()) {
            osName = "default";
        }
        return cachedFactories.get(osName.toLowerCase());
    }


}
