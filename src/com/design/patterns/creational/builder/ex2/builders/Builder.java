package com.design.patterns.creational.builder.ex2.builders;

import com.design.patterns.creational.builder.ex2.cars.CarType;
import com.design.patterns.creational.builder.ex2.components.Engine;
import com.design.patterns.creational.builder.ex2.components.GPSNavigator;
import com.design.patterns.creational.builder.ex2.components.Transmission;
import com.design.patterns.creational.builder.ex2.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
