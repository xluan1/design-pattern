package com.design.patterns.structural.adapter.v1.socket.test;

import com.design.patterns.structural.adapter.v1.Volt;
import com.design.patterns.structural.adapter.v1.socket.SocketAdapter;
import com.design.patterns.structural.adapter.v1.socket.two_way.SocketClassAdapterImpl;
import com.design.patterns.structural.adapter.v1.socket.two_way.SocketObjectAdapterImpl;

public class testAdapter {
    public static void main(String[] args) {
        testObjectAdapter();
        testClassAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("v3 volts using Object Adapter= " + v3.getVolts());
        System.out.println("v12 volts using Object Adapter= " + v12.getVolts());
        System.out.println("v120 volts using Object Adapter= " + v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("v3 volts using Class Adapter= " + v3.getVolts());
        System.out.println("v12 volts using Class Adapter= " + v12.getVolts());
        System.out.println("v120 volts using Class Adapter= " + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3:
                return socketAdapter.get3Volt();
            case 12:
                return socketAdapter.get12Volt();
            default:
                return socketAdapter.get120Volt();
        }
    }
}
