package com.design.parkinglot.parking.lot.strategies;

import com.design.parkinglot.parking.lot.ParkingSpot;

import java.util.List;

public class NaturalOrderParkingStrategy implements ParkingStrategy{

    @Override
    public ParkingSpot getParkingSpace(List<ParkingSpot> avaliableSpots) {
        return avaliableSpots.get(0);

    }


}
