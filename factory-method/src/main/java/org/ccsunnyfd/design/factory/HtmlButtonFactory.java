package org.ccsunnyfd.design.factory;

import org.ccsunnyfd.design.button.HtmlButton;
import org.ccsunnyfd.design.button.IButton;

/**
 * Html Dialog will produce Html buttons
 *
 * @version 1.0
 */
public class HtmlButtonFactory extends ButtonFactory {
    @Override
    public IButton createButton() {
        return new HtmlButton();
    }
}
