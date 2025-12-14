
import java.util.*;

public class year3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        int frstTwo = year/100;
        int lstTwo = year%100;
        if(frstTwo==lstTwo) 
            {
                System.out.println("equal");
            } else{
                System.out.println("not equal");
            }
        }
    }        
