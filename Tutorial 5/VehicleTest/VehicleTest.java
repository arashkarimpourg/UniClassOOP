package com.mycompany.vehicletest;

public class VehicleTest {

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("Car", "123456");

        System.out.println("Vehicle Type is " + myVehicle.getVehicleType() + ".");
        System.out.println("Vehicle Chassic Number is " + myVehicle.getChassisNo() + ".");
        System.out.println("Production Year is " + myVehicle.getProductionYear() + ".");

    }
}
