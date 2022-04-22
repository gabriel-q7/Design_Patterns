package Decorator;

public class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost() + .35;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
}
