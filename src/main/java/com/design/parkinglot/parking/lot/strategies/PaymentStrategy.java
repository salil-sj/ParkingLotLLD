package com.design.parkinglot.parking.lot.strategies;

import com.design.parkinglot.parking.lot.Ticket;

public interface PaymentStrategy {

    public double calculateCost(Ticket ticket);
}
