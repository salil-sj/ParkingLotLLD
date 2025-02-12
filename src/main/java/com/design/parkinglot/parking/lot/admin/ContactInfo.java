package com.design.parkinglot.parking.lot.admin;

import com.design.parkinglot.parking.lot.Address;
import lombok.Data;

@Data
public class ContactInfo {
    private String phone;
    private String email;
    private Address address;
}
