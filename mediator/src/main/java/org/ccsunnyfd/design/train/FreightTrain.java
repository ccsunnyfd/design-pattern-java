package org.ccsunnyfd.design.train;

import org.ccsunnyfd.design.mediator.IMediator;

/**
 * FreightTrain
 *
 * @version 1.0
 */
public class FreightTrain implements ITrain {
    private IMediator mediator;

    public FreightTrain(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void arrive() {
        if(mediator.canArrive(this)) {
            System.out.println("FreightTrain: Arrival blocked, waiting");
            return;
        }
        System.out.println("FreightTrain: Arrived");
    }

    @Override
    public void depart() {
        System.out.println("FreightTrain: Leaving");
        mediator.notifyAboutDeparture();
    }

    @Override
    public void permitArrival() {
        System.out.println("FreightTrain: Arrival permitted, arriving");
        arrive();
    }
}
