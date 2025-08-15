/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Timer {
    
    private int hundredths;
    private int seconds;
    
    public Timer(){
        this.hundredths = 0;
        this.seconds = 0;
    }
    
    public void advance(){
        if (hundredths + 1 > 99){
            hundredths = 0;
            if (seconds + 1 > 59){
                seconds = 0;
            } else {
                seconds++;
            }
        } else {
            hundredths++;
        }
    }
    
    public String toString(){
        if (seconds < 10){
            if (hundredths < 10){
                return "0" + seconds + ":0" + hundredths;
            } else {
                return "0" + seconds + ":" + hundredths;
            }
        } else {
            if (hundredths < 10){
                return seconds + ":0" + hundredths;
            } else {
                return seconds + ":" + hundredths;
            }
        }
    }
    
}
