
import java.util.Scanner;
public class scenario15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        if(speed > 100){
            System.out.println("over spped");
        }
        
        else{
            System.out.println("safe speed");
        }
    }
}