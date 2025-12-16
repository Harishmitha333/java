import java.util.Scanner;

public class geometry4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a+b+c==180)&&(a>0 && b>0 && c>0))
        {
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    }
}        