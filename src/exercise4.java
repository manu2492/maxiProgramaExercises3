import java.util.*;
public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        if (t > 100 && t <= 300) {
            System.out.println(t - (t * 0.1));
        }
        else if (t > 300 && t < 501) {
            System.out.println(t - (t * 0.15));
        }
        else if (t > 500) {
            System.out.println(t - (t * 0.25));
        }
        else {
            System.out.println(t);
        }

    }
}
