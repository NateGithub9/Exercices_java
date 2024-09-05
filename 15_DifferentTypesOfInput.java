
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String string = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        Integer integera = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        Double doublenumber = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean boo = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integera);
        System.out.println("You gave the double " + doublenumber);
        System.out.println("You gave the boolean " + boo);


    }
}
