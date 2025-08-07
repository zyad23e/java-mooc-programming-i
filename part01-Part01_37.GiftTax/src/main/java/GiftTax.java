
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int n = Integer.valueOf(scanner.nextLine());
        
        if (n < 5000){
            System.out.println("No tax!");
        } else if (n >= 5000 && n < 25000){
            System.out.println("Tax: " + (100 + (n - 5000) * 0.08));
        } else if (n >= 25000 && n < 55000){
            System.out.println("Tax: " + (1700 + (n - 25000) * 0.10));
        } else if (n >= 55000 && n < 200000){
            System.out.println("Tax: " + (4700 + (n - 55000) * 0.12));
        } else if (n >= 200000 && n < 1000000){
            System.out.println("Tax: " + (22100 + (n - 200000) * 0.15));
        } else {
            System.out.println("Tax: " + (142100 + (n - 1000000) * 0.17));
        }

    }
}