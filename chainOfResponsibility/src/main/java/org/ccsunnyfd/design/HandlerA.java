package org.ccsunnyfd.design;

/**
 * HandlerA
 *
 * @version 1.0
 */
public class HandlerA extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = false;
        System.out.println("HandlerA is checking...");
        return handled;
    }
}
