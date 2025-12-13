import java.util.*;

public class distanceCalcutate {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double speed = sc.nextDouble();
        double time = sc.nextDouble();
        double distance = speed*time;
        System.out.println("Distance Calculation : "+ distance);
    }
}
