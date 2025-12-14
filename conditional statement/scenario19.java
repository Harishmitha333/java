
import java.util.Scanner;
public class scenario19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter total data (GB): ");
        double totalData = sc.nextDouble(); 
        System.out.print("Enter used data (GB): ");
        double usedData = sc.nextDouble(); 
        double usagePercentage = (usedData / totalData) * 100;
        if (usagePercentage <= 25) {
            System.out.println("Low Data");
        } else if (usagePercentage <= 50) {
            System.out.println("Half Consumed");
        } else {
            System.out.println("Data Over");
        }
    }
}
