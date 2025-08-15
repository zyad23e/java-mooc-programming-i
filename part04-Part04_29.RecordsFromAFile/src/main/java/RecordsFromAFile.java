
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String name = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(name))){
            while(reader.hasNextLine()){
                String row = reader.nextLine();
                if (row.equals("")){
                    continue;
                }
                
                String[] parts = row.split(",");
                String named = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                if (age == 1){
                    System.out.println(named + ", age: " + age + " year");
                } else {
                    System.out.println(named + ", age: " + age + " years");
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
