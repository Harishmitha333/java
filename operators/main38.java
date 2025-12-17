public class main38 {
    public static void main(String[] args) {
        int num = 1235679;
        int last = num%10;
        int first = num/1000000;
        int sum = first + last;
        System.out.println(sum);
    }
}
