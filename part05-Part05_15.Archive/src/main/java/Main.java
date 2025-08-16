
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Identifier> allIDS = new ArrayList<>();
        ArrayList<Identifier> noDups = new ArrayList<>();
        while (true){
            System.out.println("Identifier? (empty will stop)");   
            String s = scanner.nextLine();
            if (s.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            
            Identifier newID = new Identifier(s, name);
            allIDS.add(newID);
        }
        
        System.out.println("");
        System.out.println("==Items==");
        boolean dupExists = false;
        for (Identifier id: allIDS){
            for (Identifier noDup: noDups){
                if (id.getID().equals(noDup.getID())){
                    dupExists = true;
                    break;
                }
            } if (!(dupExists)){
                noDups.add(id);
                dupExists = false;
            }
        }
        
        for (Identifier original: noDups){
            System.out.println(original);
        }
    }
}
