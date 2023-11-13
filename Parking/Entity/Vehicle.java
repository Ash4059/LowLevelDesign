package Parking.Entity;

import Parking.Model.VehicleCategory;

public class Vehicle {
    
    String registerNum;
    VehicleCategory vehicleCategory;

    public Vehicle(String registerNum, VehicleCategory vehicleCategory){
        this.registerNum = registerNum;
        this.vehicleCategory = vehicleCategory;
    }

    public VehicleCategory getVehicleCategory(){
        return this.vehicleCategory;
    }

}
