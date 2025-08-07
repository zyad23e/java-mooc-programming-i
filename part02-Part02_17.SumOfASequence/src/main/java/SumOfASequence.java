
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int n = Integer.valueOf(scanner.nextLine());
        
        int s = 0;
        
        for (int i =1; i <= n; i++){
            s += i;
        }
        
        System.out.println("The sum is " + s);

    }
}
