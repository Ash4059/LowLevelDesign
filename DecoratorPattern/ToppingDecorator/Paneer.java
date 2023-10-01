package DecoratorPattern.ToppingDecorator;

import DecoratorPattern.BaseDecorator.Base;

public class Paneer extends Toppings {
    
    Base basePizza;

    public Paneer(Base basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getCost(){
        return basePizza.getCost() + 80;
    }

}
