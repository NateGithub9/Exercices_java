
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int one = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int two = Integer.valueOf(scanner.nextLine());

        int addition = (one + two);
        int subs = (one - two);
        int mult = (one * two);
        double div = (double) one / two;

        System.out.println(one + " + " + two + " = " + addition);
        System.out.println(one + " - " + two + " = " + subs);
        System.out.println(one + " * " + two + " = " + mult);
        System.out.println(one + " / " + two + " = " + div);
        
    }
}
