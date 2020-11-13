package org.ccsunnyfd.design;

import org.ccsunnyfd.design.observer.ConcreteObserverOne;
import org.ccsunnyfd.design.observer.ConcreteObserverTwo;
import org.ccsunnyfd.design.subject.ConcreteSubject;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyAll(new Message("A dog lingered!"));
    }
}
