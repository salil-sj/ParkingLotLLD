package com.design.parkinglot.parking.lot.vehicle;

import lombok.Getter;


@Getter
public abstract class Vehicle {

    private String regNumber;
    private VehicleType vehicleType;

    public Vehicle(String regNumber, VehicleType vehicleType) {
        this.regNumber = regNumber;
        this.vehicleType = vehicleType;
    }
}
