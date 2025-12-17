public class afterdiscount {
    public static void main(String[] args) {
        double price = 3500;
        double discount = 10;
        double discountAmount = price*discount/100;
        double finalPrice = price - discountAmount;
        System.out.println("Final Price after discount = "+ finalPrice);

    }
}
