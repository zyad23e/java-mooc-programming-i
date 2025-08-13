
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            
            Item newMan = new Item(name);
            items.add(newMan);
            
        }
        
        for (Item person: items){
            System.out.println(person);
        }

    }
}
