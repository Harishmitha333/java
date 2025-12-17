public class surfaceofcuboid {
    public static void main(String[] args) {
        int l = 3, b = 4, h = 6;
        int tsa = 2*(l*b + b*h + l*h);
        int volume = l*b*h;
        System.out.println(tsa + " "+ volume);
    }
}
