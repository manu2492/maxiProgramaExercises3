/**Hacer un programa que solicite 50 números enteros y los guarde en un vector.
Luego recorrer todos los elementos del vector y determinar cuál es el valor
máximo y su posición dentro del vector. */

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int maxNumber = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt(); 
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
                index = i;
            }    
        }
        System.out.println("max number is: "+maxNumber+" the index is: "+index);
    }
}
