package Decorator;

public class PizzaStoreSimulator {
    public static void main(String[] args) {
        Pizza pizza = new ThickCrustPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Olives(cheesePizza);

        System.out.println(greekPizza.getDescription()
            + ". Total cost $" + greekPizza.cost());
    }
}
