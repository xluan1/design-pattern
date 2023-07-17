package com.design.patterns.structural.composite.leaf;

import com.design.patterns.structural.composite.base.Shape;

public class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color: " + fillColor);
    }
}
