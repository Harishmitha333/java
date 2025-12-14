
import java.util.Scanner;
public class batteryCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();
        if(battery >= 80 && battery <= 100){
            System.out.println("Battery full");
        }
        else if (battery >= 30 && battery < 80){
            System.out.println("50% consumed");
        }
        else if (battery >= 0 && battery < 30){
            System.out.println("Low battery");
        }else{
            System.out.println("Invalid");
        }
    }
}