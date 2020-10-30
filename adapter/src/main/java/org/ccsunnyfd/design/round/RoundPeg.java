package org.ccsunnyfd.design.round;

import lombok.AllArgsConstructor;

/**
 * RoundPeg
 *
 * @version 1.0
 */
@AllArgsConstructor
public class RoundPeg implements IRoundPeg {
    private double radius;

    @Override
    public double getRadius() {
        return radius;
    }
}
