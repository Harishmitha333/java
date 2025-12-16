
import java.util.*;

public class year5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        if(month<1 || month>12){
            System.out.println("invalid");
        }
        else if (month == 4 || month == 6 || month == 11 || month == 9){
            System.out.println("30 days");

        } 
        else if (month == 1 || month == 3 || month == 12 || month == 5 || month == 7 || month == 8 || month == 10){
            System.out.println("31 days");

        }
        
        else {
            if((year % 400 == 0) || (year%4 == 0 && year %100!=0))
            {
                System.out.println("29 days");
            }
            else{
                System.out.println("28 days");
            }
        }
    }
        }