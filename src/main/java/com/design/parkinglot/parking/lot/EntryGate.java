package com.design.parkinglot.parking.lot;

import com.design.parkinglot.parking.lot.vehicle.Vehicle;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class EntryGate {

    private String gateId;

    public EntryGate(String gateId) {
        this.gateId = gateId;
    }

    public Ticket generateTicket(Vehicle vehicle)
    {
        if(!ParkingLot.INSTANCE.isParkingSpaceAvaliable(vehicle.getVehicleType()))
        {
            return null; // throw exception
        }
        else {
            ParkingSpot parkingSpot = ParkingLot.INSTANCE.findParkingSpot(vehicle);
            parkingSpot.parkVehicle(vehicle);
            return new Ticket(LocalDateTime.now() , vehicle , parkingSpot, true);
        }
    }
}
