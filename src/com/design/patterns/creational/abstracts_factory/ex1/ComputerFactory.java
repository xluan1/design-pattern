package com.design.patterns.creational.abstracts_factory.ex1;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
