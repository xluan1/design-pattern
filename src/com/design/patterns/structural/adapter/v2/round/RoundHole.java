package com.design.patterns.structural.adapter.v2.round;

/**
 * RoundHoles are compatible with RoundPegs.
 *
 * @author Xuan Luan
 * @createdAt 7/10/2023
 */
public class RoundHole {
    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return this.radius >= roundPeg.getRadius();
    }
}
