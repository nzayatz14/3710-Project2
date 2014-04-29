/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package pkg3710.project2;

/**
 *
 * @author nzayatz14
 */
public class Cup {
    int position;
    boolean hasBall;
    int number;
    public Cup(){
        position = 0;
        hasBall = false;
        number = 0;
    }
    
    public Cup(int p){
        position = p;
        hasBall = false;
        number = 0;
    }
    
    public Cup(int p, boolean h, int n){
        position = p;
        hasBall = h;
        number = n;
    }
    
    public Cup(Cup c){
        copyCup(c);
    }
    
    public int getPosition(){
        return position;
    }
    
    public boolean containsBall(){
        return hasBall;
    }
    
    public void setPosition(int p){
        position = p;
    }
    
    public void setContains(boolean c){
        hasBall = c;
    }
    
    public void copyCup(Cup c){
        position = c.getPosition();
        hasBall = c.containsBall();
        number = c.getNumber();
    }
    
    public int getNumber(){
        return number;
    }
    
    public void setNumber(int n){
        number = n;
    }
}
