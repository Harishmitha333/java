import java.util.*;

public class arithmeticCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        char op = sc.next().charAt(0);
        switch (op){
            case '+':
                System.out.println("Result = "+ (n1+n2));
                break;
            case '-':
                System.out.println("Result = "+ (n1-n2));
                break;
            case '*':
                System.out.println("Result = "+ (n1*n2));
                break;
            case '/':
                if(n2 !=0){
                System.out.println("Result = "+ (n1/n2));
                }
                else{
                    System.out.println("division by 0 is not allowed");
                }
                break;      
                default:
                    System.out.println("invalid");      
        }

        }
    }

