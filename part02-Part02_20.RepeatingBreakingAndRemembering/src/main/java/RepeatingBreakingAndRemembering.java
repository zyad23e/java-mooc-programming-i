
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int sum = 0;
        int tit = 0;

        int even = 0;
        int odd = 0;
        
        while(true){
            int n = Integer.valueOf(scanner.nextLine());
            if (n == -1){
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + tit);
                double avg = 1.0 * sum / tit;
                System.out.println("Average: " + avg);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }
            
            if (n % 2 == 0){
                even++;
            } else {
                odd++;
            }
            
            sum+= n;
            tit++;
        }

    }
}
