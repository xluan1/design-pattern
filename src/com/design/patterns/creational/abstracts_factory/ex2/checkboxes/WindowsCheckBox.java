package com.design.patterns.creational.abstracts_factory.ex2.checkboxes;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("This is check box of windows");
    }
}
