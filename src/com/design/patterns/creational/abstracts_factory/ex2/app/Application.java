package com.design.patterns.creational.abstracts_factory.ex2.app;

import com.design.patterns.creational.abstracts_factory.ex2.buttons.Button;
import com.design.patterns.creational.abstracts_factory.ex2.checkboxes.CheckBox;
import com.design.patterns.creational.abstracts_factory.ex2.factories.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
