import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > b * c) {
            System.out.println("it is greater");
        }
        else {
            System.out.println("it is smaller");
        }
    }
}
