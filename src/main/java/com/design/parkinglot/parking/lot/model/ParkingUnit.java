package com.design.parkinglot.parking.lot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingUnit
{
    public int parkingUnitId;
    public ParkingUnitType parkingUnitType;
    public boolean isAvaiable;


}
