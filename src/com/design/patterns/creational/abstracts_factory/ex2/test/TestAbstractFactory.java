package com.design.patterns.creational.abstracts_factory.ex2.test;

import com.design.patterns.creational.abstracts_factory.ex2.app.Application;
import com.design.patterns.creational.abstracts_factory.ex2.factories.GUIFactory;
import com.design.patterns.creational.abstracts_factory.ex2.factories.MacOSFactory;
import com.design.patterns.creational.abstracts_factory.ex2.factories.WindowsFactory;

public class TestAbstractFactory {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application application;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println(osName);
        if (osName.contains("mac")) {
            guiFactory = new MacOSFactory();
        } else {
            guiFactory = new WindowsFactory();
        }
        application = new Application(guiFactory);
        return application;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
