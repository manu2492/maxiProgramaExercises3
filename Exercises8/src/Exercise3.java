/**Hacer un programa que solicite 100 números enteros y los guarde en un
vector. Luego recorrer ese vector para calcular el promedio. Mostrar por
pantalla los valores del vector que son mayores al promedio calculado. */

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int averageSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            averageSum += arr[i];
        }
        System.out.println("average is: "+averageSum / arr.length);
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > averageSum / arr.length) {
                System.out.println(arr[i]);
            }
        }
    }
}
