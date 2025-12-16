
import java.util.Scanner; 

public class scenario18 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter water consumption in liters: ");
        int liters = sc.nextInt(); 
        int bill = 0; 
        if(liters <= 1000) {
            bill = 0; 
        } else if(liters <= 3000) { 
            bill = ((liters - 1000) * 5) / 1000; 
        } else { 
            bill = (2000 * 5) / 1000 + ((liters - 3000) * 10) / 1000; 
        }
        System.out.println("Water Bill: ₹" + bill);
    }
}
