package com.design.patterns.creational.abstracts_factory.ex2.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is button of windows");
    }
}
