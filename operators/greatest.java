public class greatest {
    public static void main(String[] args) {
        int a = 30;
        int b = 78;
        int c = 88;
        int greater = (a>b)?((a>c)?a:c) : ((b>c)?b:c);
        System.out.println(greater);
    }
}
