package com.design.patterns.structural.composite.test;

import com.design.patterns.structural.composite.Drawing;
import com.design.patterns.structural.composite.base.Shape;
import com.design.patterns.structural.composite.leaf.Circle;
import com.design.patterns.structural.composite.leaf.Triangle;

public class testComposite {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(circle);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(circle);
        drawing.draw("Green");
    }
}
