package org.ccsunnyfd.design.subject;

import org.ccsunnyfd.design.Message;
import org.ccsunnyfd.design.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject
 *
 * @version 1.0
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAll(Message message) {
        for(Observer o: observers) {
            o.update(message);
        }
    }
}
