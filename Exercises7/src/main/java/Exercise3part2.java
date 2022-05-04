import java.util.Scanner;

public class Exercise3part2 {
    public static void main(String[] args) {
        System.out.println(howMany());

    }
    public static int howMany () {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }
}
