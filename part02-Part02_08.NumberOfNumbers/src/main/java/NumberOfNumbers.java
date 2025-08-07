
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tot = 0;
        
        while(true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            if (n == 0){
                System.out.println("Number of numbers: " + tot);
                break;
            }
            
            tot++; 
            
        }

    }
}
