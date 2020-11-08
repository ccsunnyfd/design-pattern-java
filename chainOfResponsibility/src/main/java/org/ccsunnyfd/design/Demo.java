package org.ccsunnyfd.design;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
