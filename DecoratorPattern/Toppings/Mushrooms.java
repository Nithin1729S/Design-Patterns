package DecoratorPattern.Toppings;

import DecoratorPattern.Pizza.BasePizza;

public class Mushrooms extends ToppingDecorator{
    BasePizza basePizza;
    public Mushrooms(BasePizza pizza){
        this.basePizza=pizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost()+20;
    }
}
