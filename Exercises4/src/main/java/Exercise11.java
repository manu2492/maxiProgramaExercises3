/*Hacer un programa para ingresar 10 números y luego calcule y emita el mayor
  de los primos de la lista. En caso de no haber ningún número primo, deberá
  aclararlo con un cartel.
* */
import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxPrime = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 2; j < arr[i] - 1; j++) {
                if (arr[i] % j == 0) {
                    count += 1;
                }
            }
            if (count == 0 && arr[i] > maxPrime) {
                maxPrime = arr[i];
            }
        }
        System.out.println(maxPrime);
    }
}
