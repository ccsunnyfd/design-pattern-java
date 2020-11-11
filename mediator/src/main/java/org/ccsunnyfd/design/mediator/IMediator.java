package org.ccsunnyfd.design.mediator;

import org.ccsunnyfd.design.train.ITrain;

/**
 * IMediator
 *
 * @version 1.0
 */
public interface IMediator {
    boolean canArrive(ITrain train);
    void notifyAboutDeparture();
}
