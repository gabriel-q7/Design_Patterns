package Decorator;

public class ThinCrustPizza extends Pizza{

    public ThinCrustPizza() {
        description = "Thick crust pizza, with tomato sauce";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
