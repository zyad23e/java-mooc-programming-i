
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int pts = Integer.valueOf(scanner.nextLine());
        
        if (pts < 0){
            System.out.println("impossible!");
        } else if (pts >= 0 && pts < 50){
            System.out.println("failed");
        } else if (pts >= 50 && pts < 60){
            System.out.println("Grade: 1");
        } else if (pts >= 60 && pts < 70){
            System.out.println("Grade: 2");
        } else if (pts >= 70 && pts < 80){
            System.out.println("Grade: 3");
        } else if (pts >= 80 && pts < 90){
            System.out.println("Grade: 4");
        } else if (pts >= 90 && pts < 101){
            System.out.println("Grade: 5");
        } else {
            System.out.println("incredible!");
        }

    }
}
