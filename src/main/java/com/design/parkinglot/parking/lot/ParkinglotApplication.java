package com.design.parkinglot.parking.lot;

import com.design.parkinglot.parking.lot.admin.Admin;
import com.design.parkinglot.parking.lot.strategies.HourlyPaymentStrategy;
import com.design.parkinglot.parking.lot.strategies.NaturalOrderParkingStrategy;
import com.design.parkinglot.parking.lot.vehicle.CarVehicle;
import com.design.parkinglot.parking.lot.vehicle.Vehicle;
import com.design.parkinglot.parking.lot.vehicle.VehicleType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkinglotApplication {

	public static void main(String[] args) throws  Exception {
		SpringApplication.run(ParkinglotApplication.class, args);

		System.out.println("Welcome to parking LOT...");

		ParkingLot parkingLot = ParkingLot.INSTANCE;
		Address address = new Address();
		address.setAddressLine1("line 1");
		address.setAddressLine2("Line 2");
		address.setCity("vity");

		parkingLot.setAddress(address);

		//ADMIN:
		Admin admin = new Admin();
		// Admin adding parking floor
		Floor floor1 = new Floor(1);
		Floor floor2 = new Floor(2);
		admin.addFloors(floor1);
		admin.addFloors(floor2);

		//Admin should be able to add entrance gate:
		EntryGate entryGate= new EntryGate("101");
		admin.addEntryGate(entryGate);

		//Admin adding exit gates:
		ExitGate exitGate = new ExitGate("201");
		admin.addExitGate(exitGate);

		//Admin can add parking strategy
		admin.setParkingStrategy(new NaturalOrderParkingStrategy());


		//Admin can add parking sports:
		ParkingSpot spot1 = new CarParkingSpot("1");
//		ParkingSpot spot2 = new CarParkingSpot("2");
//		ParkingSpot spot3 = new CarParkingSpot("3");
		admin.addParkingSpot(floor1, spot1);
//		admin.addParkingSpot(floor1, spot2);
//		admin.addParkingSpot(floor2, spot3);


		//Parking test cases:
		//checking avaiablity of car space:
		System.out.println("Is parking avaliable for car" +ParkingLot.INSTANCE.isParkingSpaceAvaliable(VehicleType.CAR));
		System.out.println("Is parking avaliable for bike" +ParkingLot.INSTANCE.isParkingSpaceAvaliable(VehicleType.BIKE));

		//vehicle
		Vehicle vehicle = new CarVehicle("UK04AB6767" , VehicleType.CAR);
		Ticket ticket = entryGate.generateTicket(vehicle);
		System.out.println("Ticket generated is "+ticket);

		System.out.println("Is parking avaliable for car-02" +ParkingLot.INSTANCE.isParkingSpaceAvaliable(VehicleType.CAR));

		Thread.sleep(1000);

		//Make payment for vehicle
		Payment payment = exitGate.makePayment(PaymentType.CARD , ticket, new HourlyPaymentStrategy());
		System.out.println(payment);











	}

}
