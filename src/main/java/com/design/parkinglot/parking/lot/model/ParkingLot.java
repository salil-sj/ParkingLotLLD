package com.design.parkinglot.parking.lot.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot {

    public List<ParkingLevel> parkingLevels;
    public List<EntryPoints> entryPoints;
    public List<ExitPoints> exitPoints;
}
