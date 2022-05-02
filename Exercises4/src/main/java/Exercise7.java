import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxNumber = 0;
        int index1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
                index1 = i + 1;
            }
        }
        System.out.println("the max number is " + maxNumber + " and the index is " + index1);
    }
}
