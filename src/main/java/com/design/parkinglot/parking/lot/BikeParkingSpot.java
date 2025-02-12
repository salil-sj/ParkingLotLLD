package com.design.parkinglot.parking.lot;

import com.design.parkinglot.parking.lot.vehicle.Vehicle;

public class BikeParkingSpot extends  ParkingSpot{
    public BikeParkingSpot(String spotId, ParkingSpotType parkingSpaceType, Vehicle vehicle, boolean isEmpty) {
        super(spotId, parkingSpaceType, vehicle, isEmpty);
    }
}
