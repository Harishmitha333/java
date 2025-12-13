
import java.util.*;

public class compoundInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double amount = p*Math.pow((1+r/100),t);
        double compoundinterest = amount - p;
        System.out.println("Compound Interest = "+ compoundinterest);
    }
}        