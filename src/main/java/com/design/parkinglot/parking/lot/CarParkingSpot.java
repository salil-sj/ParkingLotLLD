package com.design.parkinglot.parking.lot;

import com.design.parkinglot.parking.lot.vehicle.Vehicle;

public class CarParkingSpot extends ParkingSpot{
    public CarParkingSpot(String spotId) {
        super(spotId, ParkingSpotType.CAR_PARKING);
    }
}
