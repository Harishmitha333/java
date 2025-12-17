
import java.util.*;
public class convertDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int totalDays = sc.nextInt();
        int years = totalDays/365;
        int remainingDays = totalDays%365;
        int weeks = remainingDays/7;
        int days = remainingDays%7;
        System.out.println("Years = "+years);
        System.out.println("Weeks = "+weeks);
        System.out.println("Days = "+days);
    }   
}
