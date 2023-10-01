package DecoratorPattern.ToppingDecorator;

import DecoratorPattern.BaseDecorator.Base;

public class Veggi extends Toppings {
    
    Base basePizza;

    public Veggi(Base basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getCost(){
        return basePizza.getCost() + 40;
    }

}
