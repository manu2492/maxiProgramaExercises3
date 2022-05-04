import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        int maxNumber = 1;
        int indexMaxNumber = 1;
        int secondMaxNumber = 0;
        int indexSecondMaxNumber = 0;
        int trueIndex = 0;

        while (t) {
            int n = sc.nextInt();
            trueIndex += 1;
            if (n > maxNumber) {
                secondMaxNumber = maxNumber;
                maxNumber = n;
                indexSecondMaxNumber = indexMaxNumber;
                indexMaxNumber = trueIndex;
            }
            if (n == 0) {
                t = false;
                System.out.println(maxNumber+" "+ indexMaxNumber);
                System.out.println(secondMaxNumber+" "+indexSecondMaxNumber);
            }
        }
    }
}
