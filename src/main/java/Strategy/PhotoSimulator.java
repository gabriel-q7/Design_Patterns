package Strategy;

import java.util.Scanner;

public class PhotoSimulator {

    public static String getSharing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share with txt(t), email(e), or social media(s)?");
        return scanner.next();
    }

    public static void main(String[] args) {

        PhoneCameraApp cameraApp = new BasicCameraApp();

        switch (getSharing()) {
            case("t"):
                cameraApp.setShareBehavior(new Txt());
                break;
            case("e"):
                cameraApp.setShareBehavior(new Email());
                break;
            case("s"):
                cameraApp.setShareBehavior(new Social());
                break;
            default:
                cameraApp.setShareBehavior(new Txt());
        }
        cameraApp.take();
        cameraApp.edit();
        cameraApp.save();
        cameraApp.performShare();
    }
}
