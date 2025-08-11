
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Give a word: ");
        String n = scanner.nextLine();
        System.out.println("");
        System.out.println(n+n+n);

    }
}
