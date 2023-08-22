package com.mycompany.vehicletest;

public class Vehicle {
    private String VehicleType;
    private String ChassisNo;
    private int ProductionYear;

    public Vehicle() {
        System.out.println("Vehicle Information");
    }

    public Vehicle(String VehicleType, String ChassisNo) {
        setVehicleType(VehicleType);
        setChassisNo(ChassisNo);
    }

    public Vehicle(String VehicleType, String ChassisNo, int ProductionYear) {
        setVehicleType(VehicleType);
        setChassisNo(ChassisNo);
        setProductionYear(ProductionYear);
    }

    public String getVehicleType() {
        return (this.VehicleType);
    }

    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    public String getChassisNo() {
        return (this.ChassisNo);
    }
    
    public void setChassisNo(String ChassisNo) {
        this.ChassisNo = ChassisNo;
    }
    
    public int getProductionYear() {
        return (this.ProductionYear);
    }
    
    public void setProductionYear(int ProductionYear) {
        this.ProductionYear = ProductionYear;
    }
    
}