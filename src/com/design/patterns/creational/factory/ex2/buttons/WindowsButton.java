package com.design.patterns.creational.factory.ex2.buttons;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Test Windows Button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Windows World!'");
    }
}
