
import java.util.Scanner;
public class miniATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        int choice;
        System.out.println("----- MINI ATM -----");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your Balance: ₹" + balance);
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("Amount Deposited Successfully");
                System.out.println("Updated Balance: ₹" + balance);
                break;
            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdraw = sc.nextDouble();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Please collect your cash");
                    System.out.println("Remaining Balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient balance");
                }
                break;
            case 4:
                System.out.println("Thank you for using the ATM");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
