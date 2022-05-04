import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ages = " ";
        boolean cicle = true;

        while( cicle == true ) {
            int age = sc.nextInt();
            if (age > 18) {
                String j = Integer.toString(age);
                ages += j + " ";
            }
            else if (age < 18) {
                cicle = false;
            }
        }
        System.out.println(ages);
    }
}
