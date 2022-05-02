import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 18) {
                count += 1;
                sum1 += arr[i];
            }
        }
        System.out.println(sum1 / count);
    }
}
