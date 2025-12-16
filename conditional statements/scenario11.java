
import java.util.Scanner;
public class scenario11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if (amount >= 5000) {
            double discount = amount * 0.05;
            amount = amount - discount;
            System.out.println("5% Discount Applied");
        }
        System.out.println("Final Amount to Pay: ₹" + amount);
        
    }
}
