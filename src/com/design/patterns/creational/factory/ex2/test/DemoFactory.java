package com.design.patterns.creational.factory.ex2.test;

import com.design.patterns.creational.factory.ex2.factory.Dialog;
import com.design.patterns.creational.factory.ex2.factory.HtmlDialog;
import com.design.patterns.creational.factory.ex2.factory.WindowsDialog;

public class DemoFactory {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
