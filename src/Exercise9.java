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
        int memory = sc.nextInt();

        System.out.println(processor + ram + memory);


    }
}
