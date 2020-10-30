package org.ccsunnyfd.design.adapters;

import org.ccsunnyfd.design.round.IRoundPeg;
import org.ccsunnyfd.design.square.SquarePeg;

/**
 * SquarePegAdapter
 *
 * @version 1.0
 */
public class SquarePegAdapter implements IRoundPeg {
    private SquarePeg sPeg;

    public SquarePegAdapter(SquarePeg sPeg) {
        this.sPeg = sPeg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(2.0D) * sPeg.getWidth() / 2;
    }
}
