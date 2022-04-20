package Observer;

public interface Observer {
    //Necessita das variaveis do Subject concreto
    public void update(float temperature, float humidity, float pressure);
}
