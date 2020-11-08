package org.ccsunnyfd.design;

/**
 * Handler
 *
 * @version 1.0
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    protected abstract boolean doHandle();

    // template
    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }
}
