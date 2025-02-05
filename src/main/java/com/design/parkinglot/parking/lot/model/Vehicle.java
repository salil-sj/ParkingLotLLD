package com.design.parkinglot.parking.lot.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Vehicle
{
    public int vehicleParkingId;
    public String vehicleNumberPlate;
    public Date vehicleEntryTime;
    public Date vehicleExitTime;
    public ParkingUnitVehicleType vehicleType;
    public VehiclePayment vehiclePayment;
    public EntryPoint entryPoint;
    public ExitPoint exitPoint;
    public ParkingUnit vehicleParkingUnit;

    public void parkCar(ParkingUnit vehicleParkingUnit)
    {
        this.vehicleParkingUnit = vehicleParkingUnit;
    }


    public void entryToParking(EntryPoint entryPoint)
    {

    }

    public void exitParking(ExitPoint exitPoint)
    {

    }

    public void makePayment(int amount)
    {

    }


}
