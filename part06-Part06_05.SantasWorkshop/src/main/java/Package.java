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

public class Package {
    
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    
    public int totalWeight(){
        int weight = 0;
        for (Gift g: gifts){
            weight += g.getWeight();
        }
        return weight;
    }
    
}
