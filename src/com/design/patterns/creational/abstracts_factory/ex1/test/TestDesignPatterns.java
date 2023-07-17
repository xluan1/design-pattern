package com.design.patterns.creational.abstracts_factory.ex1.test;

import com.design.patterns.creational.abstracts_factory.ex1.Computer;
import com.design.patterns.creational.abstracts_factory.ex1.ComputerFactory;
import com.design.patterns.creational.abstracts_factory.ex1.impl.PCFactory;
import com.design.patterns.creational.abstracts_factory.ex1.impl.ServerFactory;

public class TestDesignPatterns {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "500 GB", "2.9 GHz"));

        System.out.println("AbstractFactory PC Config: " + pc);
        System.out.println("AbstractFactory Server Config: " + server);
    }
}
