package com.design.patterns.creational.factory.ex2.factory;

import com.design.patterns.creational.factory.ex2.buttons.Button;
import com.design.patterns.creational.factory.ex2.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
