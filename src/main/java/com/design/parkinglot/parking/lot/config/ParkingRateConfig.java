package com.design.parkinglot.parking.lot.config;

import com.design.parkinglot.parking.lot.vehicle.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class ParkingRateConfig {

    public static final Map<VehicleType, Double> RATE_PER_HOUR= new HashMap();

    static
    {
        RATE_PER_HOUR.put(VehicleType.BIKE , 0.25);
        RATE_PER_HOUR.put(VehicleType.CAR , 0.75);
        RATE_PER_HOUR.put(VehicleType.TRUCK , 0.90);
    }

    public static Double getRatesOfVehicle(VehicleType vehicleType)
    {
        return RATE_PER_HOUR.get(vehicleType);
    }
}
