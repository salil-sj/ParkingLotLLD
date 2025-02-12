package com.design.parkinglot.parking.lot;

import com.design.parkinglot.parking.lot.strategies.PaymentStrategy;

import java.time.LocalDateTime;

public class ExitGate {
    private String gateId;

    public ExitGate(String gateId) {
        this.gateId = gateId;
    }

    public Payment makePayment(PaymentType paymentType , Ticket ticket , PaymentStrategy paymentStrategy)
    {
        ticket.setExitTime(LocalDateTime.now());
        double cost = paymentStrategy.calculateCost(ticket);
        ticket.setCharges(cost);

        Payment payment= new Payment(cost , ticket , paymentStrategy);
        payment.makePayment(paymentType);
        ticket.setActive(false);

        freeParkingSpot(ticket.getParkingSpot());
        return payment;
    }

    private void freeParkingSpot(ParkingSpot parkingSpot)
    {
        parkingSpot.removeVehicleFromParking();
    }
}
