import java.lang.*;
public class Main {
    public static void main(String[] args) {

        double angle1 = 0.5;
        double angle2 = 0.2;

        var rad1 = Math.toRadians(angle1);
        var rad2 = Math.toRadians(angle2);

        System.out.println(Math.sin(rad1));
        System.out.println(Math.sin(rad2));
    }
}