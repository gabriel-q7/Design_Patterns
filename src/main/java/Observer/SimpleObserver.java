package Observer;

public class SimpleObserver implements Observer{
    private int value;
    private Subject simpleSubject;

    public SimpleObserver(Subject simpleSubject) {
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObserver(this);
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }
}
