package org.ccsunnyfd.design.subject;

import org.ccsunnyfd.design.Message;
import org.ccsunnyfd.design.observer.Observer;

/**
 * Subject
 *
 * @version 1.0
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAll(Message message);
}
