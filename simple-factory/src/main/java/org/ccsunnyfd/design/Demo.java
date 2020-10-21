package org.ccsunnyfd.design;

import org.ccsunnyfd.design.button.IButton;
import org.ccsunnyfd.design.factory.ButtonFactory;

/**
 * Demo class. Everything comes together here.
 *
 * @version 1.0
 */
public class Demo {
    private static IButton button;

    public static void main(String[] args) {
        configure();
        runBussinessLogic();
    }

    static void configure() {
        button = ButtonFactory.createButton(System.getProperty("os.name"));
    }

    private static void runBussinessLogic() {
        button.render();
    }

}
