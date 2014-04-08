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
    
    //constructor
    public Player()
    {
        level = 1;
        balance = 100;
    }
    
    public int balance(){
        return balance;
    }
    //This function can probably be deleted as we now have a getbalance function. Left for purposes of maintaining the 
    // code for today's iteration will be removed prior to the next demo.
    public void showBalance(String balance){
    }

    /*
    Show name is functionality to show the username of the person playing, this will be helpful in making the game more 
    personal for the second iteration
    */
    public void showName(String name){
    }

    /* 
    Withdraw - this is the framework for the functionality of withdrawing money from the users "bank" account balance 
    in the event that the user  loses a round in the game.
    */
    public int withdraw(int wager1) {
        return balance - wager1;   
    }
    /*
    Deposit - this is the framework for the functionality to deposit money into the users "bank" account in the event 
    that the user wins a round. 
    */
    public int deposit(int win1){
        return balance += win1;
    }

    public int getLevel()
    {
        // the current level the Player is on.
        return level;
    }
    /*
    getWinPercentage - After talking with Professor Russell it seems that this may need to be functionality of the game
    class, I will need to meet with Chris so that we can get this funcitionality set-up and working fairly quickly.
    */
    public double getWinPercentage(){
        double winPercentage = 0; //Game.calculateWinPercentage();
        return winPercentage;
    }
    
    public double getBalance()
    {
        //returns the current Balance of the Player's "Bank"
        return balance;
    }
    /* 
    PlaceBet - is a function that holds the wager, it will eventually return the amount that is stored in holdwager. 
    Until further funtionality is installed it is returning 0.
    
    */
    public double PlaceBet(double wager)
    {   
        holdwager = wager; 
        
        return 0;
    }
    /*
    checkWager - is a function that checks the amount that the user keys in against the account balance. If the
    proposed wager is more money than you have in your account, than an error window will pop open telling you that you
    do not have sufficient funds. Otherwise it will send the money to PlaceBet.
    */
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
