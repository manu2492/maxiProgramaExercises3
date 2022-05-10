import java.util.*;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int number1 = 0;  
        positiveNegativeCero(a, number1); 
    }
    public static void positiveNegativeCero (int a, int number1) {
        if (a > 0) {
            number1 = 1;
        }
        else if (a <0) {
            number1 = -1;
        }
        else {
            number1 = 0;
        }
            System.out.println(number1);
    }
}
