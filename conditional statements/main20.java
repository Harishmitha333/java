import java.util.Scanner;

public class main20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if((int)a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
        