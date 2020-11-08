package org.ccsunnyfd.design;

/**
 * HandlerB
 *
 * @version 1.0
 */
public class HandlerB extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = false;
        System.out.println("HandlerB is checking...");
        handled = true;
        return handled;
    }
}
