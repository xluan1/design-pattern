package com.design.patterns.structural.adapter.v1.socket.two_way;

import com.design.patterns.structural.adapter.v1.Volt;
import com.design.patterns.structural.adapter.v1.socket.Socket;
import com.design.patterns.structural.adapter.v1.socket.SocketAdapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
    //Using composition for adapter pattern
    private final Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
