/**Hacer un programa que solicite una serie de valores de tipo char (caracteres).
Se entiende por carácter a cada elemento que se obtiene de presionar una
tecla. Por ejemplo el valor “25” tiene dos caracteres (si quisiéramos guardarlo
en variables enteras nos alcanza con una, pero si queremos guardarlo en
variables char, necesitaremos dos); la frase “maxi programa” tiene 13 (se
incluye el espacio como un carácter). */

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        char[] arr = new char[25];

        for (int i = 0; i < words.length(); i++) {
            arr[i] = words.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                arr[i] = 'e';
            }
        }
        System.out.println(arr);
    }
}
