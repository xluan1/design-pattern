package com.design.patterns.structural.composite.leaf;

import com.design.patterns.structural.composite.base.Shape;

public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color: " + fillColor);
    }
}
