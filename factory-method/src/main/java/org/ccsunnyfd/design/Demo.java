package org.ccsunnyfd.design;

import org.ccsunnyfd.design.factory.ButtonFactory;
import org.ccsunnyfd.design.factory.ButtonFactoryMap;

/**
 * Demo class. Everything comes together here.
 *
 * @version 1.0
 */
public class Demo {
    private static ButtonFactory dialog;

    public static void main(String[] args) {
        configure();
        runBussinessLogic();
    }

    static void configure() {
        dialog = ButtonFactoryMap.getButtonFactory(System.getProperty("os.name"));
    }

    private static void runBussinessLogic() {
        dialog.renderWindow();
    }

}
