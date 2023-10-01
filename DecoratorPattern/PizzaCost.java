package DecoratorPattern;

import DecoratorPattern.BaseDecorator.Base;
import DecoratorPattern.BaseDecorator.FarmHouse;
import DecoratorPattern.BaseDecorator.VegDelight;
import DecoratorPattern.ToppingDecorator.Cheese;
import DecoratorPattern.ToppingDecorator.Paneer;

public class PizzaCost {
    
    public static void main(String args[]){

        Base paneerPizza = new Cheese(new Paneer(new FarmHouse()));
        System.out.println("Farmhouse pizza with paneer and cheese toppins cost us: " + paneerPizza.getCost());

        Base cheesePizza = new Cheese(new VegDelight());
        System.out.println("VegDelight pizza with Cheese toppins cost us: " + cheesePizza.getCost());

    }

}
