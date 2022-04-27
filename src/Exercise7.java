//Make a program to enter 4 numbers. Then analyze and report by
//screen if they are sorted in descending order.
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();

        int max1 = 1000;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max1) {
                max1 = arr[i];

            }
            else {
                System.out.println("no");
            }


        }
        if (max1 == arr[3]) {
            System.out.println("yes");
        }
    }
}
