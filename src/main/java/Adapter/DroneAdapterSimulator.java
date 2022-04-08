package Adapter;

public class DroneAdapterSimulator {

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void main(String[] args) {
        Duck droneAdapter = new DroneAdapter(new SuperDrone());

        testDuck(droneAdapter);
    }
}
