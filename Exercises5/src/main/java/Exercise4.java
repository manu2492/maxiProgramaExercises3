import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            while (a - 1 > b) {
                System.out.println(b + 1);
                b += 1;
            }
        }
        else {
            while (b - 1 > a) {
                System.out.println(a + 1);
                a += 1;
            }
        }
    }
}
