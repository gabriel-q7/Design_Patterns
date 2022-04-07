package Strategy;

public class Email implements ShareBehavior{
    @Override
    public void share() {
        System.out.println("I'm emailing the photo");
    }
}
