package com.design.parkinglot.parking.lot.strategies;

import com.design.parkinglot.parking.lot.ParkingSpot;

import java.util.List;

public interface   ParkingStrategy {
    public ParkingSpot getParkingSpace(List<ParkingSpot> avaliableSpots);
}
