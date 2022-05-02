import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int minNumber = 1000;
        int indexNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
                indexNumber = i + 1;
            }
        }
        System.out.println("the min number is " + minNumber + " and the index is " + indexNumber);
    }
}
