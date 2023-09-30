import java.util.ArrayList;
import java.util.List;

import Liskov.Car;
import Liskov.MotorCycle;
import Liskov.Vehicle;
import Liskov.Bicycle;

public class Main {
    public static void main(String args[]){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        for(Vehicle vehicle : vehicleList){
            System.out.println(vehicle.getNumberOfWheels().toString());
        }
    }
}