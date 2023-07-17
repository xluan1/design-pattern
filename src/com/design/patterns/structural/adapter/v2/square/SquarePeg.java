package com.design.patterns.structural.adapter.v2.square;

/**
 * @author Xuan Luan
 * @createdAt 7/10/2023
 */
public class SquarePeg {
    private final double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
