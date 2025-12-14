
import java.util.Scanner;
public class scenario12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp < 15) {
            System.out.println("Cold");
        } 
        else if (temp >= 15 && temp <=25) {
            System.out.println("pleasant");
        }
        else if (temp >= 26 && temp <= 35){
            System.out.println("Hot");
        }else if (temp > 35){
            System.out.println("Heatwave");
        }
    }
}
