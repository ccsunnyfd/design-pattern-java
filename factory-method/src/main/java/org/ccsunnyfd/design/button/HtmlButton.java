package org.ccsunnyfd.design.button;

/**
 * Html Button implementation
 *
 * @version 1.0
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Html Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click html button!");
    }
}
