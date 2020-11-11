package org.ccsunnyfd.design.train;

import org.ccsunnyfd.design.mediator.IMediator;

/**
 * PassengerTrain
 *
 * @version 1.0
 */
public class PassengerTrain implements ITrain {
    private IMediator mediator;

    public PassengerTrain(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void arrive() {
        if(mediator.canArrive(this)) {
            System.out.println("PassengerTrain: Arrival blocked, waiting");
            return;
        }
        System.out.println("PassengerTrain: Arrived");
    }

    @Override
    public void depart() {
        System.out.println("PassengerTrain: Leaving");
        mediator.notifyAboutDeparture();
    }

    @Override
    public void permitArrival() {
        System.out.println("PassengerTrain: Arrival permitted, arriving");
        arrive();
    }
}
