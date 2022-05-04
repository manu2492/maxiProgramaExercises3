import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        int divideNumber = 2;

        while (divideNumber < (a / 2) + 1) {
            if (a % divideNumber == 0) {
                count += 1;
            }
            divideNumber += 1;

        }
        if (count == 0) {
            System.out.println("is prime");
        }
        else {
            System.out.println("is not prime");
        }
    }
}
