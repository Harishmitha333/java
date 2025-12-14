import java.util.Scanner;

public class geometry2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int product1 = a*a;
        int product2 = b*b;
        int product3 = c*c;
        if(product1+product2==product3 || product1+product3==product2 || product2+product3==product1){
            System.out.println("right angled");
        }else{
            System.out.println("not right angled");
        }
    }
}        