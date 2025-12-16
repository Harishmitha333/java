
import java.util.*;

public class season{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int month = sc.nextInt();
        switch(month){
            case 12 :
            case 2 : 
            case 1 :
                System.out.println("winter season");
                break; 
            case 3 :
            case 4 : 
            case 5 :
                System.out.println("Summer season");
                break;    
            case 6 :
            case 7 : 
            case 8 :
                System.out.println("Rainy season");
                break;
            case 10 :
            case 9 : 
            case 11 :
                System.out.println("Autumn season");
                break; 
        }
    }
}       