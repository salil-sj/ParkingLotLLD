package com.design.parkinglot.parking.lot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExitPoint
{
    public int exitPointId;
    public String exitPointName;

    public void issueParkingExitTicket(int amount)
    {

    }
}
