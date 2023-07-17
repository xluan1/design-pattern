package com.design.patterns.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        System.out.println("read resolve called");
        return getInstance();
    }
}
