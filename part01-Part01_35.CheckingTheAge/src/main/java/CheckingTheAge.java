
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you? ");
        int n = Integer.valueOf(scanner.nextLine());
        if (n >= 0 && n < 121){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
