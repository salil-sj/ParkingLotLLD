package com.design.parkinglot.parking.lot;

import com.design.parkinglot.parking.lot.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
public class Ticket {

    private  String ticketId;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private boolean isActive;
    private double charges;

    public Ticket(String ticketId, LocalDateTime entryTime, LocalDateTime exitTime, Vehicle vehicle, ParkingSpot parkingSpot, boolean isActive, double charges) {
        this.ticketId = ticketId;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.isActive = isActive;
        this.charges = charges;
    }

    public Ticket( LocalDateTime entryTime, Vehicle vehicle, ParkingSpot parkingSpot, boolean isActive) {
        this.ticketId = UUID.randomUUID().toString();
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.isActive = isActive;
    }


}
