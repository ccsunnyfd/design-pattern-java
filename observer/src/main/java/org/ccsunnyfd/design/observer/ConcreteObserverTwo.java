package org.ccsunnyfd.design.observer;

import org.ccsunnyfd.design.Message;

/**
 * ConcreteObserverTwo
 *
 * @version 1.0
 */
public class ConcreteObserverTwo implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserverTwo is notified. " + message.getText());
    }
}
