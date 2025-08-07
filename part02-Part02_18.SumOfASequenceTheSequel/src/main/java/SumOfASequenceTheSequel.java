
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int f = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int n = Integer.valueOf(scanner.nextLine());
        
        int s = 0;
        
        for (int i =f; i <= n; i++){
            s += i;
        }
        
        System.out.println("The sum is " + s);
    }
}
