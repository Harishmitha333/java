import java.util.Scanner;

public class main17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lastOfa = a%10;
        int lastOfb = b%10;
        if(lastOfa==lastOfb){
            System.out.println("same");
        }else{
            System.out.println("not same");

        }
    }
}
