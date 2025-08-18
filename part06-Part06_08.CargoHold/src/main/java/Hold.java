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

public class Hold {
    private int maxW;
    private ArrayList<Suitcase> luggage;
    
    public Hold(int m){
        this.maxW = m;
        this.luggage = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int total = 0;
        for (Suitcase bag: luggage){
            total += bag.totalWeight();
        }
        
        if (total + suitcase.totalWeight() <= maxW){
            luggage.add(suitcase);
        }
    }
    
    public String toString(){
        int total = 0;
        for (Suitcase bag: luggage){
            total += bag.totalWeight();
        }
        
        return luggage.size() + " suitcases (" + total + " kg)";
    }
    
    public void printItems(){
        for (Suitcase item: luggage){
            item.printItems();
        }
    }
    
}
