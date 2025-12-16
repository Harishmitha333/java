import java.util.Scanner;

public class geometry6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a==b && b==c && c==d){
            System.out.println("Square");
        }
        else if(a==c && b==d){
            System.out.println("rectangle");
        }
        else{
            System.out.println("not both");
        }
    }
}        