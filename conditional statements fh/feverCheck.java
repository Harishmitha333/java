
import java.util.Scanner;
public class feverCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        if (temperature > 100) {
            System.out.println("Fever");
            
        } else {
            System.out.println("Normal");
        }
    }
}