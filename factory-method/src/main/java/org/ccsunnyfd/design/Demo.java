package org.ccsunnyfd.design;

import org.ccsunnyfd.design.factory.Dialog;
import org.ccsunnyfd.design.factory.HtmlDialog;
import org.ccsunnyfd.design.factory.WindowsDialog;

/**
 * Demo class. Everything comes together here.
 *
 * @version 1.0
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBussinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBussinessLogic() {
        dialog.renderWindow();
    }

}
