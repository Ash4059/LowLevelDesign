package DecoratorPattern.ToppingDecorator;

import DecoratorPattern.BaseDecorator.Base;

public class Cheese extends Toppings {
    
    Base basePizza;

    public Cheese(Base basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getCost(){
        int cost = basePizza.getCost();
        return cost + 20;
    }

}
