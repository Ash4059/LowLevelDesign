import Strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle{
    OffroadVehicle(){
        super(new SportsDriveStrategy());
    }
}
