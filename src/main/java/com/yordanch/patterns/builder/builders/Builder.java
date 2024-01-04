package com.yordanch.patterns.builder.builders;

import com.yordanch.patterns.builder.cars.CarType;
import com.yordanch.patterns.builder.components.Engine;
import com.yordanch.patterns.builder.components.GPSNavigator;
import com.yordanch.patterns.builder.components.Transmission;
import com.yordanch.patterns.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

