/**Hacer un programa que solicite 50 números enteros y los guarde en un vector.
Luego recorrer el vector y determinar e informar cuál es la suma de los valores
del mismo.
Nota: usar dos ciclos: uno para guardar los números en el vector y otro para
recorrerlo y leerlo. */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int totalsum = 0;

        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];            
        }

        System.out.println(totalsum);
    }
}
