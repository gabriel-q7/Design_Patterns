package Strategy;

public abstract class PhoneCameraApp {

    protected ShareBehavior shareBehavior;

    public void setShareBehavior(ShareBehavior shareBehavior) {
        this.shareBehavior = shareBehavior;
    }

    public void performShare() {
        shareBehavior.share();
    }

    public void take() {
        System.out.println("Taking the photo");
    }

    public void save() {
        System.out.println("Saving the photo");
    }

    abstract void edit();

}
