
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int tot = 0;
        
        while(true){
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n == 0){
                if (tot > 0){
                    System.out.println(1.0 * sum / tot);
                    break;              
                } else {
                    System.out.println("Cannot calculate the average");
                    break;
                }
            } else if (n > 0){
                tot++;
                sum += n;
            }
        }
    }
}
