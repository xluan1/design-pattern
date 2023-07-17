package com.design.patterns.creational.abstracts_factory.ex2.factories;

import com.design.patterns.creational.abstracts_factory.ex2.buttons.Button;
import com.design.patterns.creational.abstracts_factory.ex2.buttons.MacOSButton;
import com.design.patterns.creational.abstracts_factory.ex2.checkboxes.CheckBox;
import com.design.patterns.creational.abstracts_factory.ex2.checkboxes.MacOSCheckBox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
