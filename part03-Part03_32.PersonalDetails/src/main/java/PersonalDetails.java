
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = 0;
        int count = 0;
        String name = "g";
        int longestName = 0;
        while(true){
            String s = scanner.nextLine();
            if (s.equals("")){
                break;
            }
            String[] part = s.split(",");
            count++;
            years += Integer.valueOf(part[1]);
            
            if (part[0].length() > longestName){
                name = part[0];
                longestName = part[0].length();
            }
            
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * years / count);

    }
}
