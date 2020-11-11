package org.ccsunnyfd.design;

import org.ccsunnyfd.design.mediator.StationManager;
import org.ccsunnyfd.design.train.FreightTrain;
import org.ccsunnyfd.design.train.PassengerTrain;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        StationManager sm = new StationManager();

        PassengerTrain pt = new PassengerTrain(sm);
        FreightTrain ft = new FreightTrain(sm);

        pt.arrive();
        ft.arrive();
        pt.depart();
    }
}
