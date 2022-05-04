import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        int primesCount = 0;
        int evenCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int divideNumber = 2;
        int count = 0;

        while (t) {
            int n = sc.nextInt();
            if (n == 0) {
                t = false;
            }
            else if (n > 0) {
                positiveCount += 1;
            }
            else if (n < 0) {
                negativeCount += 1;
            }
            else if (n % 2 == 0) {
                evenCount += 1;
            }
            while (divideNumber < (n / 2) + 1) {
                if (n % divideNumber == 0) {
                    count += 1;
                }
                divideNumber += 1;
            }
            if (count == 0) {
                primesCount += 1;
            }

        }
        System.out.println("primes count "+primesCount);
        System.out.println("even count "+evenCount);
        System.out.println("negatives "+negativeCount);
        System.out.println("positives "+ positiveCount);
    }
}
