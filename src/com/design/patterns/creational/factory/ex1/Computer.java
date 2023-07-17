package com.design.patterns.creational.factory.ex1;

public abstract class Computer {

    public abstract String getRam();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "Ram= " + getRam() + ", HDD= " + getHDD() + ", CPU= " + getCPU();
    }
}
