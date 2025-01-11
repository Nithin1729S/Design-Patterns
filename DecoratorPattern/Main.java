package DecoratorPattern;
import DecoratorPattern.Pizza.BasePizza;
import DecoratorPattern.Pizza.MargeritaPizza;
import DecoratorPattern.Toppings.ExtraCheese;
import DecoratorPattern.Toppings.Mushrooms;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza=new Mushrooms(new ExtraCheese(new MargeritaPizza()));
        System.out.println(pizza.cost());
    }
    
}
