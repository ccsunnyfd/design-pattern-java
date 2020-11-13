package org.ccsunnyfd.design.observer;

import org.ccsunnyfd.design.Message;

/**
 * Process
 *
 * @version 1.0
 */
public interface Observer {
    void update(Message message);
}
