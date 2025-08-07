
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a year: ");
        int yr = Integer.valueOf(scanner.nextLine());
        
        if (yr % 4 == 0){
            if (yr % 100 == 0){
                if (yr % 400 == 0){
                    System.out.println("The year is a leap year."); 
                } else {
                    System.out.println("The year is not a leap year.");
                }
            } else {
                System.out.println("The year is a leap year.");
            }
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
