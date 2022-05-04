import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = sc.nextInt();
        isPrime(prime);
    }
    public static int isPrime (int prime) {
        int count = 0;
        for (int i = 2; i < (prime / 2) + 1; i++) {
            if (prime % i == 0) {
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("is prime");
        }
        else {
            System.out.println("is not prime");
        }
        return 0;
    }
}
