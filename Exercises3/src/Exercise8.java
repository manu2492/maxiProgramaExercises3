import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int liters = sc.nextInt();
        double price = 0.0;

        if (liters > 50 && liters < 51) {
            price = liters * 25;
        }
        else if (liters >= 51 && liters < 201) {
            price = liters * 20;
        }
        else if (liters >= 201 && liters < 501) {
            price = liters * 15;
        }
        else {
            price = liters * 10;
        }

        if (t == 1) {
            System.out.println(price - (price * 0.1));
        }
        else {
            System.out.println(price);
        }
    }
}
