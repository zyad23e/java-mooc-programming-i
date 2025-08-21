/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String com = scanner.nextLine();
            if (com.equals("X")){
                break;
            }
            
            processCommand(com);
        }
    }
    
    public void processCommand(String com){
        if (com.equals("1")){
            addJoke();
        } else if (com.equals("2")){
            drawJoke();
        } else {
            printJokes();
        }
    }
    
    public void addJoke(){
        System.out.println("Write the joke to be added:");
        String jok = scanner.nextLine();
        jokes.addJoke(jok);
    }
    
    public void drawJoke(){
        System.out.println("Drawing a joke.");
        System.out.println(jokes.drawJoke());
    }
    
    public void printJokes(){
        System.out.println("Printing the jokes.");
        jokes.printJokes();
    }
    
}
