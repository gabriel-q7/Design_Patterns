package Observer;

public class Logger implements Observer{


    public void log() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        log();
    }
}
