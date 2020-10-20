package org.ccsunnyfd.design.factory;

import org.ccsunnyfd.design.button.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 * @version 1.0
 */
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }


    public abstract Button createButton();
}
