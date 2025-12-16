import java.util.Scanner;

public class main18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a/10==0){
            System.out.println("single");
        }
        else if(a/100==0){
            System.out.println("double");
        }else{
            System.out.println("three");

        }
    }
}