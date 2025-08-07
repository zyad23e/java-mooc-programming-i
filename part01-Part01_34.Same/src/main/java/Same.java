
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String s = scanner.nextLine();
        System.out.println("Enter the second string:");
        String s1 = scanner.nextLine();
        
        if (s.equals(s1)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
