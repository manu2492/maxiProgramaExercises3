import java.util.*;
public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        if (t % 5 == 0) {
            System.out.println("it is multiple");
        }
        else {
            System.out.println("it is not a multiple");
        }
    }
}
