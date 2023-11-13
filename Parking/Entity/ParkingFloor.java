package Parking.Entity;

import java.util.List;
import java.util.Map;

import Parking.Model.ParkingSlotType;
import Parking.Model.VehicleCategory;

public class ParkingFloor {

    String name;
    Map<ParkingSlotType, List<ParkingSlot>> parkingSlots;

    public ParkingFloor(String name, Map<ParkingSlotType, List<ParkingSlot>> parkingSlots){
        this.name = name;
        this.parkingSlots = parkingSlots;
    }

    public ParkingSlot getRelevantParkingSlot(Vehicle vehicle){
        VehicleCategory vehicleCategory = vehicle.getVehicleCategory();
        ParkingSlotType parkingSlotType = getCorrectParkingSlotType(vehicleCategory);
        ParkingSlot parkingSlot = null;

        for (ParkingSlot slot  : parkingSlots.get(parkingSlotType)) {
            if(slot.isAvailable){
                parkingSlot = slot;
                break;
            }
        }

        return parkingSlot;
    }

    private ParkingSlotType getCorrectParkingSlotType(VehicleCategory vehicleCategory){
        switch (vehicleCategory) {
            case TwoWheeler:
                return ParkingSlotType.TwoWheeler;
        
            case ThreeWheeler:
                return ParkingSlotType.ThreeWheeler;

            case FourWheeler:
                return ParkingSlotType.ThreeWheeler;

            case Bus:
                return ParkingSlotType.Bus;

            default:
                return ParkingSlotType.Truck;
        }
    }

}
