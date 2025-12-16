
import java.util.*;

public class year4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int year1 = sc.nextInt();
        int year2 = sc.nextInt();
        int lastdigit1 = year1%10;
        int lastdigit2 = year2%10;
        if(lastdigit1 == lastdigit2){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}
