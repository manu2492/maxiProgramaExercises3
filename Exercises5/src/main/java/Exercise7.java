import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        int maxNumber = 0;
        while (t == true) {
            int j = sc.nextInt();
            if (j != 0 && j > maxNumber) {
                maxNumber = j;
            }
            else if(j == 0) {
                t = false;
            }
        }
        System.out.println(maxNumber);
    }
}
