/**Hacer un programa que permita ingresar una lista de números que corta
cuando se ingresa un cero. A partir de dichos datos informar:
a. El mayor de los números pares.
b. La cantidad de números impares.
c. El menor de los números primos.
Hacer uso de las funciones anteriormente desarrolladas. */

import java.util.ArrayList;
import java.util.Scanner;


public class Exercise8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean out1 = true;
        ArrayList <Integer> arr = new ArrayList<Integer>();

        ArrayList <Integer> primesArray = new ArrayList<Integer>();
        int smallerPrime = 100000;

        int countOdd = 0;

        ArrayList <Integer> evenArray = new ArrayList<>();
        int bigerEven = 0;

        //this while allows to know when the user inser a 0 number, and cut the sequence
        while(out1 == true) {
            int e = sc.nextInt();
            if (e != 0) {
                arr.add(e);
            }
            else {
                out1 = false;
            }
        }

        // get the prime numbers
        for (int i = 0; i < arr.size(); i++) {
            if (isPrime(arr.get(i)) == true) {
                primesArray.add(arr.get(i));
            }
        }
        // get the count of odds numbers
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 != 0) {
                countOdd += 1;
            }
        }
        // get the even numbers
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                evenArray.add(arr.get(i));
            }
        }

        //get the smaller prime number
        for (int i = 0; i < primesArray.size(); i++) {
            if (primesArray.get(i) < smallerPrime) {
                smallerPrime = primesArray.get(i);
            }
        }
        //get the biger even
        for (int i = 0; i < evenArray.size(); i++) {
            if (evenArray.get(i) > bigerEven) {
                bigerEven = evenArray.get(i);
            }
        }

        System.out.println("smallerPrime: "+smallerPrime+" the number of odds is: "+countOdd+
        " the biger even es: "+bigerEven);
         
    }
    // method to know if a number is prime
    public static boolean isPrime (int n) {
        int count = 0;
        boolean response = false;
        for (int i = 2; i < (n/2) + 1; i++) {
            if (n % i != 0) {
                count += 1;
            }
        }
        if (count == 0) {
            response = true;
        }
        return response;
    }
}
