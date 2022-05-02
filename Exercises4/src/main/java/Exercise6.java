import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 2; i < n -1; i++) {
            if (n % i == 0) {
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("is prime");
        }
        else {
            System.out.println("is not prime");
        }
    }
}
