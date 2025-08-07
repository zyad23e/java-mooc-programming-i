
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int tot = 0;
        
        while(true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n == 0){
                System.out.println("Average of the numbers: " + (1.0 * sum / tot));
                break;
            }
            
            tot++;
            sum += n;
        }     
        

    }
}
