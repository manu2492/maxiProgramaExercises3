import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par = sc.nextInt();
        System.out.println(ispar(par));
    }
    public static int ispar (int par) {
        if (par % 2 == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

