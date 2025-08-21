/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */

public class Container {
    
    private int container;
    
    public Container(){
        this.container = 0;
    }
    
    public int contains(){
        return container;
    }
    
    public void add(int amount){
        if (amount > 0){
            if (this.contains() + amount > 100){
                container = 100;
            } else {
                container += amount;
            }
        }
    }
    
    public void remove(int amount){
        if (amount > 0){
            if (container - amount < 0){
                container = 0;
            } else {
                container -= amount;
            }
        }
    }
    
    public String toString(){
        return this.contains() + "/100";
    }
    
    
    
    
    
}
