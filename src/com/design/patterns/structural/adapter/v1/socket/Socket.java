package com.design.patterns.structural.adapter.v1.socket;

import com.design.patterns.structural.adapter.v1.Volt;

public class Socket {
    public Volt getVolt() {
        return new Volt(20);
    }
}
