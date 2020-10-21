package org.ccsunnyfd.design.factory;

import org.ccsunnyfd.design.button.IButton;
import org.ccsunnyfd.design.button.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons
 *
 * @version 1.0
 */
public class WinButtonFactory extends ButtonFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
}
