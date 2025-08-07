
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int n = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int n1 = Integer.valueOf(scanner.nextLine());
        
        for (int i = n1; i <= n; i++){
            System.out.println(i);
        }
    }
}
