package com.design.patterns.creational.factory.ex2.factory;

import com.design.patterns.creational.factory.ex2.buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
