import java.util.Scanner;

public class geometry3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>0 && b>0){
            System.out.println("lies in 1st quadrant");
        }
        else if(a<0 && b>0){
            System.out.println("lies in 2nd quadrant");
        }
        else if(a<0 && b<0){
            System.out.println("lies in 3rd quadrant");
        }
        else if(a>0 && b<0){
            System.out.println("lies in 4th quadrant");
        }
        else if(b==0 && b!=0){
            System.out.println("lies on X-axis quadrant");
        }
        else if(a==0 && b!=0){
            System.out.println("lies on Y-axis quadrant");
        }
        else{
            System.out.println("lies on origin");
        }
    }
}
