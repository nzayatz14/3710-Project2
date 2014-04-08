/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg3710.project2;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author micheleburns
 */
public class Player {

    private String Username;
    private int balance;
    int WinPercentage;
    String userName;
    int level;
    double wager;
    double holdwager;
    
    public Player()
    {
        level = 1;
        balance = 100;
    }
    
    public int balance(){
        return balance;
    }

    public void showBalance(String balance){
    }

    public void showName(String name){
    }

    public int withdraw(int wager1) {
        return balance - wager1;   
    }
        
    public int deposit(int win1){
        return balance += win1;
    }

    public int getLevel()
    {
        // the current level the Player is on.
        return level;
    }
    
    public double getWinPercentage(){
        double winPercentage = 0; //Game.calculateWinPercentage();
        return winPercentage;
    }
    
    public double getBalance()
    {
        //returns the current Balance of the Player's "Bank"
        return balance;
    }
    
    public double PlaceBet(double wager)
    {   
        holdwager = wager; 
        
        return 0;
    }
    
    public Boolean CheckWager(double money)
    {
        Component ErrorFrame = null;
        if(money > balance){
          JOptionPane.showMessageDialog(ErrorFrame, "You do not have enough funds to place that bet.", "Error", JOptionPane.ERROR_MESSAGE);
          return false;
        }else{
          JOptionPane.showMessageDialog(null, "You have sufficient funds to place that bet."); 
          PlaceBet(money);
          return true;
        }    
    }        
}
