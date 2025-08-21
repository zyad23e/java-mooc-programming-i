
import java.util.Scanner;
import java.util.ArrayList;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> container1 = new ArrayList<>();
        ArrayList<Integer> container2 = new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;
        
        while (true) {
            for (Integer i: container1){
                sum1 += i;
            }
            
            for (Integer ii: container2){
                sum2 += ii;
            }
            
            System.out.println("First: " + sum1 +"/100");
            System.out.println("Second: " + sum2 +"/100");
            
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            String command = pieces[0];
            if (command.equals("quit")){
                break;
            }
            int numCommand = Integer.valueOf(pieces[1]);
            if (numCommand < 0){
                System.out.println("");
                continue;
            }
            
            if (command.equals("add")){
                if (sum1 + numCommand > 100){
                    sum1 = 100;
                } else {
                    sum1 += numCommand;
                }
            } else if (command.equals("move")){
                if (sum1 < numCommand){
                    if (sum2 + sum1 > 100){
                        sum2 = 100;
                    } else {
                        sum2 += sum1;
                        sum1 = 0;
                    }
                } else {
                    if (sum2 + numCommand > 100){
                        sum2 = 100;
                        sum1 -= numCommand;
                    } else {
                        sum2 += numCommand;
                        sum1 -= numCommand;
                    }
                }
            } else if (command.equals("remove")){
                if (sum2 < numCommand){
                    sum2 = 0;
                } else {
                    sum2 -= numCommand;
                }
            }
            System.out.println("");
        }
    }

}
