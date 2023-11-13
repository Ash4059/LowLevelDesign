package Parking.Entity;

import java.util.List;
import java.util.Map;

import Parking.Model.ParkingSlotType;

public class ParkingLot {
    
    private String name;
    private Address address;
    private List<ParkingFloor> parkingFloors;
    
    private ParkingLot(String name, Address address, List<ParkingFloor> parkingFloors){
        this.name = name;
        this.address = address;
        this.parkingFloors = parkingFloors;
    }

    private static class ParkingLotHelper {
        
        static ParkingLot obj;
        
        static ParkingLot geParkingLot(String name, Address address, List<ParkingFloor> parkingFloors){

            if(obj == null){
                obj = new ParkingLot(name, address, parkingFloors);
            }

            if(obj.name != name){
                return null;
            }

            return obj;

        }
    }

    public static ParkingLot getParkingLotObj(String name, Address address, List<ParkingFloor> parkingFloors){

        return ParkingLotHelper.geParkingLot(name, address, parkingFloors);

    }

    public void AddFloor(String name, Map<ParkingSlotType, List<ParkingSlot>> parkingSlots){
        ParkingFloor parkingFloor = new ParkingFloor(name, parkingSlots);
        parkingFloors.add(parkingFloor);
    }

    public void removeFloor(ParkingFloor parkingFloor){
        parkingFloors.remove(parkingFloor);
    }

    public Ticket assignTicket(String ticketId, Vehicle vehicle){

        ParkingSlot parkingSlot = getParkingSlotForVehicleAndPark(vehicle);
        if(parkingSlot == null){
            return null;
        }
        Ticket parkingTicket = new Ticket(ticketId ,vehicle, parkingSlot);
        return parkingTicket;

    }

    public double SanAndPay(Ticket ticket){
        long endTime = System.currentTimeMillis();
        ticket.getParkingSlot().removeVehilce(ticket.getVehicle());
        int duration = (int)(endTime - ticket.getStartTime())/1000;
        if(Math.ceil(duration/60) <= 20){
            return 0;
        }
        double Price = ticket.getParkingSlot().getParkingSlotType().getParkingFare(duration);
        return Price;
    }

    private ParkingSlot getParkingSlotForVehicleAndPark(Vehicle vehicle) {

        ParkingSlot parkingSlot = null;

        for (ParkingFloor parkingFloor : parkingFloors) {
            parkingSlot = parkingFloor.getRelevantParkingSlot(vehicle);
            if(parkingSlot != null){
                break;
            }
        }

        return parkingSlot;
    }

}
