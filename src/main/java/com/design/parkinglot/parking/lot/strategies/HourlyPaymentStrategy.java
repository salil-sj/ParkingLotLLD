package com.design.parkinglot.parking.lot.strategies;

import com.design.parkinglot.parking.lot.Ticket;
import com.design.parkinglot.parking.lot.config.ParkingRateConfig;
import com.design.parkinglot.parking.lot.vehicle.VehicleType;
import lombok.Data;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@Data
public class HourlyPaymentStrategy implements PaymentStrategy{

    //private ParkingRateConfig parkingRateConfig;



    @Override
    public double calculateCost(Ticket ticket) {
        double rate = ParkingRateConfig.getRatesOfVehicle(ticket.getVehicle().getVehicleType());
        Duration duration = Duration.between(ticket.getEntryTime() , ticket.getExitTime());
        double hours = duration.toMillis();
        return hours*rate;
    }
}
