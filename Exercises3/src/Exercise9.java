import java.util.*;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner sa= new Scanner(System.in);
        System.out.println("processor");
        String processor = sa.nextLine();

        Scanner sb= new Scanner(System.in);
        System.out.println("ram");
        String ram = sb.nextLine();

        Scanner sc= new Scanner(System.in);
        System.out.println("memory");
        String memory = sc.nextLine();

        int price = 0;

        if ( processor.equals("i5") && ram.equals("8")) {
            price = 800;
        }
        else if ( processor.equals("i5") && ram.equals("16")) {
            price = 900;
        }
        else if ( processor.equals("i5") && ram.equals("32")) {
            price = 900;
        }

        else if ( processor.equals("i7") && ram.equals("8")) {
            price = 900;
        }
        else if ( processor.equals("i7") && ram.equals("16")) {
            price = 1000;
        }
        else if ( processor.equals("i7") && ram.equals("32")) {
            price = 1400;
        }

        else if ( processor.equals("i9") && ram.equals("8")) {
            price = 1200;
        }
        else if ( processor.equals("i9") && ram.equals("16")) {
            price = 1400;
        }
        else if ( processor.equals("i9") && ram.equals("32")) {
            price = 2000;
        }

        if (memory.equals("1")) {
            price += 300;
        }

        System.out.println(price);
    }
}
