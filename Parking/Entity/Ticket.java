package Parking.Entity;

public class Ticket {
    
    String ticketId;
    long startTime;
    Vehicle vehicle;
    ParkingSlot parkingSlot;

    public Ticket(String ticketId, Vehicle vehicle, ParkingSlot parkingSlot){
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.startTime = System.currentTimeMillis();
        parkingSlot.addVehicle(vehicle);
    }

    public long getStartTime(){
        return this.startTime;
    }

    public ParkingSlot getParkingSlot(){
        return this.parkingSlot;
    }

    Vehicle getVehicle(){
        return this.vehicle;
    }

}
