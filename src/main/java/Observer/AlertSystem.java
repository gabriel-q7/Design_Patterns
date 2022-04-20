package Observer;

public class AlertSystem implements Observer{


    public void alert() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        alert();
    }
}
