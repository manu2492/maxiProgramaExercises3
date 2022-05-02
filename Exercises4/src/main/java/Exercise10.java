import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxEven = 0;
        int minOdd = 1000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > maxEven) {
                maxEven = arr[i];
            }
            else if (arr[i] % 2 != 0 && arr[i] < minOdd ) {
                minOdd = arr[i];
            }
        }
        System.out.println("the max even is " +maxEven + "the min odd is " + minOdd);
    }
}
