import java.util.Scanner;

public class main19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        if(product>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}