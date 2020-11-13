package org.ccsunnyfd.design.observer;

import org.ccsunnyfd.design.Message;

/**
 * ConcreteObserverOne
 *
 * @version 1.0
 */
public class ConcreteObserverOne implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserverOne is notified. " + message.getText());
    }
}
