package com.design.patterns.creational.factory.ex2.buttons;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Test Html Button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Html World!'");
    }
}
