package Decorator;

public class Peppers extends ToppingDecorator{
    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost() + .45;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Peppers";
    }
}
