
import java.util.*;

public class centuryYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        if(year%100==0){
            System.out.println("It is a century Year");
        } else{
            System.out.println("It is not a century Year");
        }
    }
}        