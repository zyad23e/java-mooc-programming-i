
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            String[] pieces = s.split(" ");
            if (s.equals("")){
                break;
            }       
            
            for (int i = 0; i < pieces.length; i++){
                System.out.println(pieces[i]);
            }
            
        }


    }
}
