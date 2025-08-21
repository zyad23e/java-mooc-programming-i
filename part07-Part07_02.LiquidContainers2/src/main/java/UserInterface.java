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
    private Container one;
    private Container two;
    private Scanner scanner;
    
    public UserInterface(Container one1, Container two2, Scanner scanner){
        this.one = one1;
        this.two = two2;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("First: " + one.toString());
            System.out.println("Second: " + two.toString());
            String command = scanner.nextLine();
            if (command.equals("quit")){
                break;
            }
            String[] pieces = command.split(" ");
            String whatToDo = pieces[0];
            int num = Integer.valueOf(pieces[1]);
            processCommand(whatToDo, num);
        }
    }
    
    public void processCommand(String com, int n){
        if (com.equals("add")){
            one.add(n);
        } else if (com.equals("remove")){
            two.remove(n);
        } else if (com.equals("move")){
            move(n);
        }
    }
    
    public void move(int amount){
        if (amount > 0) {
            if (amount > this.one.contains()) {
                this.two.add(this.one.contains());
                this.one.remove(amount);
            } else {
                this.one.remove(amount);
                this.two.add(amount);
            }
        }
    }
}
