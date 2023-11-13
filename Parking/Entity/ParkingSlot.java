package Parking.Entity;

import Parking.Model.ParkingSlotType;

public class ParkingSlot {
    
    String id;
    boolean isAvailable = true;
    Vehicle vehicle;
    ParkingSlotType parkingSlotType;

    public ParkingSlot(String id, ParkingSlotType parkingSlotType){
        this.id = id;
        this.parkingSlotType = parkingSlotType;
    }

    void addVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        isAvailable = false;
    }

    void removeVehilce(Vehicle vehicle){
        this.vehicle = null;
        isAvailable = true;
    }

    ParkingSlotType getParkingSlotType(){
        return this.parkingSlotType;
    }

}
