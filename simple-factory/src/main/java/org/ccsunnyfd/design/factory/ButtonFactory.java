package org.ccsunnyfd.design.factory;


import org.ccsunnyfd.design.button.HtmlButton;
import org.ccsunnyfd.design.button.IButton;
import org.ccsunnyfd.design.button.WindowsButton;

import java.util.HashMap;
import java.util.Map;

/**
 * Simple factory class.
 * @version 1.0
 */
public class ButtonFactory {

    private static final Map<String, IButton> cachedButtons = new HashMap<>();

    static {
        cachedButtons.put("windows 10", new WindowsButton());
        cachedButtons.put("default", new HtmlButton());
    }

    public static IButton createButton(String osName) {
        if (osName == null || osName.isEmpty()) {
            osName = "default";
        }
        return cachedButtons.get(osName.toLowerCase());
    }
}
