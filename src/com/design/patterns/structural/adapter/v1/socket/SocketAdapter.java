package com.design.patterns.structural.adapter.v1.socket;

import com.design.patterns.structural.adapter.v1.Volt;

public interface SocketAdapter {
    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();
}
