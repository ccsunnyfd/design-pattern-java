package org.ccsunnyfd.design.factory;

import org.ccsunnyfd.design.button.Button;
import org.ccsunnyfd.design.button.HtmlButton;

/**
 * Html Dialog will produce Html buttons
 *
 * @version 1.0
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
