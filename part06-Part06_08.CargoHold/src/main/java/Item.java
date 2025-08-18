/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Item {
    private String name;
    private int weight;
    
    public Item(String n, int w){
        this.name = n;
        this.weight = w;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public String toString(){
        return name + " (" + weight + " kg)";
    }
    
}
