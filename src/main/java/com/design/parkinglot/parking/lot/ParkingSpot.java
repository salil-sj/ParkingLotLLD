package com.design.parkinglot.parking.lot;

import com.design.parkinglot.parking.lot.vehicle.Vehicle;
import lombok.Getter;

@Getter
public abstract class ParkingSpot {
    private String spotId;
    private ParkingSpotType parkingSpaceType;
    private Vehicle vehicle;
    boolean isEmpty;

    public ParkingSpot(String spotId, ParkingSpotType parkingSpaceType, Vehicle vehicle, boolean isEmpty) {
        this.spotId = spotId;
        this.parkingSpaceType = parkingSpaceType;
        this.vehicle = vehicle;
        this.isEmpty = isEmpty;
    }

    public ParkingSpot(String spaceId, ParkingSpotType type){
        this.spotId= spaceId;
        this.parkingSpaceType= type;
        this.isEmpty= true;

    }

    public void parkVehicle(Vehicle v)
    {
        this.vehicle= v;
        this.isEmpty= false;
    }

    public void removeVehicleFromParking()
    {
        this.vehicle = null;
        this.isEmpty= true;
    }

}
