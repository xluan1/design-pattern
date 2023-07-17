package com.design.patterns.creational.abstracts_factory.ex2.factories;

import com.design.patterns.creational.abstracts_factory.ex2.buttons.Button;
import com.design.patterns.creational.abstracts_factory.ex2.checkboxes.CheckBox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
