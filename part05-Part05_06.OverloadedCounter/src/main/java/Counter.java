/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Counter {
    
    private int startValue;
    
    public Counter(int start){
        this.startValue = start;
    }
    
    public Counter(){
        this.startValue = 0;
    }
    
    public int value(){
        return startValue;
    }
    
    public void increase(){
        startValue++;
    }
    
    public void decrease(){
        startValue--;
    }
    
    public void increase(int increaseBy){
        if (increaseBy > 0){
            startValue += increaseBy;
        }
    }
    
    public void decrease(int decreaseBy){
        if (decreaseBy > 0){
            startValue -= decreaseBy;
        }
    }
    
}
