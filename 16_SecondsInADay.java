
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        Integer day = Integer.valueOf(scanner.nextLine());
        Integer result = (day * 86400);
        System.out.println(result);
    }
}
