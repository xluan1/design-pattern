package com.design.patterns.structural.adapter.v2;

import com.design.patterns.structural.adapter.v2.adapters.SquarePegAdapter;
import com.design.patterns.structural.adapter.v2.round.RoundHole;
import com.design.patterns.structural.adapter.v2.round.RoundPeg;
import com.design.patterns.structural.adapter.v2.square.SquarePeg;

/**
 * @author Xuan Luan
 * @createdAt 7/10/2023
 */
public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(10);
        check(hole, roundPeg);

        SquarePegAdapter adapter1 = new SquarePegAdapter(new SquarePeg(20));
        check(hole, adapter1);

        SquarePegAdapter adapter2 = new SquarePegAdapter(new SquarePeg(2));
        check(hole, adapter2);
    }

    private static void check(RoundHole hole, RoundPeg peg) {
        if (hole.fits(peg)) {
            System.out.printf("Peg %f fits round hole %f.\n", peg.getRadius(), hole.getRadius());
        } else {
            System.out.printf("Peg %f not fits round hole %f.\n", peg.getRadius(), hole.getRadius());
        }
    }
}
