import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.FormView;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean out1 = true;
        ArrayList <Integer> arr = new ArrayList<Integer>();

        while(out1 == true) {
            int e = sc.nextInt();
            if (e != 0) {
                arr.add(e);
            }
            else {
                out1 = false;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }   
    
}
