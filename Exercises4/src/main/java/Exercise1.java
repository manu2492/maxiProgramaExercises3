import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();
        arr[5] = sc.nextInt();
        arr[6] = sc.nextInt();
        arr[7] = sc.nextInt();
        arr[8] = sc.nextInt();
        arr[9] = sc.nextInt();

        int maxNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }

        }
        System.out.println(maxNumber);

    }

}
