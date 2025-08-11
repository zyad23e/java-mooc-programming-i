
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "man";
        while(true){
            String s = scanner.nextLine();
            if (s.equals("")){
                break;
            }
            String[] part = s.split(",");
            if (Integer.valueOf(part[1]) > oldest){
                oldest = Integer.valueOf(part[1]);
                name = part[0];
            }
        }
        
        System.out.println("Name of the oldest: " + name);

    }
}
