package com.design.patterns.creational.abstracts_factory.ex2.factories;

import com.design.patterns.creational.abstracts_factory.ex2.buttons.Button;
import com.design.patterns.creational.abstracts_factory.ex2.buttons.WindowsButton;
import com.design.patterns.creational.abstracts_factory.ex2.checkboxes.CheckBox;
import com.design.patterns.creational.abstracts_factory.ex2.checkboxes.WindowsCheckBox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
