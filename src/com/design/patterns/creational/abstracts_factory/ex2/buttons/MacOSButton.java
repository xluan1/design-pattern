package com.design.patterns.creational.abstracts_factory.ex2.buttons;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is button of macOS");
    }
}
