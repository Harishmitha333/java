
import java.util.*;

public class netSalary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();
        double hra = basic*0.20;
        double da = basic*0.10;
        double gross = basic+hra+da;
        double pf = basic*0.12;
        double tax = basic*0.10;
        double netsalary = gross - (pf+tax);
        System.out.println("Net Salary = "+netsalary);
    }
        }