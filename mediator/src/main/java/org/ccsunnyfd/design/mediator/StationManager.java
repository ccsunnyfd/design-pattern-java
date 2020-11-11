package org.ccsunnyfd.design.mediator;

import org.ccsunnyfd.design.train.ITrain;

import java.util.LinkedList;
import java.util.Queue;

/**
 * StationManager
 *
 * @version 1.0
 */
public class StationManager implements IMediator {
    private boolean isPlatformFree;
    private Queue<ITrain> trainQueue;

    public StationManager() {
        isPlatformFree = true;
        trainQueue = new LinkedList<>();
    }

    @Override
    public boolean canArrive(ITrain train) {
        if(isPlatformFree) {
            isPlatformFree = false;
            return true;
        }
        trainQueue.add(train);
        return false;
    }

    @Override
    public void notifyAboutDeparture() {
        if(!isPlatformFree) {
            isPlatformFree = true;
        }
        if(trainQueue.size() > 0) {
            ITrain firstTrain = trainQueue.poll();
            firstTrain.permitArrival();
        }
    }
}
