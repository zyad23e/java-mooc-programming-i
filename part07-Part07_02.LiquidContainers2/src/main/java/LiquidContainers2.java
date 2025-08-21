
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container one = new Container();
        Container two = new Container();
        
        UserInterface ui = new UserInterface(one, two, scanner);
        ui.start();
    }

}
