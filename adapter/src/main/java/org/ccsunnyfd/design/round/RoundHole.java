package org.ccsunnyfd.design.round;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.ccsunnyfd.design.round.IRoundPeg;

/**
 * RoundHole
 *
 * @version 1.0
 */
@AllArgsConstructor
@Getter
public class RoundHole {
    private double radius;

    public boolean fits(IRoundPeg peg) {
        return radius >= peg.getRadius();
    }
}
