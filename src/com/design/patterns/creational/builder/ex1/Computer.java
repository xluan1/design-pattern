package com.design.patterns.creational.builder.ex1;

public class Computer {
    //required parameters
    private String hdd;
    private String ram;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder computerBuilder) {
        this.hdd = computerBuilder.hdd;
        this.ram = computerBuilder.ram;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    //Builder Class
    public static class ComputerBuilder {
        //required parameters
        private String hdd;
        private String ram;

        //optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
