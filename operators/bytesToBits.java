import java.util.*;

public class bytesToBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bytes = sc.nextInt();
        int bits = bytes*8;
        System.out.println("Bytes To Bits : "+ bits);
    }
}
