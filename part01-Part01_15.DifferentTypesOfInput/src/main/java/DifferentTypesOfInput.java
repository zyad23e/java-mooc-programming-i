
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String n = scanner.nextLine();
        System.out.println("Give an integer:");
        int num1= Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double num2 = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean t = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + n);
        System.out.println("You gave the integer " + num1);
        System.out.println("You gave the double " + num2);
        System.out.println("You gave the boolean " + t);

    }
}
