package Parking.Model;

public enum ParkingSlotType {
    
    TwoWheeler{
        public double getParkingFare(long duration){
            return duration*(0.05);
        }
    },

    ThreeWheeler{
        public double getParkingFare(long duration){
            return duration*(0.065);
        }
    },

    FourWheeler{
        public double getParkingFare(long duration){
            return duration*(0.075);
        }
    },

    Bus{
        public double getParkingFare(long duration){
            return duration*(0.09);
        }
    },

    Truck{
        public double getParkingFare(long duration){
            return duration*(0.1);
        }
    };
    
    public abstract double getParkingFare(long duration);

}
