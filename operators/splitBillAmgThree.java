import java.util.*;

public class splitBillAmgThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double totalBill = sc.nextDouble();
        double Share = totalBill/3;
        System.out.println("Each should pay : "+ Share); 
    }
}
