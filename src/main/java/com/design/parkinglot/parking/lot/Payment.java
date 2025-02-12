package com.design.parkinglot.parking.lot;

import com.design.parkinglot.parking.lot.strategies.PaymentStrategy;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class Payment {
    private int paymentId;
    private LocalDateTime paymentTime;
    private double amount;
    private Ticket ticket;
    private PaymentType paymentType;
    private PaymentStrategy paymentStrategy;

    public Payment(int paymentId, LocalDateTime paymentTime, double amount, Ticket ticket,PaymentStrategy paymentStrategy) {
        this.paymentId = paymentId;
        this.paymentTime = paymentTime;
        this.amount = amount;
        this.ticket = ticket;
        this.paymentStrategy = paymentStrategy;
    }

    public Payment(double amount, Ticket ticket, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.ticket = ticket;
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(PaymentType type)
    {
        this.paymentType = paymentType;
    }
}
