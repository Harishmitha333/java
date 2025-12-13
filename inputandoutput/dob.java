import java.util.Scanner;
public class dob {
   public static void main(String[] args) {
       int d,m,y;
       Scanner sc=new Scanner(System.in);
       d=sc.nextInt();
       m=sc.nextInt();
       y=sc.nextInt();
       System.out.printf("%02d/%02d/%04d",d,m,y);
   } 
}
