package com.design.patterns.structural.adapter.v2.adapters;

import com.design.patterns.structural.adapter.v2.round.RoundPeg;
import com.design.patterns.structural.adapter.v2.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 *
 * @author Xuan Luan
 * @createdAt 7/10/2023
 */
public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        // Calculate a minimum circle radius, which can fit this peg.
        return Math.sqrt(Math.pow(squarePeg.getWidth() / 2, 2) * 2);
    }
}
