package org.ccsunnyfd.design.button;

/**
 * Windows Button implementation
 *
 * @version 1.0
 */
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Windows Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click windows button!");
    }
}
