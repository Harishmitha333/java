import java.util.Scanner;

public class scenario17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of the week: ");
        String day = sc.nextLine().toLowerCase();
        int price;
        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
            day.equals("thursday") || day.equals("friday")) {
            price = 100;
        } else if (day.equals("saturday") || day.equals("sunday")) {
            price = 150;
        } else {
            price = 0; 
            System.out.println("Invalid day entered!");
        }
        if (price != 0) {
            System.out.println("Ticket Price: ₹" + price);
        }

    }
}
