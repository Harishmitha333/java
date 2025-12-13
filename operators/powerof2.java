public class powerof2 {
    public static void main(String[] args) {
        int n = 24;
        boolean isPowerOf2 = (n>0) && ((n&(n-1))==0);
        System.out.println(isPowerOf2);
    }
}
