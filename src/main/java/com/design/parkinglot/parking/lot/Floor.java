package com.design.parkinglot.parking.lot;

import com.design.parkinglot.parking.lot.vehicle.Vehicle;
import com.design.parkinglot.parking.lot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floor {
    private int floorNumber;
    Map<ParkingSpotType , List<ParkingSpot>> parkingSpotTypeListMap = new HashMap<>();

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSpotTypeListMap.put(ParkingSpotType.CAR_PARKING , new ArrayList<>());
        this.parkingSpotTypeListMap.put(ParkingSpotType.BIKE_PARKING , new ArrayList<>());
        this.parkingSpotTypeListMap.put(ParkingSpotType.TRUCK_PARKING, new ArrayList<>());
    }


    public void addParkingSpot(ParkingSpot parkingSpot)
    {
        parkingSpotTypeListMap.get(parkingSpot.getParkingSpaceType()).add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot)
    {
        parkingSpotTypeListMap.get(parkingSpot.getParkingSpaceType()).remove(parkingSpot);
    }

    public boolean canVehicleBeParked(VehicleType vehicleType)
    {
        for(ParkingSpot parkingSpot : parkingSpotTypeListMap.get(getSpaceTypeForVehicle(vehicleType)))
        {
            if(parkingSpot.isEmpty)
            {
                return true;
            }
        }
        return false;
    }

    private ParkingSpotType getSpaceTypeForVehicle(VehicleType vType) {
        switch (vType) {
            case CAR:
                return ParkingSpotType.CAR_PARKING;
            case BIKE:
            return ParkingSpotType.BIKE_PARKING;
            case TRUCK:
                return ParkingSpotType.TRUCK_PARKING;

        }
        return null;
    }

    public ParkingSpotType getSpotForVehicle(VehicleType vehicleType)
    {
        switch (vehicleType)
        {
            case CAR:
                return ParkingSpotType.CAR_PARKING;

            case BIKE:
                return ParkingSpotType.BIKE_PARKING;

            case TRUCK:
                return ParkingSpotType.TRUCK_PARKING;
        }
        return null; //throw some exception:
    }

    public ParkingSpot getParkingSpot(Vehicle vehicle)
    {
        List<ParkingSpot> avaliableSpots = new ArrayList<>();
        for(ParkingSpot p : parkingSpotTypeListMap.get(getSpotForVehicle(vehicle.getVehicleType())))
        {
            if(p.isEmpty())
            {
                avaliableSpots.add(p);
            }
        }
        return ParkingLot.INSTANCE.getParkingStrategy().getParkingSpace(avaliableSpots);
    }
}
