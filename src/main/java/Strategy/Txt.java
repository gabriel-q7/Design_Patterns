package Strategy;

public class Txt implements ShareBehavior {
    @Override
    public void share() {
        System.out.println("I'm texting the photo");
    }
}
