package Observer;

public interface Observer {
    //Necessita das variaveis do Subject
    public void update(float temp, float humidity, float pressure);
}
