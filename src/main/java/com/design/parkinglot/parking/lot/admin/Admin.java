package com.design.parkinglot.parking.lot.admin;

import com.design.parkinglot.parking.lot.*;
import com.design.parkinglot.parking.lot.strategies.ParkingStrategy;

import java.util.UUID;

public class Admin {

    private String id;
    private LoginInfo loginInfo;
    private ContactInfo contactInfo;

    public Admin() {
        this.id = UUID.randomUUID().toString();
    }

    public void setParkingStrategy(ParkingStrategy parkingStrategy)
    {
        ParkingLot.INSTANCE.setParkingStrategy(parkingStrategy);
    }

    public void addFloors(Floor floor)
    {
        ParkingLot.INSTANCE.getFloors().add(floor);
    }

    public void  addParkingSpot(Floor floor , ParkingSpot parkingSpot)
    {
        floor.addParkingSpot(parkingSpot);
    }

    public void addEntryGate(EntryGate entryGate)
    {
        ParkingLot.INSTANCE.getEntryGates().add(entryGate);
    }

    public void  addExitGate(ExitGate exitGate)
    {
        ParkingLot.INSTANCE.getExitGates().add(exitGate);
    }
}
