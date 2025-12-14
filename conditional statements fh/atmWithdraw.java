
import java.util.Scanner;

public class atmWithdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        int balance = sc.nextInt();
        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();
        if (withdraw <= balance && withdraw % 100 == 0) {
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + (balance - withdraw));
        } else {
            System.out.println("Invalid Withdrawal");
        }
    }
}
