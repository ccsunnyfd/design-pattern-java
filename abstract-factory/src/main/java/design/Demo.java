package design;

import design.factory.GuiFactoryMap;
import design.factory.IGuiFactory;
import design.model.button.IButton;
import design.model.checkbox.ICheckbox;

/**
 * Demo class. Everything comes together here.
 *
 * @version 1.0
 */
public class Demo {
    private static IButton button;
    private static ICheckbox checkbox;

    public static void main(String[] args) {
        configure();
        render();
    }

    static void configure() {
        IGuiFactory factory = GuiFactoryMap.getFactory(System.getProperty("os.name"));
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    private static void render() {
        button.render();
        checkbox.render();
    }

}
