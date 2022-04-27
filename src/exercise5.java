import java.util.*;
public class exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 8 && b > 8) {
            System.out.println("direct approval");
        }
        else if (a < 8 && a >= 6 || b < 8 && b >= 6 ) {
            System.out.println("go to final exam");
        }
        else if (a < 6 && b < 6) {
            System.out.println("must retrieve");
        }
    }
}
