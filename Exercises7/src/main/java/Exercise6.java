import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumaResta(a, b);
    }
    public static int sumaResta(int a, int b) {
        int suma1 = a + b;
        int resta1 = a - b;
        System.out.println("Suma: " + suma1 + " Resta: " + resta1);
        return 0;
    }
}
