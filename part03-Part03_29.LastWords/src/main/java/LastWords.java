
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            if (s.equals("")){
                break;
            }
            String[] parts = s.split(" ");
            System.out.println(parts[parts.length - 1]);
            
        }

    }
}
