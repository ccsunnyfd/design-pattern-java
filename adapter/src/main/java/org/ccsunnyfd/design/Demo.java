package org.ccsunnyfd.design;

import org.ccsunnyfd.design.adapters.SquarePegAdapter;
import org.ccsunnyfd.design.round.RoundHole;
import org.ccsunnyfd.design.round.RoundPeg;
import org.ccsunnyfd.design.square.SquarePeg;

/**
 * Process
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        RoundHole rHole = new RoundHole(1d);
        System.out.println(rHole.fits(new RoundPeg(0.5d)));
        SquarePeg sPeg = new SquarePeg(1.5d);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(sPeg);
        System.out.println(rHole.fits(squarePegAdapter));
    }
}
