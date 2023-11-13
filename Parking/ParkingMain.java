package Parking;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import Parking.Entity.Address;
import Parking.Entity.ParkingSlot;
import Parking.Model.ParkingSlotType;

public class ParkingMain {
    
    public static void main(String [] args){
        String nameOfParkingLot = "Raheja parking";
        Address address = new Address(nameOfParkingLot, "Beharam baugh", 
        "Mumbai", "Maharashtra", "India");

        Map<ParkingSlotType, List<ParkingSlot>> allSlotsMap = new HashMap<>();
        List<ParkingSlot> parkingSlotForTwoWheeler = new LinkedList<>();
        parkingSlotForTwoWheeler.add(new ParkingSlot("twoWheeler1", ParkingSlotType.TwoWheeler));
        
    }

}
