/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Identifier {
    private String id;
    private String name;
    
    public Identifier(String id, String name){
        this.id = id;
        this.name = name;
    }    
    
    public String getID(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return id +": " + name;
    }
}
