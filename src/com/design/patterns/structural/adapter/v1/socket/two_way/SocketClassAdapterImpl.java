package com.design.patterns.structural.adapter.v1.socket.two_way;

import com.design.patterns.structural.adapter.v1.Volt;
import com.design.patterns.structural.adapter.v1.socket.Socket;
import com.design.patterns.structural.adapter.v1.socket.SocketAdapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v, 10);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v, 40);
    }
}
