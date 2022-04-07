package Strategy;

public class Social implements ShareBehavior {
    @Override
    public void share() {
        System.out.println("I'm posting the photo on social media");
    }
}
