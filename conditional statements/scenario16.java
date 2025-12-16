
import java.util.Scanner;
public class scenario16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        if(number.length() == 10 && number.matches("[0-9]+") ){
            System.out.println("Valid number");
        }else{
            System.out.println("Invalid number");
        }
    }
}
        