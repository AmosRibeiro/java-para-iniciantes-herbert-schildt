package capitulo12.enums;

public class SpeedDemo {
    public static void main(String[] args) {
        Speed tp;

        System.out.println("Typical speed for an airplane is " + Speed.AIRPLANE.getSpeed() + " miles per hour.\n");
        System.out.println("All Transport speeds: ");
        for( Speed t: Speed.values())
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
    }
}
