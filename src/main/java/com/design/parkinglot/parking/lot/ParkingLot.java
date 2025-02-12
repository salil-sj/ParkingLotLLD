package com.design.parkinglot.parking.lot;

import com.design.parkinglot.parking.lot.strategies.ParkingStrategy;
import com.design.parkinglot.parking.lot.vehicle.Vehicle;
import com.design.parkinglot.parking.lot.vehicle.VehicleType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Data
public class ParkingLot {
    private String parkingLotId;
    private List<Floor> floors;
    private List<EntryGate> entryGates;
    private List<ExitGate> exitGates;
    private Address address;
    private ParkingStrategy parkingStrategy;

    private ParkingLot() {
    parkingLotId = UUID.randomUUID().toString();
    floors = new ArrayList<>();
    entryGates = new ArrayList<>();
    exitGates = new ArrayList<>();
    }

    public static  ParkingLot INSTANCE = new ParkingLot();

    public boolean isParkingSpaceAvaliable(VehicleType vehicleType)
    {
        for(Floor floor : floors)
        {
            boolean result  = floor.canVehicleBeParked(vehicleType);
            if(result == true)
                return result;
        }
        return false; // Throw exception
    }
    public ParkingSpot findParkingSpot(Vehicle vehicle)
    {
        for(Floor floor : floors)
        {
            return floor.getParkingSpot(vehicle);
        }
        return null; //throw exception for no parking found
    }
}
