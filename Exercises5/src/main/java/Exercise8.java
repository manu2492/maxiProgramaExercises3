import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        int maxNumber = 1;
        int secondNumber = 0;

        while (t) {
            int n = sc.nextInt();
            if (n > maxNumber) {
                secondNumber = maxNumber;
                maxNumber = n;
            }
            if (n == 0) {
                t = false;
            }
        }
        System.out.println("max number is "+maxNumber+"second max number is "+secondNumber);
    }
}
