import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            t--;

            if (a == b && b == c) {
                System.out.println("equilateral");
            }
            else if (a == b && c != a || a == c && b != a || b == c && a != b) {
                System.out.println("isosceles");
            }
            else {
                System.out.println("scalene");
            }
        }
    }
}
