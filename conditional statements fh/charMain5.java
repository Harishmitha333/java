import java.util.Scanner;

public class charMain5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char chr = sc.next().charAt(0);
        if(ch==chr){
            System.out.println("Equal");

        }else{
            System.out.println("Not Equal");

        }


    }
}
