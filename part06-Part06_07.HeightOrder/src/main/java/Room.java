/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> people = new ArrayList<>();
    
    public void add(Person person){
        people.add(person);
    }
    
    public boolean isEmpty(){
        if (people.isEmpty()){
            return true;
        } return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if (people.isEmpty()){
            return null;
        }
        
        Person shorty = people.get(0);
        for (Person p: people){
            if (p.getHeight() < shorty.getHeight()){
                shorty = p;
            }
        } 
        return shorty;
    }
    
    public Person take(){
        Person shortest = this.shortest();
        this.people.remove(shortest);
        return shortest;
    }
    
}
