import java.util.Scanner;

public class main15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0 || a%7==0){
            System.out.println("it is div by both 3 or 7");
        }else{
            System.out.println("it is not div by both 3 and 7");
        }
    }
}
