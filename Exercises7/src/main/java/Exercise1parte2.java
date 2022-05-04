import java.util.Scanner;

public class Exercise1parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(totalPrice(p,c));
    }

    public static int totalPrice (int p, int c) {
        return (p * c);
    }
}
