package com.design.patterns.creational.abstracts_factory.ex1.impl;

import com.design.patterns.creational.abstracts_factory.ex1.Computer;
import com.design.patterns.creational.abstracts_factory.ex1.ComputerAbstractFactory;
import com.design.patterns.creational.abstracts_factory.ex1.Server;

public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
