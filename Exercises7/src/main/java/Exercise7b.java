import java.util.Scanner;

public class Exercise7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        function1(arr);
    }
    public static void function1 (int[] arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int ceroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount += 1;
            } else if (arr[i] < 0) {
                negativeCount += 1;
            } else {
                ceroCount += 1;
            }
        }
        System.out.println(positiveCount + " " + negativeCount + " " + ceroCount);
    }
}
