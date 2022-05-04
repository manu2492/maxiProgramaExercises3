import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(mayor(a, b));
    }
    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        }
        else if (b > a) {
            return b;
        }
        else {
            return 0;
        }
    }
}
