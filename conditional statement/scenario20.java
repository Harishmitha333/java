
import java.util.Scanner; 

public class scenario20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed = sc.nextDouble();
        if (speed > 100) {
            System.out.println("Over-speeding! Fine imposed.");
        } else {
            System.out.println("Speed is within limit");
}
    }
}
