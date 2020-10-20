package org.ccsunnyfd.design.factory;

import org.ccsunnyfd.design.button.Button;
import org.ccsunnyfd.design.button.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons
 *
 * @version 1.0
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
