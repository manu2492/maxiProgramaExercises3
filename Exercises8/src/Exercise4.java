/**Dada una lista de 10 números enteros, cargarlos en un vector. Luego,
determinar e informar si el vector está ordenado en forma creciente. Por
ejemplo el vector con los valores 1, 3, 5, 7 y 9 está ordenado; el vector 1, 5, 3, 7
y 9 no lo está. */

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int order = -10000;
        boolean isOrNot = true;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > order) {
                order = arr[i];
            }
            else {
                isOrNot = false;
            }
        }

        System.out.println(isOrNot);
    }
}
