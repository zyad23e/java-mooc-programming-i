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

public class Suitcase {
    private int maxW;
    private ArrayList<Item> items;
    
    public Suitcase(int w){
        this.maxW = w;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        if (!(item.getWeight() + this.totalWeight() > maxW)){
            items.add(item);
        }
    }
    
    public String toString(){
        int weight = this.totalWeight();

        if (items.isEmpty()){
            return "no items (0 kg)";
        } else if (items.size() == 1){
            return 1 + " item (" + weight + " kg)";
        } else {
            return items.size() + " items (" + weight + " kg)";
        }
    }
    
    public void printItems(){
        for (Item i: items){
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)");
        }
    }
    
    public int totalWeight(){
        int weight = 0;
        for (Item i: items){
            weight += i.getWeight();
        } return weight;   
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        
        Item heaviest = items.get(0);
        
        for (Item i: items){
            if (i.getWeight() > heaviest.getWeight()){
                heaviest = i;
            }
        } return heaviest;
    }
    
    
}
