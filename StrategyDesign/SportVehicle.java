import Strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle{
    SportVehicle(){
        super(new SportsDriveStrategy());
    }
}
